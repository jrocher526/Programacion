package ejerciciosud2;

public class Ejercicio3 {
	    public static void main(String[] args) {
	    	
	        
	        System.out.println("Aumento de sueldos con un bucle for:");
	        
	        int[] sueldos = {1800, 1200, 2000, 1200, 900};
	        	
	        for (int i = 0; i < sueldos.length; i++) {
	            
	        sueldos[i] += sueldos[i] * 0.10;
	        		
	        System.out.println("Empleado " + i + ": " + sueldos[i]);
	        }
	        
	        
	        
	        // Aumento del sueldo con un bucle foreach
	        System.out.println("\nAumento de sueldos con un bucle foreach:");
	        
	        sueldos = new int[]{1800, 1200, 2000, 1200, 900};
	        
	        for (int sueldo : sueldos) {
	            
	        	sueldo += sueldo * 0.10; 
	            
	        	System.out.println(sueldo);
	        }
	    }
	}


