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
public class CalcularTroco {

    public static void calcularTroco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor unitario do Notebook: ");
        Double valorUnitario = sc.nextDouble();
        if (valorUnitario <= 0) {
            System.out.println("Digite um valor valido !!");
            return;
        }
        System.out.println("Digite a quantidade vendida: ");
        Integer qntdVendida = sc.nextInt();
        if (qntdVendida <= 0) {
            System.out.println("Digite uma quantidade valida !!");
            return;
        }
        System.out.println("Digite o valor Pago");
        Double valorPago = sc.nextDouble();
        Double valorTotal = valorUnitario * qntdVendida;
        Double troco;
        if (valorPago < valorTotal) {
            System.out.println("Valor Insuficiente para o pagamento do produto");
            return;
        } else {
            troco = valorPago - valorTotal;
            System.out.println("Seu troco será de R$" + troco);
        }

    }

    public static void main(String[] args) {
        calcularTroco();
    }
}
