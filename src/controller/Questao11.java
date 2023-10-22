package controller;

import util.Teclado;

public class Questao11 {
    /*
    1) Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o
valor com o acréscimo dos 10% da gorjeta do garçom.
     */
    public static void main(String[] args) {
        double valorComanda, valorComGorjeta;

        valorComanda = Teclado.lerDouble("informe o valor da comanda: ");
        valorComGorjeta = (valorComanda*0.10) + valorComanda;

        System.out.printf("valor a ser pago: R$ %.2f (incluso gorjeta de 10%% para garçom)", valorComGorjeta);

    }
}
