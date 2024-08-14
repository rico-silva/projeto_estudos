package topoSistema;
import java.util.Scanner;

public class aula12_ex1_detetordepesado {

    public static void main(String[] args) {

        String nome;
        String nomeMaisPesado = null;
        int peso;
        int maiorPeso = 0;

        Scanner sc = new Scanner(System.in);

        topoSistema(maiorPeso);

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Digite o nome: ");
            nome = sc.nextLine();
            System.out.println("Digite o peso de " + nome + ":");
            peso = sc.nextInt();
            sc.nextLine();

            if (peso > maiorPeso) {
                topoSistema(maiorPeso = peso);
                nomeMaisPesado = nome;
            }

        }

        System.out.println("A pessoa mais pesada foi: " + nomeMaisPesado + " com o peso de: " + maiorPeso + " kgs");

        sc.close();
    }

    public static int topoSistema(int maiorPeso) {

        System.out.println("------------------------------------------");
        System.out.println("---------- Detector de pesador -----------");
        System.out.println("------- Maior peso até agora:" + maiorPeso + "Kg ---------");
        System.out.println("------------------------------------------");
        return maiorPeso;
    }
}


