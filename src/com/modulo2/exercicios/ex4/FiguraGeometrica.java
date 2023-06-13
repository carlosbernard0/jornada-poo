package com.modulo2.exercicios.ex4;

public abstract class FiguraGeometrica {
    String nomeDaFigura;
    public FiguraGeometrica(){

    }
    public FiguraGeometrica(String nomeDaFigura){
        this.pi = pi;
        this.area = area;
        this.raio = raio;
        this.altura = altura;
        this.base = base;
        this.nomeDaFigura = nomeDaFigura;
    }

    float pi;
    float area;
    float raio;
    float altura;
    float base;
    public abstract void calcularArea();
}
