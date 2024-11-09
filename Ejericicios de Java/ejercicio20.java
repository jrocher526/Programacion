package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Ingrese su nota:");
            nota = sc.nextInt();
       
        switch (nota) {
            
            case 0,1,2,3,4:
                System.out.println("Nota insuficiente");
                break; 
                
            case 5: 
                System.out.println("Nota suficiente");
                break; 
                
            case 6: 
                System.out.println("Nota bien");
                break; 
                
            case 7,8:
                System.out.println("Nota notable");
                break; 
                
            case 9,10:
                System.out.println("Nota sobresaliente");
                break; 
                
            default:
                System.out.println("Nota invalida");
                
        }
             
        
        
        
    }
}
