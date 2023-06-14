package com.modulo2.exercicios.ex5;

//Crie uma classe chamada "Pessoa" com atributos nome, idade e altura. Defina um construtor padrão e um construtor que receba
// o nome e a idade como parâmetros. Crie uma classe derivada de "Pessoa" chamada "Atleta" com um atributo adicional chamado "esporte"
// e um construtor que receba todos os atributos como parâmetros. Teste a criação de objetos das classes "Pessoa" e "Atleta" e exiba suas informações.

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Cléber", 21);
        Atleta atleta1 = new Atleta();

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);

        atleta1.nome = "Roger";
        atleta1.idade = 33;
        atleta1.altura = 1.85f;
        atleta1.esporte = "Futebol";
        System.out.println(atleta1.nome);
        System.out.println(atleta1.idade);
        System.out.println(atleta1.altura);
        System.out.println(atleta1.esporte);

    }
}
