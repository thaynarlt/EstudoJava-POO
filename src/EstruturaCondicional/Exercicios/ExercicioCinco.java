package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
    //seguir, calcule e mostre o valor da POO.conta a pagar.

    public static void main(String[]args){

        //tabela:

        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;

        if (codigo == 1) {
            total = 4.0 * quantidade;
        } else if (codigo == 2){
            total = 4.5 * quantidade;
        }else if (codigo == 3){
            total = 5.0 * quantidade;
        }else if (codigo == 4){
            total = 2.0 * quantidade;
        }else{
            total = 1.5 * quantidade;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();


    }
}
