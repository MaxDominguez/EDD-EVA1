package org.example;
public class EVA1_7_ARREGLOS2 {
    public static void main(String[] args) {
     int[] datos = new int [10];
     for (int i = 0; i < datos.length; i++){
         //genera valores aleatorios
         //entre 0 y 1
         datos[i] = (int) (Math.random() * 100);
     }
        for (int i = 0; i < datos.length; i++){
            System.out.println("[" + datos[i] + "]");
        }
    }
}