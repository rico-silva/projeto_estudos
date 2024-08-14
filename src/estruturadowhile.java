import java.util.Scanner;

public class estruturadowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        // int N = sc.nextInt();
        int C = 0;
        String Resposta = "";
       
        do {
            C = C + 1;
            System.out.println(C);
            System.out.println("Deseja continuar: [S/N]");
            Resposta = sc.nextLine();
        } while (Resposta == "N");
        System.out.println("Fim");
        sc.close();
    }
}
