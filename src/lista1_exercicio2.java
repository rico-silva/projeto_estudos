import java.util.Locale;
import java.util.Scanner;

public class lista1_exercicio2 {
    public static void main (String [] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        double r, pi, area;
        pi = 3.14159;
        

        System.out.println("Digite o valor do raio: ");
        r = sc.nextDouble();
        area = pi * (Math.pow(r, 2));
        System.out.printf("A area do círculo é: %.4f%n " , area);
        sc.close();

        
    }
    
}
