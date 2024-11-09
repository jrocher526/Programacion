package ejercicio14;

import java.util.Scanner;

public class ejericicio14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //declaro variables
            int primerS;
            int segundoS;
            int tercerS;
  
            float notaMBoletin;
            float notaMExpediente;
            
            //Imprimimos y guardamos datos
            System.out.println("Ingrese su nota del primer trimestre");
                primerS = sc.nextInt();
            
            System.out.println("Ingrese su nota del segundo trimestre");
                segundoS = sc.nextInt();
            
            System.out.println("Ingrese su nota del tercer trimestre");
                tercerS = sc.nextInt();
        
            notaMExpediente = (float) (primerS + segundoS + tercerS) / 3;
            
           notaMBoletin = (int) (notaMExpediente);
            
            System.out.println("Su nota media del curso para el expediente academico es: " + notaMExpediente);
           
            System.out.println("Su nota media del curso para el boletin es: " + notaMBoletin);
            
            
            
                    
            
            
        }
}
