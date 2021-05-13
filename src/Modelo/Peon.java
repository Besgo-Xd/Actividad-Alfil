/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Brayan Guerrero 1151983 y Angie Orozco 1151798
 */
public class Peon extends Ficha{
    int filaPeon;
    int columnaPeon;
    boolean direccionPeon;
    
    public Peon(int filaPeon, int columnaPeon, boolean direccionPeon, String nombreFicha){
        super(nombreFicha);
        this.filaPeon = filaPeon;
        this.columnaPeon = columnaPeon;
        this.direccionPeon = direccionPeon;
    }

    public int getFilaPeon() {
        return filaPeon;
    }

    public void setFilaPeon(int filaPeon) {
        this.filaPeon = filaPeon;
    }

    public int getColumnaPeon() {
        return columnaPeon;
    }

    public void setColumnaPeon(int columnaPeon) {
        this.columnaPeon = columnaPeon;
    }

    public boolean isDireccionPeon() {
        return direccionPeon;
    }

    public void setDireccionPeon(boolean direccionPeon) {
        this.direccionPeon = direccionPeon;
    }
    
    public void desplazar(){
        if(isDireccionPeon()) filaPeon++;
        else filaPeon--;
    }

    @Override
    public String toString() {
        return "P("+ filaPeon + ","+columnaPeon+")";
    }
}
