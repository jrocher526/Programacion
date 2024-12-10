package ejerciciosud2;

public class EjemploRecorereImprimir {
	public static void main(String[] args) {
		
		//declaramos e inicializamos los arrays
		int [] a = {0,4,6,8,10}; 
		
		//imprimimos la referencia 	
		System.out.println(a);
		
		//imprime el contenido
		for (int i = 0; i < a.length; i++) 
			System.out.println(a[i]);
		
		//Imprimir el contenido mediante for-each
		for (int e : a)
			System.out.println(e);
			
		
	}	

}
