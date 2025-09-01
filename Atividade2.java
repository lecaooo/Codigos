/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;

/**
 *
 * @author alex.silva
 */
import java.util.Scanner;
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("Digite um numeo(0 para sair): ");
            numero = input.nextInt();
            System.out.println("Voce digitou "+numero);
          }while(numero != 0);
          System.out.println("programa encerrado");

    }
    
}
