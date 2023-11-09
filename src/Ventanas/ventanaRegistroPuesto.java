
package Ventanas;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import zFuncionamiento.*;
public class ventanaRegistroPuesto extends javax.swing.JFrame implements Observer {

    public ventanaRegistroPuesto(Sistema unSistema) {
        initComponents();
        this.modelo=unSistema;
        temasElegidos = new ArrayList<>();
        cargarListas();
        modelo.addObserver(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesFormato = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etiqTitRegistroPuesto = new javax.swing.JLabel();
        etiqNombreRegistroPuesto = new javax.swing.JLabel();
        txtNombreRegistroPuesto = new javax.swing.JTextField();
        radbutRemotoRegistroPuesto = new javax.swing.JRadioButton();
        etiqFormatoRegistroPuesto = new javax.swing.JLabel();
        radbutPresencialRegistroPuesto = new javax.swing.JRadioButton();
        radbutMixtoRegistroPuesto = new javax.swing.JRadioButton();
        etiqTemasPosRegistroPuesto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTemasPosiblesRegistroPuesto = new javax.swing.JList();
        etiqTemasElegRegistroPuesto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTemasElegidosRegistroPuesto = new javax.swing.JList();
        butAgregarRegistroPuesto = new javax.swing.JButton();
        butEliminarRegistroPuesto = new javax.swing.JButton();
        butCancelarRegistroPuesto = new javax.swing.JButton();
        butAplicarRegistroPuesto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqTitRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitRegistroPuesto.setText("Registro de puesto");

        etiqNombreRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqNombreRegistroPuesto.setText("Nombre:");

        txtNombreRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        grupoBotonesFormato.add(radbutRemotoRegistroPuesto);
        radbutRemotoRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radbutRemotoRegistroPuesto.setText("Remoto");

        etiqFormatoRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqFormatoRegistroPuesto.setText("Formato:");

        grupoBotonesFormato.add(radbutPresencialRegistroPuesto);
        radbutPresencialRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radbutPresencialRegistroPuesto.setText("Presencial");

        grupoBotonesFormato.add(radbutMixtoRegistroPuesto);
        radbutMixtoRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radbutMixtoRegistroPuesto.setText("Mixto");
        radbutMixtoRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutMixtoRegistroPuestoActionPerformed(evt);
            }
        });

        etiqTemasPosRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqTemasPosRegistroPuesto.setText("Temas Posibles:");

        listTemasPosiblesRegistroPuesto.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTemasPosiblesRegistroPuesto);

        etiqTemasElegRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqTemasElegRegistroPuesto.setText("Temas Elegidos:");

        listTemasElegidosRegistroPuesto.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listTemasElegidosRegistroPuesto);

        butAgregarRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butAgregarRegistroPuesto.setText("Agregar");
        butAgregarRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarRegistroPuestoActionPerformed(evt);
            }
        });

        butEliminarRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butEliminarRegistroPuesto.setText("Eliminar");
        butEliminarRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEliminarRegistroPuestoActionPerformed(evt);
            }
        });

        butCancelarRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butCancelarRegistroPuesto.setText("Cancelar");

        butAplicarRegistroPuesto.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butAplicarRegistroPuesto.setText("Aplicar");
        butAplicarRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAplicarRegistroPuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqTemasElegRegistroPuesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqTemasPosRegistroPuesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiqNombreRegistroPuesto)
                                    .addComponent(etiqFormatoRegistroPuesto))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radbutRemotoRegistroPuesto)
                                        .addGap(18, 18, 18)
                                        .addComponent(radbutPresencialRegistroPuesto)
                                        .addGap(18, 18, 18)
                                        .addComponent(radbutMixtoRegistroPuesto))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etiqTitRegistroPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                        .addComponent(txtNombreRegistroPuesto)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butCancelarRegistroPuesto)
                        .addGap(255, 255, 255)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butAplicarRegistroPuesto)
                    .addComponent(butAgregarRegistroPuesto)
                    .addComponent(butEliminarRegistroPuesto))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitRegistroPuesto)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqNombreRegistroPuesto)
                    .addComponent(txtNombreRegistroPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqFormatoRegistroPuesto)
                    .addComponent(radbutRemotoRegistroPuesto)
                    .addComponent(radbutPresencialRegistroPuesto)
                    .addComponent(radbutMixtoRegistroPuesto))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqTemasPosRegistroPuesto)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(butAgregarRegistroPuesto)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(etiqTemasElegRegistroPuesto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(butEliminarRegistroPuesto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCancelarRegistroPuesto)
                    .addComponent(butAplicarRegistroPuesto))
                .addGap(96, 96, 96))
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

        setBounds(0, 0, 566, 495);
    }// </editor-fold>//GEN-END:initComponents

    private void radbutMixtoRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutMixtoRegistroPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radbutMixtoRegistroPuestoActionPerformed

    private void butAgregarRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarRegistroPuestoActionPerformed
        Tematica temaElegido = (Tematica) listTemasPosiblesRegistroPuesto.getSelectedValue();
        this.temasElegidos.add(temaElegido);
        cargarListas();
    }//GEN-LAST:event_butAgregarRegistroPuestoActionPerformed

    private void butEliminarRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEliminarRegistroPuestoActionPerformed
        Tematica temaElegidoAEliminar = (Tematica) listTemasElegidosRegistroPuesto.getSelectedValue();
        this.temasElegidos.remove(temaElegidoAEliminar);
        cargarListas();
    }//GEN-LAST:event_butEliminarRegistroPuestoActionPerformed

    private void butAplicarRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAplicarRegistroPuestoActionPerformed
        String nombre = txtNombreRegistroPuesto.getText();
        String formato="";
        if (radbutMixtoRegistroPuesto.isSelected()){
            formato = "Mixto";
        }else{
            if(radbutPresencialRegistroPuesto.isSelected()){
                formato = "Presencial";
            }else{
                formato = "Remoto";
            }
        }
        Puesto nuevoPuesto = new Puesto(nombre, formato, this.temasElegidos);
        modelo.agregarPuesto(nuevoPuesto);
        JOptionPane.showMessageDialog(null,"Entrevista agregada","Info", 1);
        limpiarCampos();
    }//GEN-LAST:event_butAplicarRegistroPuestoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAgregarRegistroPuesto;
    private javax.swing.JButton butAplicarRegistroPuesto;
    private javax.swing.JButton butCancelarRegistroPuesto;
    private javax.swing.JButton butEliminarRegistroPuesto;
    private javax.swing.JLabel etiqFormatoRegistroPuesto;
    private javax.swing.JLabel etiqNombreRegistroPuesto;
    private javax.swing.JLabel etiqTemasElegRegistroPuesto;
    private javax.swing.JLabel etiqTemasPosRegistroPuesto;
    private javax.swing.JLabel etiqTitRegistroPuesto;
    private javax.swing.ButtonGroup grupoBotonesFormato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listTemasElegidosRegistroPuesto;
    private javax.swing.JList listTemasPosiblesRegistroPuesto;
    private javax.swing.JRadioButton radbutMixtoRegistroPuesto;
    private javax.swing.JRadioButton radbutPresencialRegistroPuesto;
    private javax.swing.JRadioButton radbutRemotoRegistroPuesto;
    private javax.swing.JTextField txtNombreRegistroPuesto;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private ArrayList<Tematica> temasElegidos;
    
    public void cargarListas(){
        listTemasPosiblesRegistroPuesto.setListData(modelo.getTematicas().toArray());
        listTemasElegidosRegistroPuesto.setListData(this.temasElegidos.toArray());
    }
    
    private void limpiarCampos() {                                                        
        txtNombreRegistroPuesto.setText("");
    }

    @Override
    public void update(Observable o, Object arg) {
        cargarListas();
    }
    
}
