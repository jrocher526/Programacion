Algoritmo calculadora
	//definir variables
	Definir num1 Como Real
	Definir num2 Como Real
	definir opcion Como Caracter
	Definir resultado Como Real
	//solicitar los numeros al usuario
	escribir "Ingrese primer numero"
	leer num1
	escribir "ingrese segundo numero"
	leer num2
	//solicitar la operacion al usuario
	Escribir "Que operacion desea realizar (+, -, *, x, /):"
	leer opcion
	//realizar la operacion selecionada
	Segun opcion hacer 
			caso "+":
				resultado = num1 + num2
				escribir "resultado es: ", resultado 
				
			caso "-":
				resultado = num1 - num2
				escribir "resultado es: ", resultado
				
			caso "*":
				resultado = num1 * num2
				escribir "resultado es: ", resultado
				
			Caso "/":
				si num2 == 0 Entonces
					escribir "esta division no se puede realizar"
				sino 
					resultado = num1 / num2
					escribir "resultado es: ", resultado
				FinSi
		De Otro Modo:
			Escribir "operacion no valida"
			
	FinSegun
	
	Funcion 
	
FinAlgoritmo
