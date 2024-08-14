
public class aula12_ex02_somadevalores {

    public static void main (String [] args) {
        soma(105, 92);

    }

    public static  int soma (int A, int B)    {
        int C = A + B;
        System.out.println("O A recebe o valor: " + A);
        System.out.println("O B recebe o valor: " + B);
        System.out.println("A soma dos dois valores é: " + C);
        return C;
    }
}
