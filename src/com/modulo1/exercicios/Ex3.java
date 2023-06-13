package com.modulo1.exercicios;

//Crie uma classe chamada "Funcionário" que possua atributos como nome e salário,
// e um método chamado "calcularSalário" que retorne o salário total e receba
// o bônus do funcionario e o desconto do salário em porcentagem. Em seguida,
// crie um objeto chamado "gerente" e outro "desenvolvedor"". O objeto gerente deve chamar
// o método calcularSalario passando o bônus de 10% com um bônus ao salário total e o desconto
// de 15%, enquanto a classe desenvolvedor não deve ter bonificação e o desconto é de 10% .
public class Ex3 {
    public static void main(String[] args) {
        Ex3Funcionario gerente = new Ex3Funcionario();
        Ex3Funcionario desenvolvedor = new Ex3Funcionario();

        gerente.nome = "Alberto";
        System.out.println("\nSeu nome é "+ gerente.nome + " e seu salario é : " +
                gerente.calcularSalario(10000.0f, 1.1f,1.15f));

        desenvolvedor.nome = "Bernardo";
        System.out.println("\nSeu nome é "+ desenvolvedor.nome + " e seu salario é : " +
                desenvolvedor.calcularSalario(4000.0f, 1f,1.1f));
    }
}
