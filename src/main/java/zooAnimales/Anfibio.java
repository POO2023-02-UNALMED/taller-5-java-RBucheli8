package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean venenoso) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = color;
		this.venenoso = venenoso;
		totalAnimales++;
		listado.add(this);
	}
	
	public Anfibio() {
		this("", 0, "", "", "", false);
	}

	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public void setColorPiel(String color) {
		this.colorPiel = color;
	}

	public boolean isVenenoso() {
		return this.venenoso;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

}
