package fiuba.algo3.modelo;

public class Publicacion {
	private IdentificadorPublicacion nroPublicacion;
	private String barrio;
	private Moneda moneda;
	private Fecha fecha;
	private String inmobiliaria;
	private int precio;
	
	public IdentificadorPublicacion obtenerIndentificador() {
		return this.nroPublicacion;
	}
	public void agregarDatos(String barrio,
			int precio, Moneda moneda, String inmobiliaria, Fecha fecha, IdentificadorPublicacion nroPublicacion){
		this.nroPublicacion = nroPublicacion;
		this.barrio = barrio;
		this.moneda = moneda;
		this.fecha = fecha;
		this.inmobiliaria = inmobiliaria;
		this.precio = precio;
	}
	public Double costo() {
		return (double)(this.fecha.devolverCantidadDias()*(double)precio* (double)moneda.conValor()/1000000);
	}
	public Double costoMes(String mes) {
		return (double)(fecha.devolverCantidadDiasEnMes(mes) * (double)precio * (double)moneda.conValor() / 1000000) ;
	}

}
