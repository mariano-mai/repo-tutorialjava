package TutorialJava;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int resultado=1;
		
		System.out.println("introduce un número");
		int numero=entrada.nextInt();
		
		for(int i=numero; i>0; i--) {
			resultado=resultado*i;
		}
		System.out.println("el factorial de "+numero+" es: "+resultado);

	}

}
