package TutorialJava;

public class manipula_cadena_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "hoy es un estupendo día para aprender a programar en JAVA";
		
		String frase_resumen = frase.substring(0,29)+" irnos a la playa"
				+" y"+frase.substring(28, 57);
		
		System.out.println(frase_resumen);

	}

}
