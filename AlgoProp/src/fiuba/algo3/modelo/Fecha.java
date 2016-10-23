package fiuba.algo3.modelo;

import java.util.Date;

public class Fecha {
    private Date fechaDesde;
    private Date fechaHasta;
    private int cantidadDias;
    private boolean esTodoElMes;

	public int devolverCantidadDias() {
		return this.cantidadDias;
	}

	public void cargarDesdeHasta(String fechaDesde, String fechaHasta) {
		this.fechaDesde = new Date(fechaDesde);
		this.fechaHasta = new Date(fechaHasta);
	
	}


	public void cargarEnMes(String fechaMes) {
		this.fechaDesde = new Date(fecha);
		this.fechaHasta = new Date(fechaHasta);
		
	}
	
	public int devolverCantidadDiasEnMes(String fechaMes) {
		if (esTodoElMes) return 25;
		else return 0;
	}


}
