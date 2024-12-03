package ejerciciosud2;

public class Ejercicio8 {

	public static void main(String[] args) {
		int[] t = {1,2,3,4,5,6,7,8,9,10};
		
	System.out.println(maximo(t));
		
	}
	
	//Funcion para calcular el max de un array
	public static int maximo(int t[]) {
        
		int resultado = t[0];
        
        for (int i = 1; i < t.length; i++) {
            
        	resultado = Math.max(resultado, t[i]);
            
        }
        return resultado;
	}
}
