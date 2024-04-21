package EstruturaCondicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        //calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda

        if (salario >= 0.0 && salario <= 2000.0) {
            imposto = 0.0;
            System.out.println("Isento");
        } else if (salario >= 2000.1 && salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario >= 3000.1 && salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario > 4500.0) {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }
}
