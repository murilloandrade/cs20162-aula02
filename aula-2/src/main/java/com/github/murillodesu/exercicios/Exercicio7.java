package com.github.murillodesu.exercicios;


public class Exercicio7 {
    public static void CrivoEratostenes(int a[],int n) {
        int i = 2;
        int c;
        while(i <= n / 2) {
            if (a[i] == 0) {
                c = i + i;
                while(c <= n) {
                    a[c] = 1;
                    c = c + i;
                }
            }
            i++;
        }
    }
}
