package com.github.murillodesu.exercicios;

public class Exercicio1 {

    /**
     * @throws IllegalArgumentException se n for menor que 1.
     *
     * @param n é o numero pedido para a somatória.
     *
     * @return a somatória.
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Errou.");
        }
        int i = 2;
        int s = 1;
        while (i <= n) {
            s = s + i;
            i++;
        }
        return s;
    }
}
