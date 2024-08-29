package org.example;

public class EVA1_5_PASO_PARAMETROS {
    public static void main(String[] args){
    int num = 100;
    System.out.println("num (antes de incremento) =" + num);
    System.out.println("num (despues de incremento) ="+ num);
    //paso por referencia (direcciones de memoria)
        //es la dirccion de memoria
    Prueba objPrueba= new Prueba();
        System.out.println("valor de x (antes) ="+ objPrueba.x);
        incrementaObj(objPrueba);
        System.out.println("valor de x (despues) =" + objPrueba.x);
    }
    public static void incrementa  (int valor){//paso por valor
        valor++;
    }
    public static void incrementaObj (Prueba objPrueba){
        objPrueba.x++;
    }
}
class Prueba{
    int x = 5;
}