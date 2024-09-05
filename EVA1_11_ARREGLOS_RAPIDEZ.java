package org.example;

public class EVA1_11_ARREGLOS_RAPIDEZ {
    public static void main(String[] args) {

        int [] arreglo = new int[1000000000];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }
}