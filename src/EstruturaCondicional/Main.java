package EstruturaCondicional;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Que horas são?");

        x = sc.nextInt();


        if (x < 12) {
            System.out.println("Bom dia");
        }
        else if (x < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
            }

    }
}
