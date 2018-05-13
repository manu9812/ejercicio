package fibonacciRecursivo;

public class Main {

	public static void main(String[] args) {
		
		Main fibo= new Main();
		System.out.println(" la sucecion de fibonacci de 12 mediante recursividad es "+
		fibo.FibonacciRecursivo(30));
	}
	
	
	public int FibonacciRecursivo(int n) {
		if(n==1 || n==2) {
			return 1;
			// caso base 
			
		}else {
			return FibonacciRecursivo(n-1)+ FibonacciRecursivo(n-2);
		}
	}

}
