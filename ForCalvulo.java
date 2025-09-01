/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor.calvulo;

/**
 *
 * @author alex.silva
 */
import java.util.Scanner;
public class ForCalvulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nomero para visualizar a tabuada");
        int n1 = input.nextInt();
        
        for(int i = 1; i  <= 10; i++){
            System.out.println(n1+" x "+i+" = "+(n1*i));
        }
    }
    
}
