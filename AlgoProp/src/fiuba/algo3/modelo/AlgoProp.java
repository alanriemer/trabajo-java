package fiuba.algo3.modelo;
import java.util.HashMap;

public class AlgoProp {

	public void agregarInmobiliaria(String inmobiliaria) {
		Inmobiliaria nuevaInmobiliaria = new Inmobiliaria(inmobiliaria) ;
		
		
		// TODO Auto-generated method stub
		
	}

	public IdentificadorPublicacion publicarDepartamento(String barrio,
			int precio, String moneda, int superficie, int expensas,
			int ambientes, String inmobiliaria, String fechaDesde,
			String fechaHasta) {
		// TODO Auto-generated method stub
		return null;
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
