package com.modulo1.exercicios;

public class Ex1Veiculo {

    String nome;
    String cor;
    int numeroDeRodas;
    float velocidade;

    void moverVeiculo(){
        System.out.println("\nVelocidade aumentada para: ");
        velocidade += 50f;
    }

    void frearVeiculo(){
        System.out.println("\nVelocidade reduzida para: ");
        velocidade -= 25f;


    }

    void informacoesDoVeiculo(){
        System.out.println("\nnome do veiculo: " + nome);
        System.out.println("veiculo da cor: "+cor);
        System.out.println(numeroDeRodas + " rodas");
        System.out.println("velocidade de: " +velocidade+ " Km/h");
    }

}
