import java.util.Scanner;

public class chapeuSeletor {

    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("    ESCOLHENDO PESSOAS    ");
        System.out.println("==========================");
        Scanner sc = new Scanner(System.in);

        String resposta;
        int totParametro1 = 0;
        int totParametro2 = 0;


        do {
            System.out.println("Qual o sexo? [H/M]");
            String sexo = sc.nextLine();

            System.out.println("Qual a sua idade: ");
            int idade = sc.nextInt();


            System.out.println("Qual a cor do seu cabelo: ");
            System.out.println("[1] Loiro ");
            System.out.println("[2] Preto ");
            System.out.println("[3] Castanho ");
            System.out.println("[4] Ruivo ");
            int cabelo = sc.nextInt();
            sc.nextLine();

            if (sexo.equalsIgnoreCase("h") && cabelo == 3 && idade > 18) {
                totParametro1++;

            } else if (sexo.equalsIgnoreCase("m") && (idade > 18 && idade < 35)) {
                totParametro2++;
            }

            System.out.println("Deseja continuar: [S/N]");
            resposta = sc.nextLine();

        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("O total de parametros 1 é: " + totParametro1);
        System.out.println("O total de parametros 2 é: " + totParametro2);

        sc.close();


    }
}
