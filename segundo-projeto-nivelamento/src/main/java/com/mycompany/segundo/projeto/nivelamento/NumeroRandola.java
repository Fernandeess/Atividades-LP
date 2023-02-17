/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fernandes
 */
public class NumeroRandola {
    public static void main(String[] args) {
        double random = Math.random();
        Integer numeroSorted = ThreadLocalRandom.current().nextInt(20, 30);
        System.out.println(numeroSorted);
        System.out.println(random);
    }
}
