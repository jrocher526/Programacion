package ejercicio8;

public class ejercicio8 {
    public static void main(String[] args) {
        // Evaluar las expresiones
        boolean exp1 = 3 <= 5 && 2 == 2;
        boolean exp2 = 3 <= 5 && 2 > 10;
        boolean exp3 = 1 != 2 || 5 < 3;
        boolean exp4 = !(1 < 2);

        // Mostrar los resultados
        System.out.println("Cuanto vale cada una de estas expresiones?");
        System.out.println("1. 3 <= 5 && 2 == 2: " + exp1);
        System.out.println("2. 3 <= 5 && 2 > 10: " + exp2);
        System.out.println("3. 1 != 2 || 5 < 3: " + exp3);
        System.out.println("4. !(1 < 2): " + exp4);
    }
}

        
    