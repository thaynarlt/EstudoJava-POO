package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstudoScanner {
    public static void main(String[]args) {

        //Exemplo 1 - Lendo strings
        Locale.setDefault(Locale.US); //Para em vez de ser escrito com a "," vai ser escrito com o ponto ".
        Scanner sc = new Scanner(System.in);
        String x; //qualquer escrita
        x = sc.next();

        System.out.println("Você digitou: "+ x);


        //Exemplo 2 - Lendo inteiros
        int y; //valor inteiro
        y = sc.nextInt();

        System.out.println("Você digitou o valor: "+ y);


        //Exemplo 3 - Lendo número com ponto flutuante
        //Locale precisa ser implementado antes do scanner ser!
        double z; //valor inteiro
        z = sc.nextDouble();

        System.out.println("Você digitou o valor flutuante: "+ z);


        //Exemplo 4 - Lendo um caractere
        char h;
        h = sc.next().charAt(0); //charAt vai pegar apenas o primeiro caractere de uma cadeia de caracteres
        System.out.println("Você digitou o caractere: "+h);

        //Exemlo 5 - Para ler vários dados na mesma linha

        String a;
        int b;
        double c;

        //Vai ler os três valores na mesma linha - separados por espaço!
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.println("Você digitou em conjunto: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Exemlo 6 - Para ler um texto até a quebra de linha

        String s1,s2,s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Exemlo 7 - Quebra de linha pendente

        int g;
        String g1, g2, g3;
        g = sc.nextInt();
        sc.nextLine(); //Limpar o buffer de leitura
        g1 = sc.nextLine();
        g2 = sc.nextLine();
        g3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(g);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);


        sc.close();
    }
}
