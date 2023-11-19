package Ventanas;
//Martin Alonso(291799) y Santiago Oliveri
import static java.lang.Integer.parseInt;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import zFuncionamiento.*;

public class ventanaAltaEntrevista extends javax.swing.JFrame implements Observer {

    public ventanaAltaEntrevista(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        cargarListas();
        modelo.addObserver(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqListaPostulantesAltaEntevista = new javax.swing.JLabel();
        etiqTitAltaEntevista = new javax.swing.JLabel();
        etiqListaEntrevistadoresAltaEntevista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPostulantesAltaEntevista = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEntrevistadoresAltaEntevista = new javax.swing.JList();
        etiqPuntajeAltaEntevista = new javax.swing.JLabel();
        txtPuntajeAltaEntevista = new javax.swing.JTextField();
        etiqListaPostulantes3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComentariosAltaEntevista = new javax.swing.JTextArea();
        butAplicarAltaEntrevista = new javax.swing.JButton();
        butCancelarAltaEntrevista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqListaPostulantesAltaEntevista.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqListaPostulantesAltaEntevista.setText("Postulantes: ");

        etiqTitAltaEntevista.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitAltaEntevista.setText("Alta Entrevistas");

        etiqListaEntrevistadoresAltaEntevista.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqListaEntrevistadoresAltaEntevista.setText("Entrevistadores:");

        listPostulantesAltaEntevista.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        listPostulantesAltaEntevista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPostulantesAltaEntevista);

        listEntrevistadoresAltaEntevista.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        listEntrevistadoresAltaEntevista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listEntrevistadoresAltaEntevista);

        etiqPuntajeAltaEntevista.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqPuntajeAltaEntevista.setText("Puntaje:");

        txtPuntajeAltaEntevista.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPuntajeAltaEntevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntajeAltaEntevistaActionPerformed(evt);
            }
        });

        etiqListaPostulantes3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqListaPostulantes3.setText("Comentarios:");

        txtComentariosAltaEntevista.setColumns(20);
        txtComentariosAltaEntevista.setRows(5);
        jScrollPane3.setViewportView(txtComentariosAltaEntevista);

        butAplicarAltaEntrevista.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butAplicarAltaEntrevista.setText("Aplicar");
        butAplicarAltaEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAplicarAltaEntrevistaActionPerformed(evt);
            }
        });

        butCancelarAltaEntrevista.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        butCancelarAltaEntrevista.setText("Cancelar");
        butCancelarAltaEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarAltaEntrevistaActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiqListaPostulantesAltaEntevista))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiqListaEntrevistadoresAltaEntevista, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPuntajeAltaEntevista, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqListaPostulantes3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(butCancelarAltaEntrevista, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(butAplicarAltaEntrevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(etiqPuntajeAltaEntevista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(etiqTitAltaEntevista, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitAltaEntevista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqListaPostulantesAltaEntevista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqListaEntrevistadoresAltaEntevista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqPuntajeAltaEntevista))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPuntajeAltaEntevista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiqListaPostulantes3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butAplicarAltaEntrevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(butCancelarAltaEntrevista)
                        .addGap(44, 44, 44))))
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

        setBounds(0, 0, 488, 502);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPuntajeAltaEntevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntajeAltaEntevistaActionPerformed

    }//GEN-LAST:event_txtPuntajeAltaEntevistaActionPerformed

    private void butAplicarAltaEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAplicarAltaEntrevistaActionPerformed
        try {
            String comentariosEntrevista = txtComentariosAltaEntevista.getText();
            if (!comentariosEntrevista.isEmpty()) {
                int puntajeEntrevista = parseInt(txtPuntajeAltaEntevista.getText());
                if(puntajeEntrevista<0 || puntajeEntrevista>100){
                Entrevistador entrevistadorSelec = (Entrevistador) listEntrevistadoresAltaEntevista.getSelectedValue();
                Postulante postulanteSelec = (Postulante) listPostulantesAltaEntevista.getSelectedValue();
                if(entrevistadorSelec.getCedula()!=postulanteSelec.getCedula()){
                int numeroCorrelativo = modelo.getEntrevistas().size() + 1;
                Entrevista entrevistaCreada = new Entrevista(entrevistadorSelec, postulanteSelec, puntajeEntrevista, comentariosEntrevista, numeroCorrelativo);
                modelo.agregarEntrevista(entrevistaCreada);
                JOptionPane.showMessageDialog(null, "Entrevista agregada", "Info", 1);
                limpiarCampos();
                }else{
                    JOptionPane.showMessageDialog(null, "Elija un puntaje entre 0 y 100", "Error", 0);
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Una persona no se puede evaluar a si misma", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Relleno todos los campos por favor", "Error", 0);
            }
        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(null, "El campo Puntaje Entrevista debe ser numero ", "Error", 0);
        }
    }//GEN-LAST:event_butAplicarAltaEntrevistaActionPerformed

    private void butCancelarAltaEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarAltaEntrevistaActionPerformed
        this.dispose();
    }//GEN-LAST:event_butCancelarAltaEntrevistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAplicarAltaEntrevista;
    private javax.swing.JButton butCancelarAltaEntrevista;
    private javax.swing.JLabel etiqListaEntrevistadoresAltaEntevista;
    private javax.swing.JLabel etiqListaPostulantes3;
    private javax.swing.JLabel etiqListaPostulantesAltaEntevista;
    private javax.swing.JLabel etiqPuntajeAltaEntevista;
    private javax.swing.JLabel etiqTitAltaEntevista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listEntrevistadoresAltaEntevista;
    private javax.swing.JList listPostulantesAltaEntevista;
    private javax.swing.JTextArea txtComentariosAltaEntevista;
    private javax.swing.JTextField txtPuntajeAltaEntevista;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    private void limpiarCampos() {
        txtComentariosAltaEntevista.setText("");
        txtPuntajeAltaEntevista.setText("");
    }

    @Override
    public void update(Observable o, Object arg) {
        cargarListas();
    }

    public void cargarListas() {
        listEntrevistadoresAltaEntevista.setListData(modelo.getEntrevistadores().toArray());
        listPostulantesAltaEntevista.setListData(modelo.getPostulantes().toArray());
    }
}
