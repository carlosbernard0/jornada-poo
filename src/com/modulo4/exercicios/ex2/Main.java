package com.modulo4.exercicios.ex2;

//Crie uma classe Main e um metodo main, nela deve ter um mapa (Map) que mapeia o nome do produto para a quantidade disponível em estoque.
// Crie métodos para adicionar produtos ao estoque, remover produtos do estoque e verificar a quantidade disponível de um determinado produto.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        System.out.println(mapa);
        adicionarProduto(mapa);
        System.out.println(mapa);

        removerProduto(mapa);
        System.out.println(mapa);

        verListaProduto(mapa);
    }

    public static void adicionarProduto(Map<String, Integer> mapa) {
        mapa.put("TV", 4);
        mapa.put("Geladeira", 10);
        mapa.put("Mesa", 5);
    }

    public static void removerProduto(Map<String, Integer> mapa) {
        mapa.remove("TV");
    }

    public static void verListaProduto(Map<String, Integer> mapa) {
        System.out.println("Valores do mapa");
        for(int valor: mapa.values()){
            System.out.println(valor);
        }
    }
}
