
package rapifood.vistas.menu.reserva;

import java.awt.Container;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import rapifood.entidades.Mesa;
import rapifood.entidades.Reserva;
import rapifood.modelo.Conexion;
import rapifood.modelo.MesaData;
import rapifood.modelo.ReservaData;


public class ReservaRegistrar extends javax.swing.JInternalFrame {

    Conexion c = new Conexion();
    Reserva reserva;
    ReservaData rd;
    MesaData md;
    private int cant=0;
    boolean guarda=false;
    private DefaultTableModel modelo=new DefaultTableModel();
    
    public ReservaRegistrar() {
        initComponents();
        rd= new ReservaData(c);
        md= new MesaData(c);
        modelo.isCellEditable(0, 1);
        this.setLocation(10, 100);
        Conexion c = new Conexion();
        this.setResizable(false);
        this.armaCabeceraTabla();
        this.cargaDatosReserva();
        this.cargarComboBox();
        ((DefaultEditor) jSpinnerHora.getEditor()).getTextField().setEditable(false);
        ((DefaultEditor) jSpinnerMins.getEditor()).getTextField().setEditable(false);
 
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);//activar la x
        this.setFrameIcon(null); //sacar la flecha izquierda
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI(); Container north = (Container)ui.getNorthPane(); north.remove(0); north.validate(); north.repaint();//repasar
        
        //ACOMODAR TAMAÑO DE LAS COLUMNAS
        regularTamañoColumna();
       
    }
    public void regularTamañoColumna(){
        jTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        jTable.getColumnModel().getColumn(6).setPreferredWidth(130);
        jTable.getColumnModel().getColumn(7).setPreferredWidth(135);
        jTable.getColumnModel().getColumn(8).setPreferredWidth(40);
    }
    
    public void cargarComboBox(){
        List<Mesa> mesas = new ArrayList<>();
        mesas.addAll(md.obtenerMesasDisponibles());
        for(Mesa it: mesas){
            jComboBoxMesa.addItem(it);
        }
    }
    public void limpiarCampos(){
        jComboBoxMesa.setSelectedIndex(0);
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldComensales.setText("");
        jTextFieldDNI.setText("");
        jCheckBoxEstado.setSelected(false);
        jDateChooserFechaReserva.setDate(null);
    }
    private void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("MESA");
        columnas.add("NOMBRE");
        columnas.add("APELLIDO");
        columnas.add("DNI");
        columnas.add("COMENSALES");
        columnas.add("FECHA RESERVA");
        columnas.add("RESERVA REGISTRADA");
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
    private void cargaDatosReserva(){
    
        borraFilasTabla();
           //Llenar filas
        
        List<Reserva> lista = rd.obtenerReservas();
        
        for(Reserva r:lista){
        
            modelo.addRow(new Object[]{r.getIdReserva(),r.getMesa(),r.getNombreCliente(),r.getApellidoCliente(),r.getDniCliente(),r.getCantidadCliente(),r.getFechaReserva().toString(),r.getFechaAhora().toString(),r.isEstadoReserva()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMesa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooserFechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldComensales = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonGuardarCambios = new javax.swing.JButton();
        jSpinnerHora = new javax.swing.JSpinner();
        jSpinnerMins = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooserBuscarFecha = new com.toedter.calendar.JDateChooser();
        jButtonBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabelmesaCant = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setText("Registrar Reserva");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setText("Mesa:");

        jComboBoxMesa.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jComboBoxMesa.setBorder(null);
        jComboBoxMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("DNI:");

        jTextFieldNombre.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre Cliente:");

        jTextFieldApellido.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setText("Apellido Cliente:");

        jTextFieldDNI.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jTextFieldDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setText("Fecha Reserva:");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setText("Estado:");

        jCheckBoxEstado.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jCheckBoxEstado.setText("Activo");
        jCheckBoxEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jCheckBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEstadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setText("Comensales: ");

        jButtonRegistrar.setBackground(new java.awt.Color(0, 255, 0));
        jButtonRegistrar.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jTextFieldComensales.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jTextFieldComensales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        jTextFieldComensales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComensalesActionPerformed(evt);
            }
        });

        jTable = new javax.swing.JTable(){
            @Override
            public Class<?> getColumnClass(int columna) {
                if(columna==8){
                    return Boolean.class;
                }
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==2 || column ==3|| column ==4|| column ==5|| column ==6|| column ==8){
                    return true;}
                return false;
            }
        };
        jTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MESA", "NOMBRE", "APELLIDO", "DNI", "COMENSALES", "FECHA RESERVA", "RESERVA REGISTRADA", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        jButtonGuardarCambios.setBackground(new java.awt.Color(0, 255, 0));
        jButtonGuardarCambios.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jButtonGuardarCambios.setText("Guardar Cambios");
        jButtonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCambiosActionPerformed(evt);
            }
        });

        jSpinnerHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        jSpinnerMins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel9.setText("Hora Reserva:");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel10.setText("Hora:");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel11.setText("Minutos:");

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel12.setText("Seleccione Fecha:");

        jButtonBuscar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonBuscar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel13.setText("Mesa Para:");

        jLabelmesaCant.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N

        jButtonActualizar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonActualizar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel13))
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCheckBoxEstado)
                                    .addComponent(jDateChooserFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(jTextFieldComensales)
                                    .addComponent(jTextFieldApellido))))
                        .addGap(14, 14, 14)
                        .addComponent(jLabelmesaCant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel12)
                                .addGap(33, 33, 33)
                                .addComponent(jDateChooserBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarCambios)
                        .addGap(284, 284, 284))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBoxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabelmesaCant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldComensales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jSpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(jSpinnerMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jCheckBoxEstado))
                                .addGap(33, 33, 33)
                                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooserBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonBuscar))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonGuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesaActionPerformed
        
        Mesa m=(Mesa)jComboBoxMesa.getSelectedItem();
        jLabelmesaCant.setText(String.valueOf(m.getCapacidadMaxima()));
    }//GEN-LAST:event_jComboBoxMesaActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
       
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldComensalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComensalesActionPerformed
        
    }//GEN-LAST:event_jTextFieldComensalesActionPerformed

    private void jCheckBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEstadoActionPerformed
        
    }//GEN-LAST:event_jCheckBoxEstadoActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        if(jTextFieldNombre.equals(" ")||jTextFieldApellido.equals(" ")||jTextFieldDNI.equals(" ")||jTextFieldComensales.equals(" ")||jDateChooserFechaReserva.getDate()==null){
            JOptionPane.showMessageDialog(this, "Uno de los campos esta vacio!");
        }else{
            String nomb= "[a-z \\s A-Z]*";
            String val="^[0-9]+$";
            int num=Integer.parseInt(jTextFieldComensales.getText());
            Mesa m=(Mesa)jComboBoxMesa.getSelectedItem();
            int cant=m.getCapacidadMaxima();
            if(jTextFieldNombre.getText().matches(nomb)){
                if(jTextFieldApellido.getText().matches(nomb)){    
                    if(jTextFieldDNI.getText().matches(val)&& jTextFieldDNI.getText().length() <= 8){
                        if(jTextFieldComensales.getText().matches(val)&& num<=cant ){
  
                                LocalTime horaActual = LocalTime.now();
                                LocalDate fechaActual = LocalDate.now();
                               
                                     //obtengo fecha del dateChooser
                                LocalDate fechaReserva = LocalDateTime.ofInstant(jDateChooserFechaReserva.getDate().toInstant(), ZoneId.systemDefault()).toLocalDate();  
                        
                                    //obtengo hora del dateChooser
                                int hora = (Integer)jSpinnerHora.getValue();
                                int mins = (Integer)jSpinnerMins.getValue();
                                
                                LocalTime horaReserva=LocalTime.of(hora, mins);
                                   
                                
                                    if(fechaReserva.compareTo(fechaActual)>0 || (horaReserva.compareTo(horaActual)>0 && fechaReserva.compareTo(fechaActual)==0)){
                                        
                                        int x =JOptionPane.showConfirmDialog(this, "Esta seguro?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                                        if(x== JOptionPane.YES_OPTION){

                                            
                                            String nombre = jTextFieldNombre.getText();
                                            String apellido= jTextFieldApellido.getText();
                                            int dni= Integer.parseInt(jTextFieldDNI.getText());
                                            int comensales =Integer.parseInt(jTextFieldComensales.getText());
                                                    
                                            boolean estado = jCheckBoxEstado.isEnabled();

                                            Reserva r = new Reserva(m,dni,nombre,apellido,fechaReserva,LocalTime.of(hora,mins,00),estado,comensales);
                                            rd.registrarReserva(r);
                                            limpiarCampos();
                                            cargaDatosReserva();
                                        }
                                        
                                    }else{
                                        JOptionPane.showMessageDialog(this, "Ingrese una fecha mayor a la actual");
                                    }
                                
                        }else{
                            JOptionPane.showMessageDialog(this, "Cantidad Comensales invalido\n recuerde que debe ser menor o igual ala capacidad de la mesa");
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "El DNI es invalido\n\n Recuerde que debe ingresarse un dni con 8 digitos o menor");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, "El apellido es invalido");
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "El nombre es invalido");
            }
                
        }
       cargaDatosReserva(); 
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosActionPerformed
          
        int filaSelec=jTable.getSelectedRow();
        Mesa m=(Mesa)jComboBoxMesa.getSelectedItem();
        int cant=m.getCapacidadMaxima();
         
        if(filaSelec!=-1){
            String nomb="[a-z \\s A-Z]*";
            String val="[0-9]*";
            String valFecha ="^[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}$";
            
            if(modelo.getValueAt(filaSelec, 1).toString().matches(val)){
                if(modelo.getValueAt(filaSelec, 2).toString().matches(nomb)){
                    if(modelo.getValueAt(filaSelec, 3).toString().matches(nomb)){
                        if(modelo.getValueAt(filaSelec, 4).toString().matches(val)&& modelo.getValueAt(filaSelec, 4).toString().length()<=8){
                            if(modelo.getValueAt(filaSelec, 5).toString().matches(val)&&Integer.parseInt(modelo.getValueAt(filaSelec, 5).toString())<=cant){
                                if(modelo.getValueAt(filaSelec, 6).toString().matches(valFecha)){
                                    //if(modelo.getValueAt(filaSelec, 7).toString().matches(valFecha)){
                                    
       
                                        int id =Integer.parseInt(modelo.getValueAt(filaSelec, 0).toString());
                                        Mesa mesa =(Mesa) modelo.getValueAt(filaSelec, 1);
                                        String nombre = modelo.getValueAt(filaSelec, 2).toString();
                                        String apellido = modelo.getValueAt(filaSelec, 3).toString();
                                        int dni = Integer.parseInt(modelo.getValueAt(filaSelec, 4).toString());
                                        int comensales = Integer.parseInt(modelo.getValueAt(filaSelec, 5).toString());
                                        
                                        String fechastr= modelo.getValueAt(filaSelec, 6).toString();
                                        
                                        String[] test = fechastr.split("T");
                                        String fecha1 = test[0];
                                        String hora1 = test[1];
                                        
                                 
                                        LocalDate fecha = LocalDate.parse(fecha1);
                                        LocalTime hora = LocalTime.parse(hora1);
                                       
                                        
                                        LocalDateTime fechaReserva = LocalDateTime.of(fecha, hora);
                                        
                                        boolean estado = Boolean.valueOf(modelo.getValueAt(filaSelec, 8).toString());
                                        
                                        int x =JOptionPane.showConfirmDialog(this, "Desea modificar la Reserva?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                                            if(x== JOptionPane.YES_OPTION){
                                                if(filaSelec!=-1){
                                                    Reserva r;
                                                    r = rd.buscarReserva(id);
                                                    r.setMesa(mesa);
                                                    r.setNombreCliente(nombre);
                                                    r.setApellidoCliente(apellido);
                                                    r.setDniCliente(dni);
                                                    r.setCantidadCliente(comensales);
                                                    r.setFechaReserva(fechaReserva);
                                                    r.setEstadoReserva(estado);

                                                    rd.actualizarReserva(r);
                                                    borraFilasTabla();
                                                    cargaDatosReserva();
                                                    guarda=true;
                                                }else{
                                                   JOptionPane.showMessageDialog(this, "Seleccione una reserva a modificar");
                                                     }
                                            }
                                  
                                    //}else{
                                      //  JOptionPane.showMessageDialog(this, "INGRESE UNA FECHA CON EL FORMATO YYYY-MM-DD");
                                    //}
                                    
                                }else{
                                    JOptionPane.showMessageDialog(this, "INGRESE UNA FECHA CON EL FORMATO YYYY-MM-DDT-hh:mm");
                                    cargaDatosReserva();
                                }
                                
                            }else{
                                JOptionPane.showMessageDialog(this, "Ingrese solo numeros en la columna COMENSALES\n\nRecuerde deben ser menores o iguales ala cantidad de mesa");
                                cargaDatosReserva();
                            }
                            
                        }else{
                            JOptionPane.showMessageDialog(this, "Ingrese solo numeros en la columna DNI\n\nRecuerde que la cantidad de digitos deben ser menores iguales a 8");
                            cargaDatosReserva();
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Ingrese solo letras en la columna APELLIDO");
                        cargaDatosReserva();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Ingrese solo letras en la columna NOMBRE");
                    cargaDatosReserva();
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Ingrese solo numeros en la columna MESA");
                cargaDatosReserva();
            }
          cargaDatosReserva();  
        } 
   
    }//GEN-LAST:event_jButtonGuardarCambiosActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if(jDateChooserBuscarFecha.getDate()!=null){
                int year= jDateChooserBuscarFecha.getCalendar().get(Calendar.YEAR);   
                int mes = jDateChooserBuscarFecha.getCalendar().get(Calendar.MONTH);   
                int day = jDateChooserBuscarFecha.getCalendar().get(Calendar.DAY_OF_MONTH);

                LocalDate fechaBuscar=LocalDate.of(year, ++mes, day);


                borraFilasTabla();

                List<Reserva> reservas = rd.buscarReservaXFecha(fechaBuscar);

                for(Reserva r:reservas){

                modelo.addRow(new Object[]{r.getIdReserva(),r.getMesa(),r.getNombreCliente(),r.getApellidoCliente(),r.getDniCliente(),r.getCantidadCliente(),r.getFechaReserva().toString(),r.getFechaAhora().toString(),r.isEstadoReserva()});
                }
            
        }else{
            JOptionPane.showMessageDialog(this, "El campo esta vacio");
        }
  
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        if(guarda){
            cant=0;
            guarda=false;
        }
        
        if(cant<1){
            cargaDatosReserva();
            cant++;
        }else{
            JOptionPane.showMessageDialog(this, "Realice algun cambio para actualizar");
        }

    }//GEN-LAST:event_jButtonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JComboBox<Mesa> jComboBoxMesa;
    private com.toedter.calendar.JDateChooser jDateChooserBuscarFecha;
    private com.toedter.calendar.JDateChooser jDateChooserFechaReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelmesaCant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerHora;
    private javax.swing.JSpinner jSpinnerMins;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldComensales;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
