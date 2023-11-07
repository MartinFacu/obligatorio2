package Ventanas;

import static java.lang.Integer.parseInt;
import java.util.Observable;
import javax.swing.JOptionPane;
import zFuncionamiento.*;


public class AltaEntrevistador extends javax.swing.JFrame {

    public AltaEntrevistador(Sistema unSistema) {
        initComponents();
        this.modelo = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqTitAltaEntrevistador = new javax.swing.JLabel();
        etiqNombreAltaEntrevistador = new javax.swing.JLabel();
        etiqCedulaAltaEntrevistador = new javax.swing.JLabel();
        etiqDireccionAltaEntrevistador = new javax.swing.JLabel();
        etiquIngresoAltaEntrevistador = new javax.swing.JLabel();
        txtNombreAltaEntrevistador = new javax.swing.JTextField();
        txtCedulaAltaEntrevistador = new javax.swing.JTextField();
        txtDireccionAltaEntrevistador = new javax.swing.JTextField();
        txtIngresoAltaEntrevistador = new javax.swing.JTextField();
        butCancelarAltaEntrevistador = new javax.swing.JButton();
        butAplicarAltaEntrevistador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqTitAltaEntrevistador.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitAltaEntrevistador.setText("Alta Entrevistador");

        etiqNombreAltaEntrevistador.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqNombreAltaEntrevistador.setText("Nombre:");

        etiqCedulaAltaEntrevistador.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqCedulaAltaEntrevistador.setText("Cedula:");

        etiqDireccionAltaEntrevistador.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqDireccionAltaEntrevistador.setText("Direccion:");

        etiquIngresoAltaEntrevistador.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiquIngresoAltaEntrevistador.setText("Año de ingreso:");

        butCancelarAltaEntrevistador.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        butCancelarAltaEntrevistador.setText("Cancelar");

        butAplicarAltaEntrevistador.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        butAplicarAltaEntrevistador.setText("Aplicar");
        butAplicarAltaEntrevistador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAplicarAltaEntrevistadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(etiqTitAltaEntrevistador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqNombreAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiqCedulaAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiqDireccionAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquIngresoAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butCancelarAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIngresoAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccionAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCedulaAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(butAplicarAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitAltaEntrevistador)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqNombreAltaEntrevistador)
                    .addComponent(txtNombreAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqCedulaAltaEntrevistador)
                    .addComponent(txtCedulaAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqDireccionAltaEntrevistador)
                    .addComponent(txtDireccionAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquIngresoAltaEntrevistador)
                    .addComponent(txtIngresoAltaEntrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCancelarAltaEntrevistador)
                    .addComponent(butAplicarAltaEntrevistador))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butAplicarAltaEntrevistadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAplicarAltaEntrevistadorActionPerformed
        try{
        int ced=parseInt(txtCedulaAltaEntrevistador.getText());
        if(modelo.verificacionCedulaEntrevistadores(ced)){
        String direc = txtDireccionAltaEntrevistador.getText();
        int ingreso = parseInt(txtIngresoAltaEntrevistador.getText());
        String nombre = txtNombreAltaEntrevistador.getText();
        Entrevistador entrevistador = new Entrevistador(nombre, ced, direc, ingreso);
        modelo.agregarEntrevistador(entrevistador);
        JOptionPane.showMessageDialog(null,"Entrevistador agregado","Info", 1);
        limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(null,"cedula ya registrada ","Error", 0);
        }
        
        }catch(NumberFormatException a){
            JOptionPane.showMessageDialog(null,"los campos ingreso y cedula deben ser numeros ","Error", 0);
        }
    }//GEN-LAST:event_butAplicarAltaEntrevistadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAplicarAltaEntrevistador;
    private javax.swing.JButton butCancelarAltaEntrevistador;
    private javax.swing.JLabel etiqCedulaAltaEntrevistador;
    private javax.swing.JLabel etiqDireccionAltaEntrevistador;
    private javax.swing.JLabel etiqNombreAltaEntrevistador;
    private javax.swing.JLabel etiqTitAltaEntrevistador;
    private javax.swing.JLabel etiquIngresoAltaEntrevistador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedulaAltaEntrevistador;
    private javax.swing.JTextField txtDireccionAltaEntrevistador;
    private javax.swing.JTextField txtIngresoAltaEntrevistador;
    private javax.swing.JTextField txtNombreAltaEntrevistador;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private void limpiarCampos() {                                                        
        txtCedulaAltaEntrevistador.setText("");
        txtDireccionAltaEntrevistador.setText("");
        txtIngresoAltaEntrevistador.setText("");
        txtNombreAltaEntrevistador.setText("");
    }
}
