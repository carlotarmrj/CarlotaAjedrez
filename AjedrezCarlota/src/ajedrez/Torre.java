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
    public class Torre extends Pieza {
    public Torre(String color){
        super(color,"\u2656 ","\u265C ");
    }
    
   
    @Override
    public boolean validoMov(Movimiento mov){
        return false;
    }
      /*public boolean validoMov(Movimiento mov){
        boolean valido=false;
        if (mov.isVertical() || mov.isHorizontal()){
            valido=true;
        }
        return valido;
    }

     */
}
