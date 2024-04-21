package EstruturaSequencial.Exercicios_para_Iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a,b,c,areaTriagulo,areaCirculo,pi = 3.14159,areaTrapezio,areaQuadrado,areaRetangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();


        //a área do triângulo retângulo que tem A por base e C por altura.
        areaTriagulo = (a*c)/2;
        System.out.printf("TRIANGULO: %.3f%n", areaTriagulo);

        //a área do círculo de raio C. (pi = 3.14159)
        areaCirculo = pi * (c*c);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);

        //a área do trapézio que tem A e B por bases e C por altura.
        areaTrapezio =  ((a +b) * c)/2;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);

        //a área do quadrado que tem lado B.
        areaQuadrado = b*b;
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);

        //a área do retângulo que tem lados A e B.
        areaRetangulo = b*a;
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();

    }
}
