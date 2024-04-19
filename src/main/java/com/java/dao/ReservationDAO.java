package com.java.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.java.beans.Reservation;

public interface ReservationDAO {
	
	public List<Reservation> afficherReserve() throws SQLException, ClassNotFoundException;
	
	public void reservee();

	void Reserver(Reservation reservation) throws SQLException, ClassNotFoundException;

	void Reserver(Integer guest_name ,Date check_in_date, Date check_out_date ) throws ClassNotFoundException, SQLException;

}
