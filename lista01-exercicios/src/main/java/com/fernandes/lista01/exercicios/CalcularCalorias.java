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
public class CalcularCalorias {

    public static void calcularCalorias() {
        Scanner sc = new Scanner(System.in);
        System.out.println("o tempo, em minutos (valor inteiro) que ele passou se aquecendo?");
        Integer tempoAquecimento = sc.nextInt();
        System.out.println("Tempo que ele fez exercícios aeróbicos?");
        Integer tempoExAerobicos = sc.nextInt();
        System.out.println("Tempo de exercicios de musculação");
        Integer tempoExMusculares = sc.nextInt();
        Integer totalTempoExercicio = tempoAquecimento + tempoExAerobicos + tempoExMusculares;
        Integer total = (12 * tempoAquecimento) + (20 * tempoExAerobicos) + (25 * tempoExMusculares);
        System.out.println("Olá, Jorge. Você fez um total de " + totalTempoExercicio + " minutos de exercícios e perdeu cerca de " + total
                + " calorias");

    }

    public static void main(String[] args) {
        calcularCalorias();
    }
}
