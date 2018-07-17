package tutorialesjava;

public class ClaseMath {

	public static void main(String[] args) {
	
		
		
		double raiz= Math.sqrt(20);
		System.out.println("el resultado de la raiz cuadrada de 20 "+ raiz);
		
		double num1=5.85;
		int resultado=(int)Math.round(num1);
		System.out.println("el numero "+ num1+ " redondeado es: "+resultado);
		
		double base=5;
		double explonente=3;
		int resut=(int)Math.pow(base, explonente);
		System.out.println("el resultado de: "+ base+ " elevado a la " +explonente+ " es: "+resut);

	}

}
