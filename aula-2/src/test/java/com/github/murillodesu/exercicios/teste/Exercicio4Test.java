package com.github.murillodesu.exercicios.teste;

import com.github.murillodesu.exercicios.Exercicio4;
import org.junit.Test;

public class Exercicio4Test {

    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue0() {
        Exercicio4.propriedade3025(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMaiorQue9999() {
        Exercicio4.propriedade3025(10000);
    }
}
