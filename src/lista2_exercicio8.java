import java.util.Scanner;

public class lista2_exercicio8 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);

        double sal;

        System.out.println("Digite o valor do seu salário:");
        sal = sc.nextDouble();
        double imposto;

        if (sal < 2000.00)  {
            System.out.println("Você está isento de impostos");
        } else if (sal <= 3000.00)    {
            imposto = (sal - 2000) * 0.08;
        }
    }
    
}
