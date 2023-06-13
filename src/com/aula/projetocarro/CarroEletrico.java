package com.aula.projetocarro;

import com.aula.projetocarro.Carro;

public class CarroEletrico extends Carro {
    @Override
    public void ligar() {
        System.out.println("Ligando carro elétrico...");
    }
}
