import java.util.Locale;
import java.util.Scanner;

public class debug {
    public static void main (String [] args)    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);


        System.out.println("Digite os valores do seu terreno:");
        System.out.println("Largura:"); 
        double largura = sc.nextDouble();
         System.out.println("Altura:"); 
        double altura = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        

        double area = largura * altura;
        double valor = area * metroQuadrado;

        System.out.printf("A área do seu terreno é: %.2f%n", area);
        System.out.printf("O valor do seu terreno é: R$ %.2f reais", valor);

        sc.close();
    }
    
}
