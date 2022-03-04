/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dani96.practica1estructura.objects;

/**
 *
 * @author daniel
 */
public class Apuesta {
    private Apostador persona;
    private double montoApuesta;
    private int[] caballos= new int[10];
    private int puntos;
    private boolean valida;
    

    public Apuesta(Apostador persona, double montoApuesta, int[] caballos) {
        this.persona = persona;
        this.montoApuesta = montoApuesta;
        this.caballos = caballos;
        this.puntos=0;
        this.valida=true;
    }

    public Apuesta(Apostador persona, double montoApuesta, int puntos, boolean valida) {
        this.persona = persona;
        this.montoApuesta = montoApuesta;
        this.puntos = puntos;
        this.valida = valida;
    }
    

    public Apostador getPersona() {
        return persona;
    }

    public void setPersona(Apostador persona) {
        this.persona = persona;
    }

    public double getMontoApuesta() {
        return montoApuesta;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean isValida() {
        return valida;
    }
    
    public void setMontoApuesta(double montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    public int[] getCaballos() {
        return caballos;
    }

    public void setCaballos(int[] caballos) {
        this.caballos = caballos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }
    
    

    @Override
    public String toString() {
        return  "Nombre Apostador: " + persona .getNombre()
                + ", montoApuesta: Q." + montoApuesta + ", Ordenamiento De Caballos Escogida: \n" + getListCaballos(this)
                + "\n Apuesta: "+ isValida();
    }
    
    public String getListCaballos(Apuesta name){
        String list="";
        for (int i = 0; i < 10; i++) {
            list+=(i+1)+". "+name.caballos[i]+"\n";
        }
        return list;
    }

    
    
    
}
