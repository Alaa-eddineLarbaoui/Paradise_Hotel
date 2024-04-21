<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Reservation</title>
  <!-- Bootstrap CSS -->

</head>
<body>

<div class="container">
  <h2>Add Reservation</h2>
  <form action="re" method="post">
  <div class="form-group">
      <label for="room_id"> room_id:</label>
       <input type="text" class="form-control" id="room_id" name="room_id" value="${Id}">
     
    </div>
    
    <div class="form-group">
      <label for="guest_name">Guest Name:</label>
      <input type="text" class="form-control" id="guest_name" name="guest_name" required>
    </div>
    <div class="form-group">
      <label for="check_in_date">Check-in Date:</label>
      <input type="text" class="form-control" id="check_in_date" name="check_in_date" required>
    </div>
    <div class="form-group">
      <label for="check_out_date">Check-out Date:</label>
      <input type="text" class="form-control" id="check_out_date" name="check_out_date" required>
    </div>
   <button type="submit" class="btn btn-primary" onclick="showAlert()">Submit</button>
    
    <script>
  
  function showAlert() {
    alert("Le room a été réservé avec succès !");
  }
</script>
  
  </form>
</div>
<Style>
/* Reset CSS */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Styles généraux */
body {
    font-family: Arial, sans-serif;
    background-color: #f8f9fa;
    background-image: url(https://w.forfun.com/fetch/e9/e9339a5d9f47b810ac3dc8d62f83ec3e.jpeg);
    background-repeat: no-repeat;
    background-size: cover; /* Pour ajuster la taille de l'image */
}

.container {
    max-width: 600px;
    margin: 50px auto;
    padding: 20px;
    background-color: #ffffffdc;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
    margin-bottom: 20px;
    color: #007bff;
}

.form-group {
    margin-bottom: 20px;
}

.label {
    font-weight: bold;
}

.form-control {
    width: 100%;
    padding: 10px;
    font-size: 16px;
    border: 1px solid #ced4da;
    border-radius: 4px;
    transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

.form-control:focus {
    border-color: #007bff;
    outline: 0;
    box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
}

.btn {
    display: inline-block;
    padding: 10px 20px;
    font-size: 16px;
    color: #fff;
    background-color: #007bff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.15s ease-in-out;
}

.btn:hover {
    background-color: #0056b3;
}



</Style>


</body>
</html>
