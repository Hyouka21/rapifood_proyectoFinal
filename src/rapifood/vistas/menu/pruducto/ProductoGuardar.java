/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.vistas.menu.pruducto;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import rapifood.entidades.Producto;
import rapifood.modelo.*;

/**
 *
 * @author Hyouka
 */
public class ProductoGuardar extends javax.swing.JInternalFrame {

  ProductoData pd;
  private DefaultTableModel modelo=new DefaultTableModel();
    public ProductoGuardar() {
        initComponents();
        Conexion c=new Conexion();
        pd=new ProductoData(c);
        this.setLocation(250, 100);
        armaCabeceraTabla();
        cargaDatosProducto();

        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);//activar la x
        this.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI(); Container north = (Container)ui.getNorthPane(); north.remove(0); north.validate();
        
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jtxtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setText("Precio:");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setText("Guardar Productos");

        jtxtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jtxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPrecioKeyTyped(evt);
            }
        });

        jcbEstado.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jcbEstado.setText("Activo");
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(0, 255, 0));
        jbGuardar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jtProductos = new javax.swing.JTable(){
            @Override
            public Class<?> getColumnClass(int columna) {
                if(columna==3){
                    return Boolean.class;
                }
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==1 || column ==2 || column ==3){
                    return true;}
                return false;
            }
        };
        jtProductos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtProductos);

        jbModificar.setBackground(new java.awt.Color(0, 255, 0));
        jbModificar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jbModificar.setText("Guardar Cambios");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setText("Estado:");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel5.setText("Modificar Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNombre)
                            .addComponent(jtxtPrecio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbEstado)
                                .addGap(0, 111, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbModificar)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jcbEstado))
                                .addGap(34, 34, 34)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        if(jtxtNombre.getText().equalsIgnoreCase("")||jtxtPrecio.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Uno de los campos esta vacio!");
        }
        else{
             String val="[0-9]*"; // ACOMODAR LA CONSULTA PARA PODER INGRESAR PUNTOS O NO
            String nomb="[a-z \\s A-Z]*";
            if(jtxtNombre.getText().matches(nomb) && jtxtNombre.getText().length()!=0){
                if(jtxtPrecio.getText().matches(val) && jtxtPrecio.getText().length()!=0){  
                        int x =JOptionPane.showConfirmDialog(this, "Esta seguro?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                    if(x== JOptionPane.YES_OPTION){
                        String nombre=jtxtNombre.getText();
                        double precio=Double.valueOf(jtxtPrecio.getText());
                        boolean estado=jcbEstado.isEnabled();
                         Producto p= new Producto(nombre,precio,estado);
                        pd.guardarProducto(p);
                        
                        cargaDatosProducto();
                        limpiarCampos();
                        }
                                }else{
                    JOptionPane.showMessageDialog(this, "El precio es invalido \n ej: 149.9");
                        }
                    }else{
                    JOptionPane.showMessageDialog(this, "El nombre es invalido ");
                    }
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPrecioKeyTyped

            
    }//GEN-LAST:event_jtxtPrecioKeyTyped

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped

    }//GEN-LAST:event_jtxtNombreKeyTyped

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
          int filaSeleccionada=jtProductos.getSelectedRow();
         
        if(filaSeleccionada!=-1){
                    
            int id=(Integer) modelo.getValueAt(filaSeleccionada, 0);
            
            String val="^[0-9]+\\.[0-9]+$";
            String nomb="[a-z \\s A-Z]*";
            if(modelo.getValueAt(filaSeleccionada, 1).toString().matches(nomb) && modelo.getValueAt(filaSeleccionada, 1).toString().length()!=0 && modelo.getValueAt(filaSeleccionada, 1).toString().length()<=14){
            if(modelo.getValueAt(filaSeleccionada, 2).toString().matches(val) && modelo.getValueAt(filaSeleccionada, 2).toString().length() !=0){
                String nom= modelo.getValueAt(filaSeleccionada, 1).toString();
            double precio=Double.valueOf(modelo.getValueAt(filaSeleccionada, 2).toString());
            boolean b = Boolean.valueOf(modelo.getValueAt(filaSeleccionada, 3).toString());
            int x =JOptionPane.showConfirmDialog(this, "Desea cambiar Producto?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x== JOptionPane.YES_OPTION){
                Producto i;
                i = pd.buscarProducto(id);
                i.setNombreProducto(nom);
                i.setPrecio(precio);
                i.setEstadoProducto(b);
                
                pd.actualizarProducto(i);
                cargaDatosProducto();
           }
        }else{
            JOptionPane.showMessageDialog(this, "ingrese un numero valido");
            cargaDatosProducto();
            }}else{
            JOptionPane.showMessageDialog(this, "ingrese un nombre valido");
            cargaDatosProducto();
            }
            cargaDatosProducto();
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtxtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreKeyReleased
public void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("NOMBRE");
        columnas.add("PRECIO");
        columnas.add("ESTADO");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jtProductos.setModel(modelo);
  }

public void borraFilasTabla(){

        int a =modelo.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo.removeRow(i);
           }
}
public void cargaDatosProducto(){
    
        borraFilasTabla();
           //Llenar filas
        
        List<Producto> lista = pd.obtenerProductos();
        
        for(Producto p:lista){
        
            modelo.addRow(new Object[]{p.getIdProducto(),p.getNombreProducto(),p.getPrecio(),p.isEstadoProducto()});
        }
    }
public void limpiarCampos(){
    jtxtNombre.setText("");
    jtxtPrecio.setText("");
    jcbEstado.setSelected(false);
}
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    // End of variables declaration//GEN-END:variables
}
