package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.beans.Reservation;

public interface ReservationDAO {
	
	public List<Reservation> afficherReserve() throws SQLException, ClassNotFoundException;
	
	public void reservee();

}
