/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.control;

import com.dani96.practica1estructura.objects.Apuesta;

/**
 *
 * @author daniel
 */
public class ListaCircularDoble {

    Nodo inicioNodo;
    Nodo ultimoNodo;
    int tamaño;
    private int pasos = 1;

    public boolean empty() {
        return inicioNodo == null;
    }

    public void añadir(Apuesta valor) {

        if (empty() == false) {
            Nodo nuevo = new Nodo(ultimoNodo, inicioNodo, valor);
            ultimoNodo.setSiguiente(nuevo);
            inicioNodo.setAnterior(nuevo);
            ultimoNodo = nuevo;
        }
        if (empty()) {
            Nodo nuevo = new Nodo(ultimoNodo, inicioNodo, valor);
            inicioNodo = nuevo;
            ultimoNodo = nuevo;
        }
        tamaño++;
        // System.out.println("tamaño = " + tamaño);

    }
    public void imprimirInicioFin(){
       boolean leer=true;
       int contador=0;
        if(empty()== false){
           System.out.println("NODO "+ inicioNodo.getValor());
           Nodo aux= inicioNodo.getSiguiente();
           Nodo auxi= inicioNodo.getAnterior();
           while(leer){
               if(aux!=auxi){
                   System.out.println("NODO "+ aux.getValor());
                   aux = aux.getSiguiente();
                   contador++;
               }else{
                   System.out.println("NODO "+ aux.getValor());
                   leer=false;
                   contador++;
               }
               
           }
       }
        System.out.println("-------- "+contador);
    }

}
