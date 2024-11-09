package ejercicio21_1;

import java.util.Scanner;

public class Ejercicio21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int anyo; 
        
        System.out.println("Introduzca un año");
            anyo = sc.nextInt();
            
            if (anyo % 4 == 0){
                System.out.println("El año es bisiesto");
            } else {
                System.out.println("El ano no es bisiesto");
            }          
    }
    
}