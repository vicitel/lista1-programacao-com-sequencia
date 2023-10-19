package controller;

import util.Teclado;

public class Questao04 {
    /*
    4) Fazer um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor.
     */
    public static void main(String[] args) {
        int numero, antecessor, sucessor;

        // entrada de dados
        numero = Teclado.lerInt("insira um número: ");

        // processamento
        antecessor = numero -1;
        sucessor = numero +1;

        // saída de dados
        System.out.printf("o numero é %d. seu antecessor é %d e seu sucessor é %d!", numero, antecessor, sucessor);

    }
}
