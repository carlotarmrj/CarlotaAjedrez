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

public class Alfil extends Pieza {
    public Alfil(String color){
        super(color,"\u2657 ","\u265D ");
    }
    
   
    @Override
    public boolean validoMov(Movimiento mov){
        return false;
    }   
}