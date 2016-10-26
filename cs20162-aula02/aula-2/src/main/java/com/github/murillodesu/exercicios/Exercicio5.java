package com.github.murillodesu.exercicios;

public class Exercicio5 {

    public static boolean propriedade153(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Errou.");
        }
        if (n > 9999) {
            throw new IllegalArgumentException("Errou.");
        }
        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;
        return ((i * i * i) + (j * j * j) + (k * k * k)) == n;
    }
}
