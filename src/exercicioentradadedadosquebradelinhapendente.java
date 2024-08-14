import java.util.Scanner;
import java.util.Locale;

public class exercicioentradadedadosquebradelinhapendente {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        int x;
        String a1, a2, a3;
        x = sc.nextInt();
        sc.nextLine();
        a1 = sc.nextLine();
        a2 = sc.nextLine();
        a3 = sc.nextLine();
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        sc.close();
    }
}
