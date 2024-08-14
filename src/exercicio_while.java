import java.util.Scanner;

public class exercicio_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            System.out.println("Digite um novo valor:");
            x = sc.nextInt();
        }

        System.out.println("Ovalor digitado foi " + soma);

        sc.close();
    }

}
