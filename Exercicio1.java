/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author alex.silva
 */
import java.util.Scanner;
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int numero = 0;
         int soma = 0;
         
          while(numero >= 0){
            System.out.println("Digite um numero para o calculo(negaivo para sair): ");
            numero = input.nextInt();
            if(numero == -1){
                break;
            }
            
            soma += numero;
        }
        System.out.println(soma);
        System.out.println("Programa encerrado!");
    }
    }
    

