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

El primero de los bucles es un bucle **for**, este lo que hara es repetir sobre si mismo 4 veces con la variable *fila*, dentro de este bucle tenemos otro bucle **for** que se repetira 5 veces con la variable *columna*.

De esta forma el bucle imprimira una tabla de 4 filas por 5 columnas, dentro del segundo bucle encontramos la variable primer_array, donde se le imprimiran valores aleatorios del 0 al 10, se imprime por pantalla y luego se añade a array_resultado los valores de la fila. De esta forma tendremos la sexta columna con la suma de todos los valores de la fila.

Este bucle imprimira la tabla con los valores aleatorios, mas de todos los valores de cada fila.

| 2 | 4 | 3 | 6 | 2 | 17 |

El siguiente bucle recorrera las columnas de la tabla ya creada sumando los valores al array_resultado en las *columnas*, de esta forma tendremos en la tabla los valores aleatorios, la suma de los valores de las filas y las de las columnas.
|2|
|4|
|5|
|9|
|20|

Luego, para cumplir la última petición que este ejercicio nos pide, tendremos que hacer dos bucles **for**. Estos servirán para sumar el resultado de todos los valores de la tabla eh imprimirlo en la posición del array[5][6].

* Entonces el primer bucle lo que hará será, recorrer todas las sumas de las columnas eh ir sumándolas entre sí de esta forma tendremos el valor total de las sumas de todas las columnas del array. Guardando este en *resultado_final1*

* El siguiente bucle hará lo opuesta sumar todas las sumas de todas las filas entres si, quedando el total de todos los valores de las filas. Guardándolo en la variable *resultado_fiinal2*

Y por último en la variable *suma_fila*, sumaremos el *resultado_final1* y *resultado_final2*. Por último imprimiremos el resultado con un **sout**.

FIN DEL README :)
