package com.aula.bolo;

public class ProgramaBolo {
    public static void main(String[] args) {
//        Bolo bolo = new Bolo();
//        bolo.nome = "teste";

//        BoloDeMorango boloDeMorango = new BoloDeMorango();

        Bolo bolo = new Bolo();
//        bolo.peso = 7.5f;
        bolo.asssarBolo(10,10);
//        System.out.println(bolo.temperatura);
        Bolo bolo2 = new Bolo();
        bolo.setNome("Meu incrivel bolo");
        System.out.println(bolo.getNome());


    }

}
