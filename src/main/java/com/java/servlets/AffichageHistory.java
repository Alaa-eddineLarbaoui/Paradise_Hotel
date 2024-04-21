package com.java.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.ReservationDaoImp;
import com.java.dao.RoomDAOImpl;


@WebServlet("/AffichageHistory")
public class AffichageHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AffichageHistory() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ReservationDaoImp histo= new ReservationDaoImp();
	try {
		request.setAttribute("history", histo.afficherReserve());
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	request.getRequestDispatcher("/WEB-INF/AfficherHistorique.jsp").forward(request, response);
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
