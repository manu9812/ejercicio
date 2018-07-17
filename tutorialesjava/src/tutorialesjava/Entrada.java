package tutorialesjava;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce tu nombre por favor");
		String nombreUsuario= entrada.nextLine();
		System.out.println("intoduce tu edad por favor ");
		int edad= entrada.nextInt();
		System.out.println("hola: "+ nombreUsuario + " \nel año que viene tendras: "+ (edad+1)+ " años");

	}

}
