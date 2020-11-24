/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.vistas.menu.pedido;

import java.awt.Container;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import rapifood.entidades.DetallePedido;
import rapifood.entidades.Mesa;
import rapifood.entidades.Mesero;
import rapifood.entidades.Pedido;
import rapifood.modelo.Conexion;
import rapifood.modelo.MesaData;
import rapifood.modelo.MeseroData;
import rapifood.modelo.PedidoData;

/**
 *
 * @author Hyouka
 */
public class GuardarPedido extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
   PedidoData pd;
   MesaData md;
   MeseroData meseroD;
    public GuardarPedido() {
        initComponents();
        this.setLocation(250, 100);
        Conexion c=new Conexion();
        pd=new PedidoData(c);
        md=new MesaData(c);
        meseroD=new MeseroData(c);
        this.cargarMesas();
        this.cargarMeseros();
        armaCabeceraTabla();
        cargaPedido();
        regularTamañoColumna();
        
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);//activar la x
        this.setFrameIcon(null); //sacar la flecha izquierda
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI(); Container north = (Container)ui.getNorthPane(); north.remove(0); north.validate(); north.repaint();
        
    }

    public void regularTamañoColumna(){
        jTabla.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTabla.getColumnModel().getColumn(1).setPreferredWidth(15);
        jTabla.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTabla.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTabla.getColumnModel().getColumn(4).setPreferredWidth(20);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbMesero = new javax.swing.JComboBox<>();
        jcbMesa = new javax.swing.JComboBox<>();
        jcheakEstado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbGuardarCambios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jbAct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);

        jcbMesero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jcbMesa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jcheakEstado.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jcheakEstado.setText("Activo");

        jTabla = new javax.swing.JTable(){
            @Override
            public Class<?> getColumnClass(int columna) {

                if(columna==4){
                    return Boolean.class;
                }
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==4){
                    return true;}
                return false;
            }
        };
        jTabla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "MESA", "MESERO", "FECHA", "ESTADO"
            }
        ));
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);

        jbGuardar.setBackground(new java.awt.Color(0, 255, 0));
        jbGuardar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel1.setText("Guardar Pedido");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel2.setText("Pedidos");

        jbGuardarCambios.setBackground(new java.awt.Color(0, 255, 0));
        jbGuardarCambios.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jbGuardarCambios.setText("Guardar Cambios");
        jbGuardarCambios.setBorder(null);
        jbGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCambiosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("Mesas:");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setText("Meseros:");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setText("Buscar Pedido:");

        jbBuscar.setBackground(new java.awt.Color(0, 102, 255));
        jbBuscar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setBorderPainted(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbAct.setBackground(new java.awt.Color(0, 102, 255));
        jbAct.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jbAct.setText("Actualizar");
        jbAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setText("Estado:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcheakEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(201, 201, 201))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAct, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAct, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcheakEstado)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int x =JOptionPane.showConfirmDialog(this, "Desea Guardar el pedido?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x== JOptionPane.YES_OPTION){
                Mesa m=(Mesa)this.jcbMesa.getSelectedItem();
                Mesero mes=(Mesero)this.jcbMesero.getSelectedItem();
                boolean act= this.jcheakEstado.isEnabled();
                Pedido p=new Pedido(m,mes,act);
                pd.guardarPedido(p);
                cargaPedido();
            }      
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        cargaPedidoXFecha();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActActionPerformed
        
        jDateChooser1.setDate(null);
        cargaPedido();
    }//GEN-LAST:event_jbActActionPerformed

    private void jbGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarCambiosActionPerformed
        
        int x = JOptionPane.showConfirmDialog(this, "Esta seguro ?", "ATENCION!!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (x == JOptionPane.YES_OPTION) {
        int filaSeleccionada=jTabla.getSelectedRow();
        if(filaSeleccionada!=-1){
            int id=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            Pedido p=pd.buscarPedido(id);
            boolean est=(boolean)modelo.getValueAt(filaSeleccionada, 4);
            p.setEstadoPedido(est);
            pd.actualizarPedido(p);
            cargaPedido();
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un pedido a modificar");
        }
        }
    }//GEN-LAST:event_jbGuardarCambiosActionPerformed
 public void cargarMesas(){
     List<Mesa> mesas=new ArrayList<>();
     mesas.addAll(md.obtenerMesasDisponibles());
     for(Mesa item:mesas){
           jcbMesa.addItem(item);
     }
 }
 public void cargarMeseros(){
      List<Mesero> meseros=meseroD.obtenerMeserosActivos();
      for(Mesero item:meseros){
            jcbMesero.addItem(item);
      }
 }
 public void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("MESA");
        columnas.add("MESERO");
        columnas.add("FECHA");
        columnas.add("ESTADO");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jTabla.setModel(modelo);
  }

public void borraFilasTabla(){

        int a =modelo.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo.removeRow(i);
           }
}
public void cargaPedido(){
    
        borraFilasTabla();
           //Llenar filas
        List<Pedido> lista = pd.obtenerPedidos();
        
        for(Pedido p:lista){
        
            modelo.addRow(new Object[]{p.getIdPedido(),p.getMesa(),p.getMesero(),p.getFechaPedido(),p.isEstadoPedido()});
        }
}
public void cargaPedidoXFecha(){
    if(jDateChooser1.getDate()==null){
    JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha valida");
    }else{
        LocalDate fecha = LocalDateTime.ofInstant(jDateChooser1.getDate().toInstant(), ZoneId.systemDefault()).toLocalDate();

        borraFilasTabla();
           //Llenar filas
        List<Pedido> lista = pd.buscarPedidoXFecha(fecha);

        for(Pedido p:lista){
        
            modelo.addRow(new Object[]{p.getIdPedido(),p.getMesa(),p.getMesero(),p.getFechaPedido(),p.isEstadoPedido()});
        }
    }
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbAct;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbGuardarCambios;
    private javax.swing.JComboBox<Mesa> jcbMesa;
    private javax.swing.JComboBox<Mesero> jcbMesero;
    private javax.swing.JCheckBox jcheakEstado;
    // End of variables declaration//GEN-END:variables
}
