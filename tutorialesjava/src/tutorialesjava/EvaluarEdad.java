package tutorialesjava;
import java.util.*;
public class EvaluarEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("por favor ingresa tu edad");
		int edad= entrada.nextInt();
		if(edad<18) {
			System.out.println("eres un adolecente ");
		}
		else if (edad<=40){
			System.out.println("eres un joven");
		}
		else if(edad<=65) {
			System.out.println("eres un adulto");
		}
		else if (edad<=80) {
			System.out.println("ya eres un adulto mayor ");
		}
		else {
			System.out.println("cuidate mucho");
		}
	}
}
