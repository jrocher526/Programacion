Algoritmo CalcularFactorial
    Definir num como entero
	definir factorial Como real
	definir contador Como entero

    factorial = 1
    contador = 1
	
    Escribir "Ingrese un n�mero para calcular su factorial:"
    Leer num
	
    Repetir
        factorial = factorial * contador
        contador = contador + 1
    Hasta Que contador > num
	
    Escribir "El factorial de ", num, " es: ", factorial
FinAlgoritmo
