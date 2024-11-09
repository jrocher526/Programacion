Algoritmo ccal
	//definir variables
	Definir num Como Entero
	Definir resultado Como Entero
	//dar instrucciones
	num = 1
	Mientras num <> 0
		Escribir "Ingrese el número para generar su tabla de multiplicar: "
		Leer num
		Para i = 1 Hasta 10 Con Paso 1 Hacer
			resultado = num * i
			Escribir numero, " x ", i, " = ", resultado
		FinPara	
	FinMientras

FinAlgoritmo
