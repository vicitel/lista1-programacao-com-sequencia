package controller;

import util.Teclado;

import static java.lang.Math.*;

public class Questao09 {
    /*
    9) Fazer um algoritmo que pergunte 1 número e apresente:
a) O próprio número
b) O quadrado deste número
c) A raiz quadrada deste número
     */
    public static void main(String[] args) {
        double numero, quadrado, raizQuadrada;

        numero = Teclado.lerDouble("digite um número: ");

        quadrado = pow(numero, 2);
        raizQuadrada = sqrt(numero);

        System.out.printf("o numero é %f. o quadrado deste número é %f e a raiz quadrada é %f", numero, quadrado, raizQuadrada);
    }
}
