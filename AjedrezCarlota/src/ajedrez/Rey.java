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
public class Rey extends Pieza {
    public Rey(String color){
        super(color,"\u2654 ","\u265A ");
    }
    
   
    @Override
    public boolean validoMov(Movimiento mov){
        return false;
    } 
}
