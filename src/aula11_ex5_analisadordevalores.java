import java.util.Scanner;

public class aula11_ex5_analisadordevalores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totNulos = 0;
        int somaValores = 0;
        double mediaValores = 0;
        int totDivCinco = 0;
        int somaPares = 0;
        int somaValores1 = 0;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Digite o " + contador + "° número:");
            int numeroDigitado = sc.nextInt();

            somaValores = somaValores + numeroDigitado;

            mediaValores = somaValores / 5;

            if (numeroDigitado % 5 == 0) {
                totDivCinco++;
            }

            if (numeroDigitado == 0) {
                totNulos++;
            }

            if (numeroDigitado % 2 == 0) {
                somaPares = somaPares + numeroDigitado;
            }

        }

        System.out.println("A soma dos valores é:" + somaValores);
        System.out.println(" A média dos valores é: " + mediaValores);
        System.out.println("O total de valores diviseis por 5 é: " + totDivCinco);
        System.out.println("O tota de nulos digitados foi: " + totNulos);
        System.out.println("A soma dos valores pares é: " + somaPares);
        sc.close();
    }
}
