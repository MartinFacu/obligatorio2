package Ventanas;

import java.io.*;
import zFuncionamiento.*;

public class ventanaMenu extends javax.swing.JFrame {

    public ventanaMenu(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcionRegistroTema = new javax.swing.JMenuItem();
        opcionAltaPostulante = new javax.swing.JMenuItem();
        opcionBajaPostulante = new javax.swing.JMenuItem();
        opcionRegistroEvaluador = new javax.swing.JMenuItem();
        opcionIngresoEntrevista = new javax.swing.JMenuItem();
        opcionRegistroPuesto = new javax.swing.JMenuItem();
        opcionConsultoPuesto = new javax.swing.JMenuItem();
        opcionHistorial = new javax.swing.JMenuItem();
        opcionConsultaTema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jMenu1.setText("Opciones");

        opcionRegistroTema.setText("Registro temática");
        opcionRegistroTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRegistroTemaActionPerformed(evt);
            }
        });
        jMenu1.add(opcionRegistroTema);

        opcionAltaPostulante.setText("Alta postulante");
        opcionAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAltaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(opcionAltaPostulante);

        opcionBajaPostulante.setText("Baja postulante");
        opcionBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBajaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(opcionBajaPostulante);

        opcionRegistroEvaluador.setText("Registro de evaluador");
        opcionRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRegistroEvaluadorActionPerformed(evt);
            }
        });
        jMenu1.add(opcionRegistroEvaluador);

        opcionIngresoEntrevista.setText("Ingreso de entrevista");
        opcionIngresoEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionIngresoEntrevistaActionPerformed(evt);
            }
        });
        jMenu1.add(opcionIngresoEntrevista);

        opcionRegistroPuesto.setText("Registro de puesto");
        opcionRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRegistroPuestoActionPerformed(evt);
            }
        });
        jMenu1.add(opcionRegistroPuesto);

        opcionConsultoPuesto.setText("Consulta para puesto");
        opcionConsultoPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionConsultoPuestoActionPerformed(evt);
            }
        });
        jMenu1.add(opcionConsultoPuesto);

        opcionHistorial.setText("Historia de postulante");
        opcionHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionHistorialActionPerformed(evt);
            }
        });
        jMenu1.add(opcionHistorial);

        opcionConsultaTema.setText("Consulta pot temática");
        opcionConsultaTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionConsultaTemaActionPerformed(evt);
            }
        });
        jMenu1.add(opcionConsultaTema);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        setBounds(0, 0, 414, 337);
    }// </editor-fold>//GEN-END:initComponents

    private void opcionRegistroTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRegistroTemaActionPerformed
        ventanaRegistroTema ventRegistroTema = new ventanaRegistroTema(modelo);
        ventRegistroTema.setVisible(true);
    }//GEN-LAST:event_opcionRegistroTemaActionPerformed

    private void opcionRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRegistroEvaluadorActionPerformed
        AltaEntrevistador ventanaAltaEntrevistador = new AltaEntrevistador(modelo);
        ventanaAltaEntrevistador.setVisible(true);
    }//GEN-LAST:event_opcionRegistroEvaluadorActionPerformed

    private void opcionBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBajaPostulanteActionPerformed
        ventanaBajaPostulante ventanaBajaPostulante = new ventanaBajaPostulante(modelo);
        ventanaBajaPostulante.setVisible(true);
    }//GEN-LAST:event_opcionBajaPostulanteActionPerformed

    private void opcionHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionHistorialActionPerformed
        ventanaHistoriaPostulante ventanaHisPostulante = new ventanaHistoriaPostulante(modelo);
        ventanaHisPostulante.setVisible(true);
    }//GEN-LAST:event_opcionHistorialActionPerformed

    private void opcionAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAltaPostulanteActionPerformed
        ventanaAltaPostulante ventPostulante = new ventanaAltaPostulante(modelo);
        ventPostulante.setVisible(true);
    }//GEN-LAST:event_opcionAltaPostulanteActionPerformed

    private void opcionIngresoEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionIngresoEntrevistaActionPerformed
        ventanaAltaEntrevista ventanaAltaEntrevista = new ventanaAltaEntrevista(modelo);
        ventanaAltaEntrevista.setVisible(true);
    }//GEN-LAST:event_opcionIngresoEntrevistaActionPerformed

    private void opcionConsultoPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionConsultoPuestoActionPerformed
        ventanaConsultaPuesto ventanaConsultaPuestoo = new ventanaConsultaPuesto(modelo);
        ventanaConsultaPuestoo.setVisible(true);
    }//GEN-LAST:event_opcionConsultoPuestoActionPerformed

    private void opcionRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRegistroPuestoActionPerformed
        ventanaRegistroPuesto ventanaRegistroPuestoo = new ventanaRegistroPuesto(modelo);
        ventanaRegistroPuestoo.setVisible(true);
    }//GEN-LAST:event_opcionRegistroPuestoActionPerformed

    private void opcionConsultaTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionConsultaTemaActionPerformed
        ventanaConsultaTema ventanaConsultaTemaa = new ventanaConsultaTema(modelo);
        ventanaConsultaTemaa.setVisible(true);

    }//GEN-LAST:event_opcionConsultaTemaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            FileOutputStream f = new FileOutputStream("sistemita.ser");
            BufferedOutputStream b = new BufferedOutputStream(f);
            ObjectOutputStream s = new ObjectOutputStream(b);
            s.writeObject(modelo);
            s.close();
        } catch (IOException e) {
            System.out.println("Error de archivo " + e.getMessage());
            System.exit(1);
        }
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opcionAltaPostulante;
    private javax.swing.JMenuItem opcionBajaPostulante;
    private javax.swing.JMenuItem opcionConsultaTema;
    private javax.swing.JMenuItem opcionConsultoPuesto;
    private javax.swing.JMenuItem opcionHistorial;
    private javax.swing.JMenuItem opcionIngresoEntrevista;
    private javax.swing.JMenuItem opcionRegistroEvaluador;
    private javax.swing.JMenuItem opcionRegistroPuesto;
    private javax.swing.JMenuItem opcionRegistroTema;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;
}
