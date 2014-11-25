package servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clienteWeb.ControladorWeb;

public class ValidarPedidosPorVencerDeSucursal extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public ValidarPedidosPorVencerDeSucursal() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreSucursal=request.getParameterValues("cbSucursal")[0];
		
		
		if(!nombreSucursal.equals("")){
			
			ControladorWeb.getInstancia().validarPedidosPendientesSucursal(nombreSucursal);
			RequestDispatcher dispacher = request.getRequestDispatcher("validarPedidosPorVencerDeSucursal.jsp");

			dispacher.forward(request, response);

		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

