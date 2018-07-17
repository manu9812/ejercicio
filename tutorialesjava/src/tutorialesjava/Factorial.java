package tutorialesjava;
import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		long resultado=1l;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		for(int i=numero; i>0;i--) {
			resultado=resultado*i;
			
		}
		System.out.println("el factorial de "+ numero +" es: " + resultado);
	}

}
