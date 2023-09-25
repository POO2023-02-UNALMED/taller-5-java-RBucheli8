package zooAnimales;
import gestion.Zona;

public class Animal {
	protected static int totalAnimales = 0;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal() {
		this("", 0, "", "");
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "“Mamiferos: " + "cM" + "\n" +
				"Aves: " + "cAv" + "\n" +
				"Reptiles: " + "cR" + "\n" +
				"Peces: " + "cP" + "\n" +
				"Anfibios: " + "cAn" + "\n";
	}
	
	public String toString() {
		String formato = "Mi nombre es " + this.nombre +
				", tengo una edad de " + this.edad + 
				", habito en " + this.habitat + 
				" y mi genero es " + this.genero;
		String complemento = " la zona en la que me ubico es " + this.zona +
							", en el " + this.zona.getZoo().getNombre();
		if (this.zona == null) {
			return formato;
		}
		else {
			return formato + complemento;
		}
	}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	
	public static void setTotalAnimales(int total) {
		totalAnimales = total;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getHabitat() {
		return this.habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Zona getZona() {
		return this.zona;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}
