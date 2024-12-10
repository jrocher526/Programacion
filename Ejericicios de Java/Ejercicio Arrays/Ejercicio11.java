package ejerciciosud2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos un array con 5 numeros aleatorios
		int[] tabla = ArrayAleatorio(5);

		// Mostramos el array generado
		System.out.println("Array generado:");
		for (int num : tabla) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Pedimos al usuario un numero para buscar dentro del array creado
		System.out.print("Introduce un numero para buscar en el array: ");
		int BuscarNumero = sc.nextInt();

		// Buscamos el numero ingresado usando el siguiente metodo
		int resultadoBusqueda = busqueda(BuscarNumero, tabla);
		System.out.println("Resultado de busqueda secuencial: " + resultadoBusqueda);

		// Esta expresion nos permite ordenar el array para utilizar binarySearch
		Arrays.sort(tabla);

		// Con esta funcion buscamos el numero usando binarySearch
		int resultadoBinarySearch = Arrays.binarySearch(tabla, BuscarNumero);
		System.out.println("Resultado de binarySearch: " + resultadoBinarySearch);

	}

	// Creamos una fuincion para buscar un numero en el array
	public static int busqueda(int numero, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == numero) {
				return i; // Retorna la posición del numero
			}
		}
		return -1; // Si no encuentra el numero, retorna -1
	}

	// Creamos funcion para generar un array de numeros aleatorios
	public static int[] ArrayAleatorio(int tamaño) {
		int[] array = new int[tamaño];
		Random random = new Random();
		for (int i = 0; i < tamaño; i++) {
			array[i] = random.nextInt(100); // esta expresion nos permite generar numero aleatoreos
		}
		return array;
	}
}
