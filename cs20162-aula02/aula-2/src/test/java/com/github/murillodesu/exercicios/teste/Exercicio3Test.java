/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.murillodesu.exercicios.teste;

import com.github.murillodesu.exercicios.Exercicio3;
import org.junit.Test;

public class Exercicio3Test {

    @Test(expected = IllegalArgumentException.class)
    public void xMenorQue0() {
        Exercicio3.potencia(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void yMenorQue0() {
        Exercicio3.potencia(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void xMenorQue0yMenorque0() {
        Exercicio3.potencia(-1, -1);
    }
}
