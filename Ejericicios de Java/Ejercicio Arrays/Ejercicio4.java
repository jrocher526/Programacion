package ejerciciosud2;

public class Ejercicio4 {
    public static void main(String[] args) {

        int[] tabla = new int[10];
        int suma = 0;

        System.out.print("Tabla: ");


        for (int i = 0; i < tabla.length; i++) {

            tabla[i] = (int) (Math.random() * 100) + 1;
            suma += tabla[i];

            
            System.out.print(tabla[i] + " ");
        }

        System.out.println("\nSuma de todos los números: " + suma);
    }
}
