/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02.exercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fernandes
 */
/*
1) Loteria
Crie uma classe chamada Loteria que:
• Solicite apenas uma vez número entre 0 e 10 para o usuário.
• Tente adivinhar o número digitado através de números randômicos.
• A cada iteração exiba o número sorteado.
• Quando acontecer o “acerto” se a quantidade de vezes necessárias for:
 Até 3: exiba "Você é MUITO sortudo"
 Entre 4 e 10: exiba "Você é sortudo"
 Mais de 10: exiba "É melhor você parar de apostar e ir trabalhar"
*/
public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer nRandom = ThreadLocalRandom.current().nextInt(0, 10);
        Integer tentativas = 0;
        Boolean keepLoop = true;
        Integer nEntrada;
        while(keepLoop){
            
            nRandom = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(String.format("Numero Sorteado: %d",nRandom));
            nEntrada = sc.nextInt();
            if(nEntrada!=nRandom){
                System.out.println(String.format("Numero Sorteado: %d",nRandom));
                tentativas++;
            }else if(nEntrada==nRandom){
                System.out.println("Você Acertou");
                keepLoop = false;
            }
        }
        System.out.println(tentativas);
        if(tentativas <= 3){
            System.out.println("Você é MUITO sortudo");
        }else if(tentativas >= 4 && tentativas <= 10){
            System.out.println("Você é sortudo");
        }else if (tentativas > 10){
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
        
    }
}
