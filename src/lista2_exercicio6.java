import java.util.Scanner;

public class lista2_exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");

        double val1 = sc.nextDouble();

        if (val1 > 25 && val1 < 50) {
            System.out.println("Intervalo [25,50]");
        } else if (val1 > 0 && val1 < 25) {
            System.out.println("Intervalo [0,25]");
        } else if (val1 > 75 && val1 < 100) {
            System.out.println("Intervalo [75,100]");
        } else if (val1 > 50 && val1 < 75) {
            System.out.println("Intervalo [50,75]");
        } else {
            System.out.println("Valor fora do intervalo");
        }
        sc.close();

    }
}
