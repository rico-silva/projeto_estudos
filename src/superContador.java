import java.util.Scanner;

public class superContador {

    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("       MENU      ");
        System.out.println("=================");
        System.out.println("| [1] De 1 a 10 |");
        System.out.println("| [2] De 10 a 1 |");
        System.out.println("| [3] Sair      |");
        System.out.println("=================");
        Scanner sc = new Scanner(System.in);

        int resposta = sc.nextInt();
        int contador = 1;
        int referencia = 10;
        int meta = referencia;

        if (resposta == 1) {
            do {
                System.out.println(contador);
                contador++;
            } while (referencia >= contador);
        } else if (resposta == 2) {
            do {
                System.out.println(meta);
                meta = referencia - contador;
                contador++;
            } while (contador < referencia);
        } else {
            System.out.println("Programa Finalizado. Volte Sempre!");
        }
        sc.close();
    }
}
