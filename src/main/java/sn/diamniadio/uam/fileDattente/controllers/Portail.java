package sn.diamniadio.uam.fileDattente.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Controller
    public class Portail {
    // Liste des tickets
    private static List<Integer> tickets = new ArrayList<>();
    private static int currentTicket = 1;
    // Initialiser les tickets
    static {
        for (int i = 1; i <= 100; i++) {
            tickets.add(i);
        }
    }
    private static int nextTicketNumber = 1;
private int suivant ;
    @RequestMapping("/")
    public String service(Model model) {
//      String color = "Withe";
        String message = "Bienvenue dans le portail, Choisissez votre Service.\n";
//      model.addAttribute("couleur", color);
        model.addAttribute("message", message);

        return "service";
    }

    @RequestMapping("/ticket")
    public String ticket(Model model) {
        String message = "Générer votre ticket.\n";
        int ticketNumber = nextTicketNumber++;
        model.addAttribute("ticketNumber", ticketNumber);

        int numeroTicket = ticketNumber;
        int positionDansFile = ticketNumber; // La position dans la file est égale au numéro du ticket
        int nbreDePersonnesDevant = positionDansFile - 1; // Nombre de personnes devant - 1
        int numeroEnCoursDeTraitement = currentTicket++;
    model.addAttribute("message", message);
    model.addAttribute("numeroTicket", numeroTicket);
    model.addAttribute("positionDansFile", positionDansFile);
    model.addAttribute("nbreDePersonnesDevant", nbreDePersonnesDevant);
    model.addAttribute("numeroEnCoursDeTraitement", numeroEnCoursDeTraitement);
        return "ticket";
    }
    @RequestMapping("/agents")
    public String agents(Model model) {
        String message = "Page Agent.\n";
        model.addAttribute("message", message);
        model.addAttribute("currentTicket", currentTicket);

        return "agents";
    }
@RequestMapping("/clientSuivant")
    public String clientSuivant(Model model) {
    // Incrémente du numéro du ticket en cours
    suivant= currentTicket++;

    model.addAttribute("currentTicket", currentTicket);
    model.addAttribute("message", "Page Agent.");
    return "redirect:/agents";
    }

    @RequestMapping("/clientPrecedent")
    public String clientPrecedent(Model model) {
        // décrémente du numéro du ticket en cours
        if (currentTicket > 1) {
            currentTicket--;
        }
        else {
            currentTicket = 1;
        }
        // Rediriger vers la page agents pour afficher le nouveau numéro de ticket
        model.addAttribute("currentTicket", currentTicket);
        model.addAttribute("message", "Page Agent.");
        return "redirect:/agents";
    }


    @RequestMapping("/bank")
    public String bank(Model model) {
//      String color = "Withe";
        String messagebank = "Bienvenue dans la page Bank.\n";
        String message = "Choisissez la localisation. \n";
//      model.addAttribute("couleur", color);
        model.addAttribute("message", messagebank);
        model.addAttribute("messagelocalisation", message);
        return "bank";
    }
    @RequestMapping("/orange")
    public String orange(Model model) {
//      String color = "Withe";
        String message = "Choisissez la localisation. \n";
        String messageOrange = "Bienvenue dans la page Orange.\n";
//      model.addAttribute("couleur", color);
        model.addAttribute("message", messageOrange);
        model.addAttribute("messagelocalisation", message);
        return "orange";
    }
    @RequestMapping("/senEAU")
    public String senEAU(Model model) {
//      String color = "Withe";
        String message = "Choisissez la localisation. \n";
        String messagesenEAU = "Bienvenue dans la page SenEAU.\n";
//      model.addAttribute("couleur", color);
        model.addAttribute("message", messagesenEAU);
        model.addAttribute("messagelocalisation", message);
        return "senEAU";
    }
    @RequestMapping("/senelec")
    public String senelec(Model model) {
//      String color = "Withe";
        String message = "Choisissez la localisation. \n";
        String messagesenelec = "Bienvenue dans la page Senelec.\n";
//      model.addAttribute("couleur", color);
        model.addAttribute("message", messagesenelec);
        model.addAttribute("messagelocalisation", message);
        return "senelec";
    }
    @RequestMapping("/sonatel")
    public String sonatel(Model model) {
//      String color = "Withe";
        String message = "Choisissez la localisation. \n";
        String messagesonatel = "Bienvenue dans la page Sonatel.\n";
//      model.addAttribute("couleur", color);
        model.addAttribute("message", messagesonatel);
        model.addAttribute("messagelocalisation", message);
        return "sonatel";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
//      String color = "Withe";
        String messageadmin = "Bienvenue dans la page Sonatel.\n";
//      model.addAttribute("couleur", color);
        model.addAttribute("message", messageadmin);
        return "admin";
    }
}
