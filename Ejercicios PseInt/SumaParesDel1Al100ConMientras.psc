Algoritmo SumaParesDel1Al100ConMientras
    // Declarar variables
    Definir suma Como Entero
    Definir i Como Entero
    // Inicializar las variables
    suma <- 0
    i <- 1
    // Bucle para sumar solo los números pares del 1 al 100
    Mientras i <= 100 Hacer
        Si i % 2 = 0 Entonces
            suma <- suma + i
        FinSi
        i <- i + 1
    FinMientras
    // Mostrar el resultado
    Escribir "La suma de los números pares del 1 al 100 es: ", suma
FinAlgoritmo
