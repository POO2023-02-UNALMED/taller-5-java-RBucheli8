package zooAnimales;

public class Anfibio extends Animal {
	private static Anfibio[] listado;
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
		agregarAnfibio(this);
	}
	
	public Anfibio() {
		this("", 0, "", "", "", false);
	}

	public int cantidadAnfibios() {
		return listado.length;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public void agregarAnfibio(Anfibio anfibio) {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] == null) {
				listado[i] = anfibio;
			}
		}
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public void setColorPiel(String color) {
		this.colorPiel = color;
	}

	public boolean getVenenoso() {
		return this.venenoso;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

}
