/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import com.mysql.jdbc.Connection;
import conexionSQL.conexionSQL;

/**
 *
 * @author JEFFERSON
 */
public class Menu_Principal extends javax.swing.JFrame {
    
       conexionSQL cc = new conexionSQL();
       Connection con = cc.conexion();
    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        initComponents();
        this.setTitle("MENU");
        this.setLocationRelativeTo(null);
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
        btnPROPIETARIO = new javax.swing.JButton();
        btnDATOS_TECNICOS = new javax.swing.JButton();
        btnIDENTIFICACION_VEHICULO = new javax.swing.JButton();
        btnGENERAR_CARNET = new javax.swing.JButton();
        btnSALIR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPROPIETARIO.setText("PROPIETARIO");
        btnPROPIETARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROPIETARIOActionPerformed(evt);
            }
        });
        jPanel1.add(btnPROPIETARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 170, 50));

        btnDATOS_TECNICOS.setText("DATOS TECNICOS");
        btnDATOS_TECNICOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDATOS_TECNICOSActionPerformed(evt);
            }
        });
        jPanel1.add(btnDATOS_TECNICOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 50));

        btnIDENTIFICACION_VEHICULO.setText("IDENTIFICACION VEHICULO");
        btnIDENTIFICACION_VEHICULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDENTIFICACION_VEHICULOActionPerformed(evt);
            }
        });
        jPanel1.add(btnIDENTIFICACION_VEHICULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 60));

        btnGENERAR_CARNET.setText("GENERAR CARNET");
        btnGENERAR_CARNET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENERAR_CARNETActionPerformed(evt);
            }
        });
        jPanel1.add(btnGENERAR_CARNET, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 140, 60));

        btnSALIR.setText("SALIR");
        jPanel1.add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 120, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPROPIETARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROPIETARIOActionPerformed
        // TODO add your handling code here:
        Propietario abrir = new Propietario();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPROPIETARIOActionPerformed

    private void btnDATOS_TECNICOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDATOS_TECNICOSActionPerformed
        // TODO add your handling code here:
        Datos_Tecnicos abrir = new Datos_Tecnicos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDATOS_TECNICOSActionPerformed

    private void btnIDENTIFICACION_VEHICULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDENTIFICACION_VEHICULOActionPerformed
        // TODO add your handling code here:
        Identificacion_Vehiculo abrir = new Identificacion_Vehiculo();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIDENTIFICACION_VEHICULOActionPerformed

    private void btnGENERAR_CARNETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENERAR_CARNETActionPerformed
        // TODO add your handling code here:
        Generar_Carnet abrir = new Generar_Carnet();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGENERAR_CARNETActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDATOS_TECNICOS;
    private javax.swing.JButton btnGENERAR_CARNET;
    private javax.swing.JButton btnIDENTIFICACION_VEHICULO;
    private javax.swing.JButton btnPROPIETARIO;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
