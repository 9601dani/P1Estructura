/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.control;

import com.dani96.practica1estructura.frames.MainFrame;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class ArchivoEntrada {
    public String[] SubirArchivo(MainFrame in) {
       try{
           JFileChooser archivosubir = new JFileChooser();
        int seleccion = archivosubir.showOpenDialog(in);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = archivosubir.getSelectedFile();
            String path=fichero.getAbsolutePath();
            try ( FileReader fr = new FileReader(fichero)) {
                String cadena = "";
                int valor = fr.read();
                while (valor != -1) {
                    cadena = cadena + (char)valor;
                    valor = fr.read();
                }
                return splitDatos(cadena.replace("\n", ","));
                
               
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR EL ARCHIVO");
            }
            return null;
        }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR EL ARCHIVO");
       }
        return null;
    }
    
    public String[] splitDatos(String cadena){
        String [] resultado = cadena.split(",");
        return resultado;
    }
    
    
}
