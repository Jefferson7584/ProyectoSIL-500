/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import com.mysql.jdbc.Connection;
import conexionSQL.conexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEFFERSON
 */
public class Datos_Tecnicos extends javax.swing.JFrame {
        
        conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
    /**
     * Creates new form Datos_Tecnicos
     */
    public Datos_Tecnicos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtregistro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtclase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpais = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttraccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcolor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcapacidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtradicatoria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtservicio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcilindrada = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtcarroceria = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtvehiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos_tecnicos = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtgps = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        bntregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS TECNICOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 270, 20));

        jLabel3.setText("REGISTRO DATOS TECNICOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(txtregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));

        jLabel4.setText("CLASE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));
        jPanel1.add(txtclase, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, -1));

        jLabel5.setText("MARCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));
        jPanel1.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, -1));

        jLabel6.setText("PAIS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));
        jPanel1.add(txtpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 140, -1));

        jLabel7.setText("TRACCION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 70, -1));
        jPanel1.add(txttraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 150, -1));

        jLabel8.setText("COLOR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, -1, -1));
        jPanel1.add(txtcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 140, -1));

        jLabel9.setText("CAPACIDA DE CARGA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(txtcapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 30));

        jLabel10.setText("RADICATORIA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));
        jPanel1.add(txtradicatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 150, -1));

        jLabel11.setText("TIPO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));
        jPanel1.add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 140, -1));

        jLabel12.setText("MODELO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));
        jPanel1.add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 140, -1));

        jLabel13.setText("SERVICIO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));
        jPanel1.add(txtservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 150, -1));

        jLabel14.setText("CILINDRADA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));
        jPanel1.add(txtcilindrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 140, -1));

        jLabel15.setText("TIPO DE CARROCERIA");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel1.add(txtcarroceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, -1));

        jLabel16.setText("NUMERO DE PUERTAS");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, -1));

        jLabel17.setText("TIPO DE VEHICULO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));
        jPanel1.add(txtvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 140, -1));

        tabla_datos_tecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_datos_tecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_datos_tecnicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_datos_tecnicos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1000, 150));

        jLabel18.setText("CODIGO GPS");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));
        jPanel1.add(txtgps, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 140, -1));

        jLabel20.setText("BUQUEDA :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 20));

        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 240, -1));

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        bntregistrar.setText("REGISTRAR");
        bntregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(bntregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, -1, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        btnPrincipal.setText("MENU PRINCIPAL");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntregistrarActionPerformed
        // TODO add your handling code here:
            insertarDatos();
            limpiarCajas();
            mostrarDatos();
     
    }//GEN-LAST:event_bntregistrarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        eliminarRegistros();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void tabla_datos_tecnicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_datos_tecnicosMouseClicked
        // TODO add your handling code here:
           int filaSeleccionada = tabla_datos_tecnicos.rowAtPoint(evt.getPoint());
        txtregistro.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 0).toString());
        txtclase.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 1).toString());
        txtmarca.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 2).toString());
        txtpais.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 3).toString());
        txttraccion.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 4).toString());
        txtcolor.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 5).toString());
        txtcapacidad.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 6).toString());
        txtradicatoria.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 7).toString());
        txttipo.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 8).toString());
        txtmodelo.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 9).toString());
        txtservicio.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 10).toString());
        txtcilindrada.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 11).toString());
        txtcarroceria.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 12).toString());
        txtnumero.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 13).toString());
        txtvehiculo.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 14).toString());
        txtgps.setText(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 15).toString());
        
      //  cbMateria.setSelectedItem(tabla_datos_tecnicos.getValueAt(filaSeleccionada, 3));
    }//GEN-LAST:event_tabla_datos_tecnicosMouseClicked

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
         filtrarDatos(txtbusqueda.getText());
    }//GEN-LAST:event_txtbusquedaActionPerformed
 
    public void filtrarDatos(String valor) {
        String[] titulos = {"REGISTRO","CLASE","MARCA", "PAIS", "TRACCION", "COLOR", "CAPACIDAD DE CARGA",
            "RADICATORIA", "TIPO", "MODELO", "SERVICIO", "CILINDRADA", "TIPO DE CARROCERIA", "NUMERO DE PUERTAS", "TIPO DE VEHICULO", "CODIGO GPS"};
        String[] registros = new String[17];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "select * from tb_datos_tecnicos where reg_datos_tec like '%" + valor + "%'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("reg_datos_tec");
                registros[1] = rs.getString("clase");
                registros[2] = rs.getString("marca");
                registros[3] = rs.getString("pais");
                registros[4] = rs.getString("traccion");
                registros[5] = rs.getString("color");
                registros[6] = rs.getString("capacidad_de_carga");
                registros[7] = rs.getString("radicatoria");
                registros[8] = rs.getString("tipo");
                registros[9] = rs.getString("modelo");
                registros[10] = rs.getString("servicio");
                registros[11] = rs.getString("cilindrada");
                registros[12] = rs.getString("tipo_carroceria");
                registros[13] = rs.getString("nro_de_puertas");
                registros[14] = rs.getString("tipo_vehiculo");
                registros[15] = rs.getString("codigo_gps");
                modelo.addRow(registros);
            }
            tabla_datos_tecnicos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MOSTRAR DATOS ERROR" + e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public void limpiarCajas() {
        txtregistro.setText("");
        txtclase.setText("");
        txtmarca.setText("");
        txtpais.setText("");
        txttraccion.setText("");
        txtcolor.setText("");
        txtcapacidad.setText("");
        txtradicatoria.setText("");
        txttipo.setText("");
        txtmodelo.setText("");
        txtservicio.setText("");
        txtcilindrada.setText("");
        txtcarroceria.setText("");
        txtnumero.setText("");
        txtvehiculo.setText("");
        txtgps.setText("");

    }
        public void mostrarDatos() {
        String[] titulos = {"REGISTRO","CLASE","MARCA", "PAIS", "TRACCION", "COLOR", "CAPACIDAD DE CARGA",
            "RADICATORIA", "TIPO", "MODELO", "SERVICIO", "CILINDRADA", "TIPO DE CARROCERIA", "NUMERO DE PUERTAS", "TIPO DE VEHICULO", "CODIGO GPS" };
        String[] registros = new String[17];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "select * from tb_datos_tecnicos";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                //PARTE DE BASE DE DATOS MYSQL
                registros[0] = rs.getString("reg_datos_tec");
                registros[1] = rs.getString("clase");
                registros[2] = rs.getString("marca");
                registros[3] = rs.getString("pais");
                registros[4] = rs.getString("traccion");
                registros[5] = rs.getString("color");
                registros[6] = rs.getString("capacidad_de_carga");
                registros[7] = rs.getString("radicatoria");
                registros[8] = rs.getString("tipo");
                registros[9] = rs.getString("modelo");
                registros[10] = rs.getString("servicio");
                registros[11] = rs.getString("cilindrada");
                registros[12] = rs.getString("tipo_carroceria");
                registros[13] = rs.getString("nro_de_puertas");
                registros[14] = rs.getString("tipo_vehiculo");
                registros[15] = rs.getString("codigo_gps");
                modelo.addRow(registros);
            }
            tabla_datos_tecnicos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MOSTRAR DATOS ERROR" + e.getMessage());
        }
        }
        public void insertarDatos () {
        try {
            String SQL = "insert into tb_datos_tecnicos(reg_datos_tec,clase,marca,pais,traccion,color,capacidad_de_carga,radicatoria,tipo,modelo,servicio,cilindrada,tipo_carroceria,nro_de_puertas,tipo_vehiculo,codigo_gps)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtregistro.getText());
            pst.setString(2, txtclase.getText());
            pst.setString(3, txtmarca.getText());
            pst.setString(4, txtpais.getText());
            pst.setString(5, txttraccion.getText());
            pst.setString(6, txtcolor.getText());
            pst.setDouble(7, Double.parseDouble(txtcapacidad.getText()));    
            pst.setString(8, txtradicatoria.getText());
            pst.setString(9, txttipo.getText());
            pst.setString(10, txtmodelo.getText());
            pst.setString(11, txtservicio.getText());
            pst.setString(12, txtcilindrada.getText());
            pst.setString(13, txtcarroceria.getText());
            pst.setString(14, txtnumero.getText());
            pst.setString(15, txtvehiculo.getText());
            pst.setString(16, txtgps.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro ERROR" + e.getMessage());
        }

        }
        public void actualizarDatos() {
        try {
            String SQL = "update tb_datos_tecnicos set clase=?,marca=?,pais=?,traccion=?,color=?,capacidad_de_carga=?,radicatoria=?,tipo=?,modelo=?,sevicio=?,cilindrada=?,tipo_carroceria=?,nro_de_puertas=?,tipo_vehiculo=?,codigo_gps=? where reg_datos_tec=?";
            int filaSeleccionado = tabla_datos_tecnicos.getSelectedRow();
            String dao = (String) tabla_datos_tecnicos.getValueAt(filaSeleccionado, 0);
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setString(0, txtregistro.getText());
            pst.setString(1, txtclase.getText());
            pst.setString(2, txtmarca.getText());
            pst.setString(3, txtpais.getText());
            pst.setString(4, txttraccion.getText());
            pst.setString(5, txtcolor.getText());
            pst.setString(6, txtcapacidad.getText());
            pst.setString(7, txtradicatoria.getText());
            pst.setString(8, txttipo.getText());
            pst.setString(9, txtmodelo.getText());
            pst.setString(10, txtservicio.getText());
            pst.setString(11, txtcilindrada.getText());
            pst.setString(12, txtcarroceria.getText());
            pst.setString(13, txtnumero.getText());
            pst.setString(14, txtvehiculo.getText());
            pst.setString(15, txtgps.getText());
            pst.setString(16, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro Editado Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Editado ERROR" + e.getMessage());
        }
    }
        public void eliminarRegistros() {
        int filaSeleccionada = tabla_datos_tecnicos.getSelectedRow();
        try {
            String SQL = "delete from tb_datos_tecnicos where reg_datos_tec=" + tabla_datos_tecnicos.getValueAt(filaSeleccionada, 0);
            Statement st = con.createStatement();
            int n = st.executeUpdate(SQL);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro ELIMINADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eliminar Registro ERROR" + e.getMessage());
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datos_Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Tecnicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntregistrar;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_datos_tecnicos;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtcapacidad;
    private javax.swing.JTextField txtcarroceria;
    private javax.swing.JTextField txtcilindrada;
    private javax.swing.JTextField txtclase;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtgps;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtradicatoria;
    private javax.swing.JTextField txtregistro;
    private javax.swing.JTextField txtservicio;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextField txttraccion;
    private javax.swing.JTextField txtvehiculo;
    // End of variables declaration//GEN-END:variables
}
