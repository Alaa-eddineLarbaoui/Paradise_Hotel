package com.java.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.java.beans.Room;

public interface RoomDAO {

	ArrayList<Room> getDataRoom() throws ClassNotFoundException, SQLException;
}
