package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.PedidoBean;
import clienteWeb.ControladorWeb;

public class GenerarTraslado extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public GenerarTraslado() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
	//	YYString title = "Generar Traslado";
//
		//		    ControladorWeb.getInstancia().generarTraslado(1,Integer.parseInt(request.getParameter("cbMesas")));
		//		    
		//		    Float total = ControladorWeb.getInstancia().calcularTotalMesa(1,Integer.parseInt(request.getParameter("cbMesas")));
		//
		//		    String HTML="<html>\n" +
		//						"<head>\n" +
		//						"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n" + 
		//						"<title>" + title + "</title>\n" +      
		//						"</head>\n" +
		//						"<body>\n" +
		//						"<h1>" + title + "</h1>\n" +
		//						"<br/><br/>" +
		//						"<h2>Total a Facturar</h2>\n" + total + "</h2>\n" +
		//						"<br/><br/>" +
		//						"<h2>La mesa cambio su estado a proxima a facturar!</h2>\n" +
		//						"<br/><br/>" +
		//						"<a href='menu.jsp'>volver al menu</a>" +
		//					    "</body>\n" +
		//					    "</html>";
		//					    
		//			out.println(HTML);
	}

	//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//		doGet(request, response);
	//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String numeroPedido = request.getParameterValues("cbPedidos")[0];
		PedidoBean pB=ControladorWeb.getInstancia().getPedido(Integer.parseInt(numeroPedido));
		request.setAttribute("nuevoPedido", pB);
		RequestDispatcher dispacher = request.getRequestDispatcher("generarTraslado2.jsp");

		dispacher.forward(request, response);
	}

	}

