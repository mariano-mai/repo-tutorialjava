package TutorialJava;
import java.util.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		//Scanner informacion = new Scanner(System.in);
		
		System.out.println("elige una opción: \n1: cuadrado\n2: rectángulo\n3: triángulo\n4: círculo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			System.out.println("introduce el lado: ");
			int lado = entrada.nextInt();
			System.out.println("el área del cuadrado es: "+Math.pow(lado,2));
			break;
		case 2:
			System.out.println("introduce la base del rectángulo: ");
			int base = entrada.nextInt();
			System.out.println("introduce la altura del rectángulo: ");
			int altura = entrada.nextInt();
			System.out.println("el área de triángulo es: "+(base*altura));
			break;
		case 3:
			System.out.println("introduce la base del triángulo: ");
			base = entrada.nextInt();
			System.out.println("introduce la altura del triángulo: ");
			altura = entrada.nextInt();
			System.out.println("el área del triángulo es: "+((base*altura)/2));
			break;
		case 4:
			System.out.println("introduce el radio del círculo: ");
			int radio = entrada.nextInt();
			System.out.print("el área del círculo es: ");
			System.out.printf("%1.2f", (Math.PI*(Math.pow(radio, 2))));
			break;
		default:
			System.out.println("la opción no es correcta.");
		}

	}

}
