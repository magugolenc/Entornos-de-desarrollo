package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DiaDeLaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DiaDeLaSemanaServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String diaElegido = request.getParameter("dia");
		PrintWriter out = response.getWriter();
		String diaRes = "";
		int num1 = Integer.parseInt(diaElegido);
		switch (num1) {
		case 1:
			diaRes = "Lunes";
		break;
		case 2:
			diaRes = "Martes";
		break;
		case 3:
			diaRes = "Miércoles";
		break;
		case 4:
			diaRes = "Jueves";
		break;
		case 5:
			diaRes = "Viernes";
		break;
		case 6:
			diaRes = "Sábado";
		break;
		case 7:
			diaRes = "Domingo";
		break;
		default:
			out.print("El número que has introducido no esta entre el 1 y el 7, repite el proceso por favor.");
		break;
		}
		out.print("El dia que usted ha seleccionado es el: "+diaRes);

	}
}
