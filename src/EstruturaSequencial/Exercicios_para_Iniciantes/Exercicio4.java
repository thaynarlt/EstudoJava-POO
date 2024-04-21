package EstruturaSequencial.Exercicios_para_Iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){

        int numero,horas;
        double valor_Hora, salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();
        horas = sc.nextInt();
        valor_Hora = sc.nextDouble();

        salario = horas * valor_Hora;

        System.out.println("NUMBER = "+ numero);
        System.out.println("SALARY = U$ "+ salario);
        sc.close();
    }
}
