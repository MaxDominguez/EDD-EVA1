package org.example;

public class EVA1_4_STACK_HEAP {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println("Main" + prueba);
        foo(prueba);
    }

    public static void foo(Prueba objeto) {
        System.out.println("foo" + objeto);
    }
}
    class Prueba{

    }
