package controller;

import util.Teclado;

public class Questao03 {
    /*
3) Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais. Considere U$1,00 =
R$3,80.
     */
    public static void main(String[] args) {
        double dolar, real;
        // entrada de dados
        dolar = Teclado.lerDouble("digite o valor para realizar a conversão de U$ em R$ ");

        // processamento
        real = dolar * 3.80;

        // saída de dados
        System.out.printf("o valor U$ %f em Dólar equivale a R$ %f em Real Brasileiro.", dolar, real);

    }
}
