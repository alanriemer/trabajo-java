package fiuba.algo3.modelo;


public class PublicacionDepartamento extends Publicacion{
	
	private int conSuperficie;
	private int conExpensas;
	private int conCantidadAmbientes;
	
	public PublicacionDepartamento(){}
	public PublicacionDepartamento(String barrio,
			int precio, String moneda, int superficie, int expensas,
			int ambientes, String inmobiliaria, Fecha fecha, IdentificadorPublicacion nroPublicacion){
		this.conSuperficie = superficie;
		this.conExpensas = expensas;
		this.conCantidadAmbientes = ambientes;
		Moneda monedaNueva = new Moneda(moneda);
		this.agregarDatos(barrio, precio, monedaNueva, inmobiliaria, fecha, nroPublicacion);
		
	}
	
	
}
