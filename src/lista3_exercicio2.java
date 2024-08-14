import java.util.Scanner;

public class lista3_exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor de X:");
        int x = sc.nextInt();
        System.out.println("Digite o Valor de y:");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }

            System.out.println("Digite o Valor de X:");
            x = sc.nextInt();
            System.out.println("Digite o Valor de y:");
            y = sc.nextInt();

        }

        System.out.println("Fora da Coordenada0");
        sc.close();

    }

}
