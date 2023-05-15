package TutorialJava;

public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		
		int [][] matrix = {
				{10,15,18,19,21},
				{5,225,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		for(int[] fila: matrix) { //fijate que el primer for tiene como variable una matriz
			
			System.out.println();
			
			for(int z: fila) { //y el segundo tiene como variable un int
				
				System.out.print(z+" ");
				
			}
		}

	}

}
