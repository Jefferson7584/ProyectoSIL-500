/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import com.mysql.jdbc.Connection;
import conexionSQL.conexionSQL;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Locale;
//import javax.swing.Icon;  //BORRAR
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JEFFERSON
 */
public class Propietario extends javax.swing.JFrame {

       conexionSQL cc = new conexionSQL();
       Connection con = cc.conexion();
  //  private Icon Icon; //BORRAR
    /**
     * Creates new form Propietario
     */
    public Propietario() {
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
        txtci = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnombre2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtmaterno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtzona = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtdomicilio = new javax.swing.JTextField();
        btnQR = new javax.swing.JButton();
        btnFoto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapropietario = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnprincipal = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        txtexpedido = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        jLabelQR = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        txtnombre_foto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROPIETARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 200, -1));

        jLabel3.setText("C.I. ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));
        jPanel1.add(txtci, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, -1));

        jLabel4.setText("EXPEDIDO ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));
        jPanel1.add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 120, -1));

        jLabel5.setText("NOMBRE 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));
        jPanel1.add(txtnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 130, -1));

        jLabel6.setText("NOMBRE 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));
        jPanel1.add(txtpaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 120, -1));

        jLabel7.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));
        jPanel1.add(txtmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, -1));

        jLabel8.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));
        jPanel1.add(txtpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 120, -1));

        jLabel9.setText("PAIS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel10.setText("CIUDAD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));
        jPanel1.add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 130, -1));

        jLabel11.setText("ZONA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));
        jPanel1.add(txtzona, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 120, -1));

        jLabel12.setText("NRO. DOMICILIO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));
        jPanel1.add(txtdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 130, -1));

        btnQR.setText("GENERAR QR");
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });
        jPanel1.add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 110, -1));

        btnFoto.setText("SUBIR FOTO");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 120, -1));

        tablapropietario.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        tablapropietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapropietarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapropietario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 850, 200));

        jLabel13.setText("BUSQUEDA :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, -1));

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 100, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        btnprincipal.setText("MENU PRINCIPAL");
        btnprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));
        jPanel1.add(txtexpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 130, -1));

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 90, -1));
        jPanel1.add(jLabelQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 130, 90));
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 120, 90));
        jPanel1.add(txtnombre_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 120, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 870, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
         insertarDatos();
         limpiarCajas();
         mostrarDatos();
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        eliminarRegistros();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
        filtrarDatos(txtbusqueda.getText());
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void tablapropietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapropietarioMouseClicked
        // TODO add your handling code here:
         int filaSeleccionada = tablapropietario.rowAtPoint(evt.getPoint());
        txtci.setText(tablapropietario.getValueAt(filaSeleccionada, 0).toString());
        txtexpedido.setText(tablapropietario.getValueAt(filaSeleccionada, 1).toString());
        txtnombre1.setText(tablapropietario.getValueAt(filaSeleccionada, 2).toString());
        txtnombre2.setText(tablapropietario.getValueAt(filaSeleccionada, 3).toString());
        txtpaterno.setText(tablapropietario.getValueAt(filaSeleccionada, 4).toString());
        txtmaterno.setText(tablapropietario.getValueAt(filaSeleccionada, 5).toString());
        txtpais.setText(tablapropietario.getValueAt(filaSeleccionada, 6).toString());
        txtciudad.setText(tablapropietario.getValueAt(filaSeleccionada, 7).toString());
        txtzona.setText(tablapropietario.getValueAt(filaSeleccionada, 8).toString());
        txtdomicilio.setText(tablapropietario.getValueAt(filaSeleccionada, 9).toString());
        jLabelQR.setText(tablapropietario.getValueAt(filaSeleccionada, 10).toString());
        jLabelFoto.setText(tablapropietario.getValueAt(filaSeleccionada, 11).toString());
        
         GenerarCodigoQR();
    }//GEN-LAST:event_tablapropietarioMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        // TODO add your handling code here:
     //    JFileChooser chooser = new JFileChooser();
     //   chooser.showOpenDialog(null);
      //  File f = chooser.getSelectedFile();
      //  String path = f.getAbsolutePath();
     //   ImageIcon icon = new ImageIcon(path);
     //   jLabelQR.setIcon(icon);
      GenerarCodigoQR();
    }//GEN-LAST:event_btnQRActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
        /*   JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(path);
        jLabel15.setIcon(icon);*/
        File archivo;
        JFileChooser flcAbritArchivo=new JFileChooser();
        flcAbritArchivo.setFileFilter(new FileNameExtensionFilter("archivo de imagen", "jpg", "jpeg"));
        int respuesta=flcAbritArchivo.showOpenDialog(this);
        
        if(respuesta==JFileChooser.APPROVE_OPTION){
            
            archivo=flcAbritArchivo.getSelectedFile();
            txtnombre_foto.setText(archivo.getAbsolutePath());
            Image foto=getToolkit().getImage(txtnombre_foto.getText());
            foto=foto.getScaledInstance(120, 90, 1);
            jLabelFoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprincipalActionPerformed
        // TODO add your handling code here:
        Menu_Principal abrir = new Menu_Principal ();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnprincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void GenerarCodigoQR()
    {
        ByteArrayOutputStream out=QRCode.from(this.txtci.getText()).to(ImageType.PNG).stream();
	ImageIcon imageIcon=new ImageIcon(out.toByteArray());
	this.jLabelQR.setIcon(imageIcon);
    
    }
    
    
    public void limpiarCajas() {
        txtci.setText("");
        txtexpedido.setText("");
        txtnombre1.setText("");
        txtnombre2.setText("");
        txtpaterno.setText("");
        txtmaterno.setText("");
        txtpais.setText("");
        txtciudad.setText("");
        txtzona.setText("");
        txtdomicilio.setText("");
        jLabelQR.setIcon(null);
        jLabelFoto.setIcon(null);

    }
        public void mostrarDatos() {
        String[] titulos = {"CI", "EXPEDIDO", "NOMBRE1", "NOMBRE2", "PATERNO", "MATERNO", "PAIS","CIUDAD","ZONA","DOMICILIO","CODIGO QR","FOTO"};
        String[] registros = new String[13];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "select * from tp_propietario";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                //PARTE DE BASE DE DATOS MYSQL
                registros[0] = rs.getString("ci_propietario");
                registros[1] = rs.getString("expedido");
                registros[2] = rs.getString("nombre1");
                registros[3] = rs.getString("nombre2");
                registros[4] = rs.getString("apellido_paterno");
                registros[5] = rs.getString("apellido_materno");
                registros[6] = rs.getString("pais");
                registros[7] = rs.getString("ciudad");
                registros[8] = rs.getString("zona");
                registros[9] = rs.getString("nro_domicilio");
                registros[10] = rs.getString("codigo_qr");
                registros[11] = rs.getString("foto_P");
                modelo.addRow(registros);
            }
            tablapropietario.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MOSTRAR DATOS ERROR" + e.getMessage());
        }
        }
        public void insertarDatos() {
            FileInputStream archivoFoto;
            File nombreFoto;
        try {
            String SQL = "insert into tp_propietario(ci_propietario,expedido,nombre1,nombre2,apellido_paterno,apellido_materno,pais,ciudad,zona,nro_domicilio,codigo_qr,foto_P)values (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            nombreFoto=new File (txtnombre_foto.getText());
            archivoFoto=new FileInputStream(nombreFoto);
          //  pst.setString(0, txtci.getText());
            pst.setString(1, txtci.getText());
            pst.setString(2, txtexpedido.getText());
            pst.setString(3, txtnombre1.getText());
            pst.setString(4, txtnombre2.getText());
            pst.setString(5, txtpaterno.getText());
            pst.setString(6, txtmaterno.getText());
            pst.setString(7, txtpais.getText());
            pst.setString(8, txtciudad.getText());
            pst.setString(9, txtzona.getText());
            pst.setString(10, txtdomicilio.getText());
            pst.setString(11, jLabelQR.getText());
            pst.setBinaryStream(12, archivoFoto,archivoFoto.available());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro ERROR" + e.getMessage());
        }
        }
    
        public void actualizarDatos() {
            FileInputStream archivoFoto;
            File nombreFoto;
        try {
            String SQL = "update tp_propietario set expedido=?,nombre1=?,nombre2=?,apellido_paterno=?,apellido_materno=?,pais=?,ciudad=?,zona=?,nro_domicilio=?,codigo_qr=?,foto_P=? where ci_propietario=?"; //where idalumnos=?
            int filaSeleccionado = tablapropietario.getSelectedRow();
            String dao = (String) tablapropietario.getValueAt(filaSeleccionado, 0);
            PreparedStatement pst = con.prepareStatement(SQL);
            
            nombreFoto=new File (txtnombre_foto.getText());
            archivoFoto=new FileInputStream(nombreFoto);
            
            pst.setString(1, txtci.getText());
            pst.setString(2, txtexpedido.getText());
            pst.setString(3, txtnombre1.getText());
            pst.setString(4, txtnombre2.getText());
            pst.setString(5, txtpaterno.getText());
            pst.setString(6, txtmaterno.getText());
            pst.setString(7, txtpais.getText());
            pst.setString(8, txtciudad.getText());
            pst.setString(9, txtzona.getText());
            pst.setString(10, txtdomicilio.getText());
            pst.setString(11,jLabelQR.getText());
            pst.setBinaryStream(12, archivoFoto,archivoFoto.available());
            pst.setString(13, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro Editado Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Editado ERROR" + e.getMessage());
        }
    }
        
        public void eliminarRegistros() {
        int filaSeleccionada = tablapropietario.getSelectedRow();
        try {
            String SQL = "delete from tp_propietario where ci_propietario=" + tablapropietario.getValueAt(filaSeleccionada, 0);
            Statement st = con.createStatement();
            int n = st.executeUpdate(SQL);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro ELIMINADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eliminar Registro ERROR" + e.getMessage());
        }
        }
        //parte base de datos
         public void filtrarDatos(String valor) {
        String[] titulos = {"CI", "EXPEDIDO", "NOMBRE1", "NOMBRE2", "PATERNO", "MATERNO", "PAIS","CIUDAD","ZONA","DOMICILIO","CODIGO QR","FOTO"};
        String[] registros = new String[13];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "select * from tp_propietario where ci_propietario like '%" + valor + "%'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("ci_propietario");
                registros[1] = rs.getString("expedido");
                registros[2] = rs.getString("nombre1");
                registros[3] = rs.getString("nombre2");
                registros[4] = rs.getString("apellido_paterno");
                registros[5] = rs.getString("apellido_materno");
                registros[6] = rs.getString("pais");
                registros[7] = rs.getString("ciudad");
                registros[8] = rs.getString("zona");
                registros[9] = rs.getString("nro_domicilio");
                registros[10] = rs.getString("codigo_qr");
                registros[11] = rs.getString("foto_P");
                modelo.addRow(registros);
            }
            tablapropietario.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MOSTRAR DATOS ERROR" + e.getMessage());
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
            java.util.logging.Logger.getLogger(Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Propietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Propietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnQR;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnprincipal;
    private javax.swing.JButton btnregistrar;
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
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelQR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablapropietario;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtci;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtdomicilio;
    private javax.swing.JTextField txtexpedido;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombre2;
    private javax.swing.JTextField txtnombre_foto;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtpaterno;
    private javax.swing.JTextField txtzona;
    // End of variables declaration//GEN-END:variables
}
