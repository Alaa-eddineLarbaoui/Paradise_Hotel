package com.java.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.ReservationDAO;
import com.java.dao.ReservationDaoImp;





@WebServlet("/CreateReservation")
public class CreateReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReservationDAO reservationDAO;
	
	@Override
	public void init() throws ServletException {
		reservationDAO = new ReservationDaoImp();
	}
       
 
    public CreateReservation() {
        super();
 
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
			String Id = request.getParameter("Id");
			  

	      	request.setAttribute("Id", Id);
		request.getRequestDispatcher("/WEB-INF/Reservation.jsp").forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String Id = request.getParameter("room_id");
		  

  	        	request.setAttribute("Room", Id);
  	           
  	 
		request.getRequestDispatcher("/WEB-INF/Reservation.jsp").forward(request, response);
	}

}
