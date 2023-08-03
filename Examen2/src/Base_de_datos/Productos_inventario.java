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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dayan
 */
public class Productos_inventario extends javax.swing.JFrame {
    DefaultTableModel model;
    int no=0;
    String op;
    public Productos_inventario() {
        initComponents();
        model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Cantidad");
        this.jTable1.setModel(model);
        get("http://localhost/appi/get_productos_inventario.php");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfcantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
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
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 110, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, 20));

        tfcantidad.setText("0");
        tfcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(tfcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 20));

        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });
        getContentPane().add(tfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 200, 30));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Modificar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 110, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void seleccion(String x){
        tfid.setText("");
        tfcantidad.setText("0");
        jButton1.setText(x);
        if(x=="actualizar"|| x=="buscar"){
            tfcantidad.setEnabled(false);
           
        }
    } 
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        menu entrar = new menu();
        entrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void tfcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcantidadActionPerformed

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        metodos ne=new metodos();
        op=jButton1.getText();  
        try {
                    int id1=Integer.parseInt(tfid.getText());
                    int cantidad1=Integer.parseInt(tfcantidad.getText());
                    switch(op){
                        case "actualizar":
                                String re =ne.gett("http://localhost/appi/get_productos_inventario.php?id="+id1);
                                JSONArray j2= new JSONArray(re);
                                 if (j2.length() > 0 ) {
                                     tfcantidad.setEnabled(true);
                                     get("http://localhost/appi/get_productos_inventario.php?id="+id1);
                                     if(no==1 && tfcantidad.getText() != "0"){
                                         no=0;
                                   ne.actualizar("http://localhost/appi/actualizar_producto_inventario.php?id="+id1+"&cantidad="+cantidad1);
                                   get("http://localhost/appi/get_productos_inventario.php");
                                     JOptionPane.showMessageDialog(this, "La cantidad en el inventario se actualizo");
                                         seleccion(jButton1.getText());}
                                      no=1;
                                 }else{
                                        JOptionPane.showMessageDialog(this, "El producto no existe");
                                 }
                      break;
                        case "buscar":
                                 re =ne.gett("http://localhost/appi/get_productos_inventario.php?id="+id1);
                                JSONArray jg= new JSONArray(re);
                                 if (jg.length() > 0) {
                                   get("http://localhost/appi/get_productos_inventario.php?id="+id1);
                                     seleccion(jButton1.getText());
                                 }else{
                                        JOptionPane.showMessageDialog(this, "El producto no existe");
                                 }
                      break;
                    }
                      
                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(this, "algunos campos deben ser datos numericos, cambia los errores");
                } catch (IOException ex) {     
            Logger.getLogger(Registro_productos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    public void get(String x){
        try {
            // URL del API
            URL url = new URL(x);
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
                model.setRowCount(0);
                JSONArray jsonArray = new JSONArray(response.toString());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    int id = jsonObject.getInt("id");
                    int cantidad = jsonObject.getInt("cantidad");
                    
                    model.addRow(new Object[]{id, cantidad});
                }
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
            java.util.logging.Logger.getLogger(Productos_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos_inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tfcantidad;
    private javax.swing.JTextField tfid;
    // End of variables declaration//GEN-END:variables
}
