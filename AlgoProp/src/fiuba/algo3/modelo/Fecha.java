package fiuba.algo3.modelo;

import java.util.Date;
public class Fecha {
    private Date fechaDesde;
    private Date fechaHasta;
    private int cantidadDias;
    private boolean esTodoElMes;
    public Fecha(){
		this.fechaDesde = new Date();
		this.fechaHasta = new Date();
	}

	public int devolverCantidadDias() {
		return this.cantidadDias;
	}

	public void cargarDesdeHasta(String desde, String hasta) {
		this.esTodoElMes = false;
		fechaDesde.parse(desde);
		this.cantidadDias = this.fechaDesde.getDay() -  this.fechaHasta.getDay();
	
	}


	public void cargarEnMes(String mes) {
		this.esTodoElMes = true;
		this.cantidadDias = 25;
	}
	
	public int devolverCantidadDiasEnMes(String fechaMes) {
		if (esTodoElMes == true) return 25;
		else return 0;
	}


}
