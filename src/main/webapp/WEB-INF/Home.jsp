<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des chambres</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
    .background{
     background-color: rgb(110, 84, 12);}
 .card {
    margin-bottom: 20px;
}
.card-img-top {
    max-height: 200px;
    object-fit: cover;
}
.navbar-brand {
    font-weight: bold;
}
.footer {
    background-color: #f8f9fa;
    padding: 20px 0;
    text-align: center;
}
nav{
    position: fixed;
    width: 100%;
    top: 0;
    z-index: 1000;
    height: 100px;
    background: #ffffff47;
    backdrop-filter: blur(15px);
}
header{
    height:600px;
    background: url('https://about-planet.ru/images/asia/strana/maldivskie_ostrova/oteli_v_maldivskix_ostrovax.jpg') no-repeat bottom right/cover;
    backdrop-filter: blur(2px);
}
.title{

    width:700px;
    margin:220px auto;
    color:white;
      text-align: center;
}
.title > h2{
    font-size:40px;
    text-transform:uppercase;
    font-weight:800;
    text-shadow: 0 0 20px white;
}
.title > h4{
    font-size:14px;
    text-transform:uppercase;
    font-weight:600;
    color:white;

}




.navbar-nav{
    height: 10%;
}
    </style>
</head>
  <header>
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container">
                <a class="navbar-brand" href="#">Mon Hôtel</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Accueil</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Chambres</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Services</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <div class="title">
            <h2>Welcome to Paradise Hotel</h2>
      
            <h4>Enjoy spending your time with us</h4>
        </div>
       
        
    </header>
<body class="background">
<form action="se" method="Post" >
<div class="col-md-2 mb-2">
                <label for="CheckIn">Check In</label>
                <input class="form-control mt-1" type="date" id="start" name="checkIn" value="${checkIn}" min="2024-01-01" max="2030-12-31" required/>
            </div>
            <div class="col-md-2 mb-2 ">
                <label for="CheckOut">Check In</label>
                <input class="form-control mt-1" type="date" id="End" name="checkOut" value="${checkOut}" min="2024-01-01" max="2030-12-31" required/>
            </div>
            
            
    <label for="type">Choisissez un type :</label>
    <select name="type" id="type">
        <option value="Double">Double</option>
        <option value="Suite de luxe">Suite de luxe</option>
        <option value="Familiale">Familiale</option>
        <option value="VIP">VIP</option>
        <option value="Penthouse">Penthouse</option>
        <option value="Chambre communicante">Chambre communicante</option>
        <option value="Studio">Studio</option>
        <option value="Appartement">Appartement</option>
        <option value="Chalet">Chalet</option>
    </select>
    <button type="submit">Rechercher</button>
</form>


<div class="container mt-5">
    <div class="row">
        <c:forEach var="room" items="${rooms}">
            <div class="col-md-4 mb-4">
                <div class="card">
                     <img src="https://i.pinimg.com/originals/04/b1/33/04b1337bb8656e215f499047cc576e36.jpg" class="imgCard" alt="Image de la chambre">
                    <div class="card-body">
                        <h5 class="card-title">Id room:${room.getRoom_Id()} </h5>
                        <p class="card-text">Type: ${room.getType_Room()}</p>
                        <p class="card-text">Prix: ${room.getprix()}</p>
                        <p class="card-text">Capacite: ${room.getcapacity()}</p>
                        <p class="card-text">Disponibilite: ${room.getDisponibilite() == 1 ? 'Oui' : 'Non'}</p>
                        <a href="/Paradise-Hotel/CreateReservation?Id=${room.getRoom_Id()}" class="btn btn-primary">Reserve</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
