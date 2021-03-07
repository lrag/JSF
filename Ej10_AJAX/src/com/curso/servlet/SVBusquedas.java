package com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SVBusquedas")
public class SVBusquedas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SVBusquedas() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String codigo = request.getParameter("codigo");
		System.out.println("========================");
		System.out.println("Codigo:"+codigo);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("iso-8859-1");
		PrintWriter out = response.getWriter();
		out.print("Harry Callahan");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
