package com.modulo3.exercicios.ex1;

public class Retangulo {
    private Double largura;
    private Double altura;
    private Double area;
    private Double perimetro;

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public Double calcularArea(){
        area= altura*largura;
        return area;
    }
    public Double calcularPerimetro(){
        return perimetro = 2*(largura+altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Retangulo comparacaoMedidas = (Retangulo) obj;
        boolean comparacao = this.altura.equals(largura);
        return comparacao;
    }
}
