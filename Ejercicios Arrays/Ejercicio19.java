package ud2;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String entrada;
		String resultado;
		
		System.out.print("Escribe una palabra:");
		 entrada = scanner.nextLine();

		 resultado = invertirPalabra(entrada);
		System.out.println("La palabra al revés es: " + resultado);

	}
	
	public static String invertirPalabra(String palabra) {
		
		StringBuilder palabraInvertida = new StringBuilder(palabra);
		
		return palabraInvertida.reverse().toString();
	}
}
