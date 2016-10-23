package fiuba.algo3.tests;

import org.junit.Test;


import fiuba.algo3.modelo.AlgoProp;
import fiuba.algo3.modelo.IdentificadorPublicacion;
import fiuba.algo3.modelo.Publicacion;

import static org.junit.Assert.*;
	
public class AlgoPropTests {

	@Test
	public void test01PrecioPublicacionDepartamentoPorDia() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 85000;
		String moneda = "Dolar";
		int superficie = 45;
		int expensas = 1200;
		int ambientes = 2;
		String fechaDesde = "2017-01-01";
		String fechaHasta = "2017-01-09";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarDepartamento(barrio, precio, moneda, superficie,
				expensas, ambientes, inmobiliaria, fechaDesde, fechaHasta);

		// dias * PrecioPropiedad * Cotizacion / 1000000
		// Ej 9 * 85000 * 15 / 1000000
		assertEquals(11.475, algoProp.costoPublicacion(numeroPublicacion), 0.0001D);
	}

	@Test
	public void test02PrecioPublicacionCasaPorDia() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 3500000;
		String moneda = "Peso";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-01-01";
		String fechaHasta = "2016-01-11";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarCasa(barrio, precio, moneda, superficie,
				ambientes, pisos, inmobiliaria, fechaDesde, fechaHasta);

		// dias * PrecioPropiedad / 1000000
		// Ej 11 * 3500000 / 1000000
		assertEquals(38.5, algoProp.costoPublicacion(numeroPublicacion), 0.0001D);
	}

	@Test
	public void test03PrecioPublicacionCocheraPorDia() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String fechaDesde = "2016-05-01";
		String fechaHasta = "2016-06-09";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria,
				fechaDesde, fechaHasta);

		// dias * PrecioPropiedad * Cotizacion / 1000000
		// Ej 40 * 25000 * 15 / 1000000
		assertEquals(15.0, algoProp.costoPublicacion(numeroPublicacion), 0.0001D);
	}

	@Test
	public void test04PrecioPublicacionDepartamentoMensual() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 1275000;
		String moneda = "Peso";
		int superficie = 45;
		int expensas = 1200;
		int ambientes = 2;
		String mes = "2016-08";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarDepartamento(barrio, precio, moneda, superficie,
				expensas, ambientes, inmobiliaria, mes);

		// 25 * PrecioPropiedad / 1000000
		// Ej 25 * 1275000 / 1000000
		assertEquals(31.875, algoProp.costoPublicacion(numeroPublicacion), 0.0001D);
	}

	@Test
	public void test05PrecioPublicacionCasaMensual() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 250000;
		String moneda = "Dolar";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String mes = "2016-08";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarCasa(barrio, precio, moneda, superficie,
				ambientes, pisos, inmobiliaria, mes);

		assertEquals(93.75, algoProp.costoPublicacion(numeroPublicacion), 0.0001D);
	}

	@Test
	public void test06PrecioPublicacionCocheraMensual() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-08";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria,
				mes);

		assertEquals(9.375, algoProp.costoPublicacion(numeroPublicacion), 0.0001D);
	}

	@Test
	public void test07PrecioPorInmobiliaria() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-09";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, mes);

		precio = 4000000;
		moneda = "Peso";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-07-25";
		String fechaHasta = "2016-08-10";

		algoProp.publicarCasa(barrio, precio, moneda, superficie, ambientes, pisos, inmobiliaria, fechaDesde,
				fechaHasta);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-05-01";
		fechaHasta = "2016-05-09";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, fechaDesde, fechaDesde);

		assertEquals(40, algoProp.costoParaInmobiliaria(inmobiliaria, "2016-08"), 0.0001D);
	}

	@Test
	public void test08PrecioPorInmobiliariaConMasDe3PublicacionesEnSuHistoriaTieneDescuentoDel15Porciento() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";

		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-08";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, mes);

		precio = 250000;
		moneda = "Dolar";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-07-25";
		String fechaHasta = "2016-08-09";

		algoProp.publicarCasa(barrio, precio, moneda, superficie, ambientes, pisos, inmobiliaria, fechaDesde,
				fechaHasta);

		precio = 1250000;
		moneda = "Peso";
		superficie = 45;
		int expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria, mes);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-05-01";
		fechaHasta = "2016-05-09";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, fechaDesde, fechaHasta);

		assertEquals(63.21875, algoProp.costoParaInmobiliaria(inmobiliaria, "2016-08"), 0.000001D);
	}

	@Test
	public void test09CalculoDeGanaciaMensual() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria1 = "Inmo SA";
		algoProp.agregarInmobiliaria(inmobiliaria1);

		String inmobiliaria2 = "Otra Inmo SA";
		algoProp.agregarInmobiliaria(inmobiliaria2);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-08";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria2, mes);

		precio = 250000;
		moneda = "Dolar";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-08-01";
		String fechaHasta = "2016-08-10";

		algoProp.publicarCasa(barrio, precio, moneda, superficie, ambientes, pisos, inmobiliaria2, fechaDesde,
				fechaHasta);

		precio = 1300000;
		moneda = "Peso";
		superficie = 45;
		int expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria2, mes);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-07-01";
		fechaHasta = "2016-08-31";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria2, fechaDesde, fechaHasta);

		precio = 1300000;
		moneda = "Peso";
		superficie = 45;
		expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria1, mes);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-07-01";
		fechaHasta = "2016-08-31";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria1, fechaDesde, fechaHasta);

		assertEquals(121.475, algoProp.calcularGanaciaParaMes("2016-08"), 0.0001D);
	}

	@Test
	public void test11FiltroDepartamentosPorPrecio() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";
		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-08";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, mes);

		precio = 250000;
		moneda = "Dolar";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-07-25";
		String fechaHasta = "2016-08-09";

		algoProp.publicarCasa(barrio, precio, moneda, superficie, ambientes, pisos, inmobiliaria, fechaDesde,
				fechaHasta);

		precio = 110000;
		moneda = "Dolar";
		superficie = 55;
		int expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria, mes);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-05-01";
		fechaHasta = "2016-05-09";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, fechaDesde, fechaHasta);

		precio = 1275000;
		moneda = "Peso";
		superficie = 45;
		expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarDepartamento(barrio, precio, moneda, superficie,
				expensas, ambientes, inmobiliaria, mes);

		Iterable<Publicacion> resultados = algoProp.buscarDepartamentoConPrecioEntre(1000000, 1500000, "Peso");

		assertEquals(1, obtenerCantidadPublicaciones(resultados));
		assertTrue(obtenerPublicacion(resultados, 0).obtenerIndentificador().equals(numeroPublicacion));
	}

	@Test
	public void test12FiltroDepartamentosPorPrecioYSuperficie() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";
		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-08";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, mes);

		precio = 250000;
		moneda = "Dolar";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-07-25";
		String fechaHasta = "2016-08-09";

		algoProp.publicarCasa(barrio, precio, moneda, superficie, ambientes, pisos, inmobiliaria, fechaDesde,
				fechaHasta);

		precio = 110000;
		moneda = "Dolar";
		superficie = 55;
		int expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria, mes);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-05-01";
		fechaHasta = "2016-05-09";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, fechaDesde, fechaHasta);

		precio = 1275000;
		moneda = "Peso";
		superficie = 45;
		expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarDepartamento(barrio, precio, moneda, superficie,
				expensas, ambientes, inmobiliaria, mes);

		Iterable<Publicacion> resultados = algoProp.buscarDepartamentoConPrecioEntreYSuperficieEntre(1000000, 1500000,
				"Peso", 40, 50);

		assertEquals(1, obtenerCantidadPublicaciones(resultados));
		assertTrue(obtenerPublicacion(resultados, 0).obtenerIndentificador().equals(numeroPublicacion));
	}

	@Test
	public void test13FiltroDepartamentosPorSuperficieYExpensas() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";
		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-08";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, mes);

		precio = 250000;
		moneda = "Dolar";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-07-25";
		String fechaHasta = "2016-08-09";

		algoProp.publicarCasa(barrio, precio, moneda, superficie, ambientes, pisos, inmobiliaria, fechaDesde,
				fechaHasta);

		precio = 110000;
		moneda = "Dolar";
		superficie = 40;
		int expensas = 1800;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria, mes);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-05-01";
		fechaHasta = "2016-05-09";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, fechaDesde, fechaHasta);

		precio = 1275000;
		moneda = "Peso";
		superficie = 45;
		expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarDepartamento(barrio, precio, moneda, superficie,
				expensas, ambientes, inmobiliaria, mes);

		Iterable<Publicacion> resultados = algoProp.buscarDepartamentoConExpensasEntreYSuperficieEntre(700, 1500, 40,
				50);

		assertEquals(1, obtenerCantidadPublicaciones(resultados));
		assertTrue(obtenerPublicacion(resultados, 0).obtenerIndentificador().equals(numeroPublicacion));
	}

	@Test
	public void test14FiltroCasaPorSuperficieYBarrio() {

		AlgoProp algoProp = new AlgoProp();

		String inmobiliaria = "Inmo SA";
		algoProp.agregarInmobiliaria(inmobiliaria);

		String barrio = "Boedo";
		int precio = 25000;
		String moneda = "Dolar";
		String mes = "2016-08";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, mes);

		precio = 250000;
		moneda = "Dolar";
		int superficie = 80;
		int ambientes = 4;
		int pisos = 1;
		String fechaDesde = "2016-07-25";
		String fechaHasta = "2016-08-09";

		IdentificadorPublicacion numeroPublicacion = algoProp.publicarCasa(barrio, precio, moneda, superficie,
				ambientes, pisos, inmobiliaria, fechaDesde, fechaHasta);

		precio = 110000;
		moneda = "Dolar";
		superficie = 40;
		int expensas = 1800;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria, mes);

		barrio = "Palermo";
		precio = 300000;
		moneda = "Dolar";
		superficie = 80;
		ambientes = 2;
		pisos = 1;
		fechaDesde = "2016-07-25";
		fechaHasta = "2016-08-09";

		algoProp.publicarCasa(barrio, precio, moneda, superficie, ambientes, pisos, inmobiliaria, fechaDesde,
				fechaHasta);

		barrio = "Boedo";
		precio = 110000;
		moneda = "Dolar";
		superficie = 40;
		expensas = 1800;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria, mes);

		precio = 25000;
		moneda = "Dolar";
		fechaDesde = "2016-05-01";
		fechaHasta = "2016-05-09";

		algoProp.publicarCochera(barrio, precio, moneda, inmobiliaria, fechaDesde, fechaHasta);

		precio = 1275000;
		moneda = "Peso";
		superficie = 45;
		expensas = 1200;
		ambientes = 2;
		mes = "2016-08";

		algoProp.publicarDepartamento(barrio, precio, moneda, superficie, expensas, ambientes, inmobiliaria, mes);

		Iterable<Publicacion> resultados = algoProp.buscarCasaConSuperficieEntreYBarrio(80, 120, "Boedo");

		assertEquals(1, obtenerCantidadPublicaciones(resultados));
		assertTrue(obtenerPublicacion(resultados, 0).obtenerIndentificador().equals(numeroPublicacion));
	}

	private Publicacion obtenerPublicacion(Iterable<Publicacion> resultados, int elemento) {
		int indice = 0;

		for (Publicacion publicacion : resultados) {
			if (indice == elemento) {
				return publicacion;
			}
			indice++;
		}

		return null;
	}

	private int obtenerCantidadPublicaciones(Iterable<Publicacion> resultados) {
		int cantidad = 0;

		for (Publicacion publicacion : resultados) {
			cantidad++;
		}

		return cantidad;
	}
}
