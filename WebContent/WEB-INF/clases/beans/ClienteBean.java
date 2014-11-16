package beans;

import java.io.Serializable;


public abstract class ClienteBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idCliente;
	private String direccion;
	private String telefono;

	
	
	public ClienteBean(String direccion, String telefono) {
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public ClienteBean() {
	}

	public int getIdCliente(){
		return idCliente;
	}
	
	public void setIdCliente(int idCliente){
		this.idCliente = idCliente;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
