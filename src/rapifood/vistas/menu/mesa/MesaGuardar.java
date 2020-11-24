/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.vistas.menu.mesa;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import rapifood.entidades.Mesa;
import rapifood.modelo.*;
import javax.swing.JInternalFrame;


public class MesaGuardar extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo=new DefaultTableModel();
    Conexion c = new Conexion();
    Mesa mesa;
    MesaData md;
    public MesaGuardar() {
        initComponents();
        md = new MesaData(c);
        this.setLocation(250, 100);
        Conexion c = new Conexion();
        modelo.isCellEditable(0, 1);
        armaCabeceraTabla();
        this.cargaDatosMesa();
        this.setResizable(false);
        cargarComboBox();
        
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);//activar la x
        this.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI(); Container north = (Container)ui.getNorthPane(); north.remove(0); north.validate(); north.repaint();//repasar
            
    }

    public void cargarComboBox(){
     int i;
        for(i=1;i<13;i++){
            String numero = String.valueOf(i);
            jComboBoxCantidadPersonas.addItem(numero);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabelCapacidadMesa = new javax.swing.JLabel();
        jComboBoxCantidadPersonas = new javax.swing.JComboBox<>();
        jCheckBoxActivo = new javax.swing.JCheckBox();
        jLabelEstado = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButtonGuardarCambios = new javax.swing.JButton();

        setClosable(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setText("Mesa");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelCapacidadMesa.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelCapacidadMesa.setText("Capacidad Mesa:");

        jComboBoxCantidadPersonas.setBackground(new java.awt.Color(240, 240, 240));
        jComboBoxCantidadPersonas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxCantidadPersonas.setToolTipText("");
        jComboBoxCantidadPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCantidadPersonasActionPerformed(evt);
            }
        });

        jCheckBoxActivo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jCheckBoxActivo.setText("Activo");
        jCheckBoxActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivoActionPerformed(evt);
            }
        });

        jLabelEstado.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelEstado.setText("Estado:");

        jButtonGuardar.setBackground(new java.awt.Color(0, 255, 0));
        jButtonGuardar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTable = new javax.swing.JTable(){
            @Override
            public Class<?> getColumnClass(int columna) {
                if(columna==2){
                    return Boolean.class;
                }
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==1 || column ==2){
                    return true;}
                return false;
            }
        };
        jTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Mesa");

        jButtonGuardarCambios.setBackground(new java.awt.Color(0, 255, 0));
        jButtonGuardarCambios.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonGuardarCambios.setText("Guardar Cambios");
        jButtonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCapacidadMesa)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelEstado)
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(162, 162, 162))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonGuardarCambios)
                                .addGap(145, 145, 145))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCapacidadMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxActivo))
                                .addGap(77, 77, 77)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        int x =JOptionPane.showConfirmDialog(this, "Desea Guardar la Mesa?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x== JOptionPane.YES_OPTION){
                int cantidadPersonas = Integer.valueOf(jComboBoxCantidadPersonas.getSelectedItem().toString());
                boolean estado=jCheckBoxActivo.isSelected();
                Mesa m= new Mesa(estado,cantidadPersonas);
                md.guardarMesa(m);
                JOptionPane.showMessageDialog(null,"Mesa Registrada");
                cargaDatosMesa();
            }
            
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxCantidadPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCantidadPersonasActionPerformed
       
        
    }//GEN-LAST:event_jComboBoxCantidadPersonasActionPerformed

    private void jCheckBoxActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxActivoActionPerformed

    private void jButtonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosActionPerformed
        int filaSelec=jTable.getSelectedRow();
        if(filaSelec!=-1){
            
            String val="[0-9]*";
            
            if(modelo.getValueAt(filaSelec, 1).toString().matches(val) && modelo.getValueAt(filaSelec, 1).toString().length() !=0){

            int id = Integer.parseInt(modelo.getValueAt(filaSelec,0).toString());        
            int cantidadPersona = Integer.parseInt(modelo.getValueAt(filaSelec, 1).toString());
            boolean estado = Boolean.parseBoolean(modelo.getValueAt(filaSelec, 2).toString());
                if(cantidadPersona>0 && cantidadPersona<13){
                
                    int x =JOptionPane.showConfirmDialog(this, "Desea Modificar la Mesa?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);

                    if(x== JOptionPane.YES_OPTION){
                        Mesa m;
                        m=md.buscarMesa(id);
                        m.setCapacidadMaxima(cantidadPersona);
                        m.setEstadoMesa(estado);
                        md.actualizarMesa(m);
                        borraFilasTabla();
                        cargaDatosMesa();
                    }
                }else{
                    JOptionPane.showInternalMessageDialog(this, "Ingrese numeros entre 1 y 12.");
                    cargaDatosMesa();
                }
            }else{
                JOptionPane.showInternalMessageDialog(this, "Ingrese numeros entre 1 y 12.");
                cargaDatosMesa();
            }
        }
        cargaDatosMesa();
    }//GEN-LAST:event_jButtonGuardarCambiosActionPerformed
    private void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("CANTIDAD PERSONAS");
        columnas.add("ESTADO");
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jTable.setModel(modelo);
    }
    private void borraFilasTabla(){

        int a =modelo.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo.removeRow(i);
           }
    }
    private void cargaDatosMesa(){
    
        borraFilasTabla();
           //Llenar filas
        
        List<Mesa> lista = md.obtenerMesas();
        
        for(Mesa m:lista){
        
            modelo.addRow(new Object[]{m.getIdMesa(),m.getCapacidadMaxima(),m.isEstadoMesa()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JCheckBox jCheckBoxActivo;
    private javax.swing.JComboBox<String> jComboBoxCantidadPersonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCapacidadMesa;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
