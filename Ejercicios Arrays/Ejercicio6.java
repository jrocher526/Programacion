package ejerciciosud2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double[] numeros = new double[5];
	
	for(int i = 0; i < 5; i++) {
	
		System.out.print("Introduce el número decimal " + (i + 1) + ": ");
		numeros[i] = sc.nextDouble();
	}

	System.out.println("\nLos numeros guardados fueron:");
	
		for(int e = 0; e < 5; e++)
	{
		System.out.println(numeros[e]);
	}

	}
}
