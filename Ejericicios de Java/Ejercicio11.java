
package ejercicio.pkg11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int result;
              
        System.out.println("Ingrese primer numero:");
            num1 = sc.nextInt();
        
        System.out.println("Ingrese segundo numero:");
            num2 = sc.nextInt();
        
        result = num1 > num2 ? num1 : num2;
            
        System.out.println("El numero mayor es " + result);
        
    }
    
}