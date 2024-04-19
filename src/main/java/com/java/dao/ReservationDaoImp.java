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
	public void reservee() {
		// TODO Auto-generated method stub
		
	}


}
