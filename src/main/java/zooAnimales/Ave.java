package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = color;
		totalAnimales++;
		listado.add(this);
	}
	
	public Ave() {
		this("", 0, "", "", "");
	}

	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}

	public String getColorPlumas() {
		return this.colorPlumas;
	}
	
	public void setColorPlumas(String color) {
		this.colorPlumas = color;
	}	
	
}
