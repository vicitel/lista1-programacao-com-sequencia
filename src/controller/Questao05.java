package controller;

import util.Teclado;

public class Questao05 {
    /*
5) Fazer um programa que pergunte o salário de um funcionário e apresente este salário com um aumento de 15%.
     */
    public static void main(String[] args) {
        double salario, aumentoem15;

        salario = Teclado.lerDouble("digite o salário: ");

        aumentoem15 = (salario * 0.15) + salario;

        System.out.println("o seu salário com aumento de 15% é R$" + aumentoem15);

    }
}
