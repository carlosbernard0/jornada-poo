package com.modulo4.exercicios.ex5;

//Implemente uma classe chamada Estudante que possui os atributos nome e idade. Crie uma lista de objetos do tipo Estudante
// e utilize a Stream API para encontrar o aluno mais novo da lista. Utilize Optional para lidar com o caso em que a lista está vazia.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Estudante {
    String nome;
    Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("João", 33));
        estudantes.add(new Estudante("Carlos", 27));
        estudantes.add(new Estudante("Pedro", 20));
        estudantes.add(new Estudante("Maicon", 29));

        Optional<Estudante> alunoMaisNovo = estudantes.stream()
                .min(Comparator.comparingInt(Estudante::getIdade));

        if (alunoMaisNovo.isPresent()){
            Estudante maisNovo = alunoMaisNovo.get();
            System.out.println("Aluno mais novo : " + maisNovo.getNome() + " idade de: " + maisNovo.getIdade());
        }else {
            System.out.println("A lista esta vazia.");
        }
    }
}
