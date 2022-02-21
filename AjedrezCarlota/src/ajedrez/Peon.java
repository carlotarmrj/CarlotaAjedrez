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
public class Peon extends Pieza {
    public Peon(String color){
        super(color,"\u2659 ","\u265F ");
    }
    
   
    @Override
    public boolean validoMov(Movimiento mov){
        return false;
    } 
}
