package com.modulo2.exercicios.ex3;

//Crie uma classe chamada "Animal" com um construtor que receba o nome do animal como parâmetro.
// Defina um método chamado "emitirSom()" que imprime uma mensagem genérica. Crie classes derivadas de "Animal",
// como "Cachorro", "Gato" e "Vaca", que sobrescrevam o método "emitirSom()" para imprimir sons específicos para cada tipo de animal.
public class Ex3 {
 public static void main(String[] args) {


   Ex3Cachorro cachorro = new Ex3Cachorro();
   Ex3Vaca vaca = new Ex3Vaca();
   Ex3Gato gato = new Ex3Gato();

   Ex3Animal nomeDoAnimal = new Ex3Animal("Cadela MaryJane\n");
  System.out.println(nomeDoAnimal.nome);

  cachorro.emitirSom();
  vaca.emitirSom();
  gato.emitirSom();
   }
 }
