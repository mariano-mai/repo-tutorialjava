package TutorialJava.poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		//instanciación del objeto creado más abajo
		/*Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		
		Empleado empleado3 = new Empleado("Maria Martín", 105000, 2002, 3, 15);
		/*hay que pasarle la misma cantidad de argumentos que pide el constructor y en el orden en que los pide, caso contrario va a dar 
		 * un error.*/
		
		/*empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()
				+" Fecha de Alta: "+empleado1.dameFechaContrato());
		System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()
		+" Fecha de Alta: "+empleado2.dameFechaContrato());
		System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()
		+" Fecha de Alta: "+empleado3.dameFechaContrato());	*/
		
		//alternativa para acortar el código
		Empleado[] misEmpleados = new Empleado[3]; //se puede crear un array del tipo/clase que quieras
		
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		misEmpleados[2]=new Empleado("Maria Martín", 105000, 2002, 3, 15);
		
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("nombre: "+misEmpleados[i].dameNombre()
					+" sueldo: "+misEmpleados[i].dameSueldo()
					+" fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}
		*/
		
		//ahora con el for mejorado
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			System.out.println("nombre: "+e.dameNombre()
					+" sueldo: "+e.dameSueldo()
					+" fecha de alta: "+e.dameFechaContrato());
		}
		

	}

}

//defino la clase que voy a usar en main en el mismo fichero/archivo java (se puede, pero no es una práctica recomendada)
//el la carpeta src aparece como un único archivo java, pero en bin aparecen todas las clases incluso si están dentro de un mismo archivo
class Empleado{
	//constructor que recibe parámetros
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		//declaro los atributos para que tomen como valores los argumentos que se ingresen en el constructor
		nombre=nom;
		sueldo=sue;
		//creo un objeto de clase GragorianCalendar para armar la fecha
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		//el método getTime() es heredado de la clase Calendar, que es padre de GregorianCalendar
		//getTime devuelve un dato de tipo Date, por eso altaContrato es de tipo Date
		altaContrato=calendario.getTime();
		
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	//se pueden declarar los atributos al final de la clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}