package Ventanas;
//Martin Alonso(291799) y Santiago Oliveri
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import zFuncionamiento.*;

public class ventanaSeleccionSistema extends javax.swing.JFrame {

    public ventanaSeleccionSistema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etiqTitSeleccionSistema = new javax.swing.JLabel();
        etiqUsoDatosSeleccionSistema = new javax.swing.JLabel();
        radbutSiSeleccionSistema = new javax.swing.JRadioButton();
        radbutNoSeleccionSistema = new javax.swing.JRadioButton();
        butAceptarSeleccionSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqTitSeleccionSistema.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitSeleccionSistema.setText("Seleccion De Datos");

        etiqUsoDatosSeleccionSistema.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqUsoDatosSeleccionSistema.setText("Usar datos previos?");

        buttonGroup1.add(radbutSiSeleccionSistema);
        radbutSiSeleccionSistema.setText("SI");

        buttonGroup1.add(radbutNoSeleccionSistema);
        radbutNoSeleccionSistema.setText("NO");

        butAceptarSeleccionSistema.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butAceptarSeleccionSistema.setText("Aceptar");
        butAceptarSeleccionSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAceptarSeleccionSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radbutSiSeleccionSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(radbutNoSeleccionSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butAceptarSeleccionSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etiqUsoDatosSeleccionSistema)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(etiqTitSeleccionSistema)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etiqTitSeleccionSistema)
                .addGap(45, 45, 45)
                .addComponent(etiqUsoDatosSeleccionSistema)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radbutSiSeleccionSistema)
                    .addComponent(radbutNoSeleccionSistema)
                    .addComponent(butAceptarSeleccionSistema))
                .addContainerGap(20, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butAceptarSeleccionSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAceptarSeleccionSistemaActionPerformed
        Sistema sistema = new Sistema();
        if (radbutNoSeleccionSistema.isSelected()) {
            this.dispose();
            
            ventanaMenu ventana = new ventanaMenu(sistema);
            ventana.setVisible(true);
        } else {
            if (radbutSiSeleccionSistema.isSelected()) {
                try {
                    FileInputStream f = new FileInputStream("sistemita.ser");
                    BufferedInputStream b = new BufferedInputStream(f);
                    ObjectInputStream s = new ObjectInputStream(b);
                    sistema = (Sistema) s.readObject();
                    s.close();
                } catch (IOException e) {
                    System.out.println("Error de archivo");
                    System.exit(1);
                } catch (ClassNotFoundException ex) {
                    System.out.println("Clase no encontrada");
                    System.exit(1);
                }
                this.dispose();
                ventanaMenu ventana = new ventanaMenu(sistema);
                ventana.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una opcion", "Error", 0);
            }
        }


    }//GEN-LAST:event_butAceptarSeleccionSistemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAceptarSeleccionSistema;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etiqTitSeleccionSistema;
    private javax.swing.JLabel etiqUsoDatosSeleccionSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radbutNoSeleccionSistema;
    private javax.swing.JRadioButton radbutSiSeleccionSistema;
    // End of variables declaration//GEN-END:variables
}
