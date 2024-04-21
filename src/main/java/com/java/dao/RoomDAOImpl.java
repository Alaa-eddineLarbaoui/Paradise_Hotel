package com.java.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.Room;

public class RoomDAOImpl implements RoomDAO{

	@Override
	public ArrayList<Room> getDataRoom() throws ClassNotFoundException, SQLException {
		ArrayList<Room> arrayRoom = new ArrayList<>();
		
        Connection connection = ConnectionDAO.getConnection();
        String getDataRoom = "SELECT * FROM Room where Disponibilite = 1";
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

	@Override
	public List<Room> search(String Type_Room) throws ClassNotFoundException, SQLException {
		 List<Room> Search=new ArrayList<Room>();
	        String requet = "SELECT * FROM Room WHERE Disponibilite = ? AND Type_Room = ? ";
	        PreparedStatement statement = ConnectionDAO.getConnection().prepareStatement(requet);
	        statement.setBoolean(1, true);

	         statement.setString(2,Type_Room);
	        
	  
	        ResultSet resultat = statement.executeQuery();

	        while (resultat.next()) {
	            Integer Id = resultat.getInt("Room_Id");
	            String Type= resultat.getString("Type_Room");
	            Integer Prix  = resultat.getInt("prix");
	            String Nombre_personne = String.valueOf(resultat.getInt("capacity"));
	            String Disponibilite1=resultat.getString("Disponibilite");
	            Search.add(new Room(Id, Type, Prix, Nombre_personne, Disponibilite1));
	          

	        //    Room srRe = new Room( );
	           // Search.add(srRe);
	        }

	        return Search;
	    }
	}

