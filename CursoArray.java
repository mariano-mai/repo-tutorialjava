package TutorialJava;

public class CursoArray {

	public static void main(String[] args) {
		
		int [] mi_matriz = new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;
		
		for(int i=0; i<5; i++) {
			System.out.println("índice: "+i+" --> "+mi_matriz[i]);
		}
		
		//declaración simplificada o implícita
		int [] otra_matriz = {5,38,-15,92,71,44,23};
		
		/*con este tipo de declaración no queda tan claro cuántos elementos tiene
		 * la matriz.*/
		
		for(int i=0; i<otra_matriz.length; i++) {
			System.out.println("índice: "+i+" --> "+otra_matriz[i]);
		}
		
	}
	

}
