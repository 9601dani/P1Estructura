/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.control;

import com.dani96.practica1estructura.objects.Apostador;
import com.dani96.practica1estructura.objects.Apuesta;
import com.dani96.practica1estructura.objects.Caballo;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class ControlCaballo {
    
    public ListaCircularDoble validacionCaballos(String[] cadena, ListaCircularDoble lista){
        int contador=0;
        int colo=0;
        String[] array= new String[12];
        try{
            for (int i = 0; i < cadena.length; i++) {
                if ((colo + 1) % 12 == 0) {
                    if (i == 0) {
                        array[contador] = cadena[i];
                        contador++;
                        colo++;
                    } else {
                        array[contador] = cadena[i];
                        lista.añadir(new Apuesta(new Apostador(array[0]), Double.parseDouble(array[1]), this.asignacionCaballos(array)));
                        contador = 0;
                        colo = 0;
                    }

                } else {
                    array[contador] = cadena[i];
                    contador++;
                    colo++;

                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO HAY DATOS");
        }
        return lista;
    }
    public int[] asignacionCaballos(String[] array){
        int[] caballo= new int[10];
        int contador=0;
        for (int i = 2; i < array.length; i++) {
            caballo[contador]= Integer.parseInt(array[i]);
            contador++;
        }
        return caballo;
    }
   
    
}
