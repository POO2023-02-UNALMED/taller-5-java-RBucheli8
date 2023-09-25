package gestion;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	public Zona(String nombre, Zoologico zoo, Animal[] animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	public Zona() {
		this("", null, null);
	}
	
	public void agregarAnimales(Animal animal) {
		for (int i = 0; i < this.animales.length; i++) {
			if (animales[i] == null) {
				animales[i] = animal;
			}
		}
	}
	
	public int cantidadAnimales() {
		return this.animales.length;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Animal[] getAnimales() {
		return this.animales;
	}
	
	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}

}
