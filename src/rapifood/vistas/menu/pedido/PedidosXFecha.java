/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.vistas.menu.pedido;

import java.awt.Container;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import rapifood.entidades.DetallePedido;
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
public class PedidosXFecha extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo=new DefaultTableModel();
            PedidoData pd;
   MesaData md;
   MeseroData meseroD;
   
    public PedidosXFecha() {
        initComponents();
  
        this.setLocation(350, 10);
        Conexion c=new Conexion();
        pd=new PedidoData(c);
        md=new MesaData(c);
        meseroD=new MeseroData(c);
        armaCabeceraTabla();
        cargarMeseros();
    
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);//activar la x
        this.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI(); Container north = (Container)ui.getNorthPane(); north.remove(0); north.validate();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jButtonMesero = new javax.swing.JButton();
        jcbMesero = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jbBuscar.setBackground(new java.awt.Color(0, 102, 254));
        jbBuscar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar por Fecha");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jTabla = new javax.swing.JTable(){
            @Override
            public Class<?> getColumnClass(int columna) {

                if(columna==3){
                    return Boolean.class;
                }
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {

                return false;
            }

        };
        jTabla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);

        jButtonMesero.setBackground(new java.awt.Color(0, 102, 255));
        jButtonMesero.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jButtonMesero.setText("Buscar Mesero");
        jButtonMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMeseroActionPerformed(evt);
            }
        });

        jcbMesero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setText("Mesero:");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel2.setText("Cierre de Pedidos");

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMesero)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMesero)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMesero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        cargaDatosXPedido();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jButtonMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMeseroActionPerformed
        // TODO add your handling code here:
        cargaDatosXMesero();
    }//GEN-LAST:event_jButtonMeseroActionPerformed
public void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("MESA");
        columnas.add("MESERO");
        columnas.add("ESTADO");
        columnas.add("TOTAL");
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
public void cargaDatosXPedido(){
    if(jDateChooser1.getDate()==null){
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha valida");
    }else{
        int año= jDateChooser1.getCalendar().get(Calendar.YEAR);
        int mes = jDateChooser1.getCalendar().get(Calendar.MONTH);
        int day = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);

        LocalDate fecha =LocalDate.of(año, ++mes, day);
        borraFilasTabla();
           //Llenar filas
        
        List<Pedido> lista = pd.buscarPedidoXFecha(fecha);
        for(Pedido dp:lista){
        
            modelo.addRow(new Object[]{dp.getIdPedido(),dp.getMesa(),dp.getMesero(),dp.isEstadoPedido(),pd.obtenerTotal(dp.getIdPedido())});
            
        }
    }
}
 public void cargarMeseros(){
      List<Mesero> meseros=meseroD.obtenerMeseros();
      for(Mesero item:meseros){
            jcbMesero.addItem(item);
      }
 }
 public void cargaDatosXMesero(){
     if(jDateChooser2.getDate()==null){
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha valida");
    }else{
        int año= jDateChooser2.getCalendar().get(Calendar.YEAR);
        int mes = jDateChooser2.getCalendar().get(Calendar.MONTH);
        int day = jDateChooser2.getCalendar().get(Calendar.DAY_OF_MONTH);

        LocalDate fecha =LocalDate.of(año, ++mes, day);
        borraFilasTabla();
           //Llenar filas
        Mesero m=(Mesero)jcbMesero.getSelectedItem();
        List<Pedido> lista = pd.buscarPedidoDeMesero(fecha,m.getIdMesero());
        if(lista.size()==0){
            
        }else{
            for(Pedido dp:lista){
        
            modelo.addRow(new Object[]{dp.getIdPedido(),dp.getMesa(),dp.getMesero(),dp.isEstadoPedido(),pd.obtenerTotal(dp.getIdPedido())});
            
            }
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMesero;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<Mesero> jcbMesero;
    // End of variables declaration//GEN-END:variables
}
