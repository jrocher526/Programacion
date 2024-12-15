package ud2;
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		String tex1;
		String tex2;
		
		System.out.println("Ingrese un nombre:");
			tex1 = sc.next(); 
		System.out.println("Ingrese otro nombre:");
			tex2 = sc.next();
		
		int texCorto = (tex1 == tex2) ? tex1.length() : tex2.length() ; 
		

		System.out.println("El nombre mas corto tiene " + texCorto + " Caracteres");
		
	}

}
