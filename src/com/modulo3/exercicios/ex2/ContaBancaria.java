package com.modulo3.exercicios.ex2;

import com.modulo3.exercicios.ex2.Depositavel;
import com.modulo3.exercicios.ex2.Sacavel;

public class ContaBancaria implements Sacavel, Depositavel {
    private Integer numeroDaConta;
    private String nome;
    private Double saldo;

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double sacar(double valorDoSaque) {
        return valorDoSaque -= saldo;
    }

    @Override
    public double depositar(double valorDoDeposito) {
        return valorDoDeposito += saldo;

    }

}
