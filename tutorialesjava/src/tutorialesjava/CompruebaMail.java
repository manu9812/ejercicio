package tutorialesjava;

import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		int arroba= 0;
		boolean punto=false;
		String mail= JOptionPane.showInputDialog("introduce mail");
		
		for (int i=0; i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if (mail.charAt(i)=='.') {
				punto=true;
			}
		}
		if(arroba==1 && punto== true) {
			System.out.println("el mail es correcto");
		}else {
			System.out.println("el mail no es correcto");
		}
		
	}

}
