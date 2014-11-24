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

public class MostrarPedidosCliente extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public MostrarPedidosCliente() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipoId=request.getParameterValues("tipo")[0];
		String numero=request.getParameter("numero");
		if(!numero.equals("")&&!tipoId.equals("0"))
		{
			ClienteBean cB=ControladorWeb.getInstancia().getCliente(tipoId,Integer.parseInt(numero));
			if(cB!=null)
			{
				request.setAttribute("clienteValidado", cB);
				RequestDispatcher dispacher = request.getRequestDispatcher("mostrarPedidosCliente2.jsp");
				dispacher.forward(request, response);
			}
		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

