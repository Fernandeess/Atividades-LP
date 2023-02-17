/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author fernandes
 */
public class Calculadora {

    public static void soma(Integer x) {
        Integer y;
        for (int i = 0; i <= 10; i++) {
            y = x + i;
            System.out.println(String.format("%d + %d = %d", x, i, y));
        }
    }

    public static void multiplicacao(Integer x) {
        Integer y;
        for (int i = 0; i <= 10; i++) {
            y = x * i;
            System.out.println(String.format("%d * %d = %d", x, i, y));
        }
    }

    public static void div(Integer x) {
        Double y;
        for (Integer i = 1; i <= 10; i++) {
            y = x / (double) i;
            System.out.println(String.format("%d / %d = %.2f", x, i, y));
        }
    }

    public static void sub(Integer x) {
        Integer y;
        for (Integer i = 1; i <= 10; i++) {
            y = x - i;
            System.out.println(String.format("%d - %d = %d", x, i, y));
        }
    }

    public static void potencia(Integer x) {
        Double y;
        for (Integer i = 1; i <= 10; i++) {
            y = Math.pow(x, i);
            System.out.println(String.format("%d ** %d = %.2f", x, i, y));
        }
    }

    public static void resto(Integer x) {
        Double y;
        for (Integer i = 1; i <= 10; i++) {
            y = x % (double) i;

            System.out.println(String.format("%d %% %d = %.2f", x, i, y));
        }
    }

    public static void main(String[] args) {
        Boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        Integer select;
        Integer selected;

        while (continuar) {
            System.out.println("Digite o número correspondente a operação desejada:\n ");
            System.out.println("""
                               1 - Soma
                               2 - Multiplica\u00e7\u00e3o
                               3 - Divis\u00e3o
                               4 - Subtra\u00e7\u00e3o
                               5 - Pot\u00eancia
                               6 - Resto
                               0 \u2013 Sair""");

            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Digite um número inteiro:\n");
                    selected = sc.nextInt();
                    soma(selected);
                    break;
                case 2:
                    System.out.println("Digite um número inteiro:\n");
                    selected = sc.nextInt();
                    multiplicacao(selected);
                    break;
                case 3:
                    System.out.println("Digite um número inteiro:\n");
                    selected = sc.nextInt();
                    div(selected);
                    break;
                case 4:
                    System.out.println("Digite um número inteiro:\n");
                    selected = sc.nextInt();
                    sub(selected);
                    break;
                case 5:
                    System.out.println("Digite um número inteiro:\n");
                    selected = sc.nextInt();
                    potencia(selected);
                    break;
                case 6:
                    System.out.println("Digite um número inteiro:\n");
                    selected = sc.nextInt();
                    resto(selected);
                    break;
                case 0:
                    System.out.println("Até logo");
                    continuar = false;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }

        }
    }
}
