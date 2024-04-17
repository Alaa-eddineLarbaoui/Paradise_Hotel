package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.beans.Room;

public class RoomDAOImpl implements RoomDAO{

	@Override
	public ArrayList<Room> getDataRoom() throws ClassNotFoundException, SQLException {
		ArrayList<Room> arrayRoom = new ArrayList<>();
		
        Connection connection = ConnectionDAO.getConnection();
        String getDataRoom = "SELECT * FROM Room";
        PreparedStatement statement = connection.prepareStatement(getDataRoom);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Integer id = (resultSet.getInt("Room_Id"));
            String type =  (resultSet.getString("Type_Room"));
            Integer prix = (resultSet.getInt("prix"));
            String capacity = (resultSet.getString("capacity"));
            String dispo = (resultSet.getString("Disponibilite"));
            arrayRoom.add(new Room(id, type, prix, capacity, dispo));
        }
        connection.close();
        statement.close();
        return arrayRoom;
	}
}
