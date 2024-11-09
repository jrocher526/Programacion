
package ejercicio22;

import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
            int num;
                num = scanner.nextInt();

       
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }

       
        if (num > 0) {
            System.out.println("El número " + num + " es positivo.");
        } else if (num < 0) {
            System.out.println("El número " + num + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

       
        int cuadrado = num * num;
        System.out.println("El cuadrado de " + num + " es " + cuadrado + ".");

       
    }
}
