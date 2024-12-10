package ejerciciosud2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		// Crear un array con 5 numeros aleatorios
		int[] tabla = ArrayAleatorio(5);

		// Mostrar el array generado antes de ordenarlo
		System.out.println("Array generado (antes de ordenar):");
		for (int num : tabla) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Invocar la funcion para ordenar el array
		ordenarArray(tabla);

		// Mostrar el array ordenado
		System.out.println("Array ordenado:");
		for (int num : tabla) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Pedir al usuario un numero para buscar
		System.out.print("Introduce un numero para buscar en el array: ");
		int numeroBuscar = sc.nextInt();

		// Buscar el numero usando nuestro metodo de busqueda secuencial
		int resultadoBusqueda = busqueda(numeroBuscar, tabla);
		System.out.println("Resultado de busqueda secuencial: " + resultadoBusqueda);

		// Buscar el numero usando binarySearch
		int resultadoBinarySearch = Arrays.binarySearch(tabla, numeroBuscar);
		System.out.println("Resultado de busqueda binaria: " + resultadoBinarySearch);

	}

	// Funcion para buscar un numero en el array (busqueda secuencial)
	public static int busqueda(int numero, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == numero) {
				return i; // Retorna la posicion del numero
			}
		}
		return -1; // Si no encuentra el numero, retorna -1
	}

	// Funcion para generar un array de numeros aleatorios
	public static int[] ArrayAleatorio(int tamaño) {
		int[] array = new int[tamaño];
		Random random = new Random();
		for (int i = 0; i < tamaño; i++) {
			array[i] = random.nextInt(100); // Generar numeros aleatorios entre 0 y 99
		}
		return array;
	}

	// Funcion para ordenar un array
	public static void ordenarArray(int[] a) {
		Arrays.sort(a); // Ordena el array usando Arrays.sort
	}
}
