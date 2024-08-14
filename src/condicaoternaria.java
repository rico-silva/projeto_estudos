import java.util.Locale;
import java.util.Scanner;

public class condicaoternaria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do produto;");
        double preco = sc.nextDouble();


        double preco2 = (preco <= 20.0) ? (preco - ( preco * 0.1)) : (preco - (preco * 0.05));

        System.out.printf("O valor do produto com desconto é R$ %.2f reais", preco2);

        sc.close();

    }

}
