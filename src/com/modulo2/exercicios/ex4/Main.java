package com.modulo2.exercicios.ex4;

//Crie uma classe chamada "FiguraGeometrica" com um construtor que receba o nome da figura como parâmetro.
// Defina um método abstrato chamado "calcularArea()". Crie classes derivadas de "FiguraGeometrica",
// como "Circulo", "Retangulo" e "Triangulo", que implementem o método "calcularArea()" para calcular a área de cada figura.

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();


        retangulo.base = 10;
        retangulo.altura = 10;
        retangulo.calcularArea();
        System.out.println(retangulo.area);

        circulo.raio = 3;
        circulo.pi = 3.14f;
        circulo.calcularArea();
        System.out.println(circulo.area);

        triangulo.altura = 8;
        triangulo.base= 5;
        triangulo.calcularArea();
        System.out.println(triangulo.area);
    }


}
