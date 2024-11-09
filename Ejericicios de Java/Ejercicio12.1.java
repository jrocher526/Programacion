package ejercicio.pkg12.pkg1;

import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dato;
        int valorAbso;
        
        System.out.println("Ingrese un numero para saber su valor absoluto:");
            dato = sc.nextInt();
            
            valorAbso = dato > 0 ? dato : (-1) * dato;
            
        System.out.println("El valor absoluto de " + dato + " es: " + valorAbso);
        
                    
    }
}
