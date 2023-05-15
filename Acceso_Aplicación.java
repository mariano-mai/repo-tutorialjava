package TutorialJava;
import java.util.*;

public class Acceso_Aplicación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String clave = "Mariano";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {
			
			System.out.println("ingrese clave de acceso: ");
			pass = entrada.next();
			
			if (clave.equals(pass)==false) {
				System.out.println("contraseña incorrecta, pendejo!");
			}
			
		}
		
		System.out.println("contraseña correcta. acceso concedido");
		System.out.println("pendejo!");

	}

}
