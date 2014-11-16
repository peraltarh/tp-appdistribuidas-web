package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import beans.ClienteBean;
import beans.PedidoBean;
import beans.SucursalBean;


public interface InterfazEnvios extends Remote
{
	public void agregarEmpresaDireccionValida( String direccion, String tel, String cuit) throws RemoteException;
	public void altaCuentaCorriente(int cbu,float saldoActual, float minimoPermitidoSinAuth, String cuit) throws RemoteException;
	public void altaMovimientoCuenta(Date fecha, float monto, int cbu) throws RemoteException;
	public void altaParticular(String direccion, String telefono, String nombre, String apellido, String dni) throws RemoteException;
	public void altaProducto(String tipo, String descripcion, String cuit) throws RemoteException;
	public void altaEmpresa(String direccion, String telefono, String razonSoial, String cuit, String regularidad) throws RemoteException;
	public void buscarClienteParticular(String dni) throws RemoteException;
	public void buscarClienteEmpresa(String cuit) throws RemoteException;
	public void altaSucursal(String nombre, String dir, String gerente, String encDespacho, String encRecepcion) throws RemoteException;
	public void altaDeposito(float cantidadMax, String encargado, String sucursal) throws RemoteException;
	public void altaPedido(String manifiesto, String dirDestino, Date fechaEnregaMaxima,Date fechaEntregaEstimada, String condEspeciales,Date horarioDeEntregaDesde, Date horarioDeEntregahasta,	String dirDeRetiroSoloEmpresa, int prioridad, String estado,String sucursal,String cliente, String tipoC) throws RemoteException;
	public List<PedidoBean> getMesasPorEstado(String estado) throws RemoteException;
	
}
