package ejerciciosud2;

public class Ejercicio2 {
	    public static void main(String[] args) {
	        // Creamos tabla de 10 elementos
	        int[] tabla = new int[10];
	        
	      
	        tabla[0] = 2;
	        tabla[1] = 3;
	        tabla[2] = 4;
	        tabla[3] = 5;
	        tabla[4] = 6;
	        
	       
	        int[] a = tabla;
	        int[] b = tabla;
	        int[] c = tabla;
	        int[] d = tabla;

	       
	        System.out.println("Referencia de 'a': " + a);
	        System.out.println("Referencia de 'b': " + b);
	        System.out.println("Referencia de 'c': " + c);
	        System.out.println("Referencia de 'd': " + d);
    }
}	        
 
	    

