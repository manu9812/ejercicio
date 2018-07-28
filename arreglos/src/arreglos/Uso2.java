package arreglos;
import javax.swing.*;
public class Uso2 {

	public static void main(String[] args) {
		
	String [] paises= new String[10];
	
	/*paises[0]="españa";
	paises[1]="mexico";
	paises[2]="colombia";
	paises[3]="peru";
	paises[4]="chile";
	paises[5]="argentina";
	paises[6]="ecuador";
	paises[7]="venezuela";
	paises[8]="chile";
	paises[9]="nebraska";
	
	for(int i=0; i<paises.length;i++) {
		System.out.println("pais " + (i+1) + " "+ paises[i]); */
	for (int i=0; i<8; i++) {
		paises[i]=JOptionPane.showInputDialog("introduce pais" + (i+1));
		
	}
	for (String j:paises) {
		System.out.println("pais: "+j);
	}

	}

}
