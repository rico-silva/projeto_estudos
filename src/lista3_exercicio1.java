import java.util.Scanner;

public class lista3_exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        System.out.println("Digite sua senha:");
        int novaSenha = sc.nextInt();
        

        while (novaSenha != senha) {
            System.out.println("Senha Incorreta, Digite novamente");
            novaSenha = sc.nextInt();
        }

        System.out.println("Log in");

        sc.close();
    }

}
