/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.net.*;
import org.json.*;
import javax.swing.table.DefaultTableModel;
public class Actualizacion_inventario extends javax.swing.JFrame {
   DefaultTableModel model;
    String op="";
    public Actualizacion_inventario() {
        initComponents();
        model = new DefaultTableModel();
        model.addColumn("fechcompra");
        model.addColumn("numfactura");
        model.addColumn("id");
        model.addColumn("cantidad");
        this.jTable1.setModel(model);
        get();
    }

    public void seleccion (String x){
        jButton1.setText(x);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfnumfactura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tffechacompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfcantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Numero de factura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 20));

        tfnumfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnumfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(tfnumfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Fecha de compra");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 20));

        tffechacompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffechacompraActionPerformed(evt);
            }
        });
        getContentPane().add(tffechacompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 20));

        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });
        getContentPane().add(tfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 20));

        tfcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(tfcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 30));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Modificar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 100, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 670, 280));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        menu entrar = new menu();
        entrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void tfnumfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnumfacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnumfacturaActionPerformed

    private void tffechacompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffechacompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffechacompraActionPerformed

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void tfcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void get(){
        try {
            // URL del API
            URL url = new URL("http://localhost/appi/get_actualizacion_inventario.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            int responseCode = conn.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                
                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();
                
                // Parsear la respuesta JSON
                JSONArray jsonArray = new JSONArray(response.toString());
                
                // Recorrer el array y agregar los datos al modelo de la tabla
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String fechcompra = jsonObject.getString("fechcompra");
                    String numfactura = jsonObject.getString("numfactura");
                    int id = jsonObject.getInt("id");
                    int cantidad = jsonObject.getInt("cantidad");
                    
                    model.addRow(new Object[]{ fechcompra, numfactura, id, cantidad});
                }
            } else {
                System.out.println("Error en la solicitud HTTP: " + responseCode);
            }
            
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(Actualizacion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizacion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizacion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizacion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizacion_inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tfcantidad;
    private javax.swing.JTextField tffechacompra;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfnumfactura;
    // End of variables declaration//GEN-END:variables
}
