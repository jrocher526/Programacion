package Ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
            
        int num1;
        int num2;
        int num3;
        
        System.out.println("Ingrese primer numero:");
            num1 = sc.nextInt();
        
        System.out.println("Ingrese segundo numero:");
            num2 = sc.nextInt();
        
        System.out.println("Ingrese tercer numero:");
            num3 = sc.nextInt();
            
        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 + " es mayor que " + num2 + " y " + num2 +
                    " es mayor que " + num3);
        
            if (num1 > num3 && num3 > num2);
                System.out.println(num1 + " es mayor que " + num3 + " y " + num3 
                        + " es mayor que " + num2);
            
        }else if (num2 > num1 && num1 > num3) {
            System.out.println(num2 + " es mayor que " + num1 + " y " + num1 +
                    " es mayor que " + num3);
            
        }else if (num2 > num3 && num3 > num1) {
            System.out.println(num2 + " es mayor que " + num3 + " y " + num3 +
                    " es mayor que " + num1);  
            
        }else if (num3 > num1 && num1 > num2) {
            System.out.println(num3 + " es mayor que " + num1 + " y " + num1 +
                    " es mayor que " + num2);  
            
        }else if (num3 > num2 && num2 > num1) {
            System.out.println(num3 + " es mayor que " + num2 + " y " + num2 +
                    " es mayor que " + num1);    
            
            
        }   
    }
}
