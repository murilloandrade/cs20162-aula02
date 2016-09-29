package com.github.murillodesu.exercicios.teste;

import com.github.murillodesu.exercicios.Exercicio5;
import org.junit.Test;

public class Exercicio5Test {

    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue0() {
        Exercicio5.propriedade153(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMaiorQue9999() {
        Exercicio5.propriedade153(10000);
    }
}
