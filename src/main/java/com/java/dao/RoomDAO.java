package com.java.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.Room;

public interface RoomDAO {

	ArrayList<Room> getDataRoom() throws ClassNotFoundException, SQLException;

	public List<Room> search(String Type_Room , String capacity)
			throws ClassNotFoundException, SQLException;

}
