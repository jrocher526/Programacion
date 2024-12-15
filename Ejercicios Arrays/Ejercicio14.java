package ud2;
import java.util.Arrays;

public class Ejercicio14 {
	public static void main(String[] args) {

		// Array original
		int[] original = {20, 22, 24, 26, 28, 30};
		
		//Array destino con el mismo tamañan del original
		int[] destino = new int[original.length];
		
		for (int i = 0; i < original.length; i++) {
			
			destino[i] = original[i];
		}
		System.out.println("Original:");
		System.out.println(Arrays.toString(original));
		System.out.println("Destino:");
		System.out.println(Arrays.toString(destino));
		
	}

}
