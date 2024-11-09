package Ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        // Declaración de la constante PI
        final double PI = Math.PI;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca el radio
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        // Calcular la longitud de la circunferencia
        double longitud = 2 * PI * radio;

        // Calcular el área de la circunferencia
        double area = PI * Math.pow(radio, 2);

        // Mostrar los resultados
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area de la circunferencia es: " + area);
    }
}
        