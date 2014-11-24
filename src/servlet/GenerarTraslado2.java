package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.MercaderiaBean;
import beans.PedidoBean;
import clienteWeb.ControladorWeb;

public class GenerarTraslado2 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public GenerarTraslado2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String numeroMercaderia = request.getParameterValues("cbMercaderia")[0];
		MercaderiaBean mB=ControladorWeb.getInstancia().getMercaderia(Integer.parseInt(numeroMercaderia));
		request.setAttribute("mercaderiaSeleccionada", mB);
		RequestDispatcher dispacher = request.getRequestDispatcher("generarTraslado3.jsp");

		dispacher.forward(request, response);
	}

	}

