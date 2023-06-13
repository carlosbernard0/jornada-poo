package com.modulo1.exercicios;

//Crie uma classe base chamada "Animal" que possua atributos como nome, idade e som (o som que ele emite),
// por fim crie um método chamado "emitirSom" que imprima um som genérico.
// Em seguida, crie um objeto "cachorro", "gato" e "pássaro",
// que são do tipo Animal. Cada objeto tem um som diferente,
// atribua os sons aos objetos e chame o método emitirSom para ver qual som cada objeto faz.

public class Ex2 {
    public static void main(String[] args) {

        Ex2Animal cachorro = new Ex2Animal();
        Ex2Animal gato = new Ex2Animal();
        Ex2Animal passaro = new Ex2Animal();

        cachorro.nome = "Cachorrinho brasileiro";
        cachorro.idade = 15;
        cachorro.som = "au-au";

        gato.nome = "Gato pistoleiro";
        gato.idade = 8;
        gato.som = "miauuu";

        passaro.nome = "Passaro malandro";
        passaro.idade = 4;
        passaro.som = "piu-piu";

        System.out.println("\n");
        cachorro.emitirSom();
        System.out.println("\n");
        gato.emitirSom();
        System.out.println("\n");
        passaro.emitirSom();
        System.out.println("\n");
    }
}
