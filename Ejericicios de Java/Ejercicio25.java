
package ejercicio.pkg25;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        
        int aciertos = 0;
        int num1;
        int num2;
        int resultadoUsuario;
        int resultadoCorrecto;
        int operacion;
        
        
        System.out.println("Vamos a realizar un par de operaciones");
        
        do {
            num1 = random.nextInt(100) + 1;
            num2 = random.nextInt(100) + 1;
            
            operacion = random.nextInt(2);
            
            if (operacion == 0) {
               
                // Suma
                System.out.println("Cuanto es " + num1 + " + " + num2 + "?");
                resultadoCorrecto = num1 + num2;
            
            } else {
             
                // Resta
                System.out.println("Cuanto es " + num1 + " - " + num2 + "?");
                resultadoCorrecto = num1 - num2;
            }
            
                resultadoUsuario = sc.nextInt();
            
            if (resultadoUsuario == resultadoCorrecto) {
                aciertos++;
                System.out.println("Respuesta correcta: " + aciertos + 
                        " Aciertos");
           
            } else {
               
                int resultado = resultadoCorrecto;
               
                // Terminar bucle
                System.out.println("Respuesta incorrecta, tuviste: "
                        + aciertos + " aciertos.");
                System.out.println("La respuesta correcta era: "
                        + resultado);
            }
            
        } while (resultadoUsuario == resultadoCorrecto);
        
        
        
    }
    
}
