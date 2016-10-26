package com.github.murillodesu.exercicios;

public class Exercicio4 {

    public static boolean propriedade3025(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Errou.");
        }
        if (n > 9999) {
            throw new IllegalArgumentException("Errou.");
        }
        int i = n / 100;
        int j = n % 100;
        return (i + j) * (i + j) == n;
    }
}
