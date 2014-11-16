package beans;

import java.sql.Date;



public class MantenimientoRealizadoBean {
	
	private int idMantenimiento;
	private String descripcion;
	private float costo;
	private Date fecha;
	private float kilometrajeActual;
	private float kilometrosRealizadosDesdeUltimoControl;
	private String tipo;
	private VehiculoBean vehiculo;
	public MantenimientoRealizadoBean(String descripcion, float costo, Date fecha,
			float kilometrajeActual,
			float kilometrosRealizadosDesdeUltimoControl, String tipo, VehiculoBean vehiculo) {
		super();
		this.descripcion = descripcion;
		this.costo = costo;
		this.fecha = fecha;
		this.kilometrajeActual = kilometrajeActual;
		this.kilometrosRealizadosDesdeUltimoControl = kilometrosRealizadosDesdeUltimoControl;
		this.tipo = tipo;
	}
	
	public MantenimientoRealizadoBean(){}
	

	public int getIdMantenimiento() {
		return idMantenimiento;
	}

	public void setIdMantenimiento(int idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
	}




	public VehiculoBean getVehiculo() {
		return vehiculo;
	}




	public void setVehiculo(VehiculoBean vehiculo) {
		this.vehiculo = vehiculo;
	}




	public String getDescripcion() {
		return descripcion;
	}
	public float getCosto() {
		return costo;
	}
	public Date getFecha() {
		return fecha;
	}
	public float getKilometrajeActual() {
		return kilometrajeActual;
	}
	public float getKilometrosRealizadosDesdeUltimoControl() {
		return kilometrosRealizadosDesdeUltimoControl;
	}
	public String getTipo() {
		return tipo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setKilometrajeActual(float kilometrajeActual) {
		this.kilometrajeActual = kilometrajeActual;
	}
	public void setKilometrosRealizadosDesdeUltimoControl(
			float kilometrosRealizadosDesdeUltimoControl) {
		this.kilometrosRealizadosDesdeUltimoControl = kilometrosRealizadosDesdeUltimoControl;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
