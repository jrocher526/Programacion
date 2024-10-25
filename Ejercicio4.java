package ejercicio.pkg4;



public class Ejercicio4 {

    public static void main(String[] args) {
        short maximo = 32767; // Valor maximo de short
        short minimo = -32768; // Valor minimo de short
        
        System.out.println("Valor maximo de short: " + maximo);
       
        short desbordado = (short) (maximo + 1);
        
        System.out.println("Valor al desbordar (maximo + 1): " + desbordado);
        
        if (desbordado == minimo) {
            System.out.println("El tipo short se comporta de forma ciclica.");
        } else {
            System.out.println("El tipo short NO se comporta de forma ciclica.");
        }
    }
}
