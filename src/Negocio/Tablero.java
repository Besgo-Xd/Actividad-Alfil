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
public class Tablero {
    private final int rango = 8;
    private Ficha [][]myTablero = new Ficha[rango][rango];
    private Cola cola = new Cola();
    private boolean direccion;
    private int filaAlfil = 0;
    private int columnaAlfil = 0;
    private int filaPeon = 0;
    private int columnaPeon = 0;
    private boolean exito = false;
    private int contador = 0;
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
             this.filaAlfil = i_alfil;
             this.columnaAlfil = j_alfil;
             this.filaPeon = i_peon;
             this.columnaPeon = j_peon;
             this.direccion = dirPeon;
             //Inicializacion de las fichas en el tablero
             myTablero[filaAlfil-1][columnaAlfil-1] = new Ficha("alfil");
             myTablero[filaPeon-1][columnaPeon-1] = new Ficha("peon");
             cola.enColar("A("+i_alfil+","+j_alfil+")");
             cola.enColar("P("+i_peon+","+j_peon+")");
         }
    }
     
     public String jugar(){
         //Variables auxiliares
         int direccionAux, i;
         String msj = null;
         //Inicializacion de la variable direccion la cual ayuda con la direccion hacia donde va el peon
         if(direccion) direccionAux = 1;
         else direccionAux  = -1;
         
         contador++;
         i = filaPeon + direccionAux;
         
         if (valido(filaAlfil, columnaAlfil, i, columnaPeon)) {
             exito = false;
             this.moverPeon(i);
             this.imprimir(contador);
             jugar();
             msj = cola.toString();
         } 
         else if (!noAtaca(filaAlfil, columnaAlfil, i, columnaPeon)) {
             exito = false;
             this.moverAlfil(direccionAux);
             if(!noAtaca(filaAlfil, columnaAlfil, i, columnaPeon)){
                 this.imprimir(contador);
                 jugar();
             }
             else{
                 this.moverPeon(i);
                 this.imprimir(contador);
                 jugar();
             }
             msj = cola.toString();
         } 
         else {
             exito = true;
             msj = "Finalizado";
         }
         return msj;
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
             //System.out.println("Caso #"+aux);
             libre = libre && ((i_alfil-aux != i_peon)||(j_alfil+aux != j_peon)); //cuando el alfil va hacia arriba a la derecha
             //System.out.println("Alfil("+(i_alfil-aux)+","+(j_alfil+aux)+")");
             
             libre = libre && ((i_alfil-aux != i_peon)||(j_alfil-aux != j_peon)); //cuando el alfil va hacia arriba a la izquierda
             //System.out.println("Alfil("+(i_alfil-aux)+","+(j_alfil-aux)+")");
             
             libre = libre && ((i_alfil+aux != i_peon)||(j_alfil+aux != j_peon));//cuando el alfil va hacia abajo a la derecha
             //System.out.println("Alfil("+(i_alfil+aux)+","+(j_alfil+aux)+")");
             
             libre = libre && ((i_alfil+aux != i_peon)||(j_alfil-aux != j_peon));//cuando el alfil va hacia abjao a la izquierda
             //System.out.println("Alfil("+(i_alfil+aux)+","+(j_alfil-aux)+")");
             //System.out.println(libre);
             //System.out.println("--------");
         }while(aux < 7 && libre);
         return libre;
     }
     
     private void moverPeon(int i){
         filaPeon = i;
         cola.enColar("P("+filaPeon+","+columnaPeon+")");
         myTablero[filaPeon-1][columnaPeon-1] = new Ficha("peon");
     }
     
     private void moverAlfil(int direccionAux){
         do{
         switch (direccionAux) {
             case (1) -> {
                 //mover de abajo a la izquierda
                 if (((columnaAlfil > 1) && (columnaAlfil < columnaPeon)) || (columnaAlfil == rango)) {
                     filaAlfil++;
                     columnaAlfil--;
                 } 
                 //mover de abajo a la derecha
                 else if (((columnaAlfil < rango) && (columnaAlfil > columnaPeon)) || (columnaAlfil == 1)) {
                     filaAlfil++;
                     columnaAlfil++;
                 }
                 break;
             }
             case (-1) -> {
                 //mover de arriba a la izquierda
                 if (((columnaAlfil > 1) && (columnaAlfil < columnaPeon)) || (columnaAlfil == rango)) {
                     filaAlfil--;
                     columnaAlfil--;
                 }
                 //mover de arriba a la derecha
                 else if (((columnaAlfil < rango) && (columnaAlfil > columnaPeon)) || (columnaAlfil == 1)) {
                     filaAlfil--;
                     columnaAlfil++;
                 }
                 break;
             }
             default -> {
                 break;
             }
         }
         }while(!noAtaca(filaAlfil, columnaAlfil, (filaPeon+direccionAux), columnaPeon));
         cola.enColar("A("+filaAlfil+","+columnaAlfil+")");
         myTablero[filaAlfil-1][columnaAlfil-1] = new Ficha("alfil");
     }
     
     private void imprimir(int contador){
         System.out.println("Paso #"+contador);
         System.out.println(cola.toString());
         System.out.println("--------------------------------------------------------------------------------------------------------------");
     }
}
