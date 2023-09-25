package zooAnimales;

public class Mamifero extends Animal {
	private static Mamifero[] listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
		totalAnimales++;
		agregarMamifero(this);
	}
	
	public Mamifero() {
		this("", 0, "", "", false, 0);
	}
	
	public int cantidadMamiferos() {
		return listado.length;
	}
	
	public Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}

	public void agregarMamifero(Mamifero mamifero) {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] == null) {
				listado[i] = mamifero;
			}
		}
	}
	
	public boolean getPelaje() {
		return this.pelaje;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}
