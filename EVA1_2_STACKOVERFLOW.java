package org.example;

public class EVA1_2_STACKOVERFLOW {
    public static void main(String[] args) {
        A();
    }
    public static void A() {
        B();
    }
    public static void B(){
        A();
    }
}
//