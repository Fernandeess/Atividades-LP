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
public class Login {
    public static void main(String[] args) {
        String senha = "#SPtech2022";
        String user = "admin";
        Scanner sc = new Scanner(System.in);
        Boolean keepLogin = true;
        String inputUser;
        String inputPassword;
        while(keepLogin){
            System.out.println("Digite o nome de usuario:");            
            inputUser = sc.next();
            System.out.println("Digite a senha:");            
            inputPassword = sc.next();
            
            if(inputUser.equals(user) && inputPassword.equals(senha)){
                System.out.println("Login Realizado com sucesso");
                keepLogin = false;
            }else{
                System.out.println("Login e/ou senha inválidos");
                System.out.println("Tente Novamente:");
            }
            
        }
    }
}
