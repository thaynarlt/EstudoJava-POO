package EstruturaRepetitiva.ExerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num2 ==0) {
                System.out.println("divisão impossível");
            }else {
                Double resultado = (double) num1 / num2;
                System.out.printf("%.1f%n", resultado);
            }
        }
        sc.close();

    }
}
