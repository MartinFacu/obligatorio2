
package Ventanas;

import java.util.Observable;
import java.util.Observer;
import zFuncionamiento.*;

public class ventanaConsultaTema extends javax.swing.JFrame implements Observer{
    public ventanaConsultaTema(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        cargarLista();
        limpiarCampos();
        modelo.addObserver(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqTitConsultaPorTematica = new javax.swing.JLabel();
        etiqTematicasConsultaPorTematica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTematicasConsultaPorTematica = new javax.swing.JList();
        etiqCantQueSabenConsultaPorTematica = new javax.swing.JLabel();
        etiqAModificarCantQueSabenConsultaPorTematica = new javax.swing.JLabel();
        etiqPuestosQueNecesitanConsultaPorTematica = new javax.swing.JLabel();
        etiqAModificarPuestosQueNecesitanConsultaPorTematica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiqTitConsultaPorTematica.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiqTitConsultaPorTematica.setText("Consulta Por Tematica");

        etiqTematicasConsultaPorTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqTematicasConsultaPorTematica.setText("Tematicas:");

        listTematicasConsultaPorTematica.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listTematicasConsultaPorTematica.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTematicasConsultaPorTematicaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listTematicasConsultaPorTematica);

        etiqCantQueSabenConsultaPorTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqCantQueSabenConsultaPorTematica.setText("Cantidad personas que saben del tema:");

        etiqAModificarCantQueSabenConsultaPorTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarCantQueSabenConsultaPorTematica.setText("jLabel4");

        etiqPuestosQueNecesitanConsultaPorTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqPuestosQueNecesitanConsultaPorTematica.setText("Puestos que la requieren:");

        etiqAModificarPuestosQueNecesitanConsultaPorTematica.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiqAModificarPuestosQueNecesitanConsultaPorTematica.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiqAModificarCantQueSabenConsultaPorTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiqPuestosQueNecesitanConsultaPorTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiqAModificarPuestosQueNecesitanConsultaPorTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqTematicasConsultaPorTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(etiqCantQueSabenConsultaPorTematica, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(etiqTitConsultaPorTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqTitConsultaPorTematica)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqTematicasConsultaPorTematica)
                    .addComponent(etiqCantQueSabenConsultaPorTematica))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(etiqAModificarCantQueSabenConsultaPorTematica)
                        .addGap(29, 29, 29)
                        .addComponent(etiqPuestosQueNecesitanConsultaPorTematica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiqAModificarPuestosQueNecesitanConsultaPorTematica)))
                .addContainerGap(40, Short.MAX_VALUE))
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

        setBounds(0, 0, 501, 406);
    }// </editor-fold>//GEN-END:initComponents

    private void listTematicasConsultaPorTematicaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTematicasConsultaPorTematicaValueChanged
        Tematica temaSeleccionado = (Tematica) listTematicasConsultaPorTematica.getSelectedValue();
        int cantidadDePersonasQueSaben = modelo.cantidadDePersonasQueSabenDelTema(temaSeleccionado);
        int cantidadPuestosQueNecesitan = modelo.cantidadDePuestosQueNecesitan(temaSeleccionado);
        etiqAModificarCantQueSabenConsultaPorTematica.setText(cantidadDePersonasQueSaben+"");
        etiqAModificarPuestosQueNecesitanConsultaPorTematica.setText(cantidadPuestosQueNecesitan+"");
    }//GEN-LAST:event_listTematicasConsultaPorTematicaValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiqAModificarCantQueSabenConsultaPorTematica;
    private javax.swing.JLabel etiqAModificarPuestosQueNecesitanConsultaPorTematica;
    private javax.swing.JLabel etiqCantQueSabenConsultaPorTematica;
    private javax.swing.JLabel etiqPuestosQueNecesitanConsultaPorTematica;
    private javax.swing.JLabel etiqTematicasConsultaPorTematica;
    private javax.swing.JLabel etiqTitConsultaPorTematica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listTematicasConsultaPorTematica;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    
    private void limpiarCampos(){
        etiqAModificarCantQueSabenConsultaPorTematica.setText("");
        etiqAModificarPuestosQueNecesitanConsultaPorTematica.setText("");
    }

    @Override
    public void update(Observable o, Object arg) {
        limpiarCampos();
        cargarLista();
    }
    
    private void cargarLista(){
        listTematicasConsultaPorTematica.setListData(modelo.getTematicas().toArray());
    }
    
}
