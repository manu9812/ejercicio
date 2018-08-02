package poo;

public class Pruebas {

	
	//METODOS STATIC
	// no actuan sobre objetos 
	
	public static void main(String[] args) {
		Empleados trabajador1= new Empleados("Paco");
		Empleados trabajador2= new Empleados("Ana");
		Empleados trabajador3= new Empleados("Antonio");
		Empleados trabajador4= new Empleados("Maria");
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos()+ "\n" +
		trabajador2.devuelveDatos()+ "\n"+
		trabajador3.devuelveDatos()+ "\n"+
		trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
		
	}
}

class Empleados{
public Empleados(String nom) {
	nombre= nom;
	seccion="administracion";
	Id=IdSiguiente;
	IdSiguiente++;
	
	}
	public void cambiaSeccion(String seccion) { //setter
		this.seccion=seccion;
	}
	
	public String devuelveDatos() {
		return "el nombre es: "+ nombre + " y la seccion es: "+ seccion +
				" y el id= "+ Id;
	}
	
	public static String dameIdSiguiente () {
		return "el ID siguinete es: "+ IdSiguiente;
		
	}
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
}
