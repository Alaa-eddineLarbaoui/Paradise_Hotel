package com.java.servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.RoomDAOImpl;


@WebServlet("/SearchRoom")
public class SearchRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SearchRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String Type=request.getParameter("Type_Roome");
        Integer nbr=Integer.valueOf(request.getParameter("capacity"));
        RoomDAOImpl roomi=new RoomDAOImpl();
        
            try {
				request.setAttribute("roomsi", roomi.search(nbr,Type));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        


                request.getRequestDispatcher("/WEB-INF/SearchContent.jsp").forward(request, response);
    }
	}


