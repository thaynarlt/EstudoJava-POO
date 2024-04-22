package EstruturaRepetitiva;

import java.util.Scanner;

public class EstruturaRepetitiva {
    public static void main(String[] args) {
        /*
        Estrutura Repetitiva
        Problema exemplo:  Fazer um programa que lê números
        inteiros até que um zero seja lido. Ao final mostra
        a somados números lidos.
        */
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
            if (x == 0){
                System.out.println("Quebra do while!");
            }
        }
        System.out.println("A soma total de todos os número é " + soma);
        sc.close();
    }
}
