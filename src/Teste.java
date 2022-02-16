import java.io.IOException;
import java.util.Scanner;

public class Teste{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        int count = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (j > i) {
                    soma += M[i][j];
                    count ++;
                }
            }
        }

        if (O == 'S') System.out.println(soma);

        if (O == 'M') {
            double media = soma / count;
            System.out.println(String.format("%.1f", media));
        }

    }

}