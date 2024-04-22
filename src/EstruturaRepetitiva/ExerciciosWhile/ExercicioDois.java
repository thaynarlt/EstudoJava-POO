package EstruturaRepetitiva.ExerciciosWhile;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
        indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
        o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
        uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            }
            else {
                System.out.println("Quarto quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();

    }
}
