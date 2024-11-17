package Ejercicio30;

import java.util.Scanner;

public class ejercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Ingrese un numero");
        n = sc.nextInt();

        variosSaludos(n);

    }

    public static void variosSaludos(int n) {

        int c;

        for (c = 0; c < n; c++) {
            System.out.println("Hola");
        }

    }

}
