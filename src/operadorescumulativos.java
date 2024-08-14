import java.util.Locale;
import java.util.Scanner;

public class operadorescumulativos {

    public static void main(String[] args) {
        /*
         * operadores de atribuição cumulativa
         * a+=b |a-=b |a*=b |a\=b |a %=b
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os minutos utilizados esse mês: ");
        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.00;
        }
        System.out.printf("O Valor da conta é R$: %.2f reais", conta);

        sc.close();
    }

}
