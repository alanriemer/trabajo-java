package fiuba.algo3.modelo;

public class Moneda {
	private String tMoneda;
	private int cotizacion;
	
	public int conValor() {
		if (tMoneda == "Dolar") return cotizacion;
		return 1;
	}

	public void agregar(String moneda) {
		this.tMoneda = moneda;
		this.cotizacion = 15;
		
	}

	public String nombreMoneda() {
		// TODO Auto-generated method stub
		return tMoneda;
	}

}
