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
public class Movimiento {
    private Posicion posInicial;
    private Posicion posFinal;

    //Comprobar mov tab
    public Movimiento(){
        posInicial=new Posicion();
        posFinal=new Posicion();
    }

    public Movimiento(Posicion posInicial, Posicion posFinal){
        this.posFinal=posFinal;
        this.posInicial=posInicial;
    }

    public boolean isVertical(){
        boolean vertical=false;
        if(posInicial.getColumna()==posFinal.getColumna()){
            vertical=true;
        }
        return vertical;
    }

    public boolean isHorizontal(){
        boolean horizontal=false;
        if (posInicial.getFila()==posFinal.getFila()){
            horizontal=true;
        }
        return horizontal;
    }

    public boolean isDiagonal(){
        boolean diagonal=false;
        if ((Math.abs(saltoVertical()))== Math.abs(saltoHorizontal())){
            diagonal=true;
        }
        return diagonal;
    }

    public int saltoHorizontal(){
        return posFinal.getColumna()- posInicial.getColumna();
    }

    public int saltoVertical(){
        return posFinal.getFila()- posInicial.getFila();
    }

    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }

    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }
}
