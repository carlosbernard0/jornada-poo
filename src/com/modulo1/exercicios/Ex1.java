package com.modulo1.exercicios;
//Crie uma classe base chamada "Veículo" que possua atributos: nome, cor, número de rodas, e velocidade.
// Crie também um método chamado mover e outro chamado frear, sendo que o método mover aumenta 50km/h a velocidade,
// já o metodo frear diminui 25km/h a velocidade.Criei também outro método que imprima todos os atributos da classe.
// Crie ao menos 2 objetos e teste os métodos.
public class Ex1 {
    public static void main(String[] args) {


        Ex1Veiculo veiculo1 = new Ex1Veiculo();

        veiculo1.nome = "Honda Civic";
        veiculo1.cor = "Prata";
        veiculo1.numeroDeRodas = 4;
        veiculo1.velocidade = 60f;

        veiculo1.informacoesDoVeiculo();

        veiculo1.moverVeiculo();
        System.out.println(veiculo1.velocidade);

        veiculo1.frearVeiculo();
        System.out.println(veiculo1.velocidade);


        Ex1Veiculo veiculo2 = new Ex1Veiculo();

        veiculo2.nome = "\nNissan Skyline GT-R R34";
        veiculo2.cor = "White";
        veiculo2.numeroDeRodas = 4;
        veiculo2.velocidade = 120f;

        veiculo2.informacoesDoVeiculo();

        veiculo2.moverVeiculo();
        System.out.println(veiculo2.velocidade);

        veiculo2.frearVeiculo();
        System.out.println(veiculo2.velocidade);


    }
}
