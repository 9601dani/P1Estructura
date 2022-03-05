/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.control;

import com.dani96.practica1estructura.main.Main;
import com.dani96.practica1estructura.objects.Apuesta;
import javax.swing.JOptionPane;

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
    public static int contadorA;
    private boolean encontrado=false;

    public boolean empty() {
        return inicioNodo == null;
    }

    public void añadir(Apuesta valor) {

        if (empty() == false) {                                                     //O(1)
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
    
    /*public void imprimirInicioFin() {
           int contador=0;
        if (empty() == false) {
            //System.out.println("NODO " + inicioNodo.getValor());
            contador++;
            Nodo aux = inicioNodo.getSiguiente();
            while (aux != inicioNodo) {
              //  System.out.println("NODO " + aux.getValor());
                aux = aux.getSiguiente();
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"imprimi "+ contador);
    }*/
    public void imprimirInicioFin() {
        boolean leer = true;                                                    //O(1)
        int contador = 1;                                                       //O(1)
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA          //O(1)
            //System.out.println("NODO " + inicioNodo.getValor());                //O(1)
            Nodo aux = inicioNodo.getSiguiente();                               //O(1)
            Nodo auxi = inicioNodo.getAnterior();                               //O(1)
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {        //O(1)
                leer=false;
                contador++;
                System.out.println("si entre vamossss");
            } else {                                                            //O(1)
                while (leer) {                                                  //O(n)--------->
                    if (aux != auxi) {                                          //O(1)
                     //   System.out.println("NODO " + aux.getValor());           //O(1)
                        aux = aux.getSiguiente();                               //O(1)
                        contador++;                                             //O(1)
                    } else {                                                    //O(1)
                      //  System.out.println("NODO " + aux.getValor());           //O(1)
                        leer = false;                                           //O(1)
                        contador++;                                             //O(1)
                    }                                                    //---------------   
                                                               //Resultado final O(n)
                }
            }

        }
        JOptionPane.showMessageDialog(null,"imprimi "+ contador);
    }
    
    public ListaCircularDoble analizarApuestas() {
        int contador=0;
        int contadorF=0;
        boolean leer = true;                                                       //O(1)
        boolean leerE = true;                                                      //O(1)
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA             //O(1)
            Nodo aux = inicioNodo.getSiguiente();                                  //O(1)
            Nodo auxi = inicioNodo.getAnterior();                                  //O(1)
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {           //O(1)
                this.apuesta = inicioNodo.getValor();                              //O(1)
                        this.contador=0;                                           //O(1)                 
                        this.caballos = this.apuesta.getCaballos();                //O(1)
                        validacionApuesta();                                       //O(1)                                               //O(1)
            } else {                                                               //O(1)
                while (leer) {                                                     //O(n)-------> Unico O(n)
                    if (aux != auxi) {                                             //O(1)
                        this.apuesta = aux.getValor();                             //O(1)
                        this.contador=0;                                           //O(1)                 
                        this.caballos = aux.getValor().getCaballos();              //O(1)
                        this.encontrado=false;                                     //O(1)
                        validacionApuesta();                                       //O(1)
                        aux = aux.getSiguiente();                                  //O(1)
                        this.apuesta=aux.getValor();                               //O(1)
                        contador++;                                                //O(1)
                    } else {                                                       //O(1)
                        this.apuesta = aux.getValor();                             //O(1)
                        this.contador=0;                                           //O(1)
                        this.caballos = aux.getValor().getCaballos();              //O(1)
                        this.encontrado=false;                                     //O(1)
                        validacionApuesta();                                       //O(1)
                        aux = aux.getSiguiente();                                  //O(1)
                        this.apuesta=aux.getValor();                               //O(1)
                        leer = false;                                              //O(1)
                        contador++;                                                //O(1)
                    }                                                             //---------------   
                                                                       //Resultado final n
                }
            }
        }
        return this.eliminar();

    }
    
    
    public void validacionApuesta() {
        boolean encontado=true;
        for (int i = (contador + 1); i < 10; i++) {                             //O(10)------->
            if (this.caballos[contador] == this.caballos[i]) {                  //O(1)
                this.apuesta.setValida(false);                            //O(1)
                encontado = true;                                               //O(1)
                break;                                                          //O(1)
            }else{                                                     
                 encontado=false;                                               //O(1)
            }
        }                                                                       //O(1)
        if (encontado == false) {                                               //O(1)
            this.contador++;                                                    //O(1)
             validacionApuesta();                                               //O(1)    
        }                                                                 //--------------
    }                                                        //RESULTADO FINAL     1
    
    
    public boolean validacionIngresoResultados(int[] array ) {
        boolean encontado=true;
        for (int i = (contadorA + 1); i < 10; i++) {                            //O(10)------->
            if (array[contadorA] == array[i]) {                                 //O(1)
                return false;                                                   //O(1)
            }else{                                                     
                 encontado=false;                                               //O(1)
            }
        }                                                                       
        if (encontado == false) {                                               //O(1)
            contadorA++;                                                        //O(1)
             validacionIngresoResultados(array);                                //O(1)    
        } 
        return  true;                                                       //--------------
    }                                                           //RESULTADO FINAL  1
    
    
    public ListaCircularDoble eliminar(){//REVISAR A FONDO
        boolean leer=true;
        ListaCircularDoble lis= new ListaCircularDoble();
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA          //O(1)
            System.out.println("ini"+inicioNodo.getAnterior().getValor());
            System.out.println("ini"+ultimoNodo.getValor());
            System.out.println("ini"+ultimoNodo.getSiguiente().getValor());
            Nodo aux = inicioNodo;                               //O(1)
            Nodo auxi = inicioNodo.getAnterior();
            if(inicioNodo.getValor().isValida()==false){
                 Main.listaError.añadir(inicioNodo.getValor());    //O(1)
                inicioNodo=inicioNodo.getSiguiente();
                ultimoNodo.setSiguiente(inicioNodo);
                aux=inicioNodo.getSiguiente();
            }else{
                lis.añadir(aux.getValor());
                            aux = aux.getSiguiente();
            }
            if (inicioNodo == ultimoNodo.getSiguiente()) {        //O(1)
                        if(inicioNodo.getValor().isValida()==false){            //O(1)
                         inicioNodo.setAnterior(null);                   //O(1)
                         inicioNodo.setSiguiente(null);                 //O(1)
                         Main.listaError.añadir(aux.getValor());    //O(1)
                        }                                                       
                        leer=false;                                             //O(1)
            } else {                                                            //O(1)
                while (leer) {                                                  //O(n)-------> Unico O(n)
                    if (aux != auxi) {                                          //O(1)
                        if(aux.getValor().isValida()==true){                    //O(1)
                            lis.añadir(aux.getValor());
                            aux = aux.getSiguiente();
                            System.out.println("sisisis");//O(1)
                            
                        }else{
                           if(aux.getAnterior() == aux.getSiguiente() ){        //O(1)
                                Main.listaError.añadir(aux.getValor());    //O(1)
                                aux.setAnterior(null);                  //O(1)
                                aux.setSiguiente(null);                 //O(1)
                                aux=aux.getSiguiente();                         //O(1)
                                
                            }else{
                               // System.out.println("19");
                                Main.listaError.añadir(aux.getValor());    //O(1)
                                Nodo siguiente = aux.getSiguiente();            //O(1)
                                Nodo anterior = aux.getAnterior();              //O(1)
                                aux.getAnterior().setSiguiente(siguiente);      //O(1)
                                aux.getSiguiente().setAnterior(anterior);       //O(1)
                                aux=aux.getSiguiente();                         //O(1)
                                
                            }
                         
                           // System.out.println("jijijiji");
                        }                                                       //O(1)
                    } else {                                                    //O(1)
                        if(aux.getValor().isValida()==false){                   //O(1)
                            Main.listaError.añadir(aux.getValor());    //O(1)
                            Nodo siguiente = aux.getSiguiente();                //O(1)
                            Nodo anterior = aux.getAnterior();                  //O(1)
                            aux.getAnterior().setSiguiente(siguiente);          //O(1)
                            aux.getSiguiente().setAnterior(anterior);           //O(1)
                            //aux=aux.getSiguiente(); 
                        }else{
                             lis.añadir(aux.getValor());
                            
                        }  
                        leer = false;                                           //O(1)
                    }                                                     //---------------   
                                                                       //Resultado final n
                }
            }
        }else{
            System.out.println("NO HAY DATOS");
        }
        return lis;
        
    }
}
