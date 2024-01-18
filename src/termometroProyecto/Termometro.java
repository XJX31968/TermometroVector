package termometroProyecto;
import java.util.Arrays;
public class Termometro {
	
	private float temperaturas[];
	private int donde;
	
	
	public Termometro() {
		
		temperaturas = new float[7];
		generarTemperaturasAleatorias();
	}
	@Override
	public String toString() {
		return "Termometro [" + Arrays.toString(temperaturas) + " - " + donde + "]";
	}
	
	

	
	
	
	public void generarTemperaturasAleatorias() {
		
		for(int i=0;i<temperaturas.length;i++) {
			
				temperaturas[i] = (float) (Math.random()*25+1);
			
			
			
			
			}
			
		
			
			
		}
		
		
	
	
	public float obtenerTemperaturaDia(int dia) {
		
		if (dia >= 0 && dia < temperaturas.length) {
			
			return temperaturas[dia];
		}
		
		else {
            System.out.println("Día no válido");
            return -1; 
        }
    }
		
		
	}
	