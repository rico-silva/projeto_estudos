import java.util.Scanner;

public class entradadedadosdouble2 {
    public static void main (String [] args)    {
       
        Scanner sc = new Scanner (System.in);
        double x;

        x = sc.nextDouble();
        System.out.printf("Você Digitou = %.2f %n " , x);
        sc.close();
    }
    
}
