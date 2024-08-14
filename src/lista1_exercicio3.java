import java.util.Scanner;

public class lista1_exercicio3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, C, D, DIF;

        System.out.println("Digite quatro valores: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIF = (A * B - C * D);

        System.out.println("A diferença da equação é: " + DIF);

        sc.close();

    }

}
