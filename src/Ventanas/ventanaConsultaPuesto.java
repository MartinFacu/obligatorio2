/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.util.ArrayList;
import zFuncionamiento.*;

public class ventanaConsultaPuesto extends javax.swing.JFrame {

    /**
     * Creates new form ventanaConsultaPuesto
     */
    public ventanaConsultaPuesto(Sistema unSistema) {
        initComponents();
        modelo=unSistema;
        cargarListasSinNada();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqTitConsutarPuesto = new javax.swing.JLabel();
        etiqPuestosConsutarPuesto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPuestosConsutarPuesto = new javax.swing.JList();
        spinnNivelConsutarPuesto = new javax.swing.JSpinner();
        etiqNivelConsutarPuesto = new javax.swing.JLabel();
        butConsularConsutarPuesto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etiqPostulantesConsutarPuesto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPostulantesConsutarPuesto = new javax.swing.JList();
        butCancelarConsutarPuesto = new javax.swing.JButton();
        butExportarConsutarPuesto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqTitConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitConsutarPuesto.setText("Consulta Puesto");

        etiqPuestosConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqPuestosConsutarPuesto.setText("Puestos");

        listPuestosConsutarPuesto.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPuestosConsutarPuesto);

        etiqNivelConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqNivelConsutarPuesto.setText("Nivel");

        butConsularConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butConsularConsutarPuesto.setText("Consultar");
        butConsularConsutarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConsularConsutarPuestoActionPerformed(evt);
            }
        });

        etiqPostulantesConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqPostulantesConsutarPuesto.setText("Postulantes");

        listPostulantesConsutarPuesto.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listPostulantesConsutarPuesto);

        butCancelarConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butCancelarConsutarPuesto.setText("Cancelar");

        butExportarConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butExportarConsutarPuesto.setText("Exportar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiqTitConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butCancelarConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butExportarConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(etiqPostulantesConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiqNivelConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnNivelConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(butConsularConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(etiqPuestosConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiqPuestosConsutarPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqNivelConsutarPuesto)
                    .addComponent(spinnNivelConsutarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butConsularConsutarPuesto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqPostulantesConsutarPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCancelarConsutarPuesto)
                    .addComponent(butExportarConsutarPuesto))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        setBounds(0, 0, 502, 693);
    }// </editor-fold>//GEN-END:initComponents

    private void butConsularConsutarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsularConsutarPuestoActionPerformed
        Puesto puestoSeleccionado=(Puesto) listPuestosConsutarPuesto.getSelectedValue();
        int nivel = (int) spinnNivelConsutarPuesto.getValue();
        ArrayList<Tematica> temasDelPuesto=puestoSeleccionado.getTemas();
        String formatoDelPuesto=puestoSeleccionado.getTipo();
        cargarListasFiltrados(temasDelPuesto, nivel, formatoDelPuesto);
    }//GEN-LAST:event_butConsularConsutarPuestoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelarConsutarPuesto;
    private javax.swing.JButton butConsularConsutarPuesto;
    private javax.swing.JButton butExportarConsutarPuesto;
    private javax.swing.JLabel etiqNivelConsutarPuesto;
    private javax.swing.JLabel etiqPostulantesConsutarPuesto;
    private javax.swing.JLabel etiqPuestosConsutarPuesto;
    private javax.swing.JLabel etiqTitConsutarPuesto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listPostulantesConsutarPuesto;
    private javax.swing.JList listPuestosConsutarPuesto;
    private javax.swing.JSpinner spinnNivelConsutarPuesto;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    
    public void cargarListasSinNada(){
        listPuestosConsutarPuesto.setListData(modelo.getPuestos().toArray());
        listPostulantesConsutarPuesto.setListData(modelo.getPostulantes().toArray());
    }
    public void cargarListasFiltrados(ArrayList<Tematica> temasParaFiltrar, int nivelAFiltrar, String formatoDelPuesto){
        ArrayList<Postulante> listaFiltroNivel= modelo.getPostulantesFiltradosPorNivel(temasParaFiltrar, nivelAFiltrar);
        //ArrayList<Postulante> listaFiltroFormato=modelo.getPostulantesFiltradosPorFormato(listaFiltroNivel, formatoDelPuesto);
        //ArrayList<Postulante> listaFiltroEntrevista=modelo.getPostulantesFiltradosPorEntrevista(listaFiltroFormato);
        
        
        
        listPostulantesConsutarPuesto.setListData(listaFiltroNivel.toArray());
        listPuestosConsutarPuesto.setListData(modelo.getPuestos().toArray());
    }
}
