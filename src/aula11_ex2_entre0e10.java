import java.util.Scanner;

public class aula11_ex2_entre0e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDeNumeros = 0;
        int totalNumerosImpares = 0;
        System.out.println("Digite o limite da sua contagem: ");
        int metaContagem = sc.nextInt();

        for (int contador = 1; contador <= metaContagem; contador++) {


            System.out.println("Digite o valor desejado: ");
            int numeroNovo = sc.nextInt();

            if (numeroNovo > 0 && numeroNovo < 10 && numeroNovo % 2 != 0) {
                totalNumerosImpares = totalNumerosImpares + numeroNovo;
                totalDeNumeros++;
            }

        }
        System.out.println("O Total de números dentro do intervalo é: " + totalDeNumeros);
        System.out.println("A soma dos números impares digitados é de: " + totalNumerosImpares);
        sc.close();
    }
}
