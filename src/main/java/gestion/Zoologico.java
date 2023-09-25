package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
	public Zoologico(String nombre, String ubicacion, Zona[] zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public Zoologico() {
		this("","", null);
	}
	
	public void agregarZonas(Zona zona) {
		for (int i = 0; i < this.zonas.length; i++) {
			if (zonas[i] == null) {
				zonas[i] = zona;
			}
		}
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for (int i = 0; i < this.zonas.length; i++) {
			total += zonas[i].cantidadAnimales();
		}
		return total;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public Zona[] getZonas() {
		return this.zonas;
	}
	
	public void setZonas(Zona[] zonas) {
		this.zonas = zonas;
	}

}
