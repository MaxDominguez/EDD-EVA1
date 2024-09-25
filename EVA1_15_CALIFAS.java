package org.example;

import java.util.Scanner;

public class EVA1_15_CALIFAS {
    public static void main(String[] args) {
        int[][][] califaz;
        int noCarr,noGpos,noAl;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantas carreras son de la carrera? 2" );
        noCarr = captu.nextInt();
        captu.nextLine();

        califaz = new int [noCarr][][];
        for (int i = 0; i < califaz.length; i++) {
            System.out.println("¿Cuantas grupos son de la carrera? " + i);
            noGpos = captu.nextInt();
            captu.nextLine();
            califaz[i] = new int[noGpos][];
            for (int j = 0; j < califaz[i].length; j++) {
                System.out.println("¿Cuantas alumnos son? " + j);
                noAl = captu.nextInt();
                captu.nextLine();
                califaz[i][j] = new int [noAl];
                for (int k = 0; k < califaz[i][j].length; k++) {
                    System.out.println("¿Califa para el alumno" + k + ", del grupo" + j + ", de la carrera" + i);
                    califaz[i][j][k] = captu.nextInt();
                    captu.nextLine();
                }
           }
        }
    }
}