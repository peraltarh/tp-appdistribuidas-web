package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ClienteBean;
import beans.ParticularBean;
import beans.PedidoBean;
import clienteWeb.ControladorWeb;

public class AltaCliente extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public AltaCliente() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipoId=request.getParameterValues("tipo")[0];
		String numero=request.getParameter("numero");
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String direccion=request.getParameter("direccion");
		String telefono=request.getParameter("telefono");

		if(!numero.equals("")&&!tipoId.equals("0")&&!nombre.equals("")&&!apellido.equals("")
				&&!direccion.equals("")&&!telefono.equals(""))
		{
			if(tipoId.equalsIgnoreCase("DNI"))
			{
				ClienteBean cB=new ParticularBean();
				cB=ControladorWeb.getInstancia().altaCliente(direccion,telefono,nombre,apellido,numero, tipoId);
				request.setAttribute("clienteValidado", cB);
				RequestDispatcher dispacher = request.getRequestDispatcher("generarEnvio2.jsp");
				dispacher.forward(request, response);
			}


		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

