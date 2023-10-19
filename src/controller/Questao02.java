package controller;

import util.Teclado;

public class Questao02 {
    /*
    Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
a) Resultado de suas adições
b) Resultado de suas multiplicações
     */
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4, soma, multiplicacao;

        // entrada de dados
        numero1 = Teclado.lerInt("digite o 1º numero: ");
        numero2 = Teclado.lerInt("digite o 2º numero: ");
        numero3 = Teclado.lerInt("digite o 3º numero: ");
        numero4 = Teclado.lerInt("digite o 4º numero: ");

        // processamento
        soma = (numero1 + numero2 + numero3 + numero4);
        multiplicacao = (numero1 * numero2 * numero3 * numero4);

        // saída de dados
        System.out.printf("a soma desses 4 valores é %d, e a multiplicação resulta em %d", soma, multiplicacao);
    }

}
