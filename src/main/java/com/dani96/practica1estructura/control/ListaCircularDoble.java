/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.control;

import com.dani96.practica1estructura.main.Main;
import static com.dani96.practica1estructura.main.Main.lista;
import com.dani96.practica1estructura.objects.Apuesta;
import java.awt.FileDialog;
import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.Temporal;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private int[] resultados;
    private int contador;
    public static int contadorA;
    private boolean encontrado=false;

    public boolean empty() {
        return inicioNodo == null;
    }

    public Nodo getInicioNodo() {
        return inicioNodo;
    }

    public Nodo getUltimoNodo() {
        return ultimoNodo;
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
     public void imprimirPuntos() {
        boolean leer = true;                                                    //O(1)
        int contador = 1; 
         System.out.println("si aqui padre");//O(1)
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA          //O(1)
            System.out.println("nunca entreo");
            System.out.println(inicioNodo.getValor().getPersona().getNombre() + inicioNodo.getValor().getPuntos()+ inicioNodo.getValor().isValida());   
            Nodo aux = inicioNodo.getSiguiente();                               //O(1)
            Nodo auxi = inicioNodo.getAnterior();                               //O(1)
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {        //O(1)
                leer=false;
            } else {                                                            //O(1)
                while (leer) {                                                  //O(n)--------->
                    if (aux != auxi) {                                          //O(1)
                    System.out.println(aux.getValor().getPersona().getNombre() + aux.getValor().getPuntos()+ inicioNodo.getValor().isValida());           //O(1)
                        aux = aux.getSiguiente();                               //O(1)
                        contador++;                                             //O(1)
                    } else {                                                    //O(1)
                      System.out.println(aux.getValor().getPersona().getNombre() + aux.getValor().getPuntos()+ inicioNodo.getValor().isValida());   
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
            this.contador=0;                                                       //O(1) 
            this.apuesta=inicioNodo.getValor();                                    //O(1)                 
            this.caballos=inicioNodo.getValor().getCaballos();                     //O(1) 
            validacionApuesta();                                                   //O(1) 
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
        if (this.caballos[contador] > 10) {
            this.apuesta.setValida(false);
            encontado = true;
            
        }
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
    
    
    public ListaCircularDoble eliminar(){
        //REVISAR A FONDO
        boolean leer=true;
        ListaCircularDoble lis= new ListaCircularDoble();
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA          //O(1)
            Nodo aux = inicioNodo;                                              //O(1)
            Nodo auxi = inicioNodo.getAnterior();                               //O(1)    
            if(aux.getValor().isValida()==false){                               //O(1)
                Main.listaError.añadir(inicioNodo.getValor());             //O(1)
                aux.getSiguiente().setAnterior(aux.getAnterior());       //O(1)
                aux.getAnterior().setSiguiente(aux.getSiguiente());     //O(1)
                aux=aux.getSiguiente();                                         //O(1)        
            }else{
                lis.añadir(aux.getValor());                                //O(1)
                aux = aux.getSiguiente();                           //O(1)
            }
            if (inicioNodo == ultimoNodo.getSiguiente()) {                      //O(1)
                if(inicioNodo.getValor().isValida()==false){            //O(1)
                    inicioNodo.setAnterior(null);                   //O(1)
                    inicioNodo.setSiguiente(null);                 //O(1)
                    Main.listaError.añadir(aux.getValor());           //O(1)
                }
                leer=false;                                             //O(1)
            } else {                                                            //O(1)
                while (leer) {                                                  //O(n)-------> Unico O(n)
                    if (aux != auxi) {                                          //O(1)
                        if(aux.getValor().isValida()==true){                    //O(1)
                            lis.añadir(aux.getValor());                    //O(1) 
                            aux = aux.getSiguiente();                           //O(1)
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
                        }                                                       //O(1)
                    } else {                                                    //O(1)
                        if(aux.getValor().isValida()==false){                   //O(1)
                            Main.listaError.añadir(aux.getValor());        //O(1)
                            Nodo siguiente = aux.getSiguiente();                //O(1)
                            Nodo anterior = aux.getAnterior();                  //O(1)
                            aux.getAnterior().setSiguiente(siguiente);          //O(1)
                            aux.getSiguiente().setAnterior(anterior);           //O(1)
                        }else{
                            lis.añadir(aux.getValor());                   //O(1)
                        }  
                        leer = false;                                           //O(1)
                    }                                                     //---------------
                    //Resultado final n
                }
            }
        }else{
            System.out.println("NO HAY DATOS");
        }
        try{
        this.generarArchivo();
        
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null, "HEMOS TENIDO PROBLEMAS PARA GENERAR EL ARCHIVO");
        }
        return lis;
        
    }
    
    public void CalcularPuntos(int caballos[]){
        this.resultados= caballos;                                              //O(1)
        if(empty()==false){                                                     //O(1)
            Nodo aux = inicioNodo;                                              //O(1)
            Nodo auxi= inicioNodo.getAnterior();                                //O(1)            
                sumatioriaPuntos(aux.getValor());                        //O(1)  
                aux=aux.getSiguiente();                                         //O(1)
            while(aux!=auxi){                                                   //O(n)  ---->  
                sumatioriaPuntos(aux.getValor());                        //O(1)   
                aux=aux.getSiguiente();                                         //O(1)
            }
           if(inicioNodo==ultimoNodo){
               
           } else{
               sumatioriaPuntos(aux.getValor()); 
           }
            
           
        }                                                               //-------------------------
    }                                                              //RESULTADO:   n
    public void sumatioriaPuntos(Apuesta apuesta){
        for (int i = 0; i < 10; i++) {                                          //O(10)
            if(apuesta.getCaballos()[i]==this.resultados[i]){                   //O(1)
                apuesta.setPuntos(apuesta.getPuntos()+(10-i));                  //O(1)    
            }                                                             //-----------------   
        }                                                               //RESUTLADO 1
        
    }
    
    public void generarArchivo() throws IOException {
        FileDialog guardar = null;
        guardar = new FileDialog(guardar, "Guardar como", FileDialog.SAVE);
        guardar.setVisible(true);
        guardar.dispose();

        if (guardar.getFile() != null && guardar.getDirectory() != null) {
            FileWriter writer = new FileWriter(guardar.getDirectory() + guardar.getFile() + ".csv");
            String resultado = "";
            resultado += escribirArchivo(Main.listaError.getInicioNodo());
            writer.write(resultado);
            writer.close();
            JOptionPane.showMessageDialog(null, "Archivo guardado con éxito en la ruta:"
                    + "\n" + guardar.getDirectory(), "Infornación", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private String escribirArchivo(Nodo nodo) {
        Nodo tmp = nodo;
        String resultado = tmp.getValor().getPersona().getNombre() + "," + tmp.getValor().getMontoApuesta()
                + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]
                + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","
                + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","
                + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","
                + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";
        tmp = tmp.getSiguiente();

        while (tmp!=nodo.getAnterior()) {
            resultado += tmp.getValor().getPersona().getNombre() + "," + tmp.getValor().getMontoApuesta()
                    + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]
                    + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","
                    + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","
                    + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","
                    + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";
            tmp = tmp.getSiguiente();
        }
         resultado += tmp.getValor().getPersona().getNombre() + "," + tmp.getValor().getMontoApuesta()
                    + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]
                    + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","
                    + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","
                    + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","
                    + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";
        return resultado;
    }

}
