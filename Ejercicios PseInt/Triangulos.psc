Algoritmo triangulos
	// Definir valores
	Definir a Como Real
	definir b Como Real
	definir c Como Real
	//Mostrar y leer 
	Escribir "Introduzca primer valor"
	leer a
	Escribir "introduzca segundo valor"
	leer b 
	Escribir "introduzca tercer valor"
	leer c
	// Determinar triangulo
	si (a + b > c) Y (b + c > a) Y (c + a > b) Entonces
		si (a = b) o (b = c) Entonces
			Escribir "El triangulo es equilatero"
		sino 
				si (a = b) O (a = c) O (b = c) entonces
					Escribir "El triangulo es Isosceles"
				SiNo
					Escribir "el triangulo es Escaleno"
				FinSi
		FinSi
	FinSi
FinAlgoritmo
