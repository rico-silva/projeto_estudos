import java.util.Scanner;

public class lista2_exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        Double val1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        Double val2 = sc.nextDouble();

        if (val1 == 0 && val2 == 0) {
            System.out.println("Origem");
        } else if ( val1 > 0 && val2 >0)    {
            System.out.println(" Quadrante Q1");
        } else if (val1 < 0 && val2 > 0)    {
            System.out.println("Quadrante Q2");
        } else if (val1 < 0 && val2 < 0)    {
            System.out.println("Quadrante Q3");
        } else {
            System.out.println("Quadrante Q4");
        }

        sc.close();

    }

}
