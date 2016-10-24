package fiuba.algo3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.Fecha;
import fiuba.algo3.modelo.Moneda;

public class MonedaTests {

	@Test
	public void	test01CrearMonedaEnDolarDevuelve15(){
		Moneda monedaNueva = new Moneda("Dolar");
		assertEquals(15, monedaNueva.conValor(), 0.0001D);

	}
	
	@Test
	public void	test02CrearMonedaEnDolarDevuelveNombre(){
		Moneda monedaNueva = new Moneda("Dolar");
		assertEquals(monedaNueva.nombreMoneda(), "Dolar");

	}
	
	@Test
	public void	test03CrearMonedaEnPesoDevuelve1(){
		Moneda monedaNueva = new Moneda("Peso");
		assertEquals(1, monedaNueva.conValor(), 0.0001D);

	}	

}
