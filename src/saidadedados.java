import java.util.Locale;

public class saidadedados {
    public static void main(String[] args) {
        String nome = "Maria";
        double peso = 25.45687;
        int idade = 31;
        System.out.printf("%s tem %d anos e pesa %.2f kilos%n ", nome, idade, peso);
        Locale.setDefault(Locale.US);
    }

}