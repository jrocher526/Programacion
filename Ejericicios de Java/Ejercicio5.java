package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese las dos notas
        System.out.print("Introduce la primera nota (entera): ");
        int nota1 = sc.nextInt();
        
        System.out.print("Introduce la segunda nota (entera): ");
        int nota2 = sc.nextInt();
        
        // Calcular la media aritmética
        double media = (nota1 + nota2) / 2.0; // Dividimos por 2.0 para obtener decimales
        
        // Mostrar el resultado
        System.out.println("La media aritmetica de las dos notas es: " + media);
        
        // Cerrar el Scanner
        sc.close();
    }
}
