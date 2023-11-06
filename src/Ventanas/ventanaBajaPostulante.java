/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import javax.swing.JOptionPane;
import zFuncionamiento.*;

/**
 *
 * @author santi
 */
public class ventanaBajaPostulante extends javax.swing.JFrame {

    /**
     * Creates new form ventanaBajaPostulante
     */
    public ventanaBajaPostulante(Sistema unSistema) {
        initComponents();
        this.modelo=unSistema;
        listPostulantesBajaPostulante.setListData(modelo.getPostulantes().toArray());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqTitBajaPostulante = new javax.swing.JLabel();
        etiqPostulantesBajaPostulante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPostulantesBajaPostulante = new javax.swing.JList();
        butCancelarBajaPostulante = new javax.swing.JButton();
        butAplicarBajaPostulante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqTitBajaPostulante.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitBajaPostulante.setText("Baja Postulante");

        etiqPostulantesBajaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqPostulantesBajaPostulante.setText("Postulantes");

        listPostulantesBajaPostulante.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPostulantesBajaPostulante);

        butCancelarBajaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butCancelarBajaPostulante.setText("Cancelar");
        butCancelarBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarBajaPostulanteActionPerformed(evt);
            }
        });

        butAplicarBajaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butAplicarBajaPostulante.setText("Aplicar");
        butAplicarBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAplicarBajaPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(etiqTitBajaPostulante))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqPostulantesBajaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(butCancelarBajaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butAplicarBajaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitBajaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(etiqPostulantesBajaPostulante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCancelarBajaPostulante)
                    .addComponent(butAplicarBajaPostulante))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 421, 413);
    }// </editor-fold>//GEN-END:initComponents

    private void butCancelarBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarBajaPostulanteActionPerformed
        this.dispose();
    }//GEN-LAST:event_butCancelarBajaPostulanteActionPerformed

    private void butAplicarBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAplicarBajaPostulanteActionPerformed
        Postulante postulanteSeleccionado = (Postulante) listPostulantesBajaPostulante.getSelectedValue();
        modelo.eliminarUnPostulante(postulanteSeleccionado);
        JOptionPane.showMessageDialog(null,"Postulante eliminado","Info", 1);
        listPostulantesBajaPostulante.setListData(modelo.getPostulantes().toArray());
    }//GEN-LAST:event_butAplicarBajaPostulanteActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAplicarBajaPostulante;
    private javax.swing.JButton butCancelarBajaPostulante;
    private javax.swing.JLabel etiqPostulantesBajaPostulante;
    private javax.swing.JLabel etiqTitBajaPostulante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listPostulantesBajaPostulante;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    
}
