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
public class Idade {

    public static void idade() {
        Scanner sc = new Scanner(System.in);
        String nome;
        Integer anoNascimento;
        Integer idade;
        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        anoNascimento = sc.nextInt();
        idade = 2030 - anoNascimento;
        System.out.println("Em 2030 você terá " + idade + " anos.");

    }

    public static void main(String[] args) {
        idade();
    }

}
