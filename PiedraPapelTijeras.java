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
public class PiedraPapelTijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int puntosU = 0, puntosMaq = 0, mano, manoMaq;

        while (puntosU < 3 && puntosMaq < 3) {
            do {
                System.out.println("1.Piedra 2.Papel 3.Tijeras");
                mano = sc.nextInt();
            } while (mano < 1 || mano > 3);

            manoMaq = (int)(Math.random()*3) + 1;
            System.out.println("La máquina elige " + manoMaq);

            if (mano == manoMaq) {
                System.out.println("EMPATE");
            } else if ((mano == 1 && manoMaq == 3) ||
                       (mano == 2 && manoMaq == 1) ||
                       (mano == 3 && manoMaq == 2)) {
                System.out.println("GANASTE LA RONDA");
                puntosU++;
            } else {
                System.out.println("GANA LA MÁQUINA LA RONDA");
                puntosMaq++;
            }

            System.out.println("Marcador: tú " + puntosU + " - máquina " + puntosMaq);
        }

        if (puntosU == 3) {
            System.out.println("HAS GANADO LA PARTIDA");
        } else {
            System.out.println("HA GANADO LA MÁQUINA LA PARTIDA");
        }
        
    }
    
}
