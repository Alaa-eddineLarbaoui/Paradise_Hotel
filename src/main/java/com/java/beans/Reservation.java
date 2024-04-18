package com.java.beans;

import java.sql.Date;

public class Reservation {
	
	private Integer reservation_id;
	private Integer room_id;
	private String guest_name;
	private Date check_in_date;
	private Date check_out_date;
	
	
	public Reservation(Integer reservation_id, Integer room_id, Integer price, String guest_name, Date check_in_date, Date check_out_date) {
		super();
		this.reservation_id = reservation_id;
		this.room_id = room_id;
		this.guest_name = guest_name;
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
	}
	
	public Integer getreservation_id() {
		return reservation_id;
	}
	public void setReservationId(Integer reservationId) {
		this.reservation_id = reservationId;
	}
	public Integer getroom_id() {
		return room_id;
	}
	public void setroom_id(Integer room_id) {
		this.room_id = room_id;
	}
	public String getguest_name() {
		return guest_name;
	}
	public void setguest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public Date getcheck_in_date() {
		return check_in_date;
	}
	public void setcheck_in_date(Date check_in_date) {
		this.check_in_date = check_in_date;
	}
	public Date getcheck_out_date() {
		return check_out_date;
	}
	public void setcheck_out_date(Date check_out_date) {
		this.check_out_date = check_out_date;
	}
	
	
	
}



/*package com.java.beans;

import java.sql.Date;

public class Reservation {
	
	private Integer reservationId;
	private Integer roomId;
	private String guestName;
	private Date dateStart;
	private Date dateEnd;
	
	public Reservation(Integer reservationId, Integer roomId, String guestName, Date dateStart, Date dateEnd) {
		super();
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.guestName = guestName;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
	
	public Integer getReservationId() {
		return reservationId;
	}
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	
	
	
}
*/