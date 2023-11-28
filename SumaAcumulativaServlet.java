package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SumaAcumulativaServlet
 */
public class SumaAcumulativaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumaAcumulativaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        String nStr = request.getParameter("numeroN");

		        if (nStr != null && !nStr.isEmpty() && nStr.matches("\\d+")) {
		            int numeroN = Integer.parseInt(nStr);

		            int sumaAcumulativa = 0;
		            for (int i = 1; i <= numeroN; i++) {
		                sumaAcumulativa += i;
		            }

		            response.getWriter().println("La suma acumulativa hasta " + numeroN + " es: " + sumaAcumulativa);
		        } else {
		            response.getWriter().println("Error: Ingrese un valor numérico para N.");
		        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
