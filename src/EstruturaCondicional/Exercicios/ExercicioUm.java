package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class ExercicioUm {
    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num;
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("Este número é positivo!");
        }else {
            System.out.println("Este número é negativo!");
        }
    }
}
