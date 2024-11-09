Algoritmo modulos_1
	// Definir variables
	Definir num1 Como Entero
	Definir resultado Como Cadena
	// dar instrucciones
	Escribir 'ingrese un numero'
	Leer num1
	mostrarmensaje <- espar(num1)
	Si mostrarmensaje=' es par' Entonces
		Escribir 'numero par'
	SiNo
		Escribir 'numero impar'
	FinSi
FinAlgoritmo

Función mostrarmensaje <- espar(num1)
	Si num1 MOD 2=0 Entonces
		resultado <- 'es par'
	SiNo
		resultado <- 'es impar'
	FinSi
FinFunción
