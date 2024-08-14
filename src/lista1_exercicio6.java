import java.util.Locale;
import java.util.Scanner;

public class lista1_exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        double A, B, C, tri, cir, trap, quad, ret, pi;

        pi = 3.14;

        System.out.println("Digite o valor de A:");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        C = sc.nextDouble();

        tri = A * C / 2;
        System.out.printf("A área do triangulo retangulo é: %.2f%n", tri);

        cir = pi * (Math.pow(C,2));
        System.out.printf("A área do circulo é: %.2f%n", cir);

        trap = ((A + B) * C) / 2;
        System.out.printf("A área do trapézio é: %.2f%n", trap);

        quad = Math.pow(B,2);
        System.out.printf("A áera do quadrado é igual a: %.2f%n", quad);

        ret = A * B;
        System.out.printf("A área do retângulo é igual a: %.2f%n", ret);


        sc.close();
    }

}
