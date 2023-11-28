package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Comapara3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Comapara3() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String num1 = request.getParameter("numero1");
	String num2 = request.getParameter("numero2");
	String num3 = request.getParameter("numero3");
	PrintWriter out = response.getWriter();
	
	int numer1 = Integer.parseInt(num1);
	int numer2 = Integer.parseInt(num2);
	int numer3 = Integer.parseInt(num3);
	
	int numAlto = Math.max(Math.max(numer1, numer2), numer3);
	out.print("El número más alto de los introducidos es: "+numAlto+'\n');
	out.println("Los numeros introducidos fueron: "+numer1+", "+numer2+" y "+numer3);
	}
}
