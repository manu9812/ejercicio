package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
	
		Jefatura jefe_RRHH=new Jefatura("juan ", 55000, 2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados= new Empleado[6];
		misEmpleados[0]=new Empleado("manuela garcia ", 85000, 1990,12,17);
		misEmpleados[1]=new Empleado("jorge garcia ", 96000, 1998,06,20);
		misEmpleados[2]=new Empleado("maria silva ", 61000, 2001,03,12);
		misEmpleados[3]=new Empleado("juan andres ");
		misEmpleados[4]=jefe_RRHH;//poliformismo, principio de sustitucion
		misEmpleados[5]=new Jefatura("maria ", 95000, 1999,5,26);
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("DAR MAS DIAS DE VACACIONES A LOS EMPLEADOS "));
		
		System.out.println("el jefe "+ jefa_Finanzas.dameNombre()+ " Tiene un bonus de: "+
		jefa_Finanzas.establece_bonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: "+
		misEmpleados[3].establece_bonus(200));
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		
		Arrays.sort(misEmpleados);
		 for (Empleado e: misEmpleados) {
			 System.out.println("Nombre : " + e.dameNombre()+
						" sueldo : "+ e.dameSueldo()
						+ " fecha de alta: "+ e.dameFechaContrato());
						
			 
		 }
	}
}

class Empleado implements Comparable, Trabajadores{
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		id=IdSiguiente;
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+ gratificacion;
	}
	
	public Empleado(String nom) {
		this(nom, 3000,2000,01,01);
	}
	
	public String dameNombre() { //getter
		return nombre + "id " + id;
	}
	public  double dameSueldo() { //getter
		return sueldo;
	}
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return-1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		return 0;
		
	}
	private String nombre;
	private  double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int id;

}
class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public String tomar_decisiones(String decision) {
		return" un miembro de la direccion ha tomado la decision de:" + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+ gratificacion+prima;
	}
	public void  estableceIncentivo(double b) {
		incentivo=b;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+ incentivo;
	}
	private double incentivo;
	
}











