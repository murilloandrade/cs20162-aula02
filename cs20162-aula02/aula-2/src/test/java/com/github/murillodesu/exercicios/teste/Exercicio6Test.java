
package com.github.murillodesu.exercicios.teste;

import com.github.murillodesu.exercicios.Exercicio6;
import org.junit.Test;


public class Exercicio6Test {
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue1() {
        Exercicio6.primo(0);
    }
}
