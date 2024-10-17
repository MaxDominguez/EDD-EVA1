package org.example;

public class EVA1_19_PRIMOS{
    public static void main(String[] args) {
        System.out.println("11 " + primos2aN(11));
        System.out.println("11 " + primos2aRaizN(11));
    }
public static boolean primos2aN(int num){
        boolean resu = false;
        int modulo = 0;
        for(int i = 2; i < num; i++) {
            modulo = num % i;
            if (modulo == 0) {
                resu = false;
            }
        }
            return resu;
}
public static boolean primos2aRaizN(int num){
        boolean resu = false;
    int modulo = 0;
        double raiz = Math.sqrt(num);
        int raizEnt = (int)raiz;
        for(int i = 2; i <= raizEnt; i++) {
            modulo = num % i;
            if (modulo == 0)
                resu = false;
        }
            return resu;
}
}