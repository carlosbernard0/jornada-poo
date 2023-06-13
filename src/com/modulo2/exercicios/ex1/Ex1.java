package com.modulo2.exercicios.ex1;

//Crie uma classe abstrata chamada "Veiculo" com os atributos marca e modelo. Defina um método abstrato chamado "acelerar()".
//Em seguida, crie duas classes, "Carro" e "Moto", que herdem da classe "Veiculo" e implementem o método "acelerar()" de maneiras diferentes.
public class Ex1 {
    public static void main(String[] args) {
        Ex1Veiculo moto = new Ex1Moto();
        moto.acelerar();

        Ex1Veiculo carro = new Ex1Carro();
        carro.acelerar();
    }
}
