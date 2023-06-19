package com.modulo5.exercicios.ex1;

//Neste exercício, você irá criar uma classe chamada Calculadora que contém um método estático chamado somar,
// que aceita dois números inteiros como parâmetros e retorna a soma deles. Além disso, você também irá criar uma exceção personalizada
// chamada ResultadoNegativoException, que será lançada quando a soma resultar em um número negativo.

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) throws ResultadoNegativoException {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite um numero: ");
            int numero1 = input.nextInt();

            System.out.println("Digite outro numero: ");
            int numero2 = input.nextInt();

            int resultadoSoma = somar(numero1,numero2);
            System.out.println("O resultado da soma é: " + resultadoSoma);

            if (resultadoSoma < 0) {
                throw new ResultadoNegativoException("O resultado deu negativo! tente novamente.");
            }

            }finally {
                System.out.println("Fim do programa!");
            }
    }


    static int somar(int num1 ,int num2) throws ResultadoNegativoException{
        return num1 + num2;
    }

}
