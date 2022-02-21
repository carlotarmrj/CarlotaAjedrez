/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author carlo
 */
public class Posicion {
   private int fila;
   private int columna;

//constructores
public Posicion(){//constructor estandar
   columna=0;
   fila=0;
}
public Posicion(int fila, int columna){
    this.fila=fila;
    this.columna=columna;
}
public String toString(){
    return "{Estas en la fila "+fila+" y en la columna "+columna+"}";
}
        

//getters y setters

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    

}