package EstruturaSequencial.Exercicios_para_Iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, quant1, cod2, quant2;
        double valor1,valor2,total1,total2, total;

        cod1 = sc.nextInt();
        quant1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        quant2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total1 = quant1 * valor1;
        total2 = quant2 * valor2;

        total = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);

        sc.close();
    }
}
