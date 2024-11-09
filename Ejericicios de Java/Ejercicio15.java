package ejercicio.pkg15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float num;
        float num2;
        
        System.out.println("Ingrese un numero para su redondeo");
            num = sc.nextFloat();
              
            num2 = Math.round(num);
            
        System.out.println("El resultado ha sido redondeado y es: " + num2);
            
            
    }
    
}
