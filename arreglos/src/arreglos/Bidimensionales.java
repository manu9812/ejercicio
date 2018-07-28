package arreglos;

public class Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] matrix= {
			{10,11,12,12,13},
			{22,45,35,54,65},
			{33,67,46,564,68},
			{22,45,543,13,233}
		};
				
		for(int[]fila:matrix) {
			System.out.println();
			for(int z: fila) {
				System.out.println(z + " ");
			}
		}

	}

}
