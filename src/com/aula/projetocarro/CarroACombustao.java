package com.aula.projetocarro;

import com.aula.projetocarro.Carro;

public class CarroACombustao extends Carro {

    String tipoDeCombustivel;

    @Override
    public void ligar() {
        System.out.println("Ligando carro a combustão com o combustivel " + tipoDeCombustivel);
    }
}
