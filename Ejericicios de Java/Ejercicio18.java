package ejercicio.pkg18;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para saber si es casi-cero:");
             float num = sc.nextFloat();
             
        
        if (num > -1 && num < 1 && num != 0)  {
                System.out.println(" es casi-cero");
                
        }else {
            System.out.println("no es casi-cero");
            
        }
    }
    
}
