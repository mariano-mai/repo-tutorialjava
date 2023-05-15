package TutorialJava;
import java.util.*;

public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String genero = "";
		
		do {
			System.out.println("introduce tu género (H/M): ");
			genero = entrada.next();
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		System.out.println("introduce tu altura en cm, por favor: ");
		int altura = entrada.nextInt();
		
		int pesoideal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoideal = altura - 110;
		}
		else if(genero.equalsIgnoreCase("M")) {
			pesoideal = altura - 120;
		}
		System.out.println("tu peso ideal es "+pesoideal+"kg.");

	}

}
