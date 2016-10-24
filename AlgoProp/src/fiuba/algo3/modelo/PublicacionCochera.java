package fiuba.algo3.modelo;

public class PublicacionCochera extends Publicacion {

	public PublicacionCochera(String barrio, int precio, String moneda,
			String inmobiliaria, Fecha fecha,
			IdentificadorPublicacion nroPublicacion) {
		Moneda monedaNueva = new Moneda(moneda);
		this.agregarDatos(barrio, precio, monedaNueva, inmobiliaria, fecha, nroPublicacion);
	}

}
