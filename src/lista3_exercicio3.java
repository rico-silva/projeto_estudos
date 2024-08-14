import java.util.Scanner;

public class lista3_exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        int cod = sc.nextInt();

        int gas = 0;
        int alc = 0;
        int die = 0;

        while (cod !=4) {
            if (cod == 1) {
                alc = alc + 1;
                System.out.println("Alcool " + alc);
            } else if (cod == 2) {
                gas = gas + 1;
                System.out.println("Gasolina " + gas);
            } else if (cod == 3) {
                die = die + 1;
                System.out.println("Diesel " + die);
            } else {
                System.out.println("Código Inválido");
            }
            System.out.println("Digite o código do produto:");
            cod = sc.nextInt();
        }
        System.out.println("Muito obrigado");

        sc.close();
    }
}
