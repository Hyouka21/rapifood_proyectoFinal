/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.vistas.menu.detallepedido;

import java.awt.Container;
import java.util.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import rapifood.entidades.*;
import rapifood.modelo.*;

/**
 *
 * @author Hyouka
 */
public class DetalleGuardartest extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
    PedidoData pedidoD;
    ProductoData productoD;
    DetallePedidoData detalleD;
    public DetalleGuardartest() {
        initComponents();
        this.setLocation(50, 50);
        Conexion c=new Conexion();
        pedidoD=new PedidoData(c);
        productoD=new ProductoData(c);
        detalleD=new DetallePedidoData(c);
        this.cargarPedidos();
        this.cargarProductos();
        ((DefaultEditor) this.jsCantidad.getEditor()).getTextField().setEditable(false);
        armaCabeceraTabla();
        cargaDatosXPedido();
        regularTamañoColumna();
        
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);//activar la x
        this.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI(); Container north = (Container)ui.getNorthPane(); north.remove(0); north.validate(); north.repaint();//repasar
            
        
    }

    public void regularTamañoColumna(){
        jtDetalle.getColumnModel().getColumn(0).setPreferredWidth(10);
        jtDetalle.getColumnModel().getColumn(1).setPreferredWidth(220);
        jtDetalle.getColumnModel().getColumn(2).setPreferredWidth(110);
        jtDetalle.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtDetalle.getColumnModel().getColumn(4).setPreferredWidth(10);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbPedido = new javax.swing.JComboBox<>();
        jcbProducto = new javax.swing.JComboBox<>();
        jsCantidad = new javax.swing.JSpinner();
        jbGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalle = new javax.swing.JTable();
        jbBorrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jcbPedido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPedidoActionPerformed(evt);
            }
        });

        jcbProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jsCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jbGuardar.setBackground(new java.awt.Color(0, 255, 0));
        jbGuardar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar Pedido");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel1.setText("Guardar Detalles del Pedido");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setText("Pedido:");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("Producto:");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad:");

        jtDetalle = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }};
            jtDetalle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jtDetalle.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}
                },
                new String [] {
                    "ID", "PEDIDO", "PRODUCTO", "CANTIDAD", "SUBTOTAL"
                }
            ));
            jtDetalle.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(jtDetalle);

            jbBorrar.setBackground(new java.awt.Color(255, 0, 0));
            jbBorrar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jbBorrar.setText("Borrar");
            jbBorrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbBorrarActionPerformed(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
            jLabel6.setText("Detalles por Pedido");

            jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(91, 91, 91)))
                                    .addGap(0, 14, Short.MAX_VALUE))
                                .addComponent(jcbPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jLabel1)))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(315, 315, 315))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 14, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jcbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jcbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(53, 53, 53)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(jsCantidad.getValue().toString())>0){
        int x = JOptionPane.showConfirmDialog(this, "Esta seguro guardar?", "ATENCION!!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (x == JOptionPane.YES_OPTION) {
            Pedido ped= (Pedido)jcbPedido.getSelectedItem();
        Producto pro=(Producto) jcbProducto.getSelectedItem();
        int cantidad = (Integer) jsCantidad. getValue(); 
        DetallePedido dp = new DetallePedido(ped,pro,cantidad);
        
        detalleD.guardarDetallePedido(dp);
        
        }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una cantidad");
        }
        cargaDatosXPedido();
        this.jsCantidad.setValue(0);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPedidoActionPerformed

        cargaDatosXPedido();
    }//GEN-LAST:event_jcbPedidoActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int filaSeleccionada=jtDetalle.getSelectedRow();
        if(filaSeleccionada!=-1){
            int x = JOptionPane.showConfirmDialog(this, "Esta seguro de borrar?", "ATENCION!!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (x == JOptionPane.YES_OPTION) {
                int id=Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());
                detalleD.borrarDetalle(id);
                cargaDatosXPedido();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un detalle a borrar");
            }
    }//GEN-LAST:event_jbBorrarActionPerformed
 public void cargarPedidos(){
     List<Pedido> pedidos=new ArrayList<>();
     pedidos.addAll(pedidoD.obtenerPedidosActivos());
      for(Pedido item:pedidos){
            jcbPedido.addItem(item);
      }
 }
 public void cargarProductos(){
          List<Producto> productos=productoD.obtenerProductosDisponibles();
      for(Producto item:productos){
            jcbProducto.addItem(item);
      }
 }
 public void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("PEDIDO");
        columnas.add("PRODUCTO");
        columnas.add("CANTIDAD");
        columnas.add("SUBTOTAL");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jtDetalle.setModel(modelo);
  }

public void borraFilasTabla(){

        int a =modelo.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo.removeRow(i);
           }
}
public void cargaDatosXPedido(){
    
        borraFilasTabla();
           //Llenar filas
        Pedido p=(Pedido)jcbPedido.getSelectedItem();
        List<DetallePedido> lista = detalleD.ObtenerDetallesXPedido(p.getIdPedido());
        
        for(DetallePedido dp:lista){
        
            modelo.addRow(new Object[]{dp.getIdDetalle(),dp.getPedido(),dp.getProducto(),dp.getCantidad(),dp.getMonto()});
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Pedido> jcbPedido;
    private javax.swing.JComboBox<Producto> jcbProducto;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JTable jtDetalle;
    // End of variables declaration//GEN-END:variables
}
