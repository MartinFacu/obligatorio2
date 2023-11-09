
package Ventanas;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        if (radbutNoSeleccionSistema.isSelected()){
            this.dispose();
            //datos precargados para testeo
        
        Tematica tema1 = new Tematica("HashMapeador","Anashee");
        Tematica tema2 = new Tematica("Javador","Anashee222");
        Tematica tema3 = new Tematica("javascripteador","Anashee3");
        Tematica tema4 = new Tematica("Csseador","Anashee444");
        sistema.agregarUnaTematica(tema1);
        sistema.agregarUnaTematica(tema2);
        sistema.agregarUnaTematica(tema3);
        sistema.agregarUnaTematica(tema4);
        HashMap<Tematica, Integer> hashMap = new HashMap<>();
        hashMap.put(tema1, 5);
        hashMap.put(tema2, 3);
        Postulante postulante1 = new Postulante("Presencial", "linkedelfalo.com", "falo@gmail", 99234, "Bulevar Artigas", 123456, "Falo", hashMap);
        Postulante postulantex = new Postulante("Presencial", "linkedelfalo.com", "falo@gmail", 99234, "Bulevar Artigas", 1235541, "Falox", hashMap);
        sistema.agregarPostulante(postulante1);
        sistema.agregarPostulante(postulantex);
        HashMap<Tematica, Integer> hashMap2 = new HashMap<>();
        hashMap2.put(tema3, 7);
        hashMap2.put(tema4, 2);
        Postulante postulante2 = new Postulante("Mixto", "linkedelmors.com", "mors@gmail", 993812, "Villas", 6789, "Mors", hashMap2);
        Postulante postulante3 = new Postulante("Remoto", "hola.com", "mors22332@gmail", 993812, "Villas", 6789, "Morsaa", hashMap2);
        Postulante postulante4 = new Postulante("Remoto", "hola22222.com", "dwdadaw@gmail", 993812, "Villas", 6789, "morsaloca", hashMap2);
        sistema.agregarPostulante(postulante2);
        sistema.agregarPostulante(postulante3);
        sistema.agregarPostulante(postulante4);
        Entrevistador entrevistador1 = new Entrevistador("entrevistador1", 2134, "DireccionENtrevis1", 2001);
        Entrevistador entrevistador2 = new Entrevistador("entrevistador2", 2131, "DireccionENtrevis2", 2002);
        sistema.agregarEntrevistador(entrevistador1);
        sistema.agregarEntrevistador(entrevistador2);
        Entrevista entrevista1 = new Entrevista(entrevistador2, postulante2, 20, "buenardo y nashe", 1);
        Entrevista entrevista2 = new Entrevista(entrevistador1, postulante1, 10, "malardo", 2);
        Entrevista entrevista3 = new Entrevista(entrevistador2, postulante1, 100, "epico", 3);
        sistema.agregarEntrevista(entrevista1);
        sistema.agregarEntrevista(entrevista2);
        sistema.agregarEntrevista(entrevista3);
        ArrayList<Tematica> arr1=new ArrayList<>();
        arr1.add(tema1);
        arr1.add(tema2);
        ArrayList<Tematica> arr2=new ArrayList<>();
        arr2.add(tema3);
        arr2.add(tema4);
        Puesto puesto1 = new Puesto("puesto1", "Presencial", arr1);
        Puesto puesto2 = new Puesto("puesto2", "Remoto", arr2);
        sistema.agregarPuesto(puesto1);
        sistema.agregarPuesto(puesto2);
        
        ventanaMenu ventana = new ventanaMenu(sistema);
        ventana.setVisible(true);
        }else{
            if(radbutSiSeleccionSistema.isSelected()){
                try {
                    FileInputStream f = new FileInputStream("sistemita.ser");
                    BufferedInputStream b = new BufferedInputStream(f);
                    ObjectInputStream s = new ObjectInputStream(b);
                    sistema =(Sistema) s.readObject();
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
