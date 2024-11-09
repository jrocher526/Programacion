package ejercicio.pkg16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
           
        System.out.println("Ingrese un numero para saber si es par o impar");
            num = sc.nextInt();
            
           String resultado = (num % 2 == 0) ? "par" : "impar";
            
        System.out.println("El numero " + num + " es " + resultado);
            
       
         
    }
}
            
                

