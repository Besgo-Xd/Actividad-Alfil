/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.Ficha;
import ufps.util.colecciones_seed.Cola;

/**
 *
 * @author Brayan Guerrero 1151983 y Angie Orozco 1151798
 */
public class Tablero{
    private static final int rango = 8;
    private Ficha [][]myTablero = new Ficha[rango][rango];
    private Cola cola = new Cola();
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
         //Validacion de las posiciones iniciales
         if(((i_alfil < 1) || (i_alfil > rango) || (j_alfil < 1) || (j_alfil > rango)) || ((i_peon < 1) || (i_peon > rango) || (j_peon < 1) || (j_peon > rango)))
             throw new Exception("Coordenadas fuera de rango");
         //Asignacion de valores
         else{
             //Inicializacion de las fichas en el tablero
             myTablero[i_alfil-1][j_alfil-1] = new Ficha("alfil");
             myTablero[i_peon-1][j_peon-1] = new Ficha("peon");
             cola.enColar("A("+i_alfil+","+j_alfil+")");
             cola.enColar("P("+i_peon+","+j_peon+")");
         }
    }
     
     public void jugar(int i_alfil, int j_alfil, int i_peon,int j_peon, boolean dirPeon){
         //Variables auxiliares
         int direccionAux;
         //Inicializacion de la variable direccion la cual ayuda con la direccion hacia donde va el peon
         if(dirPeon) direccionAux = 1;
         else direccionAux  = -1;
         
         if((i_peon == 1 && !dirPeon) || (i_peon == 8 && dirPeon)){
             System.out.println("Finalizado");
         }
         else{
             if(valido(i_alfil, j_alfil, (i_peon+direccionAux), j_peon)){
                 moverPeon(i_alfil, j_alfil, (i_peon+direccionAux), j_peon, dirPeon);
             }
             else{
                 moverAlfil(i_alfil, j_alfil, (i_peon+direccionAux), j_peon, dirPeon);
             }
         }
     }
     
     //Metodo que valida el movimiento del peon
     private boolean valido(int i_alfil, int j_alfil, int i_peon, int j_peon){
         return ((i_peon >= 1) && (i_peon <= rango) && noAtaca(i_alfil, j_alfil, i_peon,j_peon));
     }
     
     //Metodo que determina si el alfil ataca al peon
     private boolean noAtaca(int i_alfil, int j_alfil, int i_peon,int j_peon){
         boolean libre = true;
         int aux = 0;
         do{
             aux++;
             libre = libre && ((i_alfil-aux != i_peon)||(j_alfil+aux != j_peon)); //cuando el alfil va hacia arriba a la derecha
             
             libre = libre && ((i_alfil-aux != i_peon)||(j_alfil-aux != j_peon)); //cuando el alfil va hacia arriba a la izquierda
             
             libre = libre && ((i_alfil+aux != i_peon)||(j_alfil+aux != j_peon));//cuando el alfil va hacia abajo a la derecha
             
             libre = libre && ((i_alfil+aux != i_peon)||(j_alfil-aux != j_peon));//cuando el alfil va hacia abjao a la izquierda
         }while(aux < 7 && libre);
         return libre;
     }
     
     private void moverPeon(int i_alfil, int j_alfil, int i_peon, int j_peon, boolean dirPeon){
         cola.enColar("P("+i_peon+","+j_peon+")");
         myTablero[i_peon-1][j_peon-1] = new Ficha("peon");
         System.out.println(cola.toString());
         jugar(i_alfil, j_alfil, i_peon, j_peon, dirPeon);
     }
     
     private void moverAlfil(int i_alfil, int j_alfil, int i_peon,int j_peon, boolean dirPeon){
         int[] posicionesAlfil = new int[2];
         int direccionAux = 0;
         posicionesAlfil[0] = i_alfil;
         posicionesAlfil[1] = j_alfil;
         if(dirPeon) direccionAux = 1;
         else direccionAux = -1;
         while(!noAtaca(posicionesAlfil[0], posicionesAlfil[1], i_peon, j_peon)){
            switch (direccionAux) {
                case (1) -> {
                    if (((posicionesAlfil[1] > 1) && (posicionesAlfil[1] <= j_peon)) || (posicionesAlfil[1] == rango)) { //mover de abajo a la izquierda
                        posicionesAlfil[0]++;
                        posicionesAlfil[1]--;
                    } 
                    else if (((posicionesAlfil[1] < rango) && (posicionesAlfil[1] >= j_peon)) || (posicionesAlfil[1] == 1)) { //mover de abajo a la derecha
                        posicionesAlfil[0]++;
                        posicionesAlfil[1]++;
                    }
                    break;
                }
                case (-1) -> {
                    if (((posicionesAlfil[1] > 1) && (posicionesAlfil[1] <= j_peon)) || (posicionesAlfil[1] == rango)) { //mover de arriba a la izquierda
                        posicionesAlfil[0]--;
                        posicionesAlfil[1]--;
                    }
                    else if (((posicionesAlfil[1] < rango) && (posicionesAlfil[1] >= j_peon)) || (posicionesAlfil[1] == 1)) { //mover de arriba a la derecha
                        posicionesAlfil[0]--;
                        posicionesAlfil[1]++;
                    }
                    break;
                }
                default -> {
                    break;
                }
            }
            cola.enColar("A("+posicionesAlfil[0]+","+posicionesAlfil[1]+")");
            myTablero[posicionesAlfil[0]-1][posicionesAlfil[1]-1] = new Ficha("alfil");
         }
         System.out.println(cola.toString());
         moverPeon(posicionesAlfil[0], posicionesAlfil[1], i_peon, j_peon, dirPeon);
     }
}
