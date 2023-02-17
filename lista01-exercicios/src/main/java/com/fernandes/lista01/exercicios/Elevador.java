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
public class Elevador {

    public static void elevador() {
        Scanner sc = new Scanner(System.in);
        Double limitePeso;
        Integer limitePessoas;
        Double pesoPessoa01;
        Double pesoPessoa02;
        Double pesoPessoa03;
        Double pesoTotal;
        System.out.println("Digite o limite de peso do elevador:");
        limitePeso = sc.nextDouble();
        System.out.println("Digite o limite de pessoas");
        limitePessoas = sc.nextInt();
        if (limitePessoas <= 0) {
            System.out.println("Peso Invalido!!");
            return;
        }
        System.out.println("Digite o peso da pessoa 01");
        pesoPessoa01 = sc.nextDouble();
        if (pesoPessoa01 <= 0) {
            System.out.println("Peso Invalido!!");
            return;
        }
        System.out.println("Digite o peso da pessoa 02");
        pesoPessoa02 = sc.nextDouble();
        if (pesoPessoa02 <= 0) {
            System.out.println("Peso Invalido!!");
            return;
        }
        System.out.println("Digite o peso da pessoa 03");
        pesoPessoa03 = sc.nextDouble();
        if (pesoPessoa03 <= 0) {
            System.out.println("Peso Invalido!!");
            return;
        }
        pesoTotal = pesoPessoa01 + pesoPessoa02 + pesoPessoa03;
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + " pessoas. O peso total no elevador é de " + pesoTotal
                + ", sendo que ele suporta " + limitePeso);

    }

    public static void main(String[] args) {
        elevador();
    }
}
