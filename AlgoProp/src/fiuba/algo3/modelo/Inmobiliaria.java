package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class Inmobiliaria {
	private String nombre;
	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	
	public Inmobiliaria(){}
	public Inmobiliaria (String nombre){
		this.nombre = nombre;
		
	}
	public void agregarPublicacion(Publicacion publicacion) {
		this.publicaciones.add(publicacion);
		
	}
	public Double costoEnMes(String mes) {
		Double costo = 0.0;
		for (Publicacion publicacion : this.publicaciones) {
			costo = costo + publicacion.costoMes(mes);
		}
		return costo;
	}
	
}
