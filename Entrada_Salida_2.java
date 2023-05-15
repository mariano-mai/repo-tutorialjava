package TutorialJava;
import javax.swing.*;

public class Entrada_Salida_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre");
		
		String edad_usuario = JOptionPane.showInputDialog("ingresa tu edad");
		
		int edad = Integer.parseInt(edad_usuario);
		
		System.out.println("Hola "+nombre_usuario+", mañana tendrás "+(edad+1)+" años.");

	}

}
