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
import beans.PedidoBean;
import beans.SucursalBean;
import clienteWeb.ControladorWeb;

public class GenerarEnvio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GenerarEnvio2() {
		super();
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String fechaMax=request.getParameter("fechaMax");
		String dirDestino=request.getParameter("dirDestino");
		String horarioDeEntregaDesde=request.getParameter("horarioDeEntregaDesde")+":00";
		String horarioDeEntregaHasta=request.getParameter("horarioDeEntregaHasta")+":00";
		String condEspeciales=request.getParameter("condEspeciales");
		String manifiesto=request.getParameter("manifiesto");
		String dirDeRetiroSoloEmpresa=request.getParameter("dirDeRetiroSoloEmpresa");
		String tipoId=request.getParameter("tipoId");
		String nroC=request.getParameter("nro");
		ClienteBean cb=ControladorWeb.getInstancia().getCliente(tipoId,Integer.parseInt(nroC));
		String sucursal=request.getParameter("sucursal");
		if(!sucursal.equals(""))
		{
			
			SucursalBean sb=ControladorWeb.getInstancia().getSucursal(sucursal);			
			if(!fechaMax.equals("")&&!dirDestino.equals("")&&!horarioDeEntregaDesde.equals("")&&!horarioDeEntregaHasta.equals("")&&
					!condEspeciales.equals(""))
			{
				//			horarioDeEntregaDesde=horarioDeEntregaDesde.concat("2014-00-00 "+horarioDeEntregaDesde+":00");
				//			int min=Integer.parseInt(horarioDeEntregaDesde.substring(3, 5));
				PedidoBean pb=new PedidoBean();
				pb.setCliente(cb);
				pb.setDirDestino(dirDestino);
				pb.setFechaEnregaMaxima(java.sql.Date.valueOf(fechaMax));
				pb.setHorarioDeEntregaDesde(java.sql.Time.valueOf(horarioDeEntregaDesde));
				pb.setHorarioDeEntregahasta(java.sql.Time.valueOf(horarioDeEntregaHasta));
				pb.setCondEspeciales(condEspeciales);
				pb.setManifiesto(manifiesto);
				pb.setDirDeRetiroSoloEmpresa(dirDeRetiroSoloEmpresa);
				request.setAttribute("nuevoPedido", pb);
				int id=ControladorWeb.getInstancia().altaPedidoBean(pb);
				pb.setIdPedido(id);
				RequestDispatcher dispacher = request.getRequestDispatcher("agregarMercaderia.jsp");
				dispacher.forward(request, response);
			}
		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

