/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import com.mysql.jdbc.Connection;
import conexionSQL.conexionSQL;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEFFERSON
 */
public class Generar_Carnet extends javax.swing.JFrame {

      conexionSQL cc = new conexionSQL();
       Connection con = cc.conexion();
    /**
     * Creates new form Generar_Carnet
     */
    public Generar_Carnet() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
    }
    
     public void limpiarCajas() {
        txtCodigo.setText("");
        txtplaca.setText("");
        txtci.setText("");
        txtregistro.setText("");
        txtcarnet.setText("");
        jLabelFotoA.setIcon(null);
        jLabelFotoP.setIcon(null);
    }
    
    
    
      public void mostrarDatos() {
        String[] titulos = {"CODIGO", "PLACA", "C I", "FECHA DE REGISTRO", "FECHA LIMITE"};
        String[] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "select * from tb_generacion";
     //   String SQL = "select * from tb_identificacion_vehiculo";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                //PARTE DE  LA BASE DE DATOS MYSQL
                registros[0] = rs.getString("cod_registro");
                registros[1] = rs.getString("placa_iv");
                registros[2] = rs.getString("ci_propietario");
                registros[3] = rs.getString("fecha_registro");
                registros[4] = rs.getString("duracion_carnet");
               // registros[5] = rs.getString("foto_A");
              //  registros[6] = rs.getString("foto_P");
                modelo.addRow(registros);
            }
            Tabla_generacion.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MOSTRAR DATOS ERROR" + e.getMessage());
        }
        }
      
      
       public void insertarDatos() {
         
        try {
            String SQL = "insert into tb_identificacion_vehiculo(cod_registro,placa_iv,ci_propietario,fecha_registro,duracion_carnet)values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
          //  pst.setString(0, txtci.getText());
       
            pst.setString(1, txtCodigo.getText());
            pst.setString(2, txtplaca.getText());
            pst.setString(3, txtci.getText());
            pst.setString(4, txtregistro.getText());
            pst.setString(5, txtcarnet.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro ERROR" + e.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabelFotoA = new javax.swing.JLabel();
        txtplaca = new javax.swing.JLabel();
        txtci = new javax.swing.JLabel();
        txtregistro = new javax.swing.JTextField();
        txtcarnet = new javax.swing.JTextField();
        jLabelFotoP = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_generacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVEHICULO = new javax.swing.JButton();
        btnPROPIETARIO = new javax.swing.JButton();
        btnNUEVO = new javax.swing.JButton();
        btnREGISTRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFotoA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabelFotoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 100));

        txtplaca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 80, 20));

        txtci.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtci, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, 20));

        txtregistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 90, -1));

        txtcarnet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtcarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, -1));

        jLabelFotoP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabelFotoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 60, 70));

        txtCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1234.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 200));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 330, 200));

        jLabel3.setText("BUSQUEDA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 20));

        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 180, -1));

        Tabla_generacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_generacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_generacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_generacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 650, 190));

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setText("GENERAR CARNET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 200, -1));

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 110, -1));

        jButton2.setText("Menu Principal");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, -1, -1));

        btnVEHICULO.setText("FOTO VEHICULO");
        btnVEHICULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVEHICULOActionPerformed(evt);
            }
        });
        jPanel1.add(btnVEHICULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        btnPROPIETARIO.setText("FOTO PROPIETARIO");
        btnPROPIETARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROPIETARIOActionPerformed(evt);
            }
        });
        jPanel1.add(btnPROPIETARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 140, -1));

        btnNUEVO.setText("NUEVO");
        btnNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUEVOActionPerformed(evt);
            }
        });
        jPanel1.add(btnNUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 80, -1));

        btnREGISTRAR.setText("REGISTRAR");
        btnREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(btnREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       
        // TODO add your handling code here:
        Toolkit tkp = jPanel2.getToolkit();
        PrintJob pjp = tkp.getPrintJob(this, null, null);
        Graphics g = pjp.getGraphics();
        jPanel2.paintAll(g);
        g.dispose();
        pjp.end();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnVEHICULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVEHICULOActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(path);
        jLabelFotoA.setIcon(icon);
    }//GEN-LAST:event_btnVEHICULOActionPerformed

    private void btnPROPIETARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROPIETARIOActionPerformed
        // TODO add your handling code here:
          JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(path);
        jLabelFotoP.setIcon(icon);
    }//GEN-LAST:event_btnPROPIETARIOActionPerformed

    private void btnNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_btnNUEVOActionPerformed

    private void btnREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGISTRARActionPerformed
        // TODO add your handling code here:
         insertarDatos();
       //  limpiarCajas();
         mostrarDatos();
    }//GEN-LAST:event_btnREGISTRARActionPerformed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
        filtrarDatos(txtbusqueda.getText());
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void Tabla_generacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_generacionMouseClicked
        // TODO add your handling code here:
         int filaSeleccionada = Tabla_generacion.rowAtPoint(evt.getPoint());
        txtCodigo.setText(Tabla_generacion.getValueAt(filaSeleccionada, 0).toString());
        txtplaca.setText(Tabla_generacion.getValueAt(filaSeleccionada, 1).toString());
        txtci.setText(Tabla_generacion.getValueAt(filaSeleccionada, 2).toString());
        txtregistro.setText(Tabla_generacion.getValueAt(filaSeleccionada, 3).toString());
        txtcarnet.setText(Tabla_generacion.getValueAt(filaSeleccionada, 4).toString());
    }//GEN-LAST:event_Tabla_generacionMouseClicked

    
                public void filtrarDatos(String valor) {
        String[] titulos = {"CODIGO", "PLACA", "C I", "FECHA DE REGISTRO", "FECHA LIMITE"};
        String[] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "select * from tb_generacion where cod_registro like '%" + valor + "%'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("cod_registro");
                registros[1] = rs.getString("placa_iv");
                registros[2] = rs.getString("ci_propietario");
                registros[3] = rs.getString("fecha_registro");
                registros[4] = rs.getString("duracion_carnet");
                modelo.addRow(registros);
            }
            Tabla_generacion.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MOSTRAR DATOS ERROR" + e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Generar_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generar_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generar_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generar_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generar_Carnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_generacion;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnNUEVO;
    private javax.swing.JButton btnPROPIETARIO;
    private javax.swing.JButton btnREGISTRAR;
    private javax.swing.JButton btnVEHICULO;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFotoA;
    private javax.swing.JLabel jLabelFotoP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtcarnet;
    private javax.swing.JLabel txtci;
    private javax.swing.JLabel txtplaca;
    private javax.swing.JTextField txtregistro;
    // End of variables declaration//GEN-END:variables
}
