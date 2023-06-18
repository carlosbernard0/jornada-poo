package com.modulo3.exercicios.ex3;

//Crie um programa Java que permite ao usuário informar um número referente às seguintes categorias:
//0 - FUTEBOL, 1 - BASQUETE, 2 - NATACAO, 3 - JIUJITSU, 4 - VOLEI e 5 - CROSSFIT (utilize um enum)
//em seguida informe se o esporte selecionado utiliza bola ou não utiliza bola e uma breve descrição do esporte.
//
//Exemplo:
//Usuário digitou 2
//O esporte NÃO utiliza bola
//
//Natação é um exercício, arte ou esporte de nadar. É considerada um dos exercícios mais completos por movimentar grande parte dos músculos
//e articulações do corpo.
//
//Teste o programa através de uma nova classe Main e um método main dentro do pacote com.jornada.exercicio3.

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o numero do correspondente esporte: ");
            int numeroEsporte = input.nextInt();
            input.close();

            Esporte1.Esporte esporteSelecionado = Esporte1.Esporte.values()[numeroEsporte];

            System.out.println("O esporte " + esporteSelecionado.name() + " " + utilizaBola(esporteSelecionado));
            System.out.println(descricaoEsporte(esporteSelecionado));

        }

        public static String utilizaBola(Esporte1.Esporte esporte){
            switch (esporte){
                case FUTEBOL:
                case VOLEI:
                case BASQUETE:
                    return "Utiliza bola";
                default:
                    return "Não utiliza a bola";
            }
        }

        public static String descricaoEsporte(Esporte1.Esporte descricao) {
            switch (descricao){
                case FUTEBOL:
                    return "Futebol é um esporte coletivo jogado entre duas equipes de 11 jogadores cada. O objetivo do jogo é marcar gols";
                case BASQUETE:
                    return "Basquete é um esporte jogado entre duas equipes de cinco jogadores cada. O objetivo é marcar pontos arremessando a bola na cesta do adversário";
                case NATACAO:
                    return "Natação é um exercício, arte ou esporte de nadar. É considerada um dos exercícios mais completos, pois movimenta grande parte dos músculos e articulações do corpo";
                case JIUJITSU:
                    return "Jiu-Jitsu é uma arte marcial japonesa que se concentra principalmente no combate corpo a corpo no chão, utilizando técnicas de estrangulamento e chave de articulação";
                case VOLEI:
                    return "Vôlei é um esporte jogado entre duas equipes de seis jogadores cada. O objetivo é fazer a bola tocar o chão do campo adversário e evitar que ela toque o chão do próprio campo";
                case CROSSFIT:
                    return "Crossfit é um programa de treinamento físico que combina diferentes modalidades esportivas e exercícios funcionais. É conhecido por sua intensidade e variedade";
                default:
                    return "";
            }
        }
}