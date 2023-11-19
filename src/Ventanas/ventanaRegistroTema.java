package Ventanas;

import javax.swing.JOptionPane;
import zFuncionamiento.*;

public class ventanaRegistroTema extends javax.swing.JFrame {

    public ventanaRegistroTema(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqTituloRegTematica = new javax.swing.JLabel();
        etiqNombreRegTematica = new javax.swing.JLabel();
        etiqDescripcionRegTematica = new javax.swing.JLabel();
        txtNombreRegTematica = new javax.swing.JTextField();
        txtDescripcionRegTematica = new javax.swing.JTextField();
        butCancelarRegTematica = new javax.swing.JButton();
        butRegistrarRegTematica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        etiqTituloRegTematica.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTituloRegTematica.setText("Registro de tematica");
        jPanel1.add(etiqTituloRegTematica);
        etiqTituloRegTematica.setBounds(170, 20, 270, 30);

        etiqNombreRegTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqNombreRegTematica.setText("Nombre:");
        jPanel1.add(etiqNombreRegTematica);
        etiqNombreRegTematica.setBounds(10, 80, 80, 24);

        etiqDescripcionRegTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqDescripcionRegTematica.setText("Descripcion:");
        jPanel1.add(etiqDescripcionRegTematica);
        etiqDescripcionRegTematica.setBounds(10, 160, 110, 30);

        txtNombreRegTematica.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jPanel1.add(txtNombreRegTematica);
        txtNombreRegTematica.setBounds(162, 80, 400, 40);

        txtDescripcionRegTematica.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jPanel1.add(txtDescripcionRegTematica);
        txtDescripcionRegTematica.setBounds(163, 150, 400, 120);

        butCancelarRegTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butCancelarRegTematica.setText("Cancelar");
        butCancelarRegTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarRegTematicaActionPerformed(evt);
            }
        });
        jPanel1.add(butCancelarRegTematica);
        butCancelarRegTematica.setBounds(50, 290, 120, 40);

        butRegistrarRegTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butRegistrarRegTematica.setText("Registrar");
        butRegistrarRegTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegistrarRegTematicaActionPerformed(evt);
            }
        });
        jPanel1.add(butRegistrarRegTematica);
        butRegistrarRegTematica.setBounds(410, 290, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 370);

        setBounds(0, 0, 615, 401);
    }// </editor-fold>//GEN-END:initComponents

    private void butRegistrarRegTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegistrarRegTematicaActionPerformed
        String descripcion = txtDescripcionRegTematica.getText();
        String nombre = txtNombreRegTematica.getText();
        if(!descripcion.isEmpty() && !nombre.isEmpty()){
            System.out.println(descripcion);
            System.out.println(nombre);
        Tematica tema = new Tematica(nombre, descripcion);
        modelo.agregarUnaTematica(tema);
        JOptionPane.showMessageDialog(null, "Tema agregado", "Info", 1);
        limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(null, "Complete ambos campos por favor ", "Error", 0);
        }
    }//GEN-LAST:event_butRegistrarRegTematicaActionPerformed

    private void butCancelarRegTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarRegTematicaActionPerformed
        this.dispose();
    }//GEN-LAST:event_butCancelarRegTematicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelarRegTematica;
    private javax.swing.JButton butRegistrarRegTematica;
    private javax.swing.JLabel etiqDescripcionRegTematica;
    private javax.swing.JLabel etiqNombreRegTematica;
    private javax.swing.JLabel etiqTituloRegTematica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescripcionRegTematica;
    private javax.swing.JTextField txtNombreRegTematica;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    private void limpiarCampos() {
        txtDescripcionRegTematica.setText("");
        txtNombreRegTematica.setText("");
    }
}
