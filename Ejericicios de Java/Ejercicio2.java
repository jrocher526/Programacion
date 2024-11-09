package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edadActual = sc.nextInt();
        int edadSigienteAnio = edadActual + 1;
        System.out.println("El año que viene tendras " + edadSigienteAnio + " años ");
        
    }
}
