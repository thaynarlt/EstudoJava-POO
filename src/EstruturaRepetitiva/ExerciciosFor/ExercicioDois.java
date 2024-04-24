package EstruturaRepetitiva.ExerciciosFor;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();
        int cont_intervalo =0;
        int cont=0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite um valor:");
            int x = sc.nextInt();
            if (x>= 10 && x<=20){
               cont_intervalo+=1;
            }else{
                cont+=1;
            }
        }
        System.out.println(cont_intervalo+" in");
        System.out.println(cont+" out");
    }
}
