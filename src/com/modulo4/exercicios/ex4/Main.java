package com.modulo4.exercicios.ex4;

//Crie uma fila (Queue) de strings que representa uma fila de atendimento de um banco. Implemente métodos para adicionar um cliente à fila,
// remover o próximo cliente a ser atendido e verificar o tamanho atual da fila.

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Giovana");
        queue.add("Pedro");
        queue.add("Mateus");
        queue.add("Teto");
        System.out.println(queue);

        adicionarCliente(queue);
        System.out.println(queue);

        removerClienteASerAtendido(queue);
        System.out.println(queue);

        tamanhoFila(queue);
    }

    public static void adicionarCliente(Queue<String> queue){
        System.out.println("Usuario adicionado: "+queue.add("Cleriton"));

    }

    public static void removerClienteASerAtendido(Queue<String> queue){
        adicionarCliente(queue);
        String primeiroElemento = queue.poll();
        System.out.println("Usuario removido: "+ primeiroElemento);
    }

    public static void tamanhoFila(Queue<String> queue){
        System.out.println("Tamanho da fila: "+queue.size());
    }

}
