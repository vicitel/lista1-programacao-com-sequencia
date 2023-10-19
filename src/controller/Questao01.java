package controller;

import util.Teclado;

public class Questao01 {
    /*
    Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo. Em seguida, o programa
deve apresentar os dados anteriormente informados.
     */
    public static void main(String[] args) {
        String nome, genero;

        // entrada de dados
        nome = Teclado.lerTexto("qual é o seu nome? ");
        genero = Teclado.lerTexto("com qual gênero você se identifica? ");

        // saída de dados
        System.out.printf("meu nome é %s e me identifico com o gênero %s!", nome, genero);

    }
}
