Algoritmo AñoBisiesto
	//Definir variables
	definir año Como Entero
	Escribir "Introduzca el año: "
	Leer año
	
	Si (año mod 4 = 0) entonces 
		si (año mod 100 <> 0) o (año mod 400 <> 0) Entonces
			Escribir "el año ", año , " es bisiesto"
		sino 
			Escribir "el año", año , "no es bisiesto"
		FinSi
	sino 
		escribir "el año " , año , " no es bisiesto"
	FinSi	
FinAlgoritmo
