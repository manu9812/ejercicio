package tutorialesjava;
import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave ="manuela";
		String pass="";
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog( "introduce la contraseña por favor");
			
			if (clave.equals(pass)==false) {
				System.out.println("contraseña incorrecta");
			}
		}
		
		System.out.println("contraseña correcta, acceso perimitido");
	}

}
