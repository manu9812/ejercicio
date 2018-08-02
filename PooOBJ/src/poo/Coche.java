package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int peso_plataforma;
	private String color;
	private int pesoTotal;
	private boolean asientos_cuero, climatizador;
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		peso_plataforma=500;
	}
	public String dime_datos_generales() { // get
		return "la plataforma del veniculo tiene "+ ruedas + " ruedas"+
			". Mide " + largo/1000 + " metros con un ancho de " +ancho +
			" cm y peso de plataforma de " + peso_plataforma + " kg";
	}
	
	public void establecer_color(String color_coche) {//set
		color=color_coche;
		
	}
	public String dime_color() {
		return "el color del coche es: " + color;	
	}
	
	public void configura_asientos(String asientos_cuero) { //setter
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
			
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() { //getter
		if(asientos_cuero==true) {
			return "el coche tiene asientos de cuero";
		}else {
			return "el coche tiene asientos de serie";
		}
	}
	public void cofigura_climatizador(String climatizador) { //setter
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {//getter
		if(climatizador==true) {
			return"el coche incorpora climatizador";
			
		}else {
			return "el coche lleva aire acondicionado";
		}
	}
	public String dime_peso_coche() { //setter + getter
		int peso_carroceria=500;
		pesoTotal=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true) {
			pesoTotal=pesoTotal+50;
		}
		if(climatizador==true) {
			pesoTotal=pesoTotal+20;
		}
		return "el peso del coche es: "+ pesoTotal;
	}
	
	public int precio_coche() { //getter
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			precio_final+=1500;
		}
		return precio_final;
	}
	
}
