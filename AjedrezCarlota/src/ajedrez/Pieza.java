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
public abstract class Pieza {//atributos
    private String color;
    private String nombre;

    public Pieza(){//constructor estandar
        color="color";
        nombre="nombre";
    }

    public Pieza(String color){//constructor solo color
        this.color=color;
    }
    

    public Pieza(String color, String unicodeBlanco, String unicodeNegro){//constructor para saber si es blanca o negra
        this.color=color;
        if (color.equalsIgnoreCase("blanco")){
            nombre=unicodeBlanco;
        }else{
            nombre=unicodeNegro;
        }
    }
    public Pieza(String color, String nombre){//constructor user
        this.color=color;
        this.nombre=nombre;
    }

    public abstract boolean validoMov(Movimiento mov);//metodo obliga a hijas a tener su movimiento

    public String pintarPieza(){//metodo impimir pieza
        return nombre;
    }

  

    @Override
    public String toString() {
        return "{ "+ "color = "+ color + " nombre = "+ nombre +" }";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

