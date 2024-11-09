package EjercicioSi;


    import java.util.Scanner;

public class ejercicioSi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Esta lloviendo? (true/false): ");
        boolean llueve = scanner.nextBoolean();

        System.out.print("Has terminado tus tareas? (true/false): ");
        boolean tareasFinalizadas = scanner.nextBoolean();

        System.out.print("Necesitas ir a la biblioteca? (true/false): ");
        boolean irABiblioteca = scanner.nextBoolean();

        boolean puedeSalir = (!llueve && tareasFinalizadas) || irABiblioteca;

     
        if (puedeSalir) {
            System.out.println("¡Puedes salir a la calle!");
        } else {
            System.out.println("No puedes salir a la calle.");
            if (llueve) {
                System.out.println("Es porque esta lloviendo.");
            }
            if (!tareasFinalizadas) {
                System.out.println("Es porque no has terminado tus tareas.");
            }
        }
        scanner.close();
    }
}

