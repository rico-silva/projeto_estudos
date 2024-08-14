
import java.util.Scanner;

public class numeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Digite até onde deseja contar:");
        System.out.println("-----------------------------");
        int meta = sc.nextInt();
        int contador = 1;
        int numPrimo = 0;

        do {
            if (meta % contador == 0) {
                numPrimo++;
            }
            contador++;
        } while (contador <= meta);

        if (numPrimo > 2) {
            System.out.println(meta + " não é um número primo!");
        } else {
            System.out.println(meta + " é um número primo!");
        }

        sc.close();


    }
}
