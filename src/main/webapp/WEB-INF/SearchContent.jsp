<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des chambres</title>
   <style>
   body{
       background-image: url(https://4kwallpapers.com/images/walls/thumbs_3t/9208.png);
       }
        .card {
            transition: transform 0.2s;
        }

        .card:hover {
            transform: translateY(-5px);
            .card {
    border: 1px solid #ccc;
    border-radius: 8px;
    transition: transform 0.2s;
}



.card-title {
    font-size: 18px;
    font-weight: bold;
    color: #333; 
}

.card-text {
    font-size: 16px;
    color: #666; 
}

.btn-primary {
    background-color: #8B4513;
    border-color: #8B4513; 
}

.btn-primary:hover {
    background-color: #A0522D;
    border-color: #A0522D; 
}

        
        }
    </style>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


<div class="container mt-5">
    <div class="row">
        <c:forEach var="room" items="${roomsi}">
            <div class="col-md-4 mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Id room:${room.getRoom_Id()} </h5>
                        <p class="card-text">Type: ${room.getType_Room()}</p>
                        <p class="card-text">Prix: ${room.getprix()}</p>
                        <p class="card-text">Capacite: ${room.getcapacity()}</p>
                        <p class="card-text">Disponibilite: ${room.getDisponibilite() == 1 ? 'Oui' : 'Non'}</p>
                        <a href="/Paradise-Hotel/CreateReservation?Id=${room.getRoom_Id()}" class="btn btn-secondary">Reserve</a>
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
