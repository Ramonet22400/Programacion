##EX_03

*Escribe un programa que genere 20 números al azar entre 0 y 9. Estos números deben 
de ser introducidos en un array de 4 filas y 5 columnas que se le pasará a una función 
que lo mostrará. El programa aparte de visualizar los números tiene que mostrar las 
sumas parciales de las filas y las columnas. En la esquina inferior derecha, saldrá la 
suma total de la columna y fila de resultados.*

Lo primero que haremos en este programa es cargar el import Random, gracias a este podremos generar numeros de forma aleatoria.

Creados la clase y el main, tendremos que declarar las diferentes variables: 2 arrays, y luego tres variables para introducir valores.

* int[][] primer_array = new int[4][5];
* int[][] array_resultado = new int[5][6];
* int resultado_final1 =0;
* int resultado_final2 =0;
* int suma_final = 0;

Para poder entender mejor el ejercicio lo dividiremos la explicación entre los 4 bucles de los que esta formado el programa.

El primero de los bucles es un bucle **for**, este lo que hara es repetir sobre si mismo 4 veces con la variable *fila*, dentro de este bucle tenemos otro bucle **for** que se repetira 5 veces con la variable *columna*. De esta forma el bucle imprimira una tabla de 4 filas por 5 columnas



