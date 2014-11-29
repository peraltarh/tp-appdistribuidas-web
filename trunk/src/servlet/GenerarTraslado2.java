package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.MercaderiaBean;
import beans.MovimientoBean;
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
		String sucAct=request.getParameterValues("cbSucursalActual")[0];
		String estado=request.getParameterValues("estado")[0];
		String sucFinal=request.getParameter("sucFinal");
		String idPedido=request.getParameter("idPedido");
		PedidoBean pB=ControladorWeb.getInstancia().getPedido(Integer.parseInt(idPedido));
		//		MercaderiaBean mB=ControladorWeb.getInstancia().getMercaderia(Integer.parseInt(numeroMercaderia));
		String estadoPedido=request.getParameter("estadoAct");
		if(sucAct.equals(sucFinal))
			estadoPedido="Entregado";

		MercaderiaBean mB=null;

		for (MercaderiaBean m : pB.getMercaderias()) {
			if(m.getIdMercaderia()==Integer.parseInt(numeroMercaderia))
			{
				mB=m;
				break;

			}
		}

		MovimientoBean movBean=new MovimientoBean(null,null,null,sucAct,estado,estadoPedido,mB);
		mB.addMovimiento(movBean);
		
		for (MercaderiaBean m : pB.getMercaderias()) {
			if(m.getIdMercaderia()==Integer.parseInt(numeroMercaderia))
			{
				m=mB;
				break;
			}
		}
		
		RequestDispatcher dispacher = request.getRequestDispatcher("index.jsp");					
		ControladorWeb.getInstancia().actualizarPedido(pB);
		dispacher.forward(request, response);
		
		
//		request.setAttribute("mercaderiaSeleccionada", mB);
//		RequestDispatcher dispacher = request.getRequestDispatcher("generarTraslado3.jsp");

//		dispacher.forward(request, response);
	}

}

