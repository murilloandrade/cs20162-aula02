package com.github.murillodesu.exercicios.teste;

import com.github.murillodesu.exercicios.Exercicio1;
import org.junit.Test;

public class Exercicio1Test {

    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue1() {
        Exercicio1.somaNaturais(0);
    }
}
