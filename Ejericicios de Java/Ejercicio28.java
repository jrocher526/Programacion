package ejercicio.pkg28;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n; 
        long r = 1; 
        System.out.println("Ingrese un numero para calcular su factorial:");
        n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            r *= i; 
        }

        System.out.println("El factorial de " + n + " es: " + r);
    }
}

