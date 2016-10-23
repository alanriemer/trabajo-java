package fiuba.algo3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.Fecha;

public class FechaTest {

	@Test
	public void	test01FechaDesdeHastaDevuelveCantidadDeDias(){
		Fecha fechaNueva = new Fecha();
		String fechaDesde = "2016-01-01";
		String fechaHasta = "2016-06-06";
		fechaNueva.cargarDesdeHasta(fechaDesde, fechaHasta);
		assertEquals(158, fechaNueva.devolverCantidadDias(), 0.0001D);
	}
  	@Test
  	public void	test02FechaDesdeHastaDevuelveCantidadDiasEnDeterminadoMes(){
  		Fecha fechaNueva = new Fecha();
  		String fechaDesde = "2016-05-01";
  		String fechaHasta = "2016-06-18";
  		String fechaMes = "2016-06";
  		fechaNueva.cargarDesdeHasta(fechaDesde, fechaHasta);
  		assertEquals(158, fechaNueva.devolverCantidadDiasEnMes(fechaMes), 0.0001D);
  	}	

  	@Test
  	public void	test03FechaDevuelveCantidadDiasDeMes(){
  		Fecha fechaNueva = new Fecha();
  		String fechaMes = "2016-06";
  		fechaNueva.cargarEnMes(fechaMes);
  		assertEquals(25, fechaNueva.devolverCantidadDias(), 0.0001D);
  	}		
  	

}
