package tutorialesjava;

public class String2 {

	public static void main(String[] args) {
		String frase= "hoy es un estupendo dia para aprender a programar en java ";
		System.out.println(frase);
		String fraseResumen= frase.substring(0, 29)+" irnos a la playa y olvidarnos de todo " + frase.substring(29, 57);
		System.out.println("el fragmento es: " + fraseResumen);
		
		
		
		
		System.out.println("\n");
		System.out.println("--------------------------------");
		String nombre1, nombre2, nombre3, nombre4;
		nombre1="andres";
		nombre2="julian";
		nombre3= "mateo";
		nombre4="Mateo";
		System.out.println(" el primer nombre es: "+ nombre1);
		System.out.println("el segundo nombre es: " + nombre2);
		System.out.println("el tercer nombre es: " + nombre3);
		System.out.println("el cuarto nombre es: "+ nombre4);
		System.out.println("las cadenas de caracteres 1 y 2 son: "+nombre1.equals(nombre2));
		System.out.println("las cadenas de caracteres 3 y 4 son:" +nombre3.equalsIgnoreCase(nombre4));
				
	}

}
