/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import Negocio.Tablero;
import Vista.CrearPDF;

/**
 * 
 * @author Brayan Guerrero 1151983 y Angie Orozco 1151798
 */
public class Test {
    public static void main(String[] args) throws Exception {
         int filaAlfil = 8;
         int columnaAlfil = 1;
         int filaPeon = 8;
         int columnaPeon = 2;
         boolean direccionPeon = false;
         try{
             Tablero t = new Tablero(filaAlfil,columnaAlfil,filaPeon,columnaPeon,direccionPeon);
             CrearPDF pdf = new CrearPDF();
             t.jugar();
             pdf.crearPDF(t.getListaTableros(), t.getListaColas());
         }catch(Exception e){
             System.out.println(e);
         }
    }
}
