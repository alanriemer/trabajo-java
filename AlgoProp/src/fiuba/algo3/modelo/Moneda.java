package fiuba.algo3.modelo;

public class Moneda {
	private String tMoneda;
	private int cotizacion;
	
	public Moneda(String moneda) {
		this.tMoneda = moneda;
		this.cotizacion = 15;
	}

	public int conValor() {
		if (tMoneda == "Dolar") return cotizacion;
		return 1;
	}


	public String nombreMoneda() {
		return tMoneda;
	}

}
