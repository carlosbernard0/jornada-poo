package com.aula.bolo;

import java.util.Date;

public class Bolo extends Object {
    //atributos - o que a classe pode ter...
    private String nome;
    private float peso;
    private String[] ingredientes;
    private String[] modoDePreparo;
    private float temperatura;
    private Date dataDeValidade;

    public String getNome (){ // metodo acessor
        return this.nome;
    }

    public void setNome(String nome) { //metodo modificador
        this.nome = nome;
    }

    public Bolo(){
    }

    public Bolo(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }

    public Bolo(String nome, String[] ingredientes, int temperatura){
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.temperatura = temperatura;

    }

    //métodos - o que a classe pode fazer...
    public void imprimirIngredientes(){
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println(ingredientes[i]);
        }
    }

    void modoDePreparo(){
        for (int i = 0; i < modoDePreparo.length; i++) {
            System.out.println(modoDePreparo[i]);
        }
    }

    public void prepararBolo(){
        System.out.println("Você vai precisar de: ");
        imprimirIngredientes();

        System.out.println("Modo de preparo: ");
        modoDePreparo();
    }

    float recuperarValorDeVendaDoBolo(float precoDeCusto, float porcentagemDeVenda){
        float valorDoBolo = precoDeCusto * porcentagemDeVenda;
        return valorDoBolo;
    }

    public void assarBolo(){
        temperatura += 10f;
    }

    private void asssarBolo(int temperaturaDesejada){

        temperatura += temperaturaDesejada;
    }

    public void asssarBolo(int temperaturaDesejada, int temperaturaForma){
        asssarBolo(temperaturaDesejada + temperaturaForma);
    }

    @Override
    public boolean equals(Object obj) {
        Bolo boloComparado = (Bolo) obj; // cast
        boolean comparacao = this.nome.equals(boloComparado.nome);
        return comparacao;
    }

    @Override
    public String toString() {
        return getClass().getName() + " nome do bolo: " + this.nome;
    }
}
