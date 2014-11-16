package clienteWeb;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import beans.PedidoBean;
import interfaz.InterfazEnvios;

public class ControladorWeb {
	InterfazEnvios controladorRMI;
	private static ControladorWeb instancia;

	public static void main(String[] args)
	{
		new ControladorWeb();
	}


	public static ControladorWeb getInstancia()
	{
		if(instancia==null)
			return instancia=new ControladorWeb();
		return instancia;
	}

	private boolean getStub() 
	{
		try {

			controladorRMI = (InterfazEnvios)Naming.lookup ("//localhost/Envios");
			System.out.println("Me pude conectar al server");
			return true;
		} catch (Exception e) {
			System.out.println("No me puedo conectar al server");
			e.printStackTrace();
		}
		return false;

	}

	public void cargaPrueba()
	{

		try
		{

			controladorRMI.altaParticular("salta 1234", "543523", "Pepe", "Garcia", "32243243");
			controladorRMI.altaParticular("salta 1234", "41233", "Damian", "M", "34554567");
			controladorRMI.altaEmpresa("DirEmpresa","3432423","Razon01","cuit01","Regular");
			controladorRMI.altaEmpresa("DirEmpresa2","999999","Razon02","cuit02","Regular");
			controladorRMI.altaProducto("TipoComun", "1kg de cocaina", "cuit01");
			controladorRMI.altaProducto("TipoComun", "caja de absenta", "cuit01");
			controladorRMI.agregarEmpresaDireccionValida("DireccionValida 01","54654645","cuit01");
			controladorRMI.altaSucursal("sucursal1","Direccion1","Gerente1","EncDespacho1","EncRecep1");
			controladorRMI.altaSucursal("sucursal2","Direccion2","Gerente2","EncDespacho2","EncRecep2");


			controladorRMI.altaDeposito(500, "EncDeposito1", "sucursal1");
			controladorRMI.altaDeposito(1000, "EncDeposito2", "sucursal1");
			controladorRMI.altaDeposito(1500, "EncDeposito3", "sucursal1");
			controladorRMI.altaDeposito(500, "EncDeposito4", "sucursal1");


			controladorRMI.altaCuentaCorriente(999999, 0, 5000, "cuit01");			
			controladorRMI.altaMovimientoCuenta(null, 500, 999999);
		}
		catch(RemoteException e){
			e.printStackTrace();
		}
	}

	public ControladorWeb()
	{
		instancia=this;
		this.getStub();
	}

	public List<PedidoBean> getPedidosPorEstado(String estado){
		try {
			return controladorRMI.getMesasPorEstado(estado);			
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}



}

	//	public List<RestauranteBean> getRestaurantes(){
	//		try {
	//			return rmiController.getRestaurantes();			
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//			return null;
	//		}
	//	}	
	//
	//	public List<MozoBean> getMozos(Integer restaurante){
	//		try {
	//			return rmiController.getMozosDeRestaurante(restaurante);			
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//			return null;
	//		}
	//	}	
	//
	//	public List<MesaBean> getMesasPorEstado(String estado){
	//		try {
	//			return rmiController.getMesasPorEstado(estado);			
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//			return null;
	//		}
	//	}
	//
	//	public List<MesaBean> getMesasDeMozo(Integer legajo){
	//		try {
	//			return rmiController.getMesasDeMozo(legajo);			
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//			return null;
	//		}
	//	}
	//
	//	public List<MedioPagoBean> getMediosPago(){
	//		try {
	//			return rmiController.getMediosPago();
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//			return null;
	//		}
	//	}
	//
	//	public void liberarMesa(Integer numeroRestaurante, Integer numeroMesa){
	//		try {
	//			//			rmiController.liberarMesa(numeroRestaurante, numeroMesa);
	//			rmiController.liberarMesa(numeroRestaurante, numeroMesa);
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//	}
	//
	//	public void crearComanda(Integer numeroMesa){
	//		tmpComanda = new ComandaBean();
	//		MesaBean m = new MesaBean();
	//		m.setNumero(numeroMesa);
	//		tmpComanda.setMesa(m);
	//
	//		System.out.println("se creo la comanda");
	//
	//	}
	//
	//	public void agregarItemComandaActual(Integer idPlato, Integer cantidad) {
	//		ItemComandaBean i = new ItemComandaBean();
	//		PlatoBean p = new PlatoBean();
	//		p.setIdPlato(idPlato);
	//		i.setCantidad(cantidad);
	//		i.setPlato(p);
	//		if(this.tmpComanda.getItemsComanda() == null)
	//			this.tmpComanda.setItemsComanda(new LinkedList<ItemComandaBean>());
	//		this.tmpComanda.getItemsComanda().add(i);
	//	}
	//
	//	public void generarComanda() {
	//		try {
	//			rmiController.generarComandas(this.tmpComanda.getMesa().getNumero(), this.tmpComanda.getItemsComanda());
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//	}
	//
	//
	//
	//	public void abrirMesa(Integer legajo, Integer numeroMesa, Integer cantComensales){
	//		try {
	//			rmiController.registrarAperturaMesa(legajo, numeroMesa, cantComensales);
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//	}
	//
	//	public Float getImporteAFacturar(Integer restaurante, Integer mesa){
	//		try {
	//			return rmiController.calcularTotalMesa(restaurante, mesa);
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//			return (float) 0;
	//		}
	//	}
	//
	//	public void generarFactura(Integer mesa, Integer medioPago){
	//		try {
	//			rmiController.generarFactura(mesa, medioPago);
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();			
	//		}
	//	}
	//
	//	public void cerrarMesa(Integer numeroRestaurante, Integer numeroMesa) {
	//		// TODO Auto-generated method stub
	//		try {
	//			rmiController.cerrarMesa(numeroRestaurante, numeroMesa);
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//
	//	}
	//
	//	public Float calcularTotalMesa(Integer numeroRestaurante, Integer numeroMesa) {
	//		Float total = new Float(0);
	//		// TODO Auto-generated method stub
	//		try {
	//			total = rmiController.calcularTotalMesa(numeroRestaurante, numeroMesa);
	//		} catch (RemoteException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//		return total;
	//	}
	//
	//}
