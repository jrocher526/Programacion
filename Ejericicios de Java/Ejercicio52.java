package ejercicio.pkg52;

import java.util.Scanner;

public class Ejercicio52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b;

        System.out.println("Ingrese un numero para saber si es primo:");
        b = sc.nextInt();

        System.out.println(esPrimo(b));

    }

    public static boolean esPrimo(int b) {

        return (b % 2 == 0 ? true : false);
    }
}
