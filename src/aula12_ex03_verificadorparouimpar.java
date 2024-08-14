import java.util.Scanner;

public class aula12_ex03_verificadorparouimpar {

    public static void main(String[] args) {
        aula12_ex03_verificadorparouimpar Start = new aula12_ex03_verificadorparouimpar();

        System.out.println("Digite o valor desejado: ");
        System.out.println(Start.respostaParOuImpar());
    }

    private String respostaParOuImpar() {
        Scanner sc = new Scanner(System.in);
        String parOuImpar = "";
        int valor = sc.nextInt();
        sc.nextLine();

        if (valor % 2 == 0) {
            parOuImpar = "Par";
        } else {
            parOuImpar = "Impar";
        }
        return parOuImpar;
    }

}




