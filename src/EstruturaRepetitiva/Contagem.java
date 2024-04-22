package EstruturaRepetitiva;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<5; i++) { //Contagem
            System.out.println("Valor de i: " + i);
        }

        for (int i=4;i>=0;i--) { //Contagem regressiva
            System.out.println("Valor de i: " + i);
        }

        sc.close();
    }
}
