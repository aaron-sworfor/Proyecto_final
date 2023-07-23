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
public class Registro_productos extends javax.swing.JFrame {
    DefaultTableModel model;

    String op="";
    public Registro_productos() {
        initComponents();
        model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nombre");
        model.addColumn("marca");
        model.addColumn("descripcion");
        model.addColumn("precio");
        this.jTable1.setModel(model);
        get();
    }
    public void seleccion(String x){
        jButton1.setText(x);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfmarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfpresentacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfid = new javax.swing.JTextField();
        tfprecio = new javax.swing.JTextField();
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
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, 20));

        tfnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnombreActionPerformed(evt);
            }
        });
        getContentPane().add(tfnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 100, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Marca");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 20));

        tfmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmarcaActionPerformed(evt);
            }
        });
        getContentPane().add(tfmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Presentacion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 130, 20));

        tfpresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpresentacionActionPerformed(evt);
            }
        });
        getContentPane().add(tfpresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Precio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 100, 20));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 110, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 620, 190));

        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });
        getContentPane().add(tfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, 30));

        tfprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprecioActionPerformed(evt);
            }
        });
        getContentPane().add(tfprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo inicio.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 385));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 385));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        menu entrar = new menu();
        entrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void tfnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnombreActionPerformed

    private void tfmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmarcaActionPerformed

    private void tfpresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpresentacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        metodos ne=new metodos();
        try {
                    int id1=Integer.parseInt(tfid.getText());
                    String nombre1=tfnombre.getText();
                    String marca1=tfmarca.getText();
                    String presentacion1=tfpresentacion.getText();
                    int precio1=Integer.parseInt(tfprecio.getText());
                    if(jButton1.getText().equals("insertar")&& tfid.getText()!="" && tfmarca.getText()!="" && tfnombre.getText()!="" && tfpresentacion.getText()!=""&& tfprecio.getText()!=""){
                        ne.insertar("http://localhost/appi/insertar_producto.php", "id="+id1+"&nombre="+nombre1+"&marca="+marca1+"&descripcion="+presentacion1+"&precio="+precio1);
                        get();}   
                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(this, "El 'ID' y el 'precio' deben ser dato numericos");
                }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void tfprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfprecioActionPerformed
    public void get(){
        try {
            // URL del API
            URL url = new URL("http://localhost/appi/get_registro_producto.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            int responseCode = conn.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader leer = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder respuesta = new StringBuilder();
                
                while ((inputLine = leer.readLine()) != null) {
                    respuesta.append(inputLine);
                }
                leer.close();
                model.setRowCount(0);
                JSONArray jsonArray = new JSONArray(respuesta.toString());
                
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    int id = jsonObject.getInt("id");
                    String nombre = jsonObject.getString("nombre");
                    String marca = jsonObject.getString("marca");
                    String presentacion = jsonObject.getString("descripcion");
                    int precio = jsonObject.getInt("precio");
                    
                    model.addRow(new Object[]{id, nombre, marca, presentacion, precio});
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
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_productos().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfmarca;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfprecio;
    private javax.swing.JTextField tfpresentacion;
    // End of variables declaration//GEN-END:variables
}
