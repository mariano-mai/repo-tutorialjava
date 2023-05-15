package TutorialJava.poo;

public class Coche {
	
	//atributos
	/*todos estos atributos están encapsulados mediante el modificador de acceso
	 * private, por lo que no pueden ser modificados o accedidos desde otra clase.*/
	//atributos que no pueden variar
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	//atributos que pueden ser modificadas con los setters
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	//constructor
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
	}
	
	//getters
	public String dimeLargo() {
		return "El largo del coche es "+largo;
	}
	
	public String dimeColor() {
		return "El color del coche es "+color;
	}
	
	public String dimeDatosGenerales() {
		return "La plataforma del vehículo tiene "+ruedas+" ruedas."+
				"mide "+largo/1000+" metros, con un ancho de "+ancho+
				" cm y un peso de plataforma de "+pesoPlataforma+" kg.";
	}
	
	public String dimeAsientos() {
		if(asientosCuero==true) {
			return "El coche tiene asientos de cuero.";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public String dimeClimatizador() {
		if(climatizador=true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	public int precioCoche() {
		int precioFinal = 10000;
		if(asientosCuero=true) {
			precioFinal+=2000;
		}
		if(climatizador=true) {
			precioFinal+=1500;
		}
		return precioFinal;
	}
	
	//setters
	public void estableceColor(String colorCoche) {
		color = colorCoche; //de este modo el método inicia la variable color
	}
	
	public void configuraAsientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero=true;
		}else {
			this.asientosCuero=false;
		}
	}
	
	public void configuraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	//método setter que también es getter (práctica no recomendable)
	public String dimePesoCoche() {
		int pesoCarroceria=500; //variable local, sólo se ve dentro del método
		
		pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if (asientosCuero==true) {
			pesoTotal = pesoTotal + 50;
		}
		if (climatizador==true) {
			pesoTotal = pesoTotal + 20;
			
		}
		return "El peso del coche es "+pesoTotal;
	}

}
