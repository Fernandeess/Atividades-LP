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
public class CalcularMedia {

    public static void calcularMedia() {
        Scanner sc = new Scanner(System.in);
        String nome;
        Double nota01;
        Double nota02;
        Double media;
        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite a sua nota 01:");
        nota01 = sc.nextDouble();
        if (nota01 <= 0 || nota01 > 10) {
            System.out.println("Nota Invalida!!");
            return;
        }
        System.out.println("Digite a sua nota 02:");
        nota02 = sc.nextDouble();
        if (nota02 <= 0 || nota02 > 10) {
            System.out.println("Nota Invalida!!");
            return;
        }
        media = (nota01 + nota02) / 2;
        System.out.println("Olá, " + nome + ". Sua média foi de " + media);

    }

    public static void main(String[] args) {
        calcularMedia();
    }
}
