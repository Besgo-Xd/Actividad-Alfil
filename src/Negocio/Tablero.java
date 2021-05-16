/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.*;
import ufps.util.colecciones_seed.Cola;

/**
 *
 * @author Brayan Guerrero 1151983 y Angie Orozco 1151798
 */
public class Tablero{
    private Ficha [][]myTablero = new Ficha[8][8];
    private Cola cola = new Cola();
    private Peon peon;
    private Alfil alfil;
    //Adicione los atributos que considere necesarios para el correcto fucnioanmiento de su aplicación, si y solo si , no violen ninguna regla en POO
    
    public Tablero() {}
    
    /**
     * Constructor para iniciar el juego
     * @param i_alfil Posición de la fila para el alfil
     * @param j_alfil Posición de la columna para el alfil
     * @param i_peon  Posición de la fila para el peon
     * @param j_peon  Posición de la columna para el alfil
     * @param dirPeon true si el peón se mueve de arriba hacia abajo, o false en caso contrario
     */
    
     public Tablero(int i_alfil, int j_alfil, int i_peon,int j_peon, boolean dirPeon) throws Exception{
         if(((i_alfil < 1) || (i_alfil > 8) || (j_alfil < 1) || (j_alfil > 8)) || ((i_peon < 1) || (i_peon > 8) || (j_peon < 1) || (j_peon > 8)))
             throw new Exception("Coordenadas fuera de rango");
         else{
             alfil = new Alfil(i_alfil,j_alfil,"Alfil");
             peon = new Peon(i_peon,j_peon,dirPeon,"Peon");
             myTablero[alfil.getFilaAlfil()-1][alfil.getColumnaAlfil()-1] = alfil;
             myTablero[peon.getFilaPeon()-1][peon.getColumnaPeon()-1] = peon;
             cola.enColar(alfil.toString());
             cola.enColar(peon.toString());
         }
    }

    public Ficha[][] getMyTablero() {
        return myTablero;
    }

    public void setMyTablero(Ficha[][] myTablero) {
        this.myTablero = myTablero;
    }
     
     public void jugar(){
         if((peon.getFilaPeon() == 1 && !peon.isDireccionPeon()) || (peon.getFilaPeon() == 8 && peon.isDireccionPeon())){
             System.out.println("Finalizado");
         }
         else{
             if(valido(alfil, peon)){
                 peon.desplazar();
                 myTablero[peon.getFilaPeon()-1][peon.getColumnaPeon()-1] = peon;
                 cola.enColar(peon.toString());
                 System.out.println(cola.toString());
                 jugar();
             }
             else{
                 alfil.desplazar(peon);
                 peon.desplazar();
                 myTablero[alfil.getFilaAlfil()-1][alfil.getColumnaAlfil()-1] = alfil;
                 cola.enColar(alfil.toString());
                 myTablero[peon.getFilaPeon()-1][peon.getColumnaPeon()-1] = peon;
                 cola.enColar(peon.toString());
                 System.out.println(cola.toString());
                 jugar();
             }
         }
     }
     
     //Metodo que valida el movimiento del peon en el tablero
     private boolean valido(Alfil alfil, Peon peon){
         int direccionAux;
         if(peon.isDireccionPeon()) direccionAux = 1;
         else direccionAux = -1;
         return (((peon.getFilaPeon()+direccionAux) >= 1) && ((peon.getFilaPeon()+direccionAux) <= 8) && alfil.noAtaca(peon));
     }
}
