package Ejericio;

import java.util.Scanner;

public class ejericio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Esta lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("Has terminado tus tareas? (true/false): ");
        boolean tareasFinalizadas = sc.nextBoolean();

        System.out.print("Necesitas ir a la biblioteca? (true/false): ");
        boolean irABiblioteca = sc.nextBoolean();
        boolean puedeSalir = (!llueve && tareasFinalizadas) || irABiblioteca;
        
        System.out.println("Puedes salir a la calle? " + puedeSalir);
        
        sc.close();
    }
}
