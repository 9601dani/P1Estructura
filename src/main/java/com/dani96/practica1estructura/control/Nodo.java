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
public class Nodo {
    private Nodo siguiente;
    private Nodo anterior;
    private Apuesta valor;

    public Nodo(Nodo siguiente, Nodo anterior, Apuesta valor) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.valor=valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Apuesta getValor() {
        return valor;
    }

    public void setValor(Apuesta valor) {
        this.valor = valor;
    }
    

    @Override
    public String toString() {
        return "anterior: "+ anterior +" valor: "+valor+" siguiente: "+ siguiente;
    }
    
}
