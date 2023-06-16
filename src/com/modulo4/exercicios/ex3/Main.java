package com.modulo4.exercicios.ex3;

//Implemente um método que receba uma lista de strings e retorne uma nova lista contendo apenas as strings que têm comprimento
// maior que 5 caracteres e que começam com a letra "A", além disso, ordene-a descendentemente (de Z a A). Utilize a Stream API
// para realizar as operações necessárias.

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static List<String> novaLista(ArrayList<String> lista){

        List<String> novaLista = lista.stream()
                .filter(s ->s.length() > 5 && s.startsWith("A"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return novaLista;
    }


    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Carlos");
        lista.add("Antônio");
        lista.add("Guilherme");
        lista.add("Alberto");
        lista.add("Pedro");
        lista.add("Amanda");
        System.out.println(lista);

        List<String>novaListaAPrimeiro= novaLista((ArrayList<String>) lista) ;
        System.out.println(novaListaAPrimeiro);
    }
}
