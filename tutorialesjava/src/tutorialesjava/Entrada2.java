package tutorialesjava;

import javax.swing.JOptionPane;

public class Entrada2 {

	public static void main(String[] args) {
		String num1= JOptionPane.showInputDialog("por favor ingrese el numero al que desea sacarle la raiz cuadrada");
		double raiz= Double.parseDouble(num1);
		System.out.print("la raiz cuadrada de: "+ raiz +" es: " );
		System.out.printf("%1.2f",Math.sqrt(raiz));

	}

}
