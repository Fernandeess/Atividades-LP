/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author fernandes
 */
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numeroDigitado =0;
        while (numeroDigitado != 42) {      
            System.out.println("Adivinhe o numero");
            numeroDigitado = sc.nextInt();
        }
        System.out.println("Voce acertou o numero e 42");
    }
}
