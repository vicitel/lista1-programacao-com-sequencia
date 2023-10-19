package controller;

import util.Teclado;

public class Questao07 {
    /*
    7) Fazer um algoritmo que pergunte 3 números e apresente a média aritmética entre estes 3 números.
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        double media;

        num1 = Teclado.lerInt("digite o 1º numero: ");
        num2 = Teclado.lerInt("digite o 2º numero: ");
        num3 = Teclado.lerInt("digite o 3º numero: ");

        media = (double) (num1 + num2 + num3) / 3;

        System.out.println("a media aritmética desses números é " + media);
    }
}
