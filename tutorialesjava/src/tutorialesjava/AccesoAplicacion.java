package tutorialesjava;
import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave ="manuela";
		String pass="";
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog( "introduce la contraseņa por favor");
			
			if (clave.equals(pass)==false) {
				System.out.println("contraseņa incorrecta");
			}
		}
		
		System.out.println("contraseņa correcta, acceso perimitido");
	}

}
