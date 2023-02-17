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
public class Calculadora {

    public static void calculadora() {
        Scanner sc = new Scanner(System.in);
        Integer numero01;
        Integer numero02;
        System.out.println("Digite o primeiro numero: ");
        numero01 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero02 = sc.nextInt();
        Integer soma = numero01 + numero02;
        Integer subtracao = numero01 - numero02;
        Integer multiplicacao = numero01 * numero02;
        Double divisao = (double) numero01 / numero02;
        System.out.println("Resultado da soma: " + soma + "\n"
                + "Resultado da subtração: " + subtracao + "\n"
                + "Resultado da multiplicação: " + multiplicacao + "\n"
                + "Resultado da divisão: " + divisao);
        Syystem.out.
    }
    

    public static void main(String[] args) {
        calculadora();
    }
}
