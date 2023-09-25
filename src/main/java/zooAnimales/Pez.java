package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String color, int cantidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = color;
		this.cantidadAletas = cantidad;
		totalAnimales++;
		listado.add(this);
	}
	
	public Pez() {
		this("", 0, "", "", "", 0);
	}

	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Reptil crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Reptil(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Reptil crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Reptil(nombre, edad, "oceano", genero, "gris", 6);
	}

	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}

	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	
	public void setCantidadAletas(int cantidad) {
		this.cantidadAletas = cantidad;
	}

}
