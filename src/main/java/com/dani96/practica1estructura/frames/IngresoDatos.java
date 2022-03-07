/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dani96.practica1estructura.frames;

import com.dani96.practica1estructura.control.ListaCircularDoble;
import static com.dani96.practica1estructura.main.Main.lista;
import com.dani96.practica1estructura.objects.Apostador;
import com.dani96.practica1estructura.objects.Apuesta;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class IngresoDatos extends javax.swing.JFrame {

    /**
     * Creates new form IngresoDatos
     */
    public IngresoDatos() {
        initComponents();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combo2 = new javax.swing.JComboBox<>();
        combo3 = new javax.swing.JComboBox<>();
        combo4 = new javax.swing.JComboBox<>();
        combo5 = new javax.swing.JComboBox<>();
        combo8 = new javax.swing.JComboBox<>();
        combo10 = new javax.swing.JComboBox<>();
        combo6 = new javax.swing.JComboBox<>();
        combo7 = new javax.swing.JComboBox<>();
        combo9 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        montoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("INGRESO DE APUESTAS:");

        jLabel2.setText("Nombre Apostador");

        jButton1.setText("Ingresar Apuesta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));

        combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));

        combo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        combo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo4ActionPerformed(evt);
            }
        });

        combo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        combo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo5ActionPerformed(evt);
            }
        });

        combo8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));

        combo10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        combo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo10ActionPerformed(evt);
            }
        });

        combo6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));

        combo7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));

        combo9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        combo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo9ActionPerformed(evt);
            }
        });

        jLabel3.setText("Monto");

        jLabel4.setText("1er Lugar");

        jLabel5.setText("2do Lugar");

        jLabel6.setText("3er Lugar");

        jLabel7.setText("4to Lugar");

        jLabel8.setText("5to Lugar");

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));

        jLabel9.setText("6to Lugar");

        jLabel10.setText("7mo Lugar");

        jLabel11.setText("8vo Lugar");

        jLabel12.setText("9no Lugar");

        jLabel13.setText("10mo Lugar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(combo5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(montoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(combo10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combo9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(montoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(combo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(combo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(combo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(combo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(combo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(combo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(combo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            int[] caballos = new int[10];
            caballos[0] = combo1.getSelectedIndex() + 1;
            caballos[1] = combo2.getSelectedIndex() + 1;
            caballos[2] = combo3.getSelectedIndex() + 1;
            caballos[3] = combo4.getSelectedIndex() + 1;
            caballos[4] = combo5.getSelectedIndex() + 1;
            caballos[5] = combo6.getSelectedIndex() + 1;
            caballos[6] = combo7.getSelectedIndex() + 1;
            caballos[7] = combo8.getSelectedIndex() + 1;
            caballos[8] = combo9.getSelectedIndex() + 1;
            caballos[9] = combo10.getSelectedIndex() + 1;
            lista.añadir(new Apuesta(new Apostador(nameText.getText()), Double.parseDouble(montoText.getText()), caballos));
            JOptionPane.showMessageDialog(null, "Hemos Ingresado la apuesta");
            this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo4ActionPerformed

    private void combo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo5ActionPerformed

    private void combo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo9ActionPerformed

    private void combo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo10ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo10;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JComboBox<String> combo4;
    private javax.swing.JComboBox<String> combo5;
    private javax.swing.JComboBox<String> combo6;
    private javax.swing.JComboBox<String> combo7;
    private javax.swing.JComboBox<String> combo8;
    private javax.swing.JComboBox<String> combo9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField montoText;
    private javax.swing.JTextField nameText;
    // End of variables declaration//GEN-END:variables
}
