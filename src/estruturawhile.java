import java.util.Scanner;

public class estruturawhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = x + soma;
            x = sc.nextInt();
        }
        System.out.println("O Valor de X é:" + soma);
        sc.close();
    }
}