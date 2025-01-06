<html>
<link rel="stylesheet" href="css/style.css">

<h1>${message}</h1>
<h2> Vos infos pour ce ticket : </h2>
<div class="button-container">
    <ul>
        <li>Votre numero est: ${numeroTicket}.</li>

        <li>Votre position dans la file est : ${positionDansFile} eme position.</li>

        <li>Le nombre de personnes devant vous est de : ${nbreDePersonnesDevant}</li>

        <li>Le numero qui est en train d etre traite est : ${numeroEnCoursDeTraitement}</li>

    </ul>

    <a>    <input class="button" type="button" value="Generer un Ticket" /></a>
</div>

</html>