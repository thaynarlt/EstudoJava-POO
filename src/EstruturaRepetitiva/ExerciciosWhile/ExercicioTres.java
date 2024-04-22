package EstruturaRepetitiva.ExerciciosWhile;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o que deseja:\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim\n");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int combustivel = sc.nextInt();

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool = alcool +1;
            }else if (combustivel == 2) {
                gasolina = gasolina +1;
            }else if (combustivel == 3) {
                diesel = diesel +1;
            } else {
                System.out.println("Código Inválido. Digite novamente");
            }
            combustivel = sc.nextInt();

        }
        System.out.println("Quantidade de clientes que abasteceram cada tipo de combustível:");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
