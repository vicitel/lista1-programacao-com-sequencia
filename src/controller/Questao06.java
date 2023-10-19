package controller;

import util.Teclado;

public class Questao06 {
    /*
    6) Fazer um programa que pergunte uma temperatura ao usuário, em graus Fahrenheit, e apresente esta
temperatura convertida em graus Celsius. A fórmula da conversão é c = (f – 32) x 5 : 9 , onde c é a temperatura em graus Celsius e
f em Fahrenheit.
     */
    public static void main(String[] args) {
        int fahrenheit, celsius;

        fahrenheit = Teclado.lerInt("informe a temperatura em graus Fahrenheit: ");
        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("a temperatura em graus Fahrenheit %dºF equivale a %dºC em graus Celsius.%n", fahrenheit, celsius);
    }
}
