package com.github.murillodesu.exercicios.teste;

import com.github.murillodesu.exercicios.Exercicio2;
import org.junit.Test;

public class Exercicio2Test {
    @Test(expected = IllegalArgumentException.class)
    public void aMenorQue0() {
        Exercicio2.produto(-1,1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void bMenorQue0() {
        Exercicio2.produto(1,-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void aMenorQue0bMenorque0() {
        Exercicio2.produto(-1,-1);
    }
}
