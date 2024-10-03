package org.example;

public class EVA1_17_FACTORIAL {
    public static void main(String[] args) {
        System.out.println("Factorial(5)="+ factorial(5));
        System.out.println("Factorial(5)="+ factorialRec(5));

    }
    public static int factorial(int valor){
        int facto = 1;
        for(int i = 1; i <= valor; i++)
            facto = facto * i;
        return facto;
    }
    public static int factorialRec(int valor){
        if (valor > 0)
         return valor * factorialRec(valor-1);
        else
         return 1;
    }

}