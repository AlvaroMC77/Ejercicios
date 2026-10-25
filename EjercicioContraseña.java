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
public class EjercicioContraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        char [] contraseña = {'a','d','m','i','n'};
        char [] usu = {'*','*','*','*','*'};
        int posicion = 0, intentos = 0;
        char letra;
        
        
        do{
            for (int j = 0; j < 5; j++) {
                System.out.print(usu[j]);
            }
            System.out.println("");
            System.out.println("Introduce la letra");
            intentos++;
            letra = sc.next().charAt(0);
            if(letra==contraseña[posicion]){
                usu[posicion]=letra;
                posicion++;
            }else{
                System.out.println("LETRA INCORRECTA");
            }
            
        }while(usu[4]=='*');
        System.out.println("La contraseña era: 'admin' ");
        System.out.println("Numero de intentos: " + intentos);
        
    }
    
}
