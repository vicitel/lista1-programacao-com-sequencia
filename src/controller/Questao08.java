package controller;

import util.Teclado;

public class Questao08 {
    /*
    8) Fazer um programa que calcule e apresente a quantidade de litros que um automóvel gastará em uma viagem. O
programa deve coletar as seguintes informações: Distância a percorrer na viagem, em quilômetros; qual é o
valor do consumo médio do automóvel, em quilômetros por litro.
     */
    public static void main(String[] args) {
        double distanciaKm, mediaConsumoPorKm, consumoViagem;

        distanciaKm = Teclado.lerDouble("Informe a distancia a percorrer na viagem (em quilômetros/KM): ");
        mediaConsumoPorKm = Teclado.lerDouble("Informe o valor do consumo médio do seu automóvel (em quilômetros/KM por litro/L): ");

        consumoViagem = (distanciaKm / mediaConsumoPorKm);

        System.out.printf("A quantidade necessária para realizar uma viagem de %.2fKm é %.2fL de combustível.", distanciaKm, consumoViagem);

    }
}
