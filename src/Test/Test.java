/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import Modelo.Ficha;
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
         try{
             Tablero t = new Tablero(filaAlfil,columnaAlfil,filaPeon,columnaPeon,direccionPeon);
             t.jugar();
             t.crearPdf();
         }catch(Exception e){
             System.out.println(e);
         }
    }
    
    public static void crearPDF(Ficha[][] tablero) throws FileNotFoundException, DocumentException{
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
                FontFactory.getFont("arial", 22, Font.BOLD, BaseColor.BLUE)
        );
                
        //Añadimos el titulo al documento
        documento.add(titulo);

        //Creamos una tabla
        PdfPTable tabla = new PdfPTable(8);

        for (int i = 0; i < tablero.length; i++) {
            for(int j = 0; j < tablero[0].length; j++ ){
                if(tablero[i][j] == null) tabla.addCell("");
                if(tablero[i][j] != null) tabla.addCell(tablero[i][j].getNombreFicha());
            }
        }

        //Añadimos la tabala al documento
        documento.add(tabla);
        
        //Se cierra el documento
        documento.close();
    }
}
