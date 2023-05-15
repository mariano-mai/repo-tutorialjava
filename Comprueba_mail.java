package TutorialJava;
import java.util.*;
//Programa que comprueba si el texto ingresado es un e-mail válido.
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int arroba=0;
		boolean punto=false;
		
		System.out.print("Introduce e-mail: ");
		String mail=entrada.next();
		
		for(int i=0; i<mail.length(); i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			
			if(mail.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if(arroba==1 && punto==true) {
			System.out.println("es correcto.");
		}
		else {
			System.out.println("no es correcto.");
		}

	}

}
