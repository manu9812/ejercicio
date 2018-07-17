package tutorialesjava;
import java.util.*;
public class AdivinaElNumero {

	public static void main(String[] args) {

		
		Scanner entrada= new Scanner (System.in);
		int aleatorio=(int)(Math.random()*100);
		int numero=0;
		int intentos=0;
		do {
			intentos++;
			System.out.println("introduce un numero, por favor");
			numero=entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("ingresa un numero mas bajo");
			}else if(aleatorio>numero) {
				System.out.println("ingresa un numero mas alto");
			}
		}while(numero!=aleatorio);
		System.out.println("correcto, has conseguido en "+ intentos + " intentos");
	}

}
