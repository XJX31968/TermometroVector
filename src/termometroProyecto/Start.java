package termometroProyecto;

public class Start {

	public static void main(String[] args) {
		
		Termometro t = new Termometro();
		System.out.println(t);
		
		float temperaturaDia = t.obtenerTemperaturaDia(5);
		System.out.println("la temperatura del dia elegido es"+temperaturaDia);

		
		

	}

}
