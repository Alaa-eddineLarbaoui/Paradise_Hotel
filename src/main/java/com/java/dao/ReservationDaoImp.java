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
	public void Reserver(Integer guest_name ,Date check_in_date, Date check_out_date) throws ClassNotFoundException, SQLException {
	    String requet = "INSERT INTO Reservation (guest_name, check_in_date, check_out_date) VALUES(?,?,?)";
	    PreparedStatement statement;

	        statement = connection.prepareStatement(requet);
	        statement.setDate(1,check_in_date);
	         statement.setDate(2,check_out_date);
	         statement.setInt(3,guest_name);
	          statement.executeUpdate();


	           String Requet = "UPDATE room SET Disponibilite=? WHERE Id_Room=?";
	           PreparedStatement statementt;
	           statementt = connection.prepareStatement(Requet);
	           statementt.setDate(1,check_out_date);
	           statementt.setInt(2,guest_name);
	           statementt.executeUpdate();

	}





	@Override
	public void reservee() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void Reserver(Reservation reservation) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	





}





