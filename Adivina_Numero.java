package TutorialJava;
import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100);
		//genera un número alatorio entre 0 y 100
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		while (numero != aleatorio) {
			intentos++;
			System.out.println("introduce un número, por favor");
			
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("más chico");
			}
			else if(aleatorio > numero) {
				System.out.println("más grande");
			}
			
			
		}
		System.out.println("correcto. lo has logrado en "+intentos+" intentos.");

	}

}
