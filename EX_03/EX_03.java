import java.util.Scanner;
import java.util.Random;
public class EX_03 {

    public static void main(String[] args) {

        int[][] primer_array = new int[4][5];
        int[][] array_resultado = new int[5][6];
        int resultado_final1 =0;
        int resultado_final2 =0;
        int suma_final = 0;

        Random rnd = new Random();

        int fila = 0;
        int columna = 0;

        for ( fila = 0; fila <= 3; fila++) {

            for ( columna = 0; columna<= 4; columna++) {

                primer_array[fila][columna] = rnd.nextInt(10);
                System.out.print("  " + primer_array[fila][columna] + "\t" + " | ");

                array_resultado[fila][5] += primer_array[fila][columna];
            }
            System.out.println(array_resultado[fila][5]);
        }

        for ( fila = 0; fila <= 3; fila++) {

            for (columna = 0; columna <= 4; columna++) {

                array_resultado[4][columna] += primer_array[fila][columna];
            }

        }

        for( columna = 0; columna <= 4; columna++){
            System.out.print(" " + array_resultado[4][columna] + "\t" + " | ");
        }

        for ( columna = 0; columna <= 4; columna++){

            resultado_final1 += array_resultado[4][columna];
        }

        for( fila = 0; fila <5; fila++){

            resultado_final2 += array_resultado[fila][5];
        }

        suma_final = resultado_final1 + resultado_final2;
        System.out.println(suma_final);

    }
}

