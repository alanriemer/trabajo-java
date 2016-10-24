package fiuba.algo3.modelo;

public class IdentificadorPublicacion {
	private int nroPublicacion;
	
	public IdentificadorPublicacion(){
		this.nroPublicacion = 0;
		
	}
	public void incrementar() {
		this.nroPublicacion = this.nroPublicacion + 1;
		
	}

}
