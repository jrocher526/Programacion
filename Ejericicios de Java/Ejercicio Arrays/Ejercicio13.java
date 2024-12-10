package ejerciciosud2;

public class Ejercicio13 {
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, };
		int[] array2 = { 1, 2, 3, };
		int[] array3 = { 3, 1, 2, };

		System.out.println("Comparacion Array 1 y 2: " + compararArrays(array1, array2));
		System.out.println("Comparacion Array 2 y 3: " + compararArrays(array2, array3));

	}

	public static boolean compararArrays(int[] array1, int[] array2) {
		/* Comprobar si los arrays tienen las mismas longitudes ya que si no la tienen
		 no pueden ser comparados */
		if (array1.length != array2.length) {

			return false; // Devuelve false en caso de que los arrys no sean iguales
		}
		// Comprueba que el contenido de los arrays sea el mismo 
		for (int i = 0; i < array1.length; i++) { 
			if (array1[i] != array2[i]) {

				return false; // Devuelve false en caso de que el contenido de los arrys no sean iguales

			}

		}

		return true; //Devuelve true en caso de que los arrays sean iguales

	}
}
