/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02.exercicios;

import java.util.Scanner;

/**
 *
 * @author fernandes
 */
public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o expoente:");
        Integer exp = sc.nextInt();
        System.out.println("Digite a base:");
        Integer base = sc.nextInt();
        System.out.println(Math.pow(base,exp));
    }
}
