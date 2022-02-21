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
public class Caballo extends Pieza {
    public Caballo(String color){
        super(color,"\u2658 ","\u265E ");
    }
    
   
    @Override
    public boolean validoMov(Movimiento mov){
        return false;
    
    }
}
