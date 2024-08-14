import java.util.Scanner;

public class ExercicioFatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Digite o valor de sua fatorial: ");
        System.out.println("--------------------------------");
        int numero = sc.nextInt();
        int contador = 1;
        int fatorial = numero;
        do {
            fatorial = fatorial * contador;
            System.out.println(fatorial);
            contador++;
        } while (numero > contador);
        System.out.println("FIM");
        sc.close();
    }
}
