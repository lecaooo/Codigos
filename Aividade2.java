/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aividade2;

/**
 *
 * @author alex.silva
 */
import java.util.Scanner;
public class Aividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int preconibus = 4;
        int precometro = 6;
        int precotrem = 7;
        System.out.println("Qual e o seu nome?");
        String nome = input.next();
        System.out.println(nome+" voce gostaria de comprar qual passagem?");
        System.out.println("1 - onibus, 2 - metro, 3 - trem");
        System.out.println("crianca e idoso nao paga (Menores de 6 anos e maiores de 65 )");
        System.out.println("estudante de ate 17 anos paga meia");
        int transporte = input.nextInt();
        System.out.println(nome+" Qual e a sua idade?");
        int idade = input.nextInt();
        
        
        
        switch(transporte){
            case 1:
                preconibus = 4;
                double pofinal = preconibus/2;
                if(idade < 6 && idade > 65){
                      System.out.println(nome+" voce e preferencial,parabens,voce nao paga nada"); 
                }else if(idade >= 6 && idade <= 17){
                    System.out.println(nome+" voce paga meia" );
                    System.out.println("o valor final e: "+ pofinal+"$");
                }else{
                    System.out.println("o valor final e: "+preconibus+"$");
                }
                break;
            case 2:
                precometro = 6;
                double pmfinal = precometro/2;
                if(idade < 6 && idade > 65){
                    System.out.println(nome+" voce e preferencial,parabens,voce nao paga nada");
                }else if(idade >= 6 && idade <= 17){
                    System.out.println(nome+" voce paga meia" );
                    System.out.println("o valor final e: "+ pmfinal+"$");
               }else{
                    System.out.println("o valor final e: "+precometro+"$");
                }
                    break;  
            case 3:
                precotrem = 7;
                double ptfinal = precotrem/2;
                  if(idade < 6 && idade > 65){
                    System.out.println(nome+" voce e preferencial,parabens,voce nao paga nada");
                  }else if(idade >= 6 && idade <= 17){
                    System.out.println(nome+" voce paga meia" );
                    System.out.println("o valor final e: "+ ptfinal+"$");
                  }else{
                    System.out.println("o valor final e: "+precotrem+"$");
                }
                    
               break;
                 
               
        
        
        
        }
        
    }
    
}
