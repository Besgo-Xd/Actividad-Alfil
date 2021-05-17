/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Modelo.Ficha;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Brayan Guerrero 1151983 y Angie Orozco 1151798
 */
public class CrearPDF {
    public void crearPDF(ArrayList<Ficha[][]> lista) throws FileNotFoundException, DocumentException, IOException {
        Document documento = new Document();
        FileOutputStream ficheroPDF = new FileOutputStream("Tablero.pdf");
        PdfWriter.getInstance(documento, ficheroPDF);
        Image peon = Image.getInstance("Peon.png");  
        Image alfil = Image.getInstance("Alfil.png");       
        documento.open();

        Paragraph titulo = new Paragraph(("Tablero de Ajedrez \n\n"), FontFactory.getFont("arial", 22, Font.BOLD, BaseColor.BLUE));
        titulo.setAlignment(Element.ALIGN_CENTER);
        Paragraph inicio = new Paragraph(("Inicio \n\n"), FontFactory.getFont("arial", 10, Font.BOLD, BaseColor.BLACK));

        documento.add(titulo);
        documento.add(inicio);

        for (int i = 0; i < lista.size(); i++) {
            Paragraph parrafo = new Paragraph(("#"+(i+1)+" Paso: \n\n"), FontFactory.getFont("arial", 10, Font.BOLD, BaseColor.BLACK));
            PdfPTable tabla = new PdfPTable(8);
            for (int j = 0; j < lista.get(i).length; j++) {
                for(int z = 0; z < lista.get(i)[0].length; z++){
                    if (lista.get(i)[j][z] == null) {
                        tabla.addCell("");
                    }
                    if (lista.get(i)[j][z] != null) {
                        if(lista.get(i)[j][z].getNombreFicha().equals("Peon")) tabla.addCell(peon);
                        else tabla.addCell(alfil);
                    }
                }
            }
            documento.add(tabla);
            documento.add(parrafo);
            documento.newPage();
        }

        documento.close();
    }
}
