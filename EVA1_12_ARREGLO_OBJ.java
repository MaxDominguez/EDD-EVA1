package org.example;

public class EVA1_12_ARREGLO_OBJ {
    public static void main(String[] args){
Persona[] arregloPer = new Persona[5];
System.out.println("Dirección arreglo :" + arregloPer);
for (int i = 0; i < arregloPer.length; i++) {
    arregloPer[i] = new Persona();
    System.out.println("ArregloPer[" + i + "] = "+ arregloPer[i]);
    System.out.println("Nombre : [" + i + "] = " + arregloPer[i].getNombre());
    System.out.println("Apellido : [" + i + "] = "+ arregloPer[i].getApellido());
    System.out.println ("Edad : [" + i + "] = "+ arregloPer[i].getEdad());
}
    }
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;
public Persona(){
this.nombre = "Max";
this.apellido = "Dominguez";
this.edad = 20;
}
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}