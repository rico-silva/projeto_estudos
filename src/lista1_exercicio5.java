import java.util.Locale;
import java.util.Scanner;

public class lista1_exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));

        int cod1, cod2, qnt1, qnt2;
        double val1, val2, soma;

        val1 = 5.30;
        val2 = 5.10;

        System.out.println("Insira o cód da peça1: ");
        cod1 = sc.nextInt();
        System.out.println("Insira a quantidade de peças1: ");
        qnt1 = sc.nextInt();

        System.out.println("Insira o cód da peça2: ");
        cod2 = sc.nextInt();
        System.out.println("Insira a quantidade de peças2: ");
        qnt2 = sc.nextInt();

        soma = (val1 * qnt1) + (val2 * qnt2);

        System.out.printf("O valor a ser pago é: R$ %.2f reais", soma);

        sc.close();

    }
}
