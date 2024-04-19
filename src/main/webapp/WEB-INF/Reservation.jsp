<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Reservation</title>
  <!-- Bootstrap CSS -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
  <h2>Add Reservation</h2>
  <form action="re" method="post">
  <div class="form-group">
      <label for="room_id"> room_id:</label>
      <input type="text" class="form-control" id="room_id" name="room_id" required>
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
    <button type="submit" class="btn btn-primary">Submit</button>
     
  
  </form>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
