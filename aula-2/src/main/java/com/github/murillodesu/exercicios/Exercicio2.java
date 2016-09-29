package com.github.murillodesu.exercicios;

public class Exercicio2 {

    /**
     * @throws IllegalArgumentException se a for menor que 0
     *
     * @throws IllegalArgumentException se b for menor que 0
     *
     * @throws IllegalArgumentException se a e b forem menores que 0.
     *
     * @param a Valor que pode ser o numero total de parcelas ou o valor a ser
     * multiplicado, dependendo de b.
     *
     * @param b Valor que pode ser o numero total de parcelas ou o valor a ser
     * multiplicado, dependendo de a.
     *
     * @return Produto da multiplicação.
     */
    public static int produto(int a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException("Errou.");
        }
        if (b < 0) {
            throw new IllegalArgumentException("Errou.");
        }
        if ((a < 0) && (b < 0)) {
            throw new IllegalArgumentException("Errou.");
        }
        int totalParcelas = a;
        int parcela = b;
        if (b < a) {
            totalParcelas = a;
            parcela = b;
        }
        int i = 1;
        int s = 0;
        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }
        return s;
    }
}
