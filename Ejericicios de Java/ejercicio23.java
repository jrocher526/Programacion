package ejercicio23;

import java.util.Scanner;

//Modificacion del ejercicio 16

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        String resultado;
        
        do {
            
        System.out.println("Ingrese un numero para saber si es par o impar:");
            num = sc.nextInt();
            
        resultado = (num % 2 == 0) ? "par" : "impar";
            
        System.out.println("El numero " + num + " es " + resultado);
            
        } while(num != -1);
    }
}

   
    /* Estructura de ejercicio 16
            int num;
           
        System.out.println("Ingrese un numero para saber si es par o impar");
            num = sc.nextInt();
            
           String resultado = (num % 2 == 0) ? "par" : "impar";
            
        System.out.println("El numero " + num + " es " + resultado); */
