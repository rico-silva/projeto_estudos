public class aula11_ex4_fibonaccia {
    public static void main (String [] args)    {
        int v1 = -1;
        int v2 = 1;
        int contador;

        for (contador = 0; contador < 15; contador++)   {
            int v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
            System.out.println(v3);
        }

    }

}
