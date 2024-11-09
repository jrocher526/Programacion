package ejercicio.pkg15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double NumDecimal;
       int NumEntero;
       
            System.out.println("Ingrese un numero con decinal para redondearlo:");
                NumDecimal = sc.nextDouble();
                
                NumDecimal = Math.round(NumDecimal);
               
                NumEntero = (int) (NumDecimal);
                
            System.out.println("El resultado es: " + NumEntero);
                
    }
    
}
