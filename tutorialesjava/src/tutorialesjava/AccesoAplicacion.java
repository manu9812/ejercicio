package tutorialesjava;
import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave ="manuela";
		String pass="";
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog( "introduce la contrase�a por favor");
			
			if (clave.equals(pass)==false) {
				System.out.println("contrase�a incorrecta");
			}
		}
		
		System.out.println("contrase�a correcta, acceso perimitido");
	}

}
