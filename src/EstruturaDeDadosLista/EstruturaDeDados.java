package EstrutuaDeDadosLista;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista

        List<String> nomes = new ArrayList<>();
        nomes.add("Dani");
        nomes.add("Vini");
        nomes.add("Elias");

        System.out.println(nomes.get(0)); //mostrar nome na posição 0

        for(String nome : nomes) { //vai aparecer 3 vezes, pq são 3 nomes
            System.out.println("O nome é " + nome);
        }

        nomes.forEach(nome -> System.out.println("O nome que apareceu foi " + nome)); //vai aparecer 3 vezes, pq são 3 nomes
    }
}
