package Ventanas;
//Martin Alonso(291799) y Santiago Oliveri
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import zFuncionamiento.*;

public class ventanaHistoriaPostulante extends javax.swing.JFrame implements Observer {

    public ventanaHistoriaPostulante(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        cargoTodoVacio();
        modelo.addObserver(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqTitHistoriaPostulante = new javax.swing.JLabel();
        etiqPostulantesHistoriaPostulante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPostulantesHistoriaPostulante = new javax.swing.JList();
        etiqNombreHistoriaPostulante = new javax.swing.JLabel();
        etiqCedulaHistoriaPostulante = new javax.swing.JLabel();
        etiqDireccionHistoriaPostulante = new javax.swing.JLabel();
        etiqTelefonoHistoriaPostulante = new javax.swing.JLabel();
        etiqMailHistoriaPostulante = new javax.swing.JLabel();
        etiqLinkedinHistoriaPostulante = new javax.swing.JLabel();
        etiqFormatoHistoriaPostulante = new javax.swing.JLabel();
        etiqExperienciaHistoriaPostulante = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listExperienciasHistoriaPostulante = new javax.swing.JList();
        etiqAModificarNombreHistoriaPostulante = new javax.swing.JLabel();
        etiqAModificarCedulaHistoriaPostulante = new javax.swing.JLabel();
        etiqAModificarDireccionHistoriaPostulante = new javax.swing.JLabel();
        etiqAModificarTelefonoHistoriaPostulante = new javax.swing.JLabel();
        etiqAModificarMailHistoriaPostulante = new javax.swing.JLabel();
        etiqAModificarLinkedinHistoriaPostulante = new javax.swing.JLabel();
        etiqAModificarFormatoHistoriaPostulante = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiqExperienciaHistoriaPostulante1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBuscarHistoriaPostulante = new javax.swing.JTextArea();
        butBuscarHistoriaPostulante = new javax.swing.JButton();
        butResetHistoriaPostulante = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaEntrevistasHistoriaPostulante = new javax.swing.JTable();
        butSalirHistorialPostulante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqTitHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitHistoriaPostulante.setText("Historia  Postulante");

        etiqPostulantesHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqPostulantesHistoriaPostulante.setText("Postulantes:");

        listPostulantesHistoriaPostulante.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listPostulantesHistoriaPostulante.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPostulantesHistoriaPostulanteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPostulantesHistoriaPostulante);

        etiqNombreHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqNombreHistoriaPostulante.setText("Nombre:");

        etiqCedulaHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqCedulaHistoriaPostulante.setText("Cédula:");

        etiqDireccionHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqDireccionHistoriaPostulante.setText("Dirección:");

        etiqTelefonoHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqTelefonoHistoriaPostulante.setText("Teléfono:");

        etiqMailHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqMailHistoriaPostulante.setText("Mail:");

        etiqLinkedinHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqLinkedinHistoriaPostulante.setText("Linkedin:");

        etiqFormatoHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqFormatoHistoriaPostulante.setText("Formato:");

        etiqExperienciaHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqExperienciaHistoriaPostulante.setText("Experiencia");

        listExperienciasHistoriaPostulante.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listExperienciasHistoriaPostulante);

        etiqAModificarNombreHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarNombreHistoriaPostulante.setText("Nombre:");

        etiqAModificarCedulaHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarCedulaHistoriaPostulante.setText("Nombre:");

        etiqAModificarDireccionHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarDireccionHistoriaPostulante.setText("Nombre:");

        etiqAModificarTelefonoHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarTelefonoHistoriaPostulante.setText("Nombre:");

        etiqAModificarMailHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarMailHistoriaPostulante.setText("Nombre:");

        etiqAModificarLinkedinHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarLinkedinHistoriaPostulante.setText("Nombre:");
        etiqAModificarLinkedinHistoriaPostulante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqAModificarLinkedinHistoriaPostulanteMouseClicked(evt);
            }
        });

        etiqAModificarFormatoHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarFormatoHistoriaPostulante.setText("Nombre:");

        etiqExperienciaHistoriaPostulante1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqExperienciaHistoriaPostulante1.setText("Buscar:");

        txtBuscarHistoriaPostulante.setColumns(20);
        txtBuscarHistoriaPostulante.setRows(5);
        jScrollPane3.setViewportView(txtBuscarHistoriaPostulante);

        butBuscarHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butBuscarHistoriaPostulante.setText("Buscar");
        butBuscarHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscarHistoriaPostulanteActionPerformed(evt);
            }
        });

        butResetHistoriaPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butResetHistoriaPostulante.setText("Reset");
        butResetHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butResetHistoriaPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(etiqTitHistoriaPostulante))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqPostulantesHistoriaPostulante)
                                .addGap(297, 297, 297)
                                .addComponent(etiqNombreHistoriaPostulante))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiqFormatoHistoriaPostulante, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etiqExperienciaHistoriaPostulante, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etiqDireccionHistoriaPostulante)
                                            .addComponent(etiqTelefonoHistoriaPostulante)
                                            .addComponent(etiqMailHistoriaPostulante)
                                            .addComponent(etiqLinkedinHistoriaPostulante))
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(208, 208, 208)
                                        .addComponent(etiqCedulaHistoriaPostulante))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqExperienciaHistoriaPostulante1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(butBuscarHistoriaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqAModificarCedulaHistoriaPostulante)
                            .addComponent(etiqAModificarNombreHistoriaPostulante)
                            .addComponent(etiqAModificarDireccionHistoriaPostulante)
                            .addComponent(etiqAModificarTelefonoHistoriaPostulante)
                            .addComponent(etiqAModificarMailHistoriaPostulante)
                            .addComponent(etiqAModificarLinkedinHistoriaPostulante)
                            .addComponent(etiqAModificarFormatoHistoriaPostulante)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(butResetHistoriaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitHistoriaPostulante)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqPostulantesHistoriaPostulante)
                    .addComponent(etiqNombreHistoriaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqAModificarNombreHistoriaPostulante))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(etiqAModificarCedulaHistoriaPostulante))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etiqCedulaHistoriaPostulante)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqAModificarDireccionHistoriaPostulante)
                            .addComponent(etiqDireccionHistoriaPostulante))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(etiqAModificarMailHistoriaPostulante))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiqTelefonoHistoriaPostulante)
                                    .addComponent(etiqAModificarTelefonoHistoriaPostulante))
                                .addGap(18, 18, 18)
                                .addComponent(etiqMailHistoriaPostulante)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqAModificarLinkedinHistoriaPostulante)
                            .addComponent(etiqLinkedinHistoriaPostulante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiqFormatoHistoriaPostulante)
                            .addComponent(etiqAModificarFormatoHistoriaPostulante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqExperienciaHistoriaPostulante)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqExperienciaHistoriaPostulante1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butBuscarHistoriaPostulante)
                        .addComponent(butResetHistoriaPostulante)))
                .addGap(15, 15, 15))
        );

        tablaEntrevistasHistoriaPostulante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ));
        jScrollPane4.setViewportView(tablaEntrevistasHistoriaPostulante);

        butSalirHistorialPostulante.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butSalirHistorialPostulante.setText("Salir");
        butSalirHistorialPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalirHistorialPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(butSalirHistorialPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butSalirHistorialPostulante)
                .addContainerGap())
        );

        setBounds(0, 0, 877, 1021);
    }// </editor-fold>//GEN-END:initComponents

    private void listPostulantesHistoriaPostulanteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPostulantesHistoriaPostulanteValueChanged
        try {
            Postulante postulanteSeleccionado = (Postulante) listPostulantesHistoriaPostulante.getSelectedValue();
            cargarDatosPostulante(postulanteSeleccionado);
            //remplazo el texto de las etiquetas AModificar con la info del postulante seleccionado
        } catch (NullPointerException e) {
        }

        //

    }//GEN-LAST:event_listPostulantesHistoriaPostulanteValueChanged

    private void butBuscarHistoriaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscarHistoriaPostulanteActionPerformed
        cargoTabla(true);
    }//GEN-LAST:event_butBuscarHistoriaPostulanteActionPerformed

    private void butResetHistoriaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butResetHistoriaPostulanteActionPerformed
        cargoTabla(false);
    }//GEN-LAST:event_butResetHistoriaPostulanteActionPerformed

    private void butSalirHistorialPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalirHistorialPostulanteActionPerformed
        this.dispose();
    }//GEN-LAST:event_butSalirHistorialPostulanteActionPerformed

    private void etiqAModificarLinkedinHistoriaPostulanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqAModificarLinkedinHistoriaPostulanteMouseClicked
        try {
        // Abre el enlace en el navegador predeterminado
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(this.url));
    } catch (java.io.IOException e) {
        System.out.println("Error al abrir el enlace: " + e.getMessage());
    }
    }//GEN-LAST:event_etiqAModificarLinkedinHistoriaPostulanteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBuscarHistoriaPostulante;
    private javax.swing.JButton butResetHistoriaPostulante;
    private javax.swing.JButton butSalirHistorialPostulante;
    private javax.swing.JLabel etiqAModificarCedulaHistoriaPostulante;
    private javax.swing.JLabel etiqAModificarDireccionHistoriaPostulante;
    private javax.swing.JLabel etiqAModificarFormatoHistoriaPostulante;
    private javax.swing.JLabel etiqAModificarLinkedinHistoriaPostulante;
    private javax.swing.JLabel etiqAModificarMailHistoriaPostulante;
    private javax.swing.JLabel etiqAModificarNombreHistoriaPostulante;
    private javax.swing.JLabel etiqAModificarTelefonoHistoriaPostulante;
    private javax.swing.JLabel etiqCedulaHistoriaPostulante;
    private javax.swing.JLabel etiqDireccionHistoriaPostulante;
    private javax.swing.JLabel etiqExperienciaHistoriaPostulante;
    private javax.swing.JLabel etiqExperienciaHistoriaPostulante1;
    private javax.swing.JLabel etiqFormatoHistoriaPostulante;
    private javax.swing.JLabel etiqLinkedinHistoriaPostulante;
    private javax.swing.JLabel etiqMailHistoriaPostulante;
    private javax.swing.JLabel etiqNombreHistoriaPostulante;
    private javax.swing.JLabel etiqPostulantesHistoriaPostulante;
    private javax.swing.JLabel etiqTelefonoHistoriaPostulante;
    private javax.swing.JLabel etiqTitHistoriaPostulante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listExperienciasHistoriaPostulante;
    private javax.swing.JList listPostulantesHistoriaPostulante;
    private javax.swing.JTable tablaEntrevistasHistoriaPostulante;
    private javax.swing.JTextArea txtBuscarHistoriaPostulante;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private Postulante post;
    private String url;

    @Override
    public void update(Observable o, Object arg) {
        listPostulantesHistoriaPostulante.setListData(modelo.getPostulantes().toArray());
        //Si el postulante sigue existiendo cargo todo de nuevo por si cambiaron las entrevistas, sino 
        // muestro todo en blanco
        if (modelo.getPostulantes().contains(this.post)) {
            System.out.println("Si esta en la lista");
            cargarDatosPostulante(this.post);
        } else {
            System.out.println("no esta en la lista");
            cargoTodoVacio();
        }
        cargoTabla(true);
    }

    public void cargoTodoVacio() {
        Collections.sort(modelo.getPostulantes());
        listPostulantesHistoriaPostulante.setListData(modelo.getPostulantes().toArray());
        listExperienciasHistoriaPostulante.setListData(modelo.darDatosDelHash().toArray());
        etiqAModificarNombreHistoriaPostulante.setText("");
        etiqAModificarCedulaHistoriaPostulante.setText("");
        etiqAModificarDireccionHistoriaPostulante.setText("");
        etiqAModificarTelefonoHistoriaPostulante.setText("");
        etiqAModificarMailHistoriaPostulante.setText("");
        etiqAModificarLinkedinHistoriaPostulante.setText("");
        etiqAModificarFormatoHistoriaPostulante.setText("");

    }

    public void cargarDatosPostulante(Postulante unPostulante) {
        etiqAModificarNombreHistoriaPostulante.setText(unPostulante.getNombre());
        etiqAModificarCedulaHistoriaPostulante.setText(unPostulante.getCedula() + "");
        etiqAModificarDireccionHistoriaPostulante.setText(unPostulante.getDireccion());
        etiqAModificarTelefonoHistoriaPostulante.setText(unPostulante.getNumCel() + "");
        etiqAModificarMailHistoriaPostulante.setText(unPostulante.getMail());
        this.url=unPostulante.getLinkedin();
        etiqAModificarLinkedinHistoriaPostulante.setText("<html><a href=" +this.url + "'>" + this.url + "</a></html>");
        etiqAModificarFormatoHistoriaPostulante.setText(unPostulante.getFormato());
        listExperienciasHistoriaPostulante.setListData(unPostulante.darDatosDelHash().toArray());
        this.post = unPostulante;
    }

    public void cargoTabla(Boolean queHacer) {
        DefaultTableModel model = (DefaultTableModel) tablaEntrevistasHistoriaPostulante.getModel();
        if (queHacer) {
            String palabraABuscar = txtBuscarHistoriaPostulante.getText();
            model.setRowCount(0);
            ArrayList<Entrevista> entrevistasDelPostulante = modelo.getPostulantesFiltradosPorEntrevistaNumeroCreciente(post);
            for (Entrevista entrevis : entrevistasDelPostulante) {
                String comentariosColor = entrevis.comentarioConColor(palabraABuscar);
                Object[] fila = {entrevis.getNumeroCorrelativo(), entrevis.getEntrevistador(), entrevis.getPuntaje(), comentariosColor};
                model.addRow(fila);
            }
        } else {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
        }

    }
}
