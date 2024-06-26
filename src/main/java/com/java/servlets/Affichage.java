package com.java.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.RoomDAOImpl;

/**
 * Servlet implementation class Affichage
 */
@WebServlet("/Affichage")
public class Affichage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
    public Affichage() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RoomDAOImpl room= new RoomDAOImpl();
	try {
		request.setAttribute("rooms", room.getDataRoom());
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	request.getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}