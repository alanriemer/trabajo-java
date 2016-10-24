package fiuba.algo3.modelo;
import java.util.HashMap;
import java.util.Map;

public class AlgoProp {
	
	private Map<String, Inmobiliaria> inmobiliarias;
	private Map<IdentificadorPublicacion, Publicacion> publicaciones;
	private Filtro filtro;
	private IdentificadorPublicacion nroPublicacion;
	
    public AlgoProp(){	
    	this.inmobiliarias = new HashMap<String, Inmobiliaria>();
    	this.publicaciones = new HashMap<IdentificadorPublicacion, Publicacion>();
    	this.filtro = new Filtro();
    	this.nroPublicacion = new IdentificadorPublicacion();
    }
    
	private void incrementarNroPublicacion(){
		this.nroPublicacion.incrementar();
	}

	public void agregarInmobiliaria(String inmobiliaria) {
		Inmobiliaria nuevaInmobiliaria = new Inmobiliaria(inmobiliaria) ;
		this.inmobiliarias.put(inmobiliaria, nuevaInmobiliaria);
	}
	
	public IdentificadorPublicacion publicarDepartamento(String barrio,
			int precio, String moneda, int superficie, int expensas,
			int ambientes, String inmobiliaria, String fechaDesde,
			String fechaHasta) {
		Fecha fechaNueva = new Fecha();
		fechaNueva.cargarDesdeHasta(fechaDesde, fechaHasta);
		
		this.incrementarNroPublicacion();
		Publicacion publicacionDptoNuevo = new PublicacionDepartamento(barrio, precio, moneda,
				superficie, expensas, ambientes, inmobiliaria, fechaNueva, nroPublicacion);
		
		this.publicaciones.put(this.nroPublicacion, publicacionDptoNuevo);
		this.inmobiliarias.get(inmobiliaria).agregarPublicacion(publicacionDptoNuevo);

		return nroPublicacion;
	}

	public IdentificadorPublicacion publicarDepartamento(String barrio,
			int precio, String moneda, int superficie, int expensas,
			int ambientes, String inmobiliaria, String mes) {
		Fecha fechaNueva = new Fecha();
		fechaNueva.cargarEnMes(mes);
		
		this.incrementarNroPublicacion();
		Publicacion publicacionDptoNuevo = new PublicacionDepartamento(barrio, precio, moneda,
				superficie, expensas, ambientes, inmobiliaria, fechaNueva, nroPublicacion);
		
		this.publicaciones.put(this.nroPublicacion, publicacionDptoNuevo);
		this.inmobiliarias.get(inmobiliaria).agregarPublicacion(publicacionDptoNuevo);

		return nroPublicacion;
	}

	public IdentificadorPublicacion publicarCochera(String barrio, int precio,
			String moneda, String inmobiliaria, String fechaDesde,
			String fechaHasta) {
		Fecha fechaNueva = new Fecha();
		fechaNueva.cargarDesdeHasta(fechaDesde, fechaHasta);
		Publicacion publicacionCocheraNueva = new PublicacionCochera(barrio, precio, moneda, 
				inmobiliaria, fechaNueva, nroPublicacion);
		this.incrementarNroPublicacion();		
		this.publicaciones.put(this.nroPublicacion, publicacionCocheraNueva);
		this.inmobiliarias.get(inmobiliaria).agregarPublicacion(publicacionCocheraNueva);

		return nroPublicacion;
	}


	public IdentificadorPublicacion publicarCochera(String barrio, int precio,
			String moneda, String inmobiliaria, String mes) {
		Fecha fechaNueva = new Fecha();
		fechaNueva.cargarEnMes(mes);
		Publicacion publicacionCocheraNueva = new PublicacionCochera(barrio, precio, moneda, 
				inmobiliaria, fechaNueva, nroPublicacion);
		this.incrementarNroPublicacion();		
		this.publicaciones.put(this.nroPublicacion, publicacionCocheraNueva);
		this.inmobiliarias.get(inmobiliaria).agregarPublicacion(publicacionCocheraNueva);

		return nroPublicacion;
	}

	public IdentificadorPublicacion publicarCasa(String barrio, int precio,
			String moneda, int superficie, int ambientes, int pisos,
			String inmobiliaria, String mes) {
		Fecha fechaNueva = new Fecha();
		fechaNueva.cargarEnMes(mes);
		Publicacion publicacionCasaNueva = new PublicacionCasa(barrio, precio, moneda, superficie, 
				ambientes, pisos, inmobiliaria, fechaNueva, nroPublicacion);
		this.publicaciones.put(this.nroPublicacion, publicacionCasaNueva);
		this.inmobiliarias.get(inmobiliaria).agregarPublicacion(publicacionCasaNueva);

		return nroPublicacion;
	}



	public IdentificadorPublicacion publicarCasa(String barrio, int precio,
			String moneda, int superficie, int ambientes, int pisos,
			String inmobiliaria, String fechaDesde, String fechaHasta) {
		Fecha fechaNueva = new Fecha();
		fechaNueva.cargarDesdeHasta(fechaDesde, fechaHasta);
		Publicacion publicacionCasaNueva = new PublicacionCasa(barrio, precio, moneda, superficie, 
				ambientes, pisos, inmobiliaria, fechaNueva, nroPublicacion);
		this.publicaciones.put(this.nroPublicacion, publicacionCasaNueva);
		this.inmobiliarias.get(inmobiliaria).agregarPublicacion(publicacionCasaNueva);

		return nroPublicacion;
	}

	public Double costoPublicacion(IdentificadorPublicacion numeroPublicacion) {
		return this.publicaciones.get(numeroPublicacion).costo();
	}

	public Double costoParaInmobiliaria(String inmobiliaria, String mes) {
		return this.inmobiliarias.get(inmobiliaria).costoEnMes(mes);
	}

	public Double calcularGanaciaParaMes(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Publicacion> buscarDepartamentoConPrecioEntre(int i, int j,
			String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Publicacion> buscarDepartamentoConPrecioEntreYSuperficieEntre(
			int i, int j, String string, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Publicacion> buscarDepartamentoConExpensasEntreYSuperficieEntre(
			int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Publicacion> buscarCasaConSuperficieEntreYBarrio(int i,
			int j, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
