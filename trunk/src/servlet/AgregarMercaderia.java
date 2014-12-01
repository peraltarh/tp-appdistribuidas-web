package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import beans.ClienteBean;
import beans.EmpresaBean;
import beans.MercaderiaBean;
import beans.MercaderiaPorPesoBean;
import beans.MercaderiaPorVolumenBean;
import beans.PedidoBean;
import beans.SucursalBean;
import clienteWeb.ControladorWeb;
import beans.MovimientoBean;

public class AgregarMercaderia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AgregarMercaderia() {
		super();
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

		int nro=Integer.parseInt(request.getParameter("nro"));
		String ultimaMercaderia=request.getParameter("ultimaMercaderia");

		String tipoMercaderia=request.getParameterValues("tipo")[0];
		float alto=Float.parseFloat(request.getParameter("alto"));
		float ancho=Float.parseFloat(request.getParameter("ancho"));
		float profundidad=Float.parseFloat(request.getParameter("profundidad"));
		String fragilidad=request.getParameter("fragilidad");
		int cantApilable=Integer.parseInt(request.getParameter("cantApilable"));
		boolean apilable=true;
		if(cantApilable==0)
			apilable=false;
		String condViaje=request.getParameter("condViaje");
		String indicacionesManipulacion=request.getParameter("indicacionesManipulacion");
		String direDestino=request.getParameter("direDestino");

		String volPeso=request.getParameter("volPeso");

		if(!tipoMercaderia.equals("")&&alto>0&&ancho>0&&profundidad>0&&!fragilidad.equals("")
				&&!condViaje.equals("")&&!direDestino.equals("")&&!volPeso.equals("")&&cantApilable>=0)
		{

			PedidoBean pb=ControladorWeb.getInstancia().getPedido(nro);

			MercaderiaBean mb=null;
			if(tipoMercaderia.equals("porPeso"))
			{
				mb=new MercaderiaPorPesoBean();
			}
			else if(tipoMercaderia.equals("porVolumen"))
			{
				mb=new MercaderiaPorVolumenBean();
			}

			mb.setAlto(alto);
			mb.setAncho(ancho);
			mb.setApilable(apilable);
			mb.setCantApilable(cantApilable);
			mb.setCondDeViaje(condViaje);
			mb.setCoordenadasDestino(direDestino);
			mb.setPedido(pb);
			mb.setDeposito(pb.getSucursal().getDepositos().get(0));	
			mb.setFragilidad(fragilidad);
			mb.setIndicacionesManpulacion(indicacionesManipulacion);
			MovimientoBean movB = new MovimientoBean(null,null,pb.getSucursal().getNombre(),pb.getSucursal().getNombre(),"Recibido","Recibido",mb);
			mb.addMovimiento(movB);
			pb.addMercaderia(mb);


			request.setAttribute("nuevoPedido", pb);


			if(ultimaMercaderia!=null)
			{


				//RequestDispatcher dispacher = request.getRequestDispatcher("index.jsp");	
				ControladorWeb.getInstancia().actualizarPedido(pb);
				String respuesta=ControladorWeb.getInstancia().cerrarPedido(pb);
				if(respuesta == null)respuesta = "No se recibio infomacion del pedido";
				RequestDispatcher dispacher = request.getRequestDispatcher("respuestaValidarPedidosSucursal.jsp");
				request.setAttribute("respuesta", respuesta);
				dispacher.forward(request, response);
			}
			else{
				ControladorWeb.getInstancia().actualizarPedido(pb);
				RequestDispatcher dispacher = request.getRequestDispatcher("agregarMercaderia.jsp");
				dispacher.forward(request, response);
			}

		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

