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





@WebServlet(name = "Reserver", urlPatterns = { "/Reserver" })
public class Reserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	
    public Reserver() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		Date check_in_date=Date.valueOf(request.getParameter("guest_name"));
        Date check_out_date=Date.valueOf(request.getParameter("check_in_date"));
       Integer guest_name=Integer.valueOf(request.getParameter("check_out_date"));

       ReservationDaoImp reserve =new ReservationDaoImp();
try {
   reserve.Reserver(guest_name,check_in_date,check_out_date);
} catch (ClassNotFoundException e) {

   e.printStackTrace();
} catch (SQLException e) {
   // TODO Auto-generated catch block 
  
   request.getRequestDispatcher("/WEB-INF/NewFile.jsp").forward(request, response);
}

           request.getRequestDispatcher("/WEB-INF/NewFile.jsp").forward(request, response);
   }
	}

