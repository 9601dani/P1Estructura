/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.control;

import com.dani96.practica1estructura.main.Main;
import com.dani96.practica1estructura.objects.Apuesta;
import java.awt.FileDialog;
import java.io.FileWriter;
import java.io.IOException;
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

    public void setInicioNodo(Nodo inicioNodo) {
        this.inicioNodo = inicioNodo;
    }

    public void setUltimoNodo(Nodo ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    
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
        //                                                                       ----------------
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
    public int tamañoArreglo() {
        boolean leer = true;                                                    //O(1)
        int contador = 1;                                                       //O(1)
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA          //O(1)
            Nodo aux = inicioNodo.getSiguiente();                               //O(1)
            Nodo auxi = inicioNodo.getAnterior();                               //O(1)
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {        //O(1)
                leer=false;
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
        //JOptionPane.showMessageDialog(null,"imprimi "+ contador);
        return contador;
    }
     public void imprimirPuntos() {
        boolean leer = true;                                                    //O(1)
        int contador = 1; 
         System.out.println("si aqui padre");//O(1)
        if (empty() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA          //O(1)
            Nodo aux = inicioNodo.getSiguiente();                               //O(1)
            Nodo auxi = inicioNodo.getAnterior();                               //O(1)
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {        //O(1)
                leer=false;
            } else {                                                            //O(1)
                while (leer) {                                                  //O(n)--------->
                    if (aux != auxi) {                                          //O(1)
                       aux = aux.getSiguiente();                                //O(1)
                        contador++;                                             //O(1)
                    } else {                                                    //O(1)
                      leer = false;                                             //O(1)
                        contador++;                                             //O(1)
                    }                                                           //---------------   
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
        return  true;                                                    //--------------
    }                                                         //RESULTADO FINAL  1
    
    
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
        }                                                        //-------------------------
       // this.OrdenarResultados();
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
            String resultado = "Nombre Apostador,Monto Apostado,Puntos Conseguidos,Primer Lugar"+       //O(1)        
                    ",Segundo Lugar,Tercer Lugar,Cuarto Lugar, Quinto Lugar,Sexto Lugar,Septimo Lugar,Octavo Lugar"+
                    ",Noveno Lugar,Decimo Lugar\n";
            resultado += escribirArchivo(Main.listaError.getInicioNodo());
            writer.write(resultado);
            writer.close();
            JOptionPane.showMessageDialog(null, "Archivo guardado con éxito");
        }
    }
     public void generarArchivo(ListaCircularDoble lista) throws IOException {
        FileDialog guardar = null;                                                                      //O(1)
        guardar = new FileDialog(guardar, "Guardar como", FileDialog.SAVE);              //O(1)
        guardar.setVisible(true);                                                                     //O(1)
        guardar.dispose();                                                                              //O(1)    
        if (guardar.getFile() != null && guardar.getDirectory() != null) {                              //O(1)    
            FileWriter writer = new FileWriter(guardar.getDirectory() + guardar.getFile() + ".csv");    //O(1)
           String resultado = "Nombre Apostador,Monto Apostado,Puntos Conseguidos,Primer Lugar"+       //O(1)        
                    ",Segundo Lugar,Tercer Lugar,Cuarto Lugar, Quinto Lugar,Sexto Lugar,Septimo Lugar,Octavo Lugar"+
                    ",Noveno Lugar,Decimo Lugar\n";
            resultado += escribirArchivo(lista.getInicioNodo());                                    //O(n)--->    
            writer.write(resultado);                                                                 //O(1)           
            writer.close();                                                                             //O(1)    
            JOptionPane.showMessageDialog(null, "Archivo guardado con éxito");       //O(1)   
        }                                                                                     //-----------------------          
    }                                                                                           //RESULTADO  O(n)
    private String escribirArchivo(Nodo nodo) {
        Nodo tmp = nodo;                                                                                                            //O(1)
        String resultado = tmp.getValor().getPersona().getNombre() + "," + tmp.getValor().getMontoApuesta()+","                     //O(1)            
                + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]        //O(1)
                + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","                               //O(1)
                + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","                                     //O(1)    
                + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","                                    //O(1)         
                + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";                                   //O(1)
        tmp = tmp.getSiguiente();                                                                                                   //O(1)

        while (tmp!=nodo.getAnterior()) {                                                                                           //O(n)
            resultado += tmp.getValor().getPersona().getNombre() + "," + tmp.getValor().getMontoApuesta()+","                       //O(1)
                    + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]    //O(1)
                    + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","                           //O(1)    
                    + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","                                 //O(1)
                    + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","                                 //O(1)        
                    + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";                               //O(1)
            tmp = tmp.getSiguiente();                                                                                               //O(1)
        }
         resultado += tmp.getValor().getPersona().getNombre() + "," + tmp.getValor().getMontoApuesta()+","                         //O(1) 
                    + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]   //O(1)
                    + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","                          //O(1) 
                    + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","                                //O(1) 
                    + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","                                //O(1)     
                    + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";                              //O(1) 
        return resultado;                                                                                                          //O(1) 
    }                                                                                                                   //----------------------------------
                                                                                                                        //RESULTADO O(n)
    public void OrdenarResultados(){
        inicioNodo.setAnterior(null);                                                       //O(1)        
        ultimoNodo.setSiguiente(null);                                                     //O(1)
        Nodo aux=inicioNodo.getSiguiente();                                                       //O(1)      
        Nodo auxi=inicioNodo.getAnterior();                                                       //O(1)  
        while(aux!=null){                                                                         //O(n)--->          
            Nodo auxiE = aux.getAnterior();                                                       //O(1)
            while(auxiE!=null){                                                                   //O(n)--->  
                if(auxiE.getValor().getPuntos() > auxiE.getSiguiente().getValor().getPuntos()){   //O(1)
                    if (auxiE == inicioNodo) {                                                    //O(1)
                        Nodo pivot = auxiE.getSiguiente();                                        //O(1)
                        Nodo pivotR= auxiE;                                                       //O(1)
                        auxiE.setSiguiente(pivot.getSiguiente());                          //O(1)
                        auxiE.setAnterior(pivot);                                           //O(1)
                        pivot.getSiguiente().setAnterior(auxiE);                            //O(1)
                        pivot.setAnterior(null);                                            //O(1)
                        pivot.setSiguiente(auxiE);                                          //O(1)
                        inicioNodo=auxiE;                                                          //O(1) 
                    }else if(auxiE==ultimoNodo){                                                   //O(1)
                        Nodo pivot = auxiE.getSiguiente();                                        //O(1)
                        Nodo pivotR= auxiE;                                                       //O(1)
                        auxiE.getAnterior().setSiguiente(pivot);                           //O(1)
                        auxiE.setSiguiente(null);                                          //O(1) 
                        auxiE.setAnterior(pivot);                                           //O(1)
                        pivot.setAnterior(pivotR.getAnterior());                            //O(1)
                        pivot.setSiguiente(auxiE);                                          //O(1)         
                        ultimoNodo=auxiE;                                                          //O(1)      
                    }else{                                                                         //O(1)
                        Nodo pivot = auxiE.getSiguiente();                                         //O(1)
                        Nodo pivotR= auxiE;                                                        //O(1)
                        auxiE.getAnterior().setSiguiente(pivot);                           //O(1)
                        auxiE.setSiguiente(pivot.getSiguiente());                          //O(1)
                        auxiE.setAnterior(pivot);                                          //O(1)
                        pivot.getSiguiente().setAnterior(auxiE);                           //O(1)
                        pivot.setAnterior(pivotR.getAnterior());                           //O(1)
                        pivot.setSiguiente(auxiE);                                        //O(1)
                        auxiE=pivot.getAnterior();                                               //O(1)
                    }
                }else{
                    break;                                                                       //O(1)
                }
            }
            aux = aux.getSiguiente();                                                           //O(1)
        }
        inicioNodo.setAnterior(ultimoNodo);                                               //O(1)
        ultimoNodo.setSiguiente(inicioNodo);                                              //O(1)  
                                                                                    //----------------------------------
                                                                                      //RESULTADO O(n²)
                                                                                    
        
      /*  if(inicioNodo.getValor().getPuntos()>inicioNodo.getSiguiente().getValor().getPuntos()){
            Nodo piv=inicioNodo;
            inicioNodo.getSiguiente().setAnterior(piv.getAnterior());
                    inicioNodo.getSiguiente().setSiguiente(piv);
                    inicioNodo.getAnterior().setSiguiente(piv.getSiguiente());
                    inicioNodo.setAnterior(piv.getSiguiente());
                    inicioNodo.setSiguiente(piv.getSiguiente().getSiguiente());
                    inicioNodo.getSiguiente().getSiguiente().setAnterior(piv);
        }
        Nodo auxE;
        
        int contador=0;
        boolean en=false;
        for(int i=0;i<con;i++){
            auxE=aux;
            en=true;
            for(int j=0;j<con;j++){
                if(auxE.getValor().getPuntos()>auxE.getSiguiente().getValor().getPuntos()){
                    Nodo pivot= auxE;
                    auxE.getSiguiente().setAnterior(pivot.getAnterior());
                    auxE.getSiguiente().setSiguiente(pivot);
                    auxE.getAnterior().setSiguiente(pivot.getSiguiente());
                    auxE.setAnterior(pivot.getSiguiente());
                    auxE.setSiguiente(pivot.getSiguiente().getSiguiente());
                    auxE.getSiguiente().getSiguiente().setAnterior(pivot);
                }
                auxE=auxE.getAnterior(); 
            }
            System.out.println("ultimo ciclo");
            aux= aux.getSiguiente();
        }
        System.out.println("saliiii");*/
    }
    
    
    
    public void insertarInicio(Nodo nodoInsertar){
        if(ultimoNodo==nodoInsertar){
            nodoInsertar.getAnterior().setSiguiente(null);
            ultimoNodo= nodoInsertar.getAnterior();
        }else{
            nodoInsertar.getAnterior().setSiguiente(nodoInsertar.getSiguiente());
            nodoInsertar.getSiguiente().setAnterior(nodoInsertar.getAnterior());
        }
        inicioNodo.setAnterior(nodoInsertar);
        nodoInsertar.setSiguiente(inicioNodo);
        nodoInsertar.setAnterior(null);
        inicioNodo=nodoInsertar;
    }
    
    public void InsertarEntre(Nodo primeroNodo, Nodo segundoNodo, Nodo nodoInsertar){
        if(ultimoNodo== nodoInsertar){
            nodoInsertar.getAnterior().setSiguiente(null);
            ultimoNodo=nodoInsertar.getAnterior();
        }else{
            nodoInsertar.getAnterior().setSiguiente(nodoInsertar.getSiguiente());
            nodoInsertar.getSiguiente().setAnterior(nodoInsertar.getAnterior());
        }
        primeroNodo.setSiguiente(nodoInsertar);
        nodoInsertar.setAnterior(primeroNodo);
        segundoNodo.setAnterior(nodoInsertar);
        nodoInsertar.setSiguiente(segundoNodo);
    }
    

}
