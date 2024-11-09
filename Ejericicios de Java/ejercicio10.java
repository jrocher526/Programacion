package ejercicio10;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            float kgManzS1;
            float kgPeraS1;
            float kgManzS2;
            float kgPeraS2;
            float total1;
            float total2;
            float total;
            final float precioManz = 2.35f;
            final float precioPera = 1.95f;
            
        System.out.println("Cuantos kilos de manzana vendio el semestre 1?");
            kgManzS1 = sc.nextFloat();
            
        System.out.println("Cuantos kilos de pera vendio el semestre 1?");
            kgPeraS1 = sc.nextFloat();

        System.out.println("Cuantos kilos de manzana vendio el semestre 2?");
             kgManzS2 = sc.nextFloat();

        System.out.println("Cuantos kilos de pera vendio el semestre 2?");
             kgPeraS2 = sc.nextFloat();

        total1 = precioManz * kgManzS1 + precioManz * kgManzS2;
        total2 = precioPera * kgPeraS1 + precioPera * kgPeraS2;
        total = total1 + total2;
        
        System.out.println("El importe total de sus ventas de manzanas al año fue: " + total1);
        
        System.out.println("El importe total de sus ventas de peras al año fue: " + total2);
        
        System.out.println("El importe total de sus ventas de manzanas y peras al año fue: " + total);
             
    }
      
}
