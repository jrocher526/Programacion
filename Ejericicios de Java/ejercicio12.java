package ejercicio.pkg12;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num;
    
        System.out.println("Ingresa un numero para sacar el valor absoluto:");
            num = sc.nextInt();
           
            int valorAbso = Math.abs(num);
       
        System.out.println("El valor absoluto de " + num + " es " + valorAbso);
        
        
        
    }
}

    
