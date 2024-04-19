package com.java.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.Reservation;
import com.java.beans.Room;

public class ReservationDaoImp implements ReservationDAO {
	Connection connection = null ;

	@Override
	public List<Reservation> afficherReserve() throws SQLException, ClassNotFoundException {
		List<Reservation> RoomsArray = new ArrayList<>();
		
		
		Connection connection = ConnectionDAO.getConnection();
        String getDataReservation = "SELECT * FROM Reservation";
 
        PreparedStatement statement = connection.prepareStatement(getDataReservation);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Integer id = (resultSet.getInt("reservation_id"));
            Integer RoomId =  (resultSet.getInt("room_id"));
            String Name = (resultSet.getString("guest_name"));
            Date StartDate = (resultSet.getDate("check_in_date"));
            Date FinDate = (resultSet.getDate("check_out_date"));
            RoomsArray.add(new Reservation(id,RoomId,Name,StartDate,FinDate));
        }
		connection.close();

        statement.close();
		
		return RoomsArray;
	}
	
	
	
	
	
	@Override
	public void Reserver( Integer room_id ,String guest_name ,Date check_in_date, Date check_out_date) throws ClassNotFoundException, SQLException {
	    String requet = "INSERT INTO Reservation (room_id , guest_name, check_in_date, check_out_date) VALUES(?,?,?,?)";
	    PreparedStatement statement;

	        statement = ConnectionDAO.getConnection().prepareStatement(requet);
	        statement.setInt(1,room_id);
	        statement.setString(2,guest_name);
	        statement.setDate(3,check_in_date);
	         statement.setDate(4,check_out_date);
	         
	          statement.executeUpdate();

	}










	
}





