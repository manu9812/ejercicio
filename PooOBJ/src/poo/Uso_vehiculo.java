package poo;


public class Uso_vehiculo {

	public static void main(String[] args) {
		
		/*Coche micoche= new Coche();
		System.out.println(micoche.dime_datos_generales());
		micoche.establecer_color(JOptionPane.showInputDialog("introduce color "));
		System.out.println(micoche.dime_color());
		micoche.configura_asientos(JOptionPane.showInputDialog("tiene asientos de cuero? "));
		System.out.println(micoche.dime_asientos());
		micoche.cofigura_climatizador(JOptionPane.showInputDialog("tiene climatizador? "));
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println("el precio final del coche es: "+ micoche.precio_coche());
		
		*/
		
		Coche micoche1= new Coche();
		micoche1.establecer_color("rojo");
		Furgoneta miFurgoneta1 = new Furgoneta(7,580);
		miFurgoneta1.establecer_color("azul");
		miFurgoneta1.configura_asientos("si");
		miFurgoneta1.cofigura_climatizador("si");
		System.out.println(micoche1.dime_datos_generales()+
				"\n"+ micoche1.dime_color());
		
		System.out.println(miFurgoneta1.dime_datos_generales()+
				"\n"+ miFurgoneta1.dimeDatosFurgoneta());
	}

}
