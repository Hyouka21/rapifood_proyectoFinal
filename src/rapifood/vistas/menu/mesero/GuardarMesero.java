/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.vistas.menu.mesero;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import rapifood.entidades.Mesero;
import rapifood.modelo.*;

/**
 *
 * @author Hyouka
 */
public class GuardarMesero extends javax.swing.JInternalFrame {
    MeseroData md;
    private DefaultTableModel modelo=new DefaultTableModel();
    public GuardarMesero() {
        initComponents();
        this.setLocation(250, 130);
        Conexion c=new Conexion();
        md=new MeseroData(c);
        armaCabeceraTabla();
        cargaDatosMesero();
        regularTamañoColumna();
        
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);//activar la x
        this.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI(); Container north = (Container)ui.getNorthPane(); north.remove(0); north.validate();
    }

    public void regularTamañoColumna(){
        jTabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTabla.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTabla.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTabla.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTabla.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTabla.getColumnModel().getColumn(5).setPreferredWidth(40);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtCuil = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jTabla = new javax.swing.JTable(){
            @Override
            public Class<?> getColumnClass(int columna) {

                if(columna==5){
                    return Boolean.class;
                }
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==0){
                    return false;}
                return true;
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

        jtDni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setText("Dni:");

        jtCuil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtCuil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        jtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        jtApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));

        jcbEstado.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jcbEstado.setText("Activo");

        jbGuardar.setBackground(new java.awt.Color(0, 255, 0));
        jbGuardar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setText("Cuil:");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel6.setText("Guardar Mesero");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel7.setText("Meseros");

        jbModificar.setBackground(new java.awt.Color(0, 255, 0));
        jbModificar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jbModificar.setText("Guardar Cambios");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 92, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtCuil, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtDni, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(158, 158, 158))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbEstado)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        String val="^[0-9]+$";
            String nomb="[a-z A-Z]*";
            if(jtDni.getText().matches(val)&&jtDni.getText().length()<=8){
            if(jtCuil.getText().matches(val)&&jtCuil.getText().length()<=10){
            if(jtNombre.getText().matches(nomb) && jtNombre.getText().length() !=0){
            if(jtApellido.getText().matches(nomb) && jtApellido.getText().length() !=0){
 //////////////////////Para la proxima usar string en un cuil///////////////////////////////////    
                int dni=Integer.parseInt(jtDni.getText());
                int cuit=Integer.parseInt(jtCuil.getText());
                String nombre=jtNombre.getText();
                String apellido=jtApellido.getText();
                boolean est=jcbEstado.isEnabled();
                Mesero m= new Mesero(dni,cuit,nombre,apellido,est);
                int x = JOptionPane.showConfirmDialog(this, "Esta seguro guardar?", "ATENCION!!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (x == JOptionPane.YES_OPTION) {
                md.guardarMesero(m);
                porDefecto();
                }
            }else{
            JOptionPane.showMessageDialog(this, "Ingrese un apellido valido");
            }
            }else{
            JOptionPane.showMessageDialog(this, "Ingrese un nombre valido");
            }
            }else{
                JOptionPane.showMessageDialog(this, "El cuit es invalido\n\nRecuerde debe tener 10 digitos o menos");  
            }
            }else{        
            JOptionPane.showMessageDialog(this, "El dni es invalido\n\nRecuerde debe tener 8 digitos o menos");
            }
     cargaDatosMesero();       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada=jTabla.getSelectedRow();
         
        if(filaSeleccionada!=-1){
                    
            int id=(Integer) modelo.getValueAt(filaSeleccionada, 0);
            
            String val="^[0-9]+$";
            String nomb="[a-z A-Z]*";
                 if(modelo.getValueAt(filaSeleccionada, 1).toString().matches(val) && modelo.getValueAt(filaSeleccionada, 1).toString().length()<=8){
                    if(modelo.getValueAt(filaSeleccionada, 2).toString().matches(val) && modelo.getValueAt(filaSeleccionada, 2).toString().length()<=10){
                        if(modelo.getValueAt(filaSeleccionada, 3).toString().matches(nomb) && modelo.getValueAt(filaSeleccionada, 3).toString().length() != 0){
                            if(modelo.getValueAt(filaSeleccionada, 4).toString().matches(nomb) && modelo.getValueAt(filaSeleccionada, 4).toString().length() != 0){     
                      
                                int dni=Integer.parseInt(modelo.getValueAt(filaSeleccionada, 1).toString());
                                int cuit=Integer.parseInt(modelo.getValueAt(filaSeleccionada, 2).toString());
                                String nombre=modelo.getValueAt(filaSeleccionada, 3).toString();
                                String apellido=modelo.getValueAt(filaSeleccionada, 4).toString();
                                boolean est=Boolean.valueOf(modelo.getValueAt(filaSeleccionada, 5).toString());
                                Mesero m;
                                m = md.buscarMesero(id);
                                m.setDni(dni);
                                m.setCuit(cuit);
                                m.setNombre(nombre);
                                m.setApellido(apellido);
                                m.setEstado(est);
                                int x =JOptionPane.showConfirmDialog(this, "Desea cambiar Producto?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                                if(x== JOptionPane.YES_OPTION){
                                    md.actualizarMesero(m);}
                                    cargaDatosMesero();
           
                            }else{JOptionPane.showMessageDialog(this,"El apellido a modificar es invalido"); }
                        }else{JOptionPane.showMessageDialog(this,"El nombre a modificar es invalido"); }
                    }else{JOptionPane.showMessageDialog(this,"El cuit a modificar es invalido\n\nRecuerde debe tener 10 digitos o menos"); }
                }else{JOptionPane.showMessageDialog(this,"El dni a modificar es invalido\n\nRecuerde debe tener 8 digitos o menos"); }
        
        }
        cargaDatosMesero();
    }//GEN-LAST:event_jbModificarActionPerformed
public void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("ID");
        columnas.add("DNI");
        columnas.add("CUIT");
        columnas.add("NOMBRE");
        columnas.add("APELLIDO");
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
public void cargaDatosMesero(){
    
        borraFilasTabla();
           //Llenar filas
       
        List<Mesero> lista = md.obtenerMeseros();
        
        for(Mesero m:lista){
        
            modelo.addRow(new Object[]{m.getIdMesero(),m.getDni(),m.getCuit(),m.getNombre(),m.getApellido(),m.isEstado()});
        }
}
public void porDefecto(){
    jtApellido.setText("");
    jtNombre.setText("");
    jtCuil.setText("");
    jtDni.setText("");
    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCuil;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
