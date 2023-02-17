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
public class SalarioLiquido {

    public static void calcularSalarioLiquido() {
        Scanner sc = new Scanner(System.in);
        Double salarioBruto;
        Double descontoINSS;
        Double descontoIR;
        Double conducaoDiaria;
        Double descontoVT;
        Double salarioLiquido;
        Double totalDescontos;
        System.out.println("Digite o seu salario bruto");
        salarioBruto = sc.nextDouble();
        if (salarioBruto <= 0) {
            System.out.println("Digite um valor valido");
            return;
        }
        System.out.println("Quanto custa a condução diaria");
        conducaoDiaria = sc.nextDouble();
        descontoINSS = salarioBruto * .10;
        descontoIR = salarioBruto * .20;
        descontoVT = (conducaoDiaria * 2) * 22;
        totalDescontos = descontoINSS + descontoIR + descontoVT;
        salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Seu salário bruto é R$" + salarioBruto + ", tem um total de R$" + totalDescontos + " em descontos e receberá um líquido de R$" + salarioLiquido);

    }

    public static void main(String[] args) {
        calcularSalarioLiquido();
    }
}
