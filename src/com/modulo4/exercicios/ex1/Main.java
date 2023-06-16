package com.modulo4.exercicios.ex1;

//Crie um método que receba uma lista de números inteiros e retorne
// a soma de todos os números pares presentes na lista. Utilize a Stream API para realizar a operação.

import java.util.List;

public class Main {

    public static int somaDosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> numero %2 ==0)
                .mapToInt(Integer::intValue)
                .sum();

    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);
        int soma = somaDosPares(numeros);
        System.out.println("A soma dos numeros pares é : " + soma);
    }
}
