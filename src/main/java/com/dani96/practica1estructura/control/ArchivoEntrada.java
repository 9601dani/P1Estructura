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
           JFileChooser archivosubir = new JFileChooser();                                              //O(1)   
        int seleccion = archivosubir.showOpenDialog(in);                                          //O(1)                                         
        if (seleccion == JFileChooser.APPROVE_OPTION) {                                                 //O(1)   
            File fichero = archivosubir.getSelectedFile();                                              //O(1)
            String path=fichero.getAbsolutePath();                                                      //O(1)        
            try ( FileReader fr = new FileReader(fichero)) {                                        //O(1)
                String cadena = "";                                                                     //O(1)           
                int valor = fr.read();                                                                 //O(1)
                while (valor != -1) {                                                                   //O(n)------>
                    cadena = cadena + (char)valor;                                                     //O(1)         
                    valor = fr.read();                                                                  //O(1)
                }
                return splitDatos(cadena.replace("\n", ","));                       //O(1)        
            } catch (IOException e1) {                                                                          
                JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR EL ARCHIVO");  //O(1)
            }
            return null;                                                                                //O(1)
        }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR EL ARCHIVO");       //O(1)
       }
        return null;                                                                                    //O(1)
    }
    
    public String[] splitDatos(String cadena){
        String [] resultado = cadena.split(",");                                                   //O(1)         
        return resultado;                                                                              //O(1)     
    }                                                                                   //--------------------------------------    
                                                                                            //RESULTADO O(n)
    
}
