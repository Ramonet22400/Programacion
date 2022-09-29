import java.util.Scanner;

public class EX_01 {
    public EX_01() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        int igual = 0;
        int menor = 0;
        Integer[] numeros = new Integer[10];

        for(int i = 0; i < 10; ++i) {
            System.out.println("Introduzca los numeros: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] < 0) {
                System.out.println("El numero es menor que 0");
                ++menor;
            } else if (numeros[i] == 0) {
                System.out.println("El numero es igual que 0");
                ++igual;
            } else {
                System.out.println("El numero es mayor que 0");
                ++mayor;
            }
        }

        System.out.println("Cantida de numeros menores que 0: " + menor);
        System.out.println("Cantidad de numeros iguales que 0: " + igual);
        System.out.println("Cantidad de numeros mayores que 0: " + mayor);
    }
}