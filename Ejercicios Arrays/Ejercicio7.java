package ejerciciosud2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Cuantos numeros deseas introducir? ");
		int cantidad = sc.nextInt();

		int[] numeros = new int[cantidad];

		for (int i = 0; i < cantidad; i++) {
			System.out.print("Introduce el numero " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Los numeros en orden inverso son:");
		for (int i = cantidad - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}
}
