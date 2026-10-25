/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int num, aleatorio = (int)(Math.random()*100)+1;
        
        do{
            do{
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            }while(num>100 || num<0);
            if(num>aleatorio){
                System.out.println("Mas bajo");
            }else if(num<aleatorio){
                System.out.println("Mas alto");
            }else System.out.println("Lo has acertado");
        }while(aleatorio!=num);
        
        
    }
    
}
