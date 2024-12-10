package ejerciciosud2;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		int [] enteros = {2,4,6,8,10};
		
		int resultado = sumaArrays(enteros);
		
		System.out.println("La suma de los Arrys es: " + resultado);
	}
	//Funcion para calcular la suma de todos los numeros de un array
	public static int sumaArrays(int[] enteros) {
	
		int suma = 0;
		
		for (int i = 0; i < enteros.length; i++) 
			
			suma += enteros[i]; 
		
			return suma;
	}
	
}
