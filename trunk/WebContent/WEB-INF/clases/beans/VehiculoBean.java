package beans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;




public class VehiculoBean {

	private float pesoMax;
	private float volumenMax;
	private String condEspeciales;
	private float tara;
	private String patente;
	private int nroChasis;
	private String tipo;
	private float kilometrakeActual;
	private float kilometrajemaximo;
	private Date modelo;
	private String coordenadaActual;
	private String estado;
	private long numeroPolizaSeguro;
	private Date expiracionGarantia;
	private SucursalBean sucursal;
	private List<PlanDeMantenimientoBean> mantenimientosPlaneados;
	private List<MantenimientoRealizadoBean> mantenimientosRealizados;
	private List<RemitoBean> remitos;

	public VehiculoBean(float pesoMax, float volumenMax, String condEspeciales,	float tara, String patente, int nroChasis, String tipo,	float kilometrakeActual, float kilometrajemaximo, Date modelo,
			String coordenadaActual, String estado, long numeroPolizaSeguro,
			Date expiracionGarantia, SucursalBean sucursal) {
		super();
		this.pesoMax = pesoMax;
		this.volumenMax = volumenMax;
		this.condEspeciales = condEspeciales;
		this.tara = tara;
		this.patente = patente;
		this.nroChasis = nroChasis;
		this.tipo = tipo;
		this.kilometrakeActual = kilometrakeActual;
		this.kilometrajemaximo = kilometrajemaximo;
		this.modelo = modelo;
		this.coordenadaActual = coordenadaActual;
		this.estado = estado;
		this.numeroPolizaSeguro = numeroPolizaSeguro;
		this.expiracionGarantia = expiracionGarantia;
		this.mantenimientosPlaneados= new ArrayList<PlanDeMantenimientoBean>();
		this.mantenimientosRealizados = new ArrayList<MantenimientoRealizadoBean>();
		this.remitos = new ArrayList<RemitoBean>();
	}

	public VehiculoBean(){}
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}

	public float getPesoMax() {
		return pesoMax;
	}

	public float getVolumenMax() {
		return volumenMax;
	}

	public String getCondEspeciales() {
		return condEspeciales;
	}

	public float getTara() {
		return tara;
	}


	public int getNroChasis() {
		return nroChasis;
	}

	public String getTipo() {
		return tipo;
	}

	public float getKilometrakeActual() {
		return kilometrakeActual;
	}

	
	public float getKilometrajemaximo() {
		return kilometrajemaximo;
	}

	public Date getModelo() {
		return modelo;
	}

	public String getCoordenadaActual() {
		return coordenadaActual;
	}

	public String getEstado() {
		return estado;
	}

	public long getNumeroPolizaSeguro() {
		return numeroPolizaSeguro;
	}

	public Date getExpiracionGarantia() {
		return expiracionGarantia;
	}



	public void setPesoMax(float pesoMax) {
		this.pesoMax = pesoMax;
	}

	public void setVolumenMax(float volumenMax) {
		this.volumenMax = volumenMax;
	}

	public void setCondEspeciales(String condEspeciales) {
		this.condEspeciales = condEspeciales;
	}

	public void setTara(float tara) {
		this.tara = tara;
	}

	public void setNroChasis(int nroChasis) {
		this.nroChasis = nroChasis;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setKilometrakeActual(float kilometrakeActual) {
		this.kilometrakeActual = kilometrakeActual;
	}

	public void setKilometrajemaximo(float kilometrajemaximo) {
		this.kilometrajemaximo = kilometrajemaximo;
	}

	public void setModelo(Date modelo) {
		this.modelo = modelo;
	}

	public void setCoordenadaActual(String coordenadaActual) {
		this.coordenadaActual = coordenadaActual;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setNumeroPolizaSeguro(long numeroPolizaSeguro) {
		this.numeroPolizaSeguro = numeroPolizaSeguro;
	}

	public void setExpiracionGarantia(Date expiracionGarantia) {
		this.expiracionGarantia = expiracionGarantia;
	}


	public SucursalBean getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalBean sucursal) {
		this.sucursal = sucursal;
	}


	public List<PlanDeMantenimientoBean> getMantenimientosPlaneados() {
		return mantenimientosPlaneados;
	}

	public void setMantenimientosPlaneados(
			List<PlanDeMantenimientoBean> mantenimientosPlaneados) {
		this.mantenimientosPlaneados = mantenimientosPlaneados;
	}
	

	public List<MantenimientoRealizadoBean> getMantenimientosRealizados() {
		return mantenimientosRealizados;
	}
	
	public void setMantenimientosPlaneados(ArrayList<PlanDeMantenimientoBean> mantenimientosPlaneados) {
		this.mantenimientosPlaneados = mantenimientosPlaneados;
	}
	
	
	

	public void setMantenimientosRealizados(
			List<MantenimientoRealizadoBean> mantenimientosRealizados) {
		this.mantenimientosRealizados = mantenimientosRealizados;
	}

	public List<RemitoBean> getRemitos() {
		return remitos;
	}
	public void setRemitos(List<RemitoBean> remitos) {
		this.remitos = remitos;
	}

	
	public void addMantenimientoPlaneado(PlanDeMantenimientoBean mantenimientoPlaneado) 
	{
		this.mantenimientosPlaneados.add(mantenimientoPlaneado);
	}

	public void addMantenimientoRealizado(MantenimientoRealizadoBean mantenimientoRealizado) {
		this.mantenimientosRealizados.add(mantenimientoRealizado);
	}

	
	public void addRemito(RemitoBean remito) {
		this.remitos.add(remito);
	}

	
	

}
