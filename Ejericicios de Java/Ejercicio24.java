package ejercicio.pkg24;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) { 
           Scanner sc = new Scanner(System.in);
           
        int edad;
        int edadMinima;
        int edadMaxima;
          
            edadMinima = Integer.MAX_VALUE;
            edadMaxima = Integer.MIN_VALUE;
            
        System.out.println("Introduce las edades de los alumnos (escribe -1 para terminar):");
        
        while ((edad = sc.nextInt()) != -1) {
            if (edad >= 0) {
                if (edad < edadMinima) edadMinima = edad;
                if (edad > edadMaxima) edadMaxima = edad;
            }
        }
        
        if (edadMinima != Integer.MAX_VALUE) {
            System.out.println("La edad minima es: " + edadMinima);
            System.out.println("La edad maxima es: " + edadMaxima);
        } else {
            System.out.println("No se ha introducido ninguna edad valida.");
        }
    }
}
