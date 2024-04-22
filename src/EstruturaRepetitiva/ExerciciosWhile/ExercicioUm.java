package EstruturaRepetitiva.ExerciciosWhile;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* Exercicio 1
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha:");
        int password = sc.nextInt();

        while (password != 12345) {
            System.out.println("Senha Invalida");
            password = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        sc.close();

    }
}
