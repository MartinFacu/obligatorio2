
package Ventanas;
import zFuncionamiento.*;

public class ventanaAltaNivel extends javax.swing.JFrame {

    public ventanaAltaNivel(Sistema unSistema, String unLinkedin, String unMail, int unNumCel, String unaDirec, int unaCed, String unNombre, String unFormato) {
        initComponents();
        this.modelo = unSistema;
        this.linkedin = unLinkedin;
        this.mail = unMail;
        this.numCel = unNumCel;
        this.direccion = unaDirec;
        this.cedula = unaCed;
        this.nombre = unNombre;
        this.formato = unFormato;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqTitAltaNiveles = new javax.swing.JLabel();
        etiqTematicaAltaNiveles = new javax.swing.JLabel();
        combTemaElegidoAltaNiveles = new javax.swing.JComboBox<>();
        etiqNIvelAltaNiveles = new javax.swing.JLabel();
        spinNivelElegidoAltaNiveles = new javax.swing.JSpinner();
        butAgregarTematicaAltaNiveles = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etiqExperienciaAltaNiveles = new javax.swing.JLabel();
        butEliminarTematicaAltaNiveles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTematicasAltaNiveles = new javax.swing.JList();
        butCancelarAltaNiveles = new javax.swing.JButton();
        butRegistrarAltaNiveles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqTitAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitAltaNiveles.setText("Alta NIveles");

        etiqTematicaAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqTematicaAltaNiveles.setText("Tematica:");

        combTemaElegidoAltaNiveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiqNIvelAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqNIvelAltaNiveles.setText("Nivel:");

        butAgregarTematicaAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        butAgregarTematicaAltaNiveles.setText("Agregar");
        butAgregarTematicaAltaNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarTematicaAltaNivelesActionPerformed(evt);
            }
        });

        etiqExperienciaAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqExperienciaAltaNiveles.setText("Experiencia:");

        butEliminarTematicaAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        butEliminarTematicaAltaNiveles.setText("Eliminar");

        listTematicasAltaNiveles.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTematicasAltaNiveles);

        butCancelarAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        butCancelarAltaNiveles.setText("Cancelar");
        butCancelarAltaNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarAltaNivelesActionPerformed(evt);
            }
        });

        butRegistrarAltaNiveles.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        butRegistrarAltaNiveles.setText("Registrar");
        butRegistrarAltaNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegistrarAltaNivelesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqTematicaAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiqNIvelAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqTitAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(spinNivelElegidoAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butAgregarTematicaAltaNiveles))
                                .addComponent(combTemaElegidoAltaNiveles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butCancelarAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butRegistrarAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiqExperienciaAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butEliminarTematicaAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitAltaNiveles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqTematicaAltaNiveles)
                    .addComponent(combTemaElegidoAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqNIvelAltaNiveles)
                    .addComponent(spinNivelElegidoAltaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAgregarTematicaAltaNiveles))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiqExperienciaAltaNiveles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butEliminarTematicaAltaNiveles))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(butCancelarAltaNiveles)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butRegistrarAltaNiveles)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        setBounds(0, 0, 472, 391);
    }// </editor-fold>//GEN-END:initComponents

    private void butCancelarAltaNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarAltaNivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butCancelarAltaNivelesActionPerformed

    private void butRegistrarAltaNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegistrarAltaNivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butRegistrarAltaNivelesActionPerformed

    private void butAgregarTematicaAltaNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarTematicaAltaNivelesActionPerformed
        
    }//GEN-LAST:event_butAgregarTematicaAltaNivelesActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAgregarTematicaAltaNiveles;
    private javax.swing.JButton butCancelarAltaNiveles;
    private javax.swing.JButton butEliminarTematicaAltaNiveles;
    private javax.swing.JButton butRegistrarAltaNiveles;
    private javax.swing.JComboBox<String> combTemaElegidoAltaNiveles;
    private javax.swing.JLabel etiqExperienciaAltaNiveles;
    private javax.swing.JLabel etiqNIvelAltaNiveles;
    private javax.swing.JLabel etiqTematicaAltaNiveles;
    private javax.swing.JLabel etiqTitAltaNiveles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listTematicasAltaNiveles;
    private javax.swing.JSpinner spinNivelElegidoAltaNiveles;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private String nombre;
    private int cedula;
    private String direccion;
    private int numCel;
    private String mail;
    private String linkedin;
    private String formato;
}
