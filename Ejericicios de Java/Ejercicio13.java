package ejercicio.pkg13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        //Deckaranis las variablas a utilizar
        boolean exprecion1;
        boolean exprecion2;
        boolean exprecion3;
        int x; //exprecion 4
        boolean b; //exprecion 5
                
        //Aca resolvemos y mostramos por pantalla las expreciones
        exprecion1 = 10 + 5 * 2 >20 && 4 == 4;
        System.out.println("Exprecion 1: 10 + 5 * 2 >20 && 4 == 4");
            System.out.println("El resultado de la exprecion 1 es: " + exprecion1);
        
        
        exprecion2 = !(7 + 3 > 10) || 3 * 2 <= 6;
        System.out.println("Exprecion 2: !(7 + 3 > 10) || 3 * 2 <= 6");
            System.out.println("El resultado de la exprecion 2 es: " + exprecion2);
        
        
        exprecion3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("Exprecion 3: 10 / 2 + 3 * 5 == 19 && true");
            System.out.println("El resultado de la exprecion 3 es: " + exprecion3);
        
        
        x = 5; x += 3 * 2;
        System.out.println("exprecion 4: x = 5; x += 3 * 2");
            System.out.println("El resultado de la exprecion 4 es: " + x);
        
        
        b = false; b = !b || 7 % 2 == 1;
        System.out.println("exprecion 5: b = false; b = !b || 7 % 2 == 1");
            System.out.println("El resultado de la exprecion 5 es: " + b);
            
            
    }
    
}
