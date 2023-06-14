package com.modulo3.exercicios.ex2;

//Crie uma classe chamada ContaBancaria que represente uma conta bancária. A classe deve ter atributos privados para o número
// da conta o nome do titular e o saldo (ambos wrappers).
//Crie 2 interfaces:
//Sacavel: deve conter um método sacar. Esse metodo recebe o valor de saque.
//Depositavel: deve conter um método para depositar. Esse método recebe o valor de depósito.
//
//Implementar a interface Sacavel e Depositavel na casse ContaBancaria com seus devidos métodos.
//
//Teste os métodos através de uma nova classe Main e um método main dentro do pacote com.jornada.exercicio2.

public class Main {
    public static void main(String[] args) {
        ContaBancaria usuario1 = new ContaBancaria();
        ContaBancaria usuario2 = new ContaBancaria();

        usuario1.setNome("Mateus");
        usuario1.setNumeroDaConta(1);
        usuario1.setSaldo(1000d);

        usuario2.setNome("Jorge");
        usuario2.setNumeroDaConta(2);
        usuario2.setSaldo(5000d);

        System.out.println(usuario1.depositar(2000d));
        System.out.println(usuario2.sacar(5000d));
    }
}

