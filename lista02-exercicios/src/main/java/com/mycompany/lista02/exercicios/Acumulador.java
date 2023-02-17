/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02.exercicios;

import java.util.Scanner;

/*
 
 2) Acumulador
Crie uma classe chamada Acumulador que:
• Leia vários números até ler o número 0 e calcule a soma dos números lidos. (Não é para
usar vetor).
• Exiba: "A soma dos números é x"
 * @author fernandes
 */
public class Acumulador {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer numeros =10;
        Integer soma =0;
        while(numeros != 0 ){
            System.out.println("Digite um numero:");
        numeros = sc.nextInt();
        soma+=numeros;
        
    }
        System.out.println(String.format("A Soma dos numeros e %d", soma));
    }
}
