/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author alex.silva
 */
import java.util.Scanner;
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int senha = 1234, acesso = 0;
         
         while(acesso != senha){
             System.out.println("Digite sua senha de acesso");
             acesso = input.nextInt();
             if(acesso != senha){
                 System.out.println("Senha incorreta, tente novamente");
             } else{
                 System.out.println("Parabens, Acesso permitido");
             }
             
        }
    }
    
}
