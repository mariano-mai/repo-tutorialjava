package TutorialJava.poo;
import java.util.*;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche renault = new Coche(); //<- instancia/ejemplo de la clase Coche
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(renault.dimeDatosGenerales());
		
		System.out.println("Dame un color");
		renault.estableceColor(entrada.nextLine()); //a través de este método se establece el color del coche
		System.out.println(renault.dimeColor());
		
		System.out.println("¿tiene asientos de cuero?");
		renault.configuraAsientos(entrada.nextLine());
		System.out.println(renault.dimeAsientos());
		
		System.out.println("¿tiene climatizador?");
		renault.configuraClimatizador(entrada.nextLine());
		System.out.println(renault.dimeClimatizador());
		
		System.out.println(renault.dimePesoCoche());
		
		System.out.println("El precio final del coche es "+renault.precioCoche());
	}

}
