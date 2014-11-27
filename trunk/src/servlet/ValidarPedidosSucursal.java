package servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clienteWeb.ControladorWeb;

public class ValidarPedidosSucursal extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public ValidarPedidosSucursal() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreSucursal=request.getParameterValues("cbSucursal")[0];
		
		
		if(!nombreSucursal.equals("")){
			
			String respuesta = ControladorWeb.getInstancia().validarPedidosPendientesSucursal(nombreSucursal);
			if(respuesta == null)respuesta = "No existen pedidos pendientes para la sucursal seleccionada";
			
			RequestDispatcher dispacher = request.getRequestDispatcher("respuestaValidarPedidosSucursal.jsp");
			request.setAttribute("respuesta", respuesta);
			dispacher.forward(request, response);

		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

