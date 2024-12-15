package ud2;

import java.util.Scanner;

//Juego acierta la contraseña
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contraseña;
		int jugador;
		String mayor = "La contraseña es mayor";
		String menor = "La contraseña es menor";

		System.out.println("Introduce la contraseña:");
		contraseña = sc.nextInt();

		System.out.println("Intenta adivinar la contraseña:");

		do {
			jugador = sc.nextInt();

			if (jugador != contraseña) {

				String pista = (jugador > contraseña) ? menor : mayor;

				System.out.println("¡Fallaste, te dare una pista! " + pista + ", vuelve a intentarlo:");

			}

		} while (jugador != contraseña);

		System.out.println("¡Lo lograste, Contraseña correcta!");
	}

}
