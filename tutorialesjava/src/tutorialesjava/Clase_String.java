package tutorialesjava;

public class Clase_String {

	public static void main(String[] args) {
		String nombre= "Manuela Garcia Monsalve";
		System.out.println("mi nombre es: "+ nombre);
		System.out.println("mi nombre tiene: " + nombre.length() + " letras");
		System.out.println("la primera letra de : " +nombre + "es la "+ nombre.charAt(0));
		int ultimaLetra;
		ultimaLetra= nombre.length();
		System.out.println("y la ultima letra es la: "+ nombre.charAt(ultimaLetra-1));
	}

}
