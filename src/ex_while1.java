import java.util.Scanner;

public class ex_while1 {

    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
        System.out.println("Senha incorreta, digite novamente");
        senha = sc.nextInt();

        }

        System.out.println("Senha correta");
        sc.close();
    }
}