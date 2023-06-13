package com.modulo1.exercicios;

public class Ex3Funcionario {
    String nome;
    float salario;

    float calcularSalario(float salario, float bonusFuncionario, float descontoEmPorcentagem){
        this.salario = salario;
        float salarioAumentado = salario * bonusFuncionario;
        float salarioDiminuido = salario * descontoEmPorcentagem;
        return salario = salario + (salarioAumentado - salarioDiminuido);
    }

}
