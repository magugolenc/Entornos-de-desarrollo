package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Hola_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hola_Servlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre =request.getParameter("nombre");
		String apellido =request.getParameter("apellido");
		PrintWriter out = response.getWriter();
		out.print("Hola que tal estas Don "+ nombre+" "+apellido+" bienvenido.");
	}
}
