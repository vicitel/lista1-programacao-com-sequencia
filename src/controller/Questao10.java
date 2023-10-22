package controller;

import util.Teclado;

public class Questao10 {
    /*
    10) Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso, utilizando a fórmula
prestação = valor + (valor x (taxa : 100) x tempo em dias).
     */
    public static void main(String[] args) {
        double valorInicial, valorAtrasado, taxa, diasAtrasados;

        valorInicial = Teclado.lerDouble("digite o valor da prestação: ");
        diasAtrasados = Teclado.lerDouble("quantos dias esta atrasado? ");
        taxa = 2;
        valorAtrasado = valorInicial + (valorInicial*(taxa/100)*diasAtrasados);

        System.out.printf("o valor da prestação incluindo juros de atraso está em R$ %.2f", valorAtrasado);

    }
}
