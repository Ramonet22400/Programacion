import java.util.Scanner;
public class EX_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_dni = 23843848;

        String[] letras = {"T","R","W","A","G","M","Y","F","P", "X","B",
                "N","J","Z","S","Q","V","H","L","C","K","E"};

        int resultado = num_dni % 23;

        System.out.println(num_dni+""+letras[resultado]);
    }
}


