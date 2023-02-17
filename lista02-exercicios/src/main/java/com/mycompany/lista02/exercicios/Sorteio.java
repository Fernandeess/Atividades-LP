/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02.exercicios;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fernandes
 */
public class Sorteio {

    public static void main(String[] args) {
        Integer sorteio1;
        sorteio1 = ThreadLocalRandom.current().nextInt(1, 101);
        Integer sorteioAtual;
        Integer sorteioPares = 0;
        Integer sorteioImpar = 0;
        Integer i;
        Boolean find = true;
        Integer findPosition = 0;

        System.out.println(String.format("Sorteio Atual %d ", sorteio1));
        for (i = 0; i < 200; i++) {

            sorteioAtual = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println(sorteioAtual);
            if (sorteioAtual % 2 == 0) {
                sorteioPares++;
            } else if (sorteioAtual % 2 != 0) {
                sorteioImpar++;
            }
            if (find) {
                if (sorteio1 == sorteioAtual) {
                    findPosition = i;
                    find = false;
                }
            }
        }
        System.out.println(String.format("Rodada:%d \n Números Impar: %d \n Números Pares %d \nO Numero apareceu na rodada: %d ", i, sorteioImpar, sorteioPares, findPosition));
    }
}
