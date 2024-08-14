import java.util.Scanner;

public class lista1_exercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y, SOMA;

      
        
        System.out.println("Digite um valor: ");
        x = sc.nextInt();
        System.out.println("Digite um segundo valor valor: ");
        y = sc.nextInt();
        SOMA = (x + y);
        System.out.println("O dados digitados foram: " + x + " e " + y + "!");
        System.out.println("A soma deses valores é igual a: " + SOMA);

        sc.close();

    }

}
