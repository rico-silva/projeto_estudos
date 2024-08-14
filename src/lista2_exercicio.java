import java.util.Locale;
import java.util.Scanner;

public class lista2_exercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um número: ");
        Locale.setDefault(new Locale("pt", "BR"));
        x = sc.nextInt();

        if (x > 0) {
            System.out.println("O núme digitado é: " + x + "e ele é maior que zero");
        } else if (x == 0) {
            System.out.println("O númego digitado é igual a 0");
        } else {
            System.out.println("O número digitado é: " + x + " e ele é menor que zero");
        }

        sc.close();
    }

}
