package org.example;

public class EVA1_3_HEAP {
    public static void main(String[] args){
        int i = 5;
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
            System.out.println(i);
            System.out.println(obj);
            System.out.println(obj2);
    }
}
    class Prueba  {
    }


    // en java al correr el programa no es la ubicacion de memoria,
// el apuntador: es la variable que guarda una direccion de memoria real
// referencias: una direccion pero de memoria de la JVM, es lo que maneja java.
// obj y obj2, son referencias.
// obj = null, asi se borra un objeto.