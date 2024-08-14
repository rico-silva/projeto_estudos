import java.util.Scanner;

public class lista2_exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite um valor:");
        A = sc.nextInt();
        
        System.out.println("Digite um valor:");
        B = sc.nextInt();

        if (A % B ==0 || B % A == 0)    {
            System.out.println("Os números digitados são " + A + " e" + B + " e eles são multiplos");
        }
        else    {
            System.out.println("Os número digitados são " + A + " e " + B + " e eles não são multiplos");
        }
        sc.close();
    }

}
