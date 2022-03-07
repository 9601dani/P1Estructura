/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.control;

/**
 *
 * @author daniel
 */
public class Orde {
    private ListaCircularDoble lista;

    public Orde(ListaCircularDoble lista) {
        this.lista = lista;
    }
    
    public void insertionSort() {
        Nodo nodoInsertar= lista.getInicioNodo().getSiguiente();
        while(nodoInsertar!=null){
            Nodo primerNodo=nodoInsertar.getAnterior();
            
            while(primerNodo!=null){
                System.out.println("jaja");
                if(primerNodo.getValor().getPuntos() >= nodoInsertar.getValor().getPuntos()){
                    System.out.println("1");
                    if(primerNodo.getSiguiente().getValor().getPuntos() < nodoInsertar.getValor().getPuntos()){
                        System.out.println("2");
                        this.lista.InsertarEntre(primerNodo, primerNodo.getSiguiente(), nodoInsertar);
                    }
                    System.out.println("hice el break");
                    break;
                }else{
                    if(this.lista.getInicioNodo()==primerNodo){
                        this.lista.insertarInicio(nodoInsertar);
                        System.out.println("inserte primer nodo");
                    }
                }
                
                primerNodo= primerNodo.getAnterior();
                System.out.println("cambie primeroNodo");
            }
            
            nodoInsertar= nodoInsertar.getSiguiente();
//           System.out.println(nodoInsertar.getValor().getPersona().getNombre());
        }
        this.lista.getInicioNodo().setAnterior(this.lista.ultimoNodo);
        this.lista.getInicioNodo().setSiguiente(this.lista.inicioNodo);
        try{
            this.lista.generarArchivo(this.lista);
        }catch(Exception c){
            
        }
        
    }
    
}
