/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandes.lista01.exercicios;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CalcularRenda {

    public static void calcularRenda() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" quantos filhos de 0 a 3 anos possui?");
        Integer filhos03 = sc.nextInt();
        System.out.println(" quantos filhos de 4 a 16 anos possui?");
        Integer filhos16 = sc.nextInt();
        System.out.println(" quantos filhos de 17 a 18 anos possui?");
        Integer filhos18 = sc.nextInt();
        Double total = (25.12 * filhos03) + (15.88 * filhos16) + (12.44 * filhos18);
        Integer totalFilhos = filhos03 + filhos16 + filhos18;
        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$" + total + " de bolsa");
    }

    public static void main(String[] args) {
        calcularRenda();
    }

}
