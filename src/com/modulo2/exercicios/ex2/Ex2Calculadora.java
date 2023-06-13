package com.modulo2.exercicios.ex2;

public class Ex2Calculadora {

    int somar(int num1, int num2) {
        //decimal1 = new float 14.5;
        return num1 + num2;

    }

    float somar(float decimal1, float decimal2) {
        //decimal1 = new float 14.5;
        return decimal1 + decimal2;

    }

    public int somar(int[] lista) {

        int total = 0;

        for (int i = 0; i < lista.length; i++) {
            total += lista[i];

        }
        return total;
    }
    public double somar(double[] decimais){
        double total = 0;

        for (int i=0; i< decimais.length;i++){
            total+=decimais[i];

        }
        return total;
    }
}