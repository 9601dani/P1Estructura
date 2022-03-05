/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.main;

import com.dani96.practica1estructura.control.ListaCircularDoble;
import com.dani96.practica1estructura.frames.MainFrame;
import com.dani96.practica1estructura.objects.Caballo;

/**
 *
 * @author daniel
 */
public class Main {
    public static ListaCircularDoble lista= new ListaCircularDoble();
    public static ListaCircularDoble listaError= new ListaCircularDoble();
    public static boolean apuestas=true;
    
    public static void main(String[] args) {
          MainFrame ventana= new MainFrame();
          ventana.setVisible(true);
          
    }
}
