<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5" >
    <div class="row">
        <c:forEach var="room" items="${history}">
            <div class="col-md-4 mb-4"  id="chambres">
                <div class="card">
                     <img src="https://i.pinimg.com/originals/04/b1/33/04b1337bb8656e215f499047cc576e36.jpg" class="imgCard" alt="Image de la chambre">
                    <div class="card-body">
                        <h5 class="card-title">reservation_id: ${room.getReservation_id()} </h5>
                        <p class="card-text">room_id: ${room.getRoom_id()}</p>
                        <p class="card-text">guest_name: ${room.getGuest_name()}</p>
                        <p class="card-text">check_in_date: ${room.getCheck_in_date()}</p>
                        <p class="card-text">check_out_date: ${room.getCheck_in_date()}</p>
                        
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>