import java.util.Scanner;

public class lista2_exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cod, qnt;
        double val;

        System.out.println("---Produtos e valores---");
        System.out.println("1 - Cachorro Quente - R$ 4,00");
        System.out.println("2 - X-Salada - R$ 4,50");
        System.out.println("3 - X-Bacon - R$ 5,00");
        System.out.println("4 - Torrada Simples - R$ 2,00");
        System.out.println("5 - Refrigerante - R$ 2,50");
        System.out.println("--------------------------------");
        System.out.println("Digite o código do produto:");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade do produto:");
        qnt = sc.nextInt();

        if (cod == 1) {
            val = qnt * 4;
            System.out.println("O valor a ser pago é de: R$" + val + "reais");
        } else if (cod == 2) {
            val = qnt * 4.5;
            System.out.println("O Valor a se pago é de R$ " + val + " reais");
        } else if (cod == 3) {
            val = qnt * 5;
            System.out.println("O valor a ser pago é de R$ " + val + " reais");
        } else if (cod == 4)    {
            val = qnt * 2;
            System.out.println("O Valor a ser pago é de R$ " + val + "reais");
        } else {
            val = qnt * 2.5;
            System.out.println("O valor a ser ágo é de " + val + " reais"); 
        }
        sc.close();
    }

}
