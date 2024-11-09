Algoritmo suma_hasta
	Definir num1 Como Entero
	Definir suma Como Entero
	suma = num1 + num1
	
	Repetir
		escribir "ingrese numero"
		leer num1
		suma = suma + num1
	Hasta Que num1 = 0
	resultado = suma 
	escribir "el resultado de la suma es " , suma
FinAlgoritmo
