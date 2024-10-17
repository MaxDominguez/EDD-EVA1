package org.example;

public class EVA1_18MCD {
    public static void main(String[] args) {
                System.out.println("El MCD de 180 y 48 es" + mcd(180,48));
            }
            public static int mcd(int num1, int num2){
                int modulo = num1 % num2;
                if( modulo==0)
                    return num2;
                else
                    return mcd(num2, modulo);
            }
        }
