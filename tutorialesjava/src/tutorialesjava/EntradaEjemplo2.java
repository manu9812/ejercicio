package tutorialesjava;
import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		String nombre= JOptionPane.showInputDialog("introduce tu nombre, por favor");
		String edad= JOptionPane.showInputDialog("por favor ingresa tu edad ");
		int edadUsuario= Integer.parseInt(edad);
		System.out.println("hola, "+  nombre + " el año que viene tendras: "+ (edadUsuario+1) +" años");

	}

}
