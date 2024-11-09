Algoritmo menuCalculadora
	// Definici�n de variables principales
	Definir x Como Entero  // Variable para almacenar n�meros
	Definir i Como Entero  // Variable para iteraciones en bucles
	Definir result Como Entero  // Variable para almacenar resultados de c�lculos
	Definir num como Cadena  // Variable para almacenar valores en formato cadena
	Definir  num4 Como Entero  // Variable para almacenar valores enteros
	Definir suma1 Como Entero  // Variable para almacenar la suma acumulada
	Definir acumulador Como Real  // Variable acumuladora
	Definir saludoPrincipal Como Cadena  // Variable para un saludo inicial
	
	// Inicializaci�n del acumulador
    acumulador = 0
	
	// Definici�n de variables para nombres y n�meros de acceso
	Definir numNombre1 como entero
	Definir numNombre2 como entero
	Definir numNombre3 como entero
	Definir nombre1 como cadena
	Definir nombre2 como cadena
	Definir nombre3 como cadena
	
	// Asignaci�n de nombres y n�meros para verificaci�n de acceso
	nombre1="Alvaro"
	nombre2="Jhonal"
	nombre3="Alejandro"
	numNombre1=1
	numNombre2=2
	numNombre3=3
	
	// Conversi�n de n�meros a texto
	s=ConvertirATexto(numNombre1)
	s="1"
	s2=ConvertirATexto(numNombre2)
	s2="2"
	s3=ConvertirATexto(numNombre3)
	s3="3"
	
	// Lectura del valor de entrada (sa) para validar el acceso
	Escribir "Introduzca su ID"
	Leer sa
	// Estructura Segun para comparar la entrada con los valores predefinidos
	Segun sa Hacer
			1:
				Si "1"=s Entonces
					Escribir " has entrado ",nombre1  // Verificaci�n exitosa de acceso
				SiNo
					Escribir " permiso denegado"  // Mensaje de error
				Fin Si
			2:
				Si "2"=s2 Entonces
					Escribir " has entrado ",nombre2
				SiNo
					Escribir " permiso denegado"
				Fin Si
			3:
				Si "3"=s3 Entonces
				Escribir " has entrado ",nombre3
			SiNo
				Escribir " permiso denegado"
			Fin Si
		De Otro Modo:
			Escribir "acceso denegado"  // Mensaje en caso de valor incorrecto
	Fin Segun
	
	//Menu impreso por pantalla con las distintas opciones
    Escribir " 1.Suma"
	Escribir " 2.Resta"
	Escribir " 3.Multiplicacion"
	Escribir " 4.Division"
	Escribir " 5.raizCuadrada"
	Escribir " 6.Seno"
	Escribir " 7.Coseno"
	Escribir " 8.Tangente"
	Escribir " 9.NotaMedia"
	Escribir "10.TablaMultiplicar"
	Escribir "11.Acumulador"
	
	//Esto es para salir del bucle
	Escribir "12.Salir"
	
	// Leer la opci�n seleccionada por el usuario
	Escribir " Elige la operacion deseada"
	Leer opcionMenu
	
	// Estructura Segun para seleccionar la opci�n del men�
Segun opcionMenu Hacer
	1:
		sum=suma(int1,int2)  // Llama a la funci�n de suma
	2:
		res=resta(int1,int2)  // Llama a la funci�n de resta
	3: 
		mul=multiplicacion(int1,int2)  // Llama a la funci�n de multiplicaci�n
	4:
		div=division(int1,int2)  // Llama a la funci�n de divisi�n
	5:
		resu=raizCuadrada(int1)  // Llama a la funci�n de ra�z cuadrada
	6:
		seo=seno(int1,pi)  // Llama a la funci�n de seno
	7:
		cosd=coz(int1,pi)  // Llama a la funci�n de coseno
	8:
		tam=tad(int1,pi)  // Llama a la funci�n de tangente
	9:
		not=nota(int1,int2)  // Llama a la funci�n de c�lculo de nota media
	10:
		tabla=tabl(num,i,x,result)  // Llama a la funci�n de tabla de multiplicar
	11:
		acu=acumu(num4)  // Llama a la funci�n de acumulador
	12:
		saludo <- saludar(nombre2)  // Llama a la funci�n de saludo
		
		
	De Otro Modo:
		Escribir "Opci�n no valida. Intente de nuevo."  // Mensaje en caso de opci�n inv�lida
Fin Segun
FinAlgoritmo

//Todas las funciones de cada operacion  

// Funci�n para calcular la ra�z cuadrada
Funcion resu=raizCuadrada(int1)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	resu=raiz(int1)
	Escribir  "el resultado es: ",resu
FinFuncion

// Funci�n para sumar dos n�meros
Funcion sum=suma(int1,int2)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	Escribir"introduzca el segundo numero. "
	
	Leer int2
	sum=int1+int2
	Escribir  "el resultado es: ",sum
FinFuncion

// Funci�n para restar dos n�meros
Funcion res=resta(int1,int2)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	Escribir"introduzca el segundo numero. "
	
	Leer int2
	res=int1-int2
	Escribir  "el resultado es: ",res
FinFuncion

// Funci�n para multiplicar dos n�meros
Funcion mul=multiplicacion(int1,int2)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	Escribir"introduzca el segundo numero. "
	
	Leer int2
	mul=int1*int2
	Escribir  "el resultado es: ",mul
FinFuncion

// Funci�n para dividir dos n�meros
Funcion div=division(int1,int2)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	Escribir"introduzca el segundo numero. "
	
	Leer int2
	div = int1 % int2  // Divisi�n con resto
	Escribir "el resultado es: ",div
FinFuncion

// Funci�n para calcular el seno de un �ngulo
Funcion seo=seno(int1,pi)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	seo = SEN(int1*PI/180)  // Conversi�n a radianes
	Escribir "el resultado es: ",seo
FinFuncion

// Funci�n para calcular el coseno de un �ngulo
Funcion cosd=coz(int1,pi)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	cosd = COS(int1*PI/180)  // Conversi�n a radianes
	Escribir "el resultado es: ",cosd
FinFuncion

// Funci�n para calcular la tangente de un �ngulo
Funcion tam=tad(int1,pi)
	Escribir " introduzca el primer numero: "
	
	Leer int1
	tam = TAN(int1*PI/180)  // Conversi�n a radianes
	Escribir "el resultado es: ",tam
FinFuncion

// Funci�n para calcular la nota media de dos ex�menes
Funcion not=nota(int1,int2)
	Escribir " introduzca tu nota 1 "
	Leer int1
	Escribir"introduzca tu nota 2 "
	Leer int2
	
	sumanota=int1+int2
	media=sumanota/2
	not = Redon(media)  // Redondeo de la media
	Escribir " la nota final entre tus dos examenes es: ",not
FinFuncion

// Funci�n para acumular una suma hasta que se ingrese 0
Funcion acu=acumu(num4)
	Escribir "Ingrese 1 para sumar en el acumulador. Ingrese 0 para salir."
	Leer num4
	
	Mientras num4 <> 0 Hacer
		
		Escribir "Dime el numero para empezar a sumarlo (0 para salir):"
		Leer num4
		suma1 = suma1 + num4
		Si num4 = 0 Entonces
			Escribir "Salir"
		Fin Si
		
	Fin Mientras
	
	Escribir "La suma total es: ", suma1
	
FinFuncion

// Funci�n para mostrar un saludo de despedida
Funcion saludo <- saludar(nombre2)
	Escribir "Cual es tu nombre?: "
	Leer nombre2
	Escribir  " Adios " + nombre2
	
FinFuncion

// Funci�n para generar la tabla de multiplicar de un n�mero
Funcion tabla=tabl(num,i,x,result)
	Repetir
		
		Escribir "Escriba salir si quiere terminar el programa o introduzca el numero "
		Leer num
		Si num="salir" Entonces
			Escribir "salio"
		SiNo
			Escribir  "introduce el numero"
			Leer x
			Para i=0 Hasta 10 Con Paso 1 Hacer
				result=x * i
				Escribir i ," * ",x, " = ",result
			Fin Para
			
		Fin Si
		
	Hasta Que num="salir"
	
FinFuncion





