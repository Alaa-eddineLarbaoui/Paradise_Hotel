package com.java.servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.ReservationDaoImp;
import com.java.dao.RoomDAOImpl;





@WebServlet("/Reserver")
public class Reserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	
    public Reserver() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer room_id=Integer.valueOf(request.getParameter("room_id"));
	    String guest_name=request.getParameter("guest_name");
		Date check_in_date=Date.valueOf(request.getParameter("check_in_date"));
        Date check_out_date=Date.valueOf(request.getParameter("check_out_date"));
   

       ReservationDaoImp reserve =new ReservationDaoImp();
try {
   reserve.Reserver(room_id,guest_name,check_in_date,check_out_date);
} catch (ClassNotFoundException e) {

   e.printStackTrace();
} catch (SQLException e) {
  
  

}
RoomDAOImpl room =new RoomDAOImpl();
try {
	request.setAttribute("rooms", room.getDataRoom());
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
           this.getServletContext().getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
   }
	}


