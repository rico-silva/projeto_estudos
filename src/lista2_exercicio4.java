import java.util.Scanner;
import java.util.Locale;

public class lista2_exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, h2, h3;

        System.out.println("Digite a hora de ínicio do jogo:");
        h1 = sc.nextInt();
        System.out.println("Digite a hora do fim do jogo: ");
        h2 = sc.nextInt();

        if (h1 == 0 && h2 == 0) {
            System.out.println("O jogo durou 24 horas");
        } else if (h1 > 0 && h1 <= 12 && h1 < h2) {
            h3 = h2 - h1;
            System.out.println("O jogo durou " + h3 + " horas");
        } else {
            h3 = (24 - h1) + h2 ;
            System.out.println("O jogo durou " + h3 + " horas");

        }
        sc.close();
    }
}
