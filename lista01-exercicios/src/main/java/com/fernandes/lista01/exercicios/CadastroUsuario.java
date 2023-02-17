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
public class CadastroUsuario {

    public static void cadastroUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu login: ");
        String loginInput = sc.next();
        System.out.println("Digite sua senha:  ");
        String senhaInput = sc.next();
        System.out.println("Digite sua qntd de tentativas:  ");
        Integer qntdPermitida = sc.nextInt();
        System.out.println("Seu login é " + loginInput + " e sua senha é " + senhaInput + ". Você tem " + qntdPermitida + "\n"
                + "tentativas antes de ser bloqueado");

    }

    public static void main(String[] args) {
        cadastroUser();
    }

}
