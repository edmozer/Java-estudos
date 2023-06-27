package lista_vetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaVetor {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(50);
        numeros.add(40);
        numeros.add(78);
        numeros.add(9);
        numeros.add(23);
        numeros.add(43);
        numeros.add(1);
        numeros.add(75);
        numeros.add(89);
        numeros.add(74);

        Collections.sort(numeros);
        System.out.println("Ordem de menor para maior: \n");
        for(Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println(); // linha em branco so pra dar espaco
        List<Integer> numerosOrdenadosDesc = new ArrayList<>(numeros);
        Collections.reverse(numerosOrdenadosDesc);
        System.out.println("Ordem de maior para menor: \n");
        for (Integer numero : numerosOrdenadosDesc) {
            System.out.println(numero);
        }

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maiquimrrio");
        nomes.add("Aesley");
        nomes.add("Gleyciana");
        nomes.add("Guilherme");
        nomes.add("Janaina");
        nomes.add("Siqueira");
        nomes.add("Marilia");
        nomes.add("Yuri");
        nomes.add("Gustavo");
        nomes.add("Gabriela");
        nomes.add("Eduardo");
        nomes.add("Moises");

        Collections.sort(nomes);
        System.out.println("Ordem de menor para maior: \n");

        for(String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println(); // linha em branco so pra dar espaco

        List<String> nomesOrdenadosDesc = new ArrayList<>(nomes);
        Collections.reverse(nomesOrdenadosDesc);
        System.out.println("Ordem de maior para menor: \n");
        for (String nome : nomesOrdenadosDesc) {
            System.out.println(nome);
        }
    }
}
