package com.java.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.Room;

public interface RoomDAO {

	ArrayList<Room> getDataRoom() throws ClassNotFoundException, SQLException;

	List<Room> search(Integer capacity, String Type_Room)
			throws ClassNotFoundException, SQLException;

}
