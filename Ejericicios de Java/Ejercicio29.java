package ejercicio.pkg29;



public class Ejercicio29 {
    public static void main(String[] args) {

        for (int i = 4; i > 0; i--) {       //Construye la linea horizontal, el primero for se representaria como la "X" en el plano cartesiano 
            for (int t = 0; t < i; t++) {       //Contruye la linea vertical,el segundo for se representaria como la "Y" en el plano cartesiano 
                System.out.print("* ");  
                  
            }
          System.out.println();
        }
    }
}

            
