package ejercicio201;

import java.util.Scanner;

public class ejercicio201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nota;
        String notaExamen;
        
        System.out.println("Ingrese nota:");
            nota = sc.nextInt();
        
         notaExamen = switch (nota) {
            
            case 0,1,2,3,4 -> "insuficiente";
            case 5 -> "suficiente";
            case 6  -> "bien";
            case 7,8 -> "notable";
            case 9,10 -> "sobresaliente";
            default -> "nota invalida";
            
            
        };
             System.out.println(notaExamen);
    }
}
