package fiuba.algo3.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	private int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}

	public void cargarDesdeHasta(String desde, String hasta) {
		this.esTodoElMes = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.fechaDesde = sdf.parse(desde);
			this.fechaHasta = sdf.parse(hasta);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.cantidadDias = daysBetween(this.fechaDesde,this.fechaHasta)+1;
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
