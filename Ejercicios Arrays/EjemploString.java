package ud2;

public class EjemploString {
	public static void main(String[] args) {
		
		System.out.println("Hola corazon: \"jhonal\"");
		
		//Convertir
		int i = 40;
		char c =  (char) i;
		System.out.println(c);
		
		char d = 'A';
		int e = d;
		System.out.println(e);
		
		//convertir int a strin
		int j = 50;
		String s = String.valueOf(j);
		System.out.println(s);
		
		//comparar cadenas
		String cad1 = "hola";
		String cad2 = "hola";
		System.out.println(cad1 == cad2);
		
		//tipos primitios si se usa ==
		//Porque no tiene metodos
		
		int e1 = 1;
		int e2 = 1;
		System.out.println(e1 == e2);
		
		//comparar cad1 y cad2 con equals
		System.out.println(cad1.contentEquals(cad2));
		
		//Comprobar metodo comparteTo
		int comparacion;
		
		//Cadenas iguales
		comparacion = "hola".compareTo("hola");
		
		//Cadena invocante menor
		comparacion = "casa".compareTo("dedo");
		
		//Cadena invocante mayor
		comparacion = "dedo".compareTo("casa");
		
		if(comparacion == 0) {
			System.out.println("Son iguales");
			
		} else if (comparacion < 0) {
			System.out.println("Primera meno");
			
		} else {
			System.out.println("Primer mayor");
		}
		
		//Concatenar String
		String nombre = "Jhonal";
		String relleno = " va raspanndo";
		System.out.println(nombre + relleno);
		
		
		
		
	}
}
