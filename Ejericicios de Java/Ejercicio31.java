package ejercicio.pkg31;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        
        System.out.println("Introduzca 2 numeros:");
            a = sc.nextInt();
            b = sc.nextInt();
   
          System.out.println("El numero mayor es:");
        System.out.println(max(a,b));
        
    }
    public static int max (int a, int b) {
        
        return a > b ? a : b;
    }
    
}

