package org.example;

public class EVA1_13_ARREGLOS_MULTI {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}