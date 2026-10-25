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
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int total = 0, usu, maq;

        while (total < 21) {
            // Turno del usuario
            do {
                System.out.println("Introduce un número (1-3): ");
                usu = sc.nextInt();
            } while (usu < 1 || usu > 3);

            total = total + usu;
            System.out.println("Total: " + total);

            if (total >= 21) {
                System.out.println("Has llegado a 21. HAS PERDIDO");
            } else {
                // Turno de la máquina
                System.out.println("Turno de la máquina");
                maq = (int)(Math.random()*3) + 1;
                System.out.println("La máquina suma " + maq);
                total = total + maq;
                System.out.println("Total: " + total);

                if (total >= 21) {
                    System.out.println("La máquina ha llegado a 21. HAS GANADO");
                }
            }
        }
    }
    
}
