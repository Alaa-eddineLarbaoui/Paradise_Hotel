<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
        <tr>
            <th>Id</th>
            <th>Type</th>
            <th>Prix</th>
            <th>capacity</th>
            <th>Disponibilite</th>
             
        </tr>  
        <c:forEach var="room" items="${rooms}">
            <tr>
                <td>${room.getRoom_Id()}</td>
                <td>${room.getType_Room()}</td>
                <td>${room.getprix()}</td>
                <td>${room.getcapacity()}</td> 
                <td>
                    <c:if test="${room.disponibilite eq 1}">
                        Oui
                    </c:if>
                    <c:if test="${room.disponibilite ne 1}">
                        Non 
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>