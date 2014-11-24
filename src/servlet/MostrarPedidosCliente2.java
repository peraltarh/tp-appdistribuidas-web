package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ClienteBean;
import beans.PedidoBean;
import clienteWeb.ControladorWeb;

public class MostrarPedidosCliente2 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public MostrarPedidosCliente2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numeroPedido = request.getParameterValues("cbPedidos")[0];
		PedidoBean pB=ControladorWeb.getInstancia().getPedido(Integer.parseInt(numeroPedido));
		request.setAttribute("nuevoPedido", pB);
		RequestDispatcher dispacher = request.getRequestDispatcher("mostrarPedidosCliente3.jsp");
		dispacher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

