package TutorialJava;
//import javax.swing.*;
import java.util.*;

public class Entrada_Salida_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String num1 = JOptionPane.showInputDialog("introduce un valor");
		
		//double num2 = Double.parseDouble(num1);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un valor: ");
		
		int num2 = entrada.nextInt();
		
		System.out.print("La raiz de "+num2+" es ");
		
		System.out.printf("%1.0f", Math.sqrt(num2));

	}

}
