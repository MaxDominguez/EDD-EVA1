package org.example;

public class EVA1_16_RECURSIVIDAD {
    public static void main(String[] args) {
        //   for (int i = 5; i > 0; i--) {
        //   System.out.println(i + "-");
        forRecursive(10);
        forRecursiveUp(1, 10);
    }

    public static void forRecursive(int val) {
        System.out.println(val + " - ");
        if (val > 1)
            forRecursive(val - 1);
    }

        public static void forRecursiveUp ( int val, int fin){
            System.out.println(val + " - ");
            if (val < fin)
                forRecursiveUp(val + 1, fin);
    }
}
    //el metodo se tiene que llamar  a si mismo
// debe haber un mecanismo para detener  la recursividad