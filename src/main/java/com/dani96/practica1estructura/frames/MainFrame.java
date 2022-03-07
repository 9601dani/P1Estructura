/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dani96.practica1estructura.frames;

import com.dani96.practica1estructura.control.ArchivoEntrada;
import com.dani96.practica1estructura.control.ControlCaballo;
import com.dani96.practica1estructura.control.ListaCircularDoble;
import com.dani96.practica1estructura.main.Main;
import static com.dani96.practica1estructura.main.Main.apuestas;
import static com.dani96.practica1estructura.main.Main.lista;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class MainFrame extends javax.swing.JFrame {

    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this. setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFinal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        IngresoApuesta = new javax.swing.JMenuItem();
        IngresoResultado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        SubirArchivo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        CerrarApuesta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelFinalLayout = new javax.swing.GroupLayout(PanelFinal);
        PanelFinal.setLayout(PanelFinalLayout);
        PanelFinalLayout.setHorizontalGroup(
            PanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        PanelFinalLayout.setVerticalGroup(
            PanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jMenu1.setText("Ingresos");
        jMenu1.setAutoscrolls(true);
        jMenu1.setRolloverEnabled(true);
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        IngresoApuesta.setText("Ingresar Apuesta");
        IngresoApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoApuestaActionPerformed(evt);
            }
        });
        jMenu1.add(IngresoApuesta);

        IngresoResultado.setText("Ingresar Resultado");
        IngresoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoResultadoActionPerformed(evt);
            }
        });
        jMenu1.add(IngresoResultado);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Subir Archivo");

        SubirArchivo.setText("Archivo Entrada");
        SubirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirArchivoActionPerformed(evt);
            }
        });
        jMenu2.add(SubirArchivo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cerrar Apuestas");

        CerrarApuesta.setText("Cerrar Apuestas");
        CerrarApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarApuestaActionPerformed(evt);
            }
        });
        jMenu3.add(CerrarApuesta);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void IngresoApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoApuestaActionPerformed
        // TODO add your handling code here:
        if (apuestas == true) {
            IngresoDatos ingreso = new IngresoDatos();
            ingreso.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Apuestas Cerradas");
        }

    }//GEN-LAST:event_IngresoApuestaActionPerformed

    private void IngresoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoResultadoActionPerformed
        // TODO add your handling code here:
        IngresoResultado IR= new IngresoResultado();
        IR.setVisible(true);
    }//GEN-LAST:event_IngresoResultadoActionPerformed

    private void SubirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirArchivoActionPerformed
        // TODO add your handling code here:
        if (apuestas == true) {
            ArchivoEntrada archE = new ArchivoEntrada();
            String[] cadena = archE.SubirArchivo(this);
            ListaCircularDoble liso= new ListaCircularDoble();
            ListaCircularDoble lisoE= new ListaCircularDoble();
            ControlCaballo cc = new ControlCaballo();
            Main.listaError=lisoE;
            lista = cc.validacionCaballos(cadena, liso);
            int Datos=lista.tamañoArreglo();
            JOptionPane.showMessageDialog(null,"Se ingresaron "+ Datos+" filas");
        }else{
            JOptionPane.showMessageDialog(null, "ACTUALMENTE ESTAN CERRADAS LAS APUESTAS");
        }
        
    }//GEN-LAST:event_SubirArchivoActionPerformed

    private void CerrarApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarApuestaActionPerformed
        // TODO add your handling code here:
        apuestas=false;                                                //O(n)     
        JOptionPane.showMessageDialog(null, "Hemos analizado las apuestas, recuerda ingresar los resultado\n"+
                                                         "no olvides ingresar los resultados");          
                                               //O(n)
        JOptionPane.showMessageDialog(null, "\tA Continuacion te enviamos el archivo\n\tde las apuestas que han tenido errores y\n\tno se han tomado en cuenta");
        lista=lista.analizarApuestas();
        lista.tamañoArreglo();                                      //O(n)
        Main.listaError.tamañoArreglo();
                                                                //----------------
                                                                        //n
    }//GEN-LAST:event_CerrarApuestaActionPerformed
    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CerrarApuesta;
    private javax.swing.JMenuItem IngresoApuesta;
    private javax.swing.JMenuItem IngresoResultado;
    public static javax.swing.JPanel PanelFinal;
    private javax.swing.JMenuItem SubirArchivo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
