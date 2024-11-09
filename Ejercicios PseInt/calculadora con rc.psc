Algoritmo cass
//definir variables
Definir num1 Como Real
Definir num2 Como Real
Definir opcion Como Caracter
Definir resultado Como Real

//solicitar la operacion al usuario
Escribir "Que operacion desea realizar (+, -, *, /, x):"
Leer opcion

//solicitar los numeros al usuario
Escribir "Ingrese primer numero"
Leer num1

si opcion <> "x" entonces
    Escribir "Ingrese segundo numero"
    Leer num2
FinSi

//realizar la operacion seleccionada
Segun opcion hacer 
    caso "+":
        resultado = num1 + num2
        Escribir "resultado es: ", resultado 
		
    caso "-":
        resultado = num1 - num2
        Escribir "resultado es: ", resultado 
		
    caso "*":
        resultado = num1 * num2
        Escribir "resultado es: ", resultado 
		
    Caso "/":
        si num2 == 0 Entonces
            Escribir "esta division no se puede realizar"
        sino 
            resultado = num1 / num2
            Escribir "resultado es: ", resultado
        FinSi
		
    Caso "x":
        resultado = raiz(num1)
        Escribir "resultado es: ", resultado
		
    De Otro Modo:
        Escribir "operacion no valida"
		
FinSegun

FinAlgoritmo
