package EstruturaRepetitiva;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números" +
                "que vão ser somados: ");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) { // i++ == (i = i+1)
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
