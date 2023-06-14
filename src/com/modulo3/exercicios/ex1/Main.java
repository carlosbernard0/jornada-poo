package com.modulo3.exercicios.ex1;

//Crie uma classe chamada "Retangulo" que represente um retângulo. A classe deve ter atributos
// privados para a largura e a altura do retângulo, esses valores são Double (wrapper). Além disso, esses atributos devem
// ser acessados por meio de getters e setters. Por fim, crie métodos públicos para calcular a área e o perímetro do retângulo.
//Sobrescreva os métodos:
//toString(): imprima os valores de largura e altura do retângulo.
//equals(): verifique se a largura e altura são iguais, caso positivo retorne true.
//
//Teste os métodos através de uma nova classe Main e um método main dentro do pacote com.jornada.exercicio1.

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();

        retangulo1.setLargura(5.0);
        retangulo1.setAltura(6.0);

        System.out.println( retangulo1.toString());

        System.out.println("Area de : " + retangulo1.calcularArea());
        System.out.println("Perimetro de : " + retangulo1.calcularPerimetro());

        System.out.println(retangulo1.equals(retangulo1));



    }

}
