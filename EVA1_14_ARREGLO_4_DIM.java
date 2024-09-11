package org.example;

public class EVA1_14_ARREGLO_4_DIM {
    public static void main(String[] args) {
            int arreglo [][][][]  = new int[4][3][3][2];
            System.out.println(arreglo.length);
            System.out.println(arreglo[0].length);
            System.out.println(arreglo[1].length);
            System.out.println(arreglo[2].length);
            System.out.println(arreglo[3].length);

            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    for (int k = 0; k < arreglo[i][j].length; k++) {
                        for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        arreglo[i][j][k][l] = (int) (Math.random() * 100);
                        }
                    }
                }
            }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                            System.out.println("[" + arreglo[i][j][k][l] + "]");
                        }
                    }
                }
            }
    }
}
