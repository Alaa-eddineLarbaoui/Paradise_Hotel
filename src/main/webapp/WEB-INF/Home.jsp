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
 
 
 
 
 
.search {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 30vh;
    
}

form {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    top:20px;
    height:80px;
    background-color: rgba(255, 255, 255, 0.726);
    backdrop-filter: blur(15px);
    box-shadow: 4px 4px 50px black;
}

label {
    margin-right: 10px;
}

input[type="date"],
input[type="number"],
select {
    padding: 8px;
    margin: 5px;
    border: 1px solid #ccc;
    border-radius: 4px;
}






.navbar-nav{
    height: 10%;
}


.btn-5 {
  width: 130px;
  height: 40px;
  line-height: 42px;
  padding: 0;
  border-radius: 15%;
  border: none;
  background: rgb(255,27,0);
  background: linear-gradient(0deg, rgba(255,27,0,1) 0%, rgba(251,75,2,1) 100%);
}

.btn-5:hover {
  color: black;
  background:  rgb(205, 144, 22);
  box-shadow:none;
}

.btn-5:before,
.btn-5:after {
  content:'';
  position:absolute;
  top:0;
  right:0;
  height:2px;
  width:0;
  background: #f0094a;
  box-shadow:
   -1px -1px 5px 0px #fff,
   7px 7px 20px 0px #0003,
   4px 4px 5px 0px #0002;
  transition:400ms ease all;
}

.btn-5:after {
  right:inherit;
  top:inherit;
  left:0;
  bottom:0;
}

.btn-5:hover:before,
.btn-5:hover:after {
  width:100%;
  transition:800ms ease all;
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
                            <a class="nav-link" href="id="chambres""  >Chambres</a>
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
<div class="search">
    <form action="se" method="Post" >
        <div class="col-md-2 mb-2">
                        <label for="CheckIn">Check In</label>
                        <input class="form-control mt-1" type="date" id="start" name="checkIn" value="${checkIn}" min="2024-01-01" max="2030-12-31" required/>
                    </div>
                    <div class="col-md-2 mb-2 ">
                        <label for="CheckOut">Check Out</label>
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

            <label for="capacity">Capacité des personnes:</label>
<input type="number" id="capacity" name="capacity">
<button type="submit" class="btn-5">Rechercher</button>
        </form> 
    </div>


<div class="container mt-5" >
    <div class="row">
        <c:forEach var="room" items="${rooms}">
            <div class="col-md-4 mb-4"  id="chambres">
                <div class="card">
                     <img src="https://i.pinimg.com/originals/04/b1/33/04b1337bb8656e215f499047cc576e36.jpg" class="imgCard" alt="Image de la chambre">
                    <div class="card-body">
                        <h5 class="card-title">Id room:${room.getRoom_Id()} </h5>
                        <p class="card-text">Type: ${room.getType_Room()}</p>
                        <p class="card-text">Prix: ${room.getprix()}</p>
                        <p class="card-text">Capacite: ${room.getcapacity()}</p>
                        <p class="card-text">Disponibilite: ${room.getDisponibilite() == 1 ? 'Oui' : 'Non'}</p>
                        <a href="/Paradise-Hotel/CreateReservation?Id=${room.getRoom_Id()}" class="btn btn-warning">Reserver</a>
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
