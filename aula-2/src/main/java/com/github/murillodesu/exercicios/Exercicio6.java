package com.github.murillodesu.exercicios;

public class Exercicio6 {

    public static boolean Primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Errou.");
        }
        int i = 2;
        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
