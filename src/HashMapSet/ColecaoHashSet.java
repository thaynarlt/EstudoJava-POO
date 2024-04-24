package HashMapSet;

import java.util.HashSet;

public class ColecaoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println(numeros.size());

        //remove o 12
        numeros.remove(12);

        //percorrer
        for(Integer elemento : numeros){
            System.out.println(elemento);
        }

        //verificar se existe
        System.out.println(numeros.contains(12));
    }
}
