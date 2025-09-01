/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepicao;

/**
 *
 * @author alex.silva
 */
import java.util.Scanner;
public class Lacoderepicao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero = 0;
        
        while(numero >= 0){
            System.out.println("Digite um numeo(negaivo para sair): ");
            numero = input.nextInt();
            System.out.println("Voce digitou "+numero);
        }
        
        System.out.println("Programa encerrado!");
    }
    
}
