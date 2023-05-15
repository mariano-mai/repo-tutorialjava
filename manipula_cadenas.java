package TutorialJava;

public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Albana";
		
		int ultima_letra;
		
		ultima_letra = nombre.length();
		
		System.out.println("mi nombre es "+nombre);
		
		System.out.println("mi nombre tiene "+nombre.length()+" letras.");
		
		System.out.println("la primera letra de mi nombre es "+nombre.charAt(0));
		
		System.out.println("la última letra es "+nombre.charAt(ultima_letra-1));
	}

}
