package ejercicio.pkg17;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int num2;
       
        
        System.out.println("Ingrese un numero:");
            num = sc.nextInt();
                   
        System.out.println("Ingrese otro numero:");
            num2 = sc.nextInt();
            
            String resultado = (num == num2) ? " son iguales " : " no son iguales ";
            
            int numMayor = (num > num2) ? num : num2;
            
            
            
            System.out.println("Los numeros " + num + " y " + num2 + resultado + " y el " + numMayor + " es mayor");
                                
                   
    }
    
}
