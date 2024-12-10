package ejerciciosud2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int[] tabla = new int [10];
		
		Arrays.fill(tabla, 1);
		
		System.out.println(Arrays.toString(tabla));
		
		Arrays.fill(tabla, 5 ,9 , 2);
		
		System.out.println(Arrays.toString(tabla));
		
	}

}
