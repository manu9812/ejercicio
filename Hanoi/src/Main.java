
public class Main {
	
	public static void main (String []args) {
		
		
		Main hanoi = new Main();
		hanoi.Hanoi(3, 1, 2, 3);
		System.out.println("juego completado");
		
	}
	
	public void Hanoi(int discos, int torre1, int torre2, int torre3) {
	
		
		if(discos==1) {
			System.out.println("mover discos de torre " + torre1 + " a torre " + torre3);
			
		}else {
			Hanoi(discos-1, torre1, torre3, torre2 );
			System.out.println("mover discos de torre " + torre1 + " a torre " + torre3);
			Hanoi(discos-1, torre2, torre1, torre3 );
		}
		
		
	}

}
