import java.util.Locale;
import java.util.Scanner;

public class lista1_exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        int f;
        double h, money, sal;

        System.out.println("Digite o dód do funcionário: ");
        f = sc.nextInt();
        System.out.println("Digite as horas do trabalhadas: ");
        h = sc.nextDouble();
        System.out.println("Digite o valor da hora trabalhada: ");
        money = sc.nextDouble();
        
        sal = h * money;
        System.out.printf("O salário do funcionário cód: " + f + " será: R$ %.2f%n" , sal);
        sc.close();
    }

}
