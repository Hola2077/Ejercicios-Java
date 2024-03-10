
package com.mycompany.prueba;

public class Nodo {
    private int numero = 0;
    private int edad = 0;
    private String nombre = "";
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
    
    public Nodo siguiente = null;
    
    Nodo(){
    
    }
    
    Nodo(String numero ){
        this.nombre = numero;
    }

    @Override
    public String toString() {
        return "Nodo{" + "numero=" + numero + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
}
