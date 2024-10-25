package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su año de nacimiento");
        int anioNaci = sc.nextInt();
        System.out.println("Introduzca el año actual");
        int anioActual = sc.nextInt();
        int edad = anioActual - anioNaci;
        System.out.println("Su edad es " + edad + " años ");
    
    }
}
