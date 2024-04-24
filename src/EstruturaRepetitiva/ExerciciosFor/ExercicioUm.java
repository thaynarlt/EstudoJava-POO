package EstruturaRepetitiva.ExerciciosFor;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
        ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreve um valor maior que 1 e menor que 1000");
        
        int x = sc.nextInt();
        int contagem = 0;
        
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                //System.out.println("Par");
            }else{
                contagem+=1;
                System.out.println(i);
            }
        }
        System.out.println("A quantidade de números ímpares de 1 até "+ x+ " é: " + contagem);
    }
}
