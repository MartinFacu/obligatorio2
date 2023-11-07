package Ventanas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import zFuncionamiento.*;

public class ventanaConsultaPuesto extends javax.swing.JFrame implements Observer {

    public ventanaConsultaPuesto(Sistema unSistema) {
        initComponents();
        modelo=unSistema;
        cargarListasSinNada();
        modelo.addObserver(this);
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
        butCancelarConsutarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarConsutarPuestoActionPerformed(evt);
            }
        });

        butExportarConsutarPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butExportarConsutarPuesto.setText("Exportar");
        butExportarConsutarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExportarConsutarPuestoActionPerformed(evt);
            }
        });

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
                .addContainerGap(428, Short.MAX_VALUE))
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
                .addGap(0, 38, Short.MAX_VALUE))
        );

        setBounds(0, 0, 881, 697);
    }// </editor-fold>//GEN-END:initComponents

    private void butConsularConsutarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsularConsutarPuestoActionPerformed
        Puesto puestoSeleccionado=(Puesto) listPuestosConsutarPuesto.getSelectedValue();
        int nivel = (int) spinnNivelConsutarPuesto.getValue();
        ArrayList<Tematica> temasDelPuesto=puestoSeleccionado.getTemas();
        String formatoDelPuesto=puestoSeleccionado.getTipo();
        puestoSeleccionadoGeneral = puestoSeleccionado;
        cargarListasFiltrados(temasDelPuesto, nivel, formatoDelPuesto);
    }//GEN-LAST:event_butConsularConsutarPuestoActionPerformed

    private void butExportarConsutarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExportarConsutarPuestoActionPerformed
        
        
        try {
            FileWriter fr = new FileWriter("ConsultaPuesto.txt");
            Formatter arch = new Formatter(fr);
            arch.format("%s%n",puestoSeleccionadoGeneral+" :");
            int i=0;
            for(Postulante pos : postulantesFiltrados){
                i++;
                arch.format("%s%n",i+") "+pos);
            }
            arch.close();
        } catch (IOException ex) {
            System.out.println("No puedo crear el archivo");
        }
    }//GEN-LAST:event_butExportarConsutarPuestoActionPerformed

    private void butCancelarConsutarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarConsutarPuestoActionPerformed
        this.dispose();
    }//GEN-LAST:event_butCancelarConsutarPuestoActionPerformed

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
    private ArrayList<Postulante> postulantesFiltrados;
    private Puesto puestoSeleccionadoGeneral;
    
    public void cargarListasSinNada(){
        listPuestosConsutarPuesto.setListData(modelo.getPuestos().toArray());
        listPostulantesConsutarPuesto.setListData(modelo.getPostulantes().toArray());
    }
    public void cargarListasFiltrados(ArrayList<Tematica> temasParaFiltrar, int nivelAFiltrar, String formatoDelPuesto){
        ArrayList<Postulante> listaFiltroNivel= modelo.getPostulantesFiltradosPorNivel(temasParaFiltrar, nivelAFiltrar);
        System.out.println("Luego de ser filtrados por el nivel y tematica : ");
        listasMuestra (listaFiltroNivel);
        ArrayList<Postulante> listaFiltroFormato=modelo.getPostulantesFiltradosPorFormato(listaFiltroNivel, formatoDelPuesto);
        System.out.println("Luego de ser filtrados por formato : ");
        listasMuestra (listaFiltroFormato);
        ArrayList<Postulante> listaFiltroEntrevista=modelo.getPostulantesFiltradosPorEntrevista(listaFiltroFormato);
        System.out.println("Luego de ser filtrados por entrevistas : ");
        listasMuestra (listaFiltroEntrevista);
        ArrayList<Postulante> listaFiltroFinal=modelo.getPostulantesFiltradosPorEntrevistaPuntaje(listaFiltroEntrevista);
        System.out.println("Luego de ser filtrados por puntaje en entrevistas : ");
        listasMuestra (listaFiltroFinal);
        listPostulantesConsutarPuesto.setListData(listaFiltroFinal.toArray());
        postulantesFiltrados = listaFiltroFinal;
        listPuestosConsutarPuesto.setListData(modelo.getPuestos().toArray());
    }
    
    public void listasMuestra (ArrayList<Postulante> lista){
        for(Postulante pos : lista){
            System.out.println(pos);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
