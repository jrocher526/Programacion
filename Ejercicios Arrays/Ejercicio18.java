package ud2;

public class Ejercicio18 {
	public static void main(String[] args) {

		String s = "Jho nal Je sus";
		char c;
		int cont = 0;

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == ' ') {
				cont++;
			}
		}
		System.out.print(cont);
	}

	
}
