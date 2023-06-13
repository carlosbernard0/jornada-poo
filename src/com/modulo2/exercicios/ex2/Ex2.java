package com.modulo2.exercicios.ex2;

//Crie uma classe chamada "Calculadora" com um método sobrecarregado chamado "somar()". O método "somar()" deve receber dois inteiros
// e retornar a soma deles. Crie outras versões do método "somar()" que aceitem dois números decimais, uma lista de inteiros
// e uma lista de números decimais como argumentos.
public class Ex2 {
    public static void main(String[] args) {
        Ex2Calculadora calculadora = new Ex2Calculadora();

//        double valoresDouble = {20.0,40.0f,60.0f};

        System.out.println(calculadora.somar(55,45));
        System.out.println(calculadora.somar(1.5f,4.5f));
        System.out.println(calculadora.somar(new int[]{10, 20, 30, 40}));
        System.out.println(calculadora.somar(new double[]{20.0, 40.0f, 60.0f}));


        //procurar saber como q coloca os valores dentro dos paramentos
    }
}
