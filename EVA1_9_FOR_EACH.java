package org.example;

public class EVA1_9_FOR_EACH {
    public static void main(String[] args) {
        String[] diasSemana = {"Domingo", "lunes", "martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for (String valor : diasSemana) {
            System.out.println("[" + valor + "]");
        }
    }
}