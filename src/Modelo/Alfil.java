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
public class Alfil extends Ficha{
    int filaAlfil;
    int columnaAlfil;
    
    public Alfil(int filaAlfil, int columnaAlfil, String nombreFicha) {
        super(nombreFicha);
        this.filaAlfil = filaAlfil;
        this.columnaAlfil = columnaAlfil;
    }

    public int getFilaAlfil() {
        return filaAlfil;
    }

    public void setFilaAlfil(int filaAlfil) {
        this.filaAlfil = filaAlfil;
    }

    public int getColumnaAlfil() {
        return columnaAlfil;
    }

    public void setColumnaAlfil(int columnaAlfil) {
        this.columnaAlfil = columnaAlfil;
    }
    
    public boolean noAtaca(Peon peon){
         boolean libre = true;
         int aux = 0;
         int i_peon;
         if (peon.isDireccionPeon()) i_peon = peon.getFilaPeon()+1;
         else i_peon = peon.getFilaPeon()-1;
         do{
             aux++;
             libre = libre && ((filaAlfil != i_peon)||(columnaAlfil != peon.getColumnaPeon())); 
             
             libre = libre && ((filaAlfil-aux != i_peon)||(columnaAlfil+aux != peon.getColumnaPeon())); //cuando el alfil va hacia arriba a la derecha
             
             libre = libre && ((filaAlfil-aux != i_peon)||(columnaAlfil-aux != peon.getColumnaPeon())); //cuando el alfil va hacia arriba a la izquierda
             
             libre = libre && ((filaAlfil+aux != i_peon)||(columnaAlfil+aux != peon.getColumnaPeon()));//cuando el alfil va hacia abajo a la derecha
             
             libre = libre && ((filaAlfil+aux != i_peon)||(columnaAlfil-aux != peon.getColumnaPeon()));//cuando el alfil va hacia abjao a la izquierda
         }while(aux < 7 && libre);
         return libre;
     }
    
    public void desplazar(Peon peon){
        int direccionAux;
        if (peon.isDireccionPeon()) direccionAux = 1;
        else direccionAux = -1;
            switch (direccionAux) {
                case (1) -> {
                    if (filaAlfil != 8) {
                        if (((columnaAlfil > 1) && (columnaAlfil <= peon.getColumnaPeon())) || (columnaAlfil == 8)) { //mover de abajo a la izquierda
                            filaAlfil++;
                            columnaAlfil--;
                        } else if (((columnaAlfil < 8) && (columnaAlfil >= peon.getColumnaPeon())) || (columnaAlfil == 1)) { //mover de abajo a la derecha
                            filaAlfil++;
                            columnaAlfil++;
                        }
                    } else {
                        if (columnaAlfil == 2) {
                            filaAlfil--;
                            columnaAlfil++;
                        }
                        else if (columnaAlfil == 7) {
                            filaAlfil--;
                            columnaAlfil--;
                        }
                        else if (((columnaAlfil > 1) && (columnaAlfil <= peon.getColumnaPeon())) || (columnaAlfil == 8)) { //mover de arriba a la izquierda
                            filaAlfil--;
                            columnaAlfil--;
                        } else if (((columnaAlfil < 8) && (columnaAlfil >= peon.getColumnaPeon())) || (columnaAlfil == 1)) { //mover de arriba a la derecha
                            filaAlfil--;
                            columnaAlfil++;
                        }
                    }
                    break;
                }
                case (-1) -> {
                    if(filaAlfil!=1){
                        if (((columnaAlfil > 1) && (columnaAlfil <= peon.getColumnaPeon())) || (columnaAlfil == 8)) { //mover de arriba a la izquierda
                            filaAlfil--;
                            columnaAlfil--;
                        } else if (((columnaAlfil < 8) && (columnaAlfil >= peon.getColumnaPeon())) || (columnaAlfil == 1)) { //mover de arriba a la derecha
                            filaAlfil--;
                            columnaAlfil++;
                        }
                    } else {
                        if (columnaAlfil == 2) {
                            filaAlfil++;
                            columnaAlfil++;
                        }
                        else if(columnaAlfil==7){
                            filaAlfil++;
                            columnaAlfil--;
                        }
                        else if (((columnaAlfil > 1) && (columnaAlfil <= peon.getColumnaPeon())) || (columnaAlfil == 8)) { //mover de abajo a la izquierda
                            filaAlfil++;
                            columnaAlfil--;
                        } 
                        else if (((columnaAlfil < 8) && (columnaAlfil >= peon.getColumnaPeon())) || (columnaAlfil == 1)) { //mover de abajo a la derecha
                            filaAlfil++;
                            columnaAlfil++;
                            }
                        }
                    break;
                    }
                default -> {
                    break;
                }
            }
    }
    
    @Override
    public String toString() {
        return "A("+filaAlfil + ","+columnaAlfil + ')';
    }
}
