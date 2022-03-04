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
    private Apuesta apuesta;
    private int[] caballos;
    private int contador;
    private int contadorA;

    public boolean empty() {
        return inicioNodo == null;
    }

    public void añadir(Apuesta valor) {

        if (empty() == false) {                                                      //O(1)
            Nodo nuevo = new Nodo(ultimoNodo, inicioNodo, valor);    //O(1)
            ultimoNodo.setSiguiente(nuevo);                                 //O(1)
            inicioNodo.setAnterior(nuevo);                                   //O(1)
            ultimoNodo = nuevo;                                                     //O(1)
        }
        if (empty()) {                                                              //O(1)
            Nodo nuevo = new Nodo(ultimoNodo, inicioNodo, valor);   //O(1)
            inicioNodo = nuevo;                                                    //O(1)
            ultimoNodo = nuevo;                                                    //O(1)
        }
        tamaño++;                                                                  //O(1)
        // System.out.println("tamaño = " + tamaño);                         ----------------
                                                                            //RESULTADO: O(1)

    }
    public void imprimirInicioFin() {
        boolean leer = true;                                                       //O(1)
        int contador = 0;                                                          //O(1)
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA             //O(1)
            System.out.println("NODO " + inicioNodo.getValor());                  //O(1)
            Nodo aux = inicioNodo.getSiguiente();                                 //O(1)
            Nodo auxi = inicioNodo.getAnterior();                                 //O(1)
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {             //O(1)

            } else {                                                               //O(1)
                while (leer) {                                                     //O(n)
                    if (aux != auxi) {                                                   //O(1)
                        System.out.println("NODO " + aux.getValor());                 //O(1)
                        aux = aux.getSiguiente();                                    //O(1)
                        contador++;                                                  //O(1)
                    } else {                                                           //O(1)
                        System.out.println("NODO " + aux.getValor());                 //O(1)
                        leer = false;                                                  //O(1)
                        contador++;                                                  //O(1)
                    }                                                             //---------------   
                                                                             //Resultado final O(n)
                }
            }

        }
        System.out.println("-------- " + (contador + 1));                           //O(n)
    }
    
    public void analizarApuestas() {

        boolean leer = true;                                                       //O(1)
        int contador = 0;                                                          //O(1)
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA             //O(1)
            Nodo aux = inicioNodo.getSiguiente();                                  //O(1)
            Nodo auxi = inicioNodo.getAnterior();                                  //O(1)
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {           //O(1)
                System.out.println("FINALICEEEEE");
            } else {                                                               //O(1)
                while (leer) {                                                     //O(n)------->
                    if (aux != auxi) {                                             //O(1)
                        this.apuesta = aux.getValor();                      //O(1)
                        this.contador=0;                                           //O(1)                 
                        this.caballos = aux.getValor().getCaballos();       //O(1)
                        validacionApuesta();                                       //O(1)
                        aux = aux.getSiguiente();                                  //O(1)
                        this.apuesta=aux.getValor();
                        contador++;                                                //O(1)
                    } else {                                                       //O(1)
                        this.apuesta = aux.getValor();                             //O(1)
                        this.contador=0;                                           //O(1)
                        this.caballos = aux.getValor().getCaballos();             //O(1)
                        validacionApuesta();                                       //O(1)
                        aux = aux.getSiguiente();                                  //O(1)
                        this.apuesta=aux.getValor();
                        leer = false;                                              //O(1)
                        contador++;                                                //O(1)
                    }                                                             //---------------   
                                                                       //Resultado final O(n)
                }
            }

        }

    }
    public void validacionApuesta(){
        for (int i = (contador+1); i <(10-contador) ; i++) {                    //O(10)------->
            if(this.caballos[contador] == this.caballos[i]){                    //O(1)
                if(contador==8){
                    this.contador=0;
                    break;
                }
                this.apuesta.setValida(false);                            //O(1)
                break;                                                          //O(1)
            }else{                                                              //O(1)
                this.contador++;                                                //O(1)
                validacionApuesta();                                            //O(1)
            }                                                               //--------------
        }                                                       //RESULTADO FINAL O(1)
    }

}
