Algoritmo A�oBisiesto
	//Definir variables
	definir a�o Como Entero
	Escribir "Introduzca el a�o: "
	Leer a�o
	
	Si (a�o mod 4 = 0) entonces 
		si (a�o mod 100 <> 0) o (a�o mod 400 <> 0) Entonces
			Escribir "el a�o ", a�o , " es bisiesto"
		sino 
			Escribir "el a�o", a�o , "no es bisiesto"
		FinSi
	sino 
		escribir "el a�o " , a�o , " no es bisiesto"
	FinSi	
FinAlgoritmo
