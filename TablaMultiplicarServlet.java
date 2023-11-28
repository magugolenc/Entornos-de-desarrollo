package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TablaMultiplicarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TablaMultiplicarServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nStr = request.getParameter("numero");

	        if (nStr != null && nStr.matches("\\d+")) {
	            int numero = Integer.parseInt(nStr);
	            response.getWriter().println("Tabla de Multiplicar del " + numero);

	            for (int i = 1; i <= 10; i++) {
	                int resultado = numero * i;
	                response.getWriter().println(i +" x "+numero+" = "+ resultado);
	            }
	        } else {
	            response.getWriter().println("Error: Ingrese un valor numérico para el número.");
	        }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
