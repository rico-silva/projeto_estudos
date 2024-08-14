import java.util.Locale;
import java.util.Scanner;

public class lista2_exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));
        int x;

        System.out.println("Digite um valor: ");
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("O número digitado é " + x + " e ele é par!");
        } else {
            System.err.println("O número digitado é " + x + " e ele é ímpar");
        }

        sc.close();
    }
}
