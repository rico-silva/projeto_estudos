import java.util. Scanner;

public class funcaomatemaitica {
    public static void main (String [] args) {
      
        Scanner sc = new Scanner (System.in);
      
        double x, y, z, A, B, C;

        System.out.println("Digite seus dados: ");

        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();

        A = Math.sqrt(x);
        B = Math.pow(x, y);
        C = Math.abs(z);

        System.out.println("A raiz quadrade de " + x + " é: " + A);
        System.out.println("A potência de " + y + " elevado a " + x + " é " + B);
        System.out.println("O valor absoluto de " + z + " é " + C);

        sc.close();


    }
    
}
