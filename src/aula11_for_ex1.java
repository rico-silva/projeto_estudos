import java.util.Scanner;

public class aula11_for_ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite até onde deseja contar: ");
        int meta = sc.nextInt();
        System.out.println("Digite qual o intervalo desejado: ");
        int intervalo = sc.nextInt();

        for (int contador = 0; contador <= meta; contador = contador + intervalo)   {
            System.out.println(contador);

        }
    }
}
