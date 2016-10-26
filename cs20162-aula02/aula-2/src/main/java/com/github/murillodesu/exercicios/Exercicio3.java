package com.github.murillodesu.exercicios;

import static com.github.murillodesu.exercicios.Exercicio2.produto;

public class Exercicio3 {

    public static int potencia(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("Errou.");
        }
        if (y < 0) {
            throw new IllegalArgumentException("Errou.");
        }
        if ((x < 0) && (y < 0)) {
            throw new IllegalArgumentException("Errou.");
        }
        int potencia = 1;
        int i = 1;
        while (i <= y) {
            potencia = produto(potencia, x);
            i++;
        }
        return potencia;
    }
}
