package zooAnimales;

public class Reptil extends Animal {
	private static Reptil[] listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String color, int largo) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = color;
		this.largoCola = largo;
		totalAnimales++;
		agregarReptil(this);
	}
	
	public Reptil() {
		this("", 0, "", "", "", 0);
	}

	public int cantidadReptiles() {
		return listado.length;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public void agregarReptil(Reptil reptil) {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] == null) {
				listado[i] = reptil;
			}
		}
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	
	public void setLargoCola(int largo) {
		this.largoCola = largo;
	}

}
