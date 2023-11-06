package Ventanas;
import java.util.HashMap;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import zFuncionamiento.*;
public class ventanaAltaPostulante extends javax.swing.JFrame {


    public ventanaAltaPostulante(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etiqNombreAltaPostulante = new javax.swing.JLabel();
        etiqTitAltaPostulante = new javax.swing.JLabel();
        etiqCedulaAltaPostulante = new javax.swing.JLabel();
        etiqDireccionAltaPostulante = new javax.swing.JLabel();
        etiqTelefonoAltaPostulante = new javax.swing.JLabel();
        etiqMailAltaPostulante = new javax.swing.JLabel();
        etiqLinkedinAltaPostulante = new javax.swing.JLabel();
        txtMailAltaPostulante = new javax.swing.JTextField();
        etiqFormatoAltaPostulante = new javax.swing.JLabel();
        txtNombreAltaPostulante = new javax.swing.JTextField();
        txtCedulaAltaPostulante = new javax.swing.JTextField();
        txtDireccionAltaPostulante = new javax.swing.JTextField();
        txtTelefonoAltaPostulante = new javax.swing.JTextField();
        txtLinkedinAltaPostulante = new javax.swing.JTextField();
        radbutRemotoAltaPostulante = new javax.swing.JRadioButton();
        radbutPresencialAltaPostulante = new javax.swing.JRadioButton();
        radbutMixtoAltaPostulante = new javax.swing.JRadioButton();
        butCancelarAltaPostulante = new javax.swing.JButton();
        butSiguienteAltaPostulante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqNombreAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqNombreAltaPostulante.setText("Nombre:");

        etiqTitAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitAltaPostulante.setText("Alta Postulante");

        etiqCedulaAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqCedulaAltaPostulante.setText("Cedula:");

        etiqDireccionAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqDireccionAltaPostulante.setText("Direccion:");

        etiqTelefonoAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqTelefonoAltaPostulante.setText("Telefono:");

        etiqMailAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqMailAltaPostulante.setText("Mail:");

        etiqLinkedinAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqLinkedinAltaPostulante.setText("Linkedin:");

        txtMailAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailAltaPostulanteActionPerformed(evt);
            }
        });

        etiqFormatoAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqFormatoAltaPostulante.setText("Formato:");

        txtNombreAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAltaPostulanteActionPerformed(evt);
            }
        });

        txtDireccionAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionAltaPostulanteActionPerformed(evt);
            }
        });

        txtTelefonoAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoAltaPostulanteActionPerformed(evt);
            }
        });

        txtLinkedinAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedinAltaPostulanteActionPerformed(evt);
            }
        });

        buttonGroup1.add(radbutRemotoAltaPostulante);
        radbutRemotoAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radbutRemotoAltaPostulante.setSelected(true);
        radbutRemotoAltaPostulante.setText("Remoto");

        buttonGroup1.add(radbutPresencialAltaPostulante);
        radbutPresencialAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radbutPresencialAltaPostulante.setText("Presencial");

        buttonGroup1.add(radbutMixtoAltaPostulante);
        radbutMixtoAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radbutMixtoAltaPostulante.setText("Mixto");

        butCancelarAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        butCancelarAltaPostulante.setText("Cancelar");
        butCancelarAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarAltaPostulanteActionPerformed(evt);
            }
        });

        butSiguienteAltaPostulante.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        butSiguienteAltaPostulante.setText("Siguiente");
        butSiguienteAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSiguienteAltaPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(butCancelarAltaPostulante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butSiguienteAltaPostulante)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiqFormatoAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(radbutRemotoAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radbutPresencialAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(radbutMixtoAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiqNombreAltaPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqDireccionAltaPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(etiqCedulaAltaPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqTelefonoAltaPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqMailAltaPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqLinkedinAltaPostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqTitAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMailAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCedulaAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLinkedinAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiqTitAltaPostulante)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqNombreAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreAltaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqCedulaAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaAltaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqDireccionAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionAltaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqTelefonoAltaPostulante)
                    .addComponent(txtTelefonoAltaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqMailAltaPostulante)
                    .addComponent(txtMailAltaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqLinkedinAltaPostulante)
                    .addComponent(txtLinkedinAltaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqFormatoAltaPostulante)
                    .addComponent(radbutRemotoAltaPostulante)
                    .addComponent(radbutPresencialAltaPostulante)
                    .addComponent(radbutMixtoAltaPostulante))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCancelarAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSiguienteAltaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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

        setBounds(0, 0, 599, 629);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMailAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailAltaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailAltaPostulanteActionPerformed

    private void txtDireccionAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionAltaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionAltaPostulanteActionPerformed

    private void txtTelefonoAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoAltaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoAltaPostulanteActionPerformed

    private void txtLinkedinAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedinAltaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedinAltaPostulanteActionPerformed

    private void txtNombreAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAltaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAltaPostulanteActionPerformed

    private void butCancelarAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarAltaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butCancelarAltaPostulanteActionPerformed

    private void butSiguienteAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSiguienteAltaPostulanteActionPerformed
        
        try{
        int unaCed = Integer.parseInt(txtCedulaAltaPostulante.getText());
        int unNumCel = Integer.parseInt(txtTelefonoAltaPostulante.getText());
        if(modelo.verificacionCedulaPostulantes(unaCed)){
        String unLinkedin = txtLinkedinAltaPostulante.getText();
        String unMail = txtMailAltaPostulante.getText();
        String unaDirec = txtDireccionAltaPostulante.getText();
        String unNombre = txtNombreAltaPostulante.getText();
        String formato ="";
        if (radbutMixtoAltaPostulante.isSelected()){
            formato = "Mixto";
        }else{
            if(radbutPresencialAltaPostulante.isSelected()){
                formato = "Presencial";
            }else{
                formato = "Remoto";
            }
        }
        limpiarCampos();
        ventanaAltaNivel ventanaAltaNivel = new ventanaAltaNivel(modelo, unLinkedin, unMail, unNumCel, unaDirec, unaCed, unNombre, formato);
        ventanaAltaNivel.setVisible(true);
        
        }else{
            JOptionPane.showMessageDialog(null,"cedula ya registrada ","Error", 0);
        }
        }catch(NumberFormatException a){
            JOptionPane.showMessageDialog(null,"los campos telefono y cedula deben ser numeros ","Error", 0);
        }
        
    }//GEN-LAST:event_butSiguienteAltaPostulanteActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelarAltaPostulante;
    private javax.swing.JButton butSiguienteAltaPostulante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etiqCedulaAltaPostulante;
    private javax.swing.JLabel etiqDireccionAltaPostulante;
    private javax.swing.JLabel etiqFormatoAltaPostulante;
    private javax.swing.JLabel etiqLinkedinAltaPostulante;
    private javax.swing.JLabel etiqMailAltaPostulante;
    private javax.swing.JLabel etiqNombreAltaPostulante;
    private javax.swing.JLabel etiqTelefonoAltaPostulante;
    private javax.swing.JLabel etiqTitAltaPostulante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radbutMixtoAltaPostulante;
    private javax.swing.JRadioButton radbutPresencialAltaPostulante;
    private javax.swing.JRadioButton radbutRemotoAltaPostulante;
    private javax.swing.JTextField txtCedulaAltaPostulante;
    private javax.swing.JTextField txtDireccionAltaPostulante;
    private javax.swing.JTextField txtLinkedinAltaPostulante;
    private javax.swing.JTextField txtMailAltaPostulante;
    private javax.swing.JTextField txtNombreAltaPostulante;
    private javax.swing.JTextField txtTelefonoAltaPostulante;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private void limpiarCampos() {                                                        
        txtCedulaAltaPostulante.setText("");
        txtDireccionAltaPostulante.setText("");
        txtLinkedinAltaPostulante.setText("");
        txtMailAltaPostulante.setText("");
        txtNombreAltaPostulante.setText("");
        txtTelefonoAltaPostulante.setText("");
        
    }
}
