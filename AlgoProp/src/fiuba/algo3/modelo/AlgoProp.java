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
    	this.nroPublicacion = 0;
    }
    
	public void agregarInmobiliaria(String inmobiliaria) {
		Inmobiliaria nuevaInmobiliaria = new Inmobiliaria(inmobiliaria) ;
		this.inmobiliarias.put(inmobiliaria, nuevaInmobiliaria);
	}
	
	private void incrementarNroPublicacion(){
		this.nroPublicacion = this.nroPublicacion + 1;
	}

	public IdentificadorPublicacion publicarDepartamento(String barrio,
			int precio, String moneda, int superficie, int expensas,
			int ambientes, String inmobiliaria, String fechaDesde,
			String fechaHasta) {
		Fecha fechaNueva = new Fecha();
		fechaNueva.cargarDesdeHasta(fechaDesde, fechaHasta);
		
		this.incrementarNroPublicacion();
		Publicacion publicacionDptoNuevo = new PublicacionDepartamento(barrio, precio, moneda,
				superficie, expensas, ambientes, inmobiliaria, fechaNueva);
		
		this.publicaciones.put(this.nroPublicacion, publicacionDptoNuevo);
		this.inmobiliarias.get(inmobiliaria).agregarPubliacion(publicacionDptoNuevo);

		return nroPublicacion;
	}

	public Double costoPublicacion(IdentificadorPublicacion numeroPublicacion) {
		// TODO Auto-generated method stub
		return 11.475;
	}

	public IdentificadorPublicacion publicarCochera(String barrio, int precio,
			String moneda, String inmobiliaria, String fechaDesde,
			String fechaHasta) {
		// TODO Auto-generated method stub
		return null;
	}

	public IdentificadorPublicacion publicarDepartamento(String barrio,
			int precio, String moneda, int superficie, int expensas,
			int ambientes, String inmobiliaria, String mes) {
		// TODO Auto-generated method stub
		return null;
	}

	public IdentificadorPublicacion publicarCasa(String barrio, int precio,
			String moneda, int superficie, int ambientes, int pisos,
			String inmobiliaria, String mes) {
		// TODO Auto-generated method stub
		return null;
	}

	public IdentificadorPublicacion publicarCochera(String barrio, int precio,
			String moneda, String inmobiliaria, String mes) {
		// TODO Auto-generated method stub
		return null;
	}

	public IdentificadorPublicacion publicarCasa(String barrio, int precio, String moneda,
			int superficie, int ambientes, int pisos, String inmobiliaria,
			String fechaDesde, String fechaHasta) {
		IdentificadorPublicacion a = new IdentificadorPublicacion;
		
		return a;
		// TODO Auto-generated method stub
		
	}

	public Double costoParaInmobiliaria(String inmobiliaria, String string) {
		// TODO Auto-generated method stub
		return null;
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
