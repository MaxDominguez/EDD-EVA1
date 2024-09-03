package org.example;

public class EVA1_8_ARREGLOS3 {
    public static void main(String[] args) {
        String[] diasSemana = {"Domingo", "lunes", "martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("[" + diasSemana[i] + "]");
        }
        for (int i = 0; i < billetes.length; i++) {
            System.out.println("[" + billetes[i] + "]");
        }
    }
}
