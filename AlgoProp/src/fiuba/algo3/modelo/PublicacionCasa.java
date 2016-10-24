package fiuba.algo3.modelo;

public class PublicacionCasa extends Publicacion{
	private int superficie;
	private int ambientes;
	private int pisos;
	
	public PublicacionCasa(String barrio, int precio, String moneda,
			int superficie, int ambientes, int pisos, String inmobiliaria,
			Fecha fechaNueva, IdentificadorPublicacion nroPublicacion) {
		Moneda monedaNueva = new Moneda(moneda);
		this.superficie = superficie;
		this.ambientes = ambientes;
		this.pisos = pisos;
		this.agregarDatos(barrio, precio, monedaNueva, inmobiliaria, fechaNueva, nroPublicacion);
		
	}

}
