/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import Modelo.Alfil;
import Modelo.Ficha;
import Modelo.Peon;
import Negocio.Tablero;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * 
 * @author Brayan Guerrero 1151983 y Angie Orozco 1151798
 */
public class Test {
    public static void main(String[] args) throws Exception {
         int filaAlfil = 8;
         int columnaAlfil = 1;
         int filaPeon = 8;
         int columnaPeon = 8;
         boolean direccionPeon = false;
         /*
         try{
             Tablero t = new Tablero(filaAlfil,columnaAlfil,filaPeon,columnaPeon,direccionPeon);
             t.jugar();
         }catch(Exception e){
             System.out.println(e);
         }*/
         
         Peon peon = new Peon(filaPeon, columnaPeon, direccionPeon, "Peon");
         Alfil alfil = new Alfil(filaAlfil, columnaAlfil, "Alfil");
         ArrayList<Ficha> lista = new ArrayList();
         lista.add(peon);
         lista.add(alfil);
         
         crearPDF(lista);
    }
    
    public static void crearPDF(ArrayList<Ficha> lista) throws FileNotFoundException, DocumentException{
        //Se crea el documento 
        Document documento = new Document();
        
        //El OutPutStream para el fichero donde crearemos el PDF
        FileOutputStream ficheroPDF = new FileOutputStream("Tablero.pdf");
        
        //Se asocia el documento de OutPutStream
        PdfWriter.getInstance(documento, ficheroPDF);
        
        //Se abre el documneto
        documento.open();
        
        //Parrafo
        Paragraph titulo = new Paragraph(("Mi Tablero \n\n"),
                FontFactory.getFont("arial",
                        22,
                        Font.BOLD,
                        BaseColor.BLUE
                        )
                        );
                
        //Añadimos el titulo al documento
        documento.add(titulo);

        //Creamos una tabla
        PdfPTable tabla = new PdfPTable(2);
        tabla.addCell("NOMBRE");

        for (int i = 0; i < lista.size(); i++) {
            tabla.addCell("" + i);
            tabla.addCell(lista.get(i).getNombreFicha());
        }

        //Añadimos la tabala al documento
        documento.add(tabla);
        
        //Se cierra el documento
        documento.close();
    }
}
