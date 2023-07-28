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
public class Ventas_productos extends javax.swing.JFrame {
    int no=0;
    String op="";
    int cantidad=0;
   DefaultTableModel model;
    public Ventas_productos() {
        initComponents();
         model = new DefaultTableModel();
        model.addColumn("id_venta");
        model.addColumn("id_producto");
        model.addColumn("fecha_venta");
        model.addColumn("cantidad_productos");
        model.addColumn("precio");
        model.addColumn("nombre_producto");
        this.jTable1.setModel(model);
        get("http://localhost/appi/get_ventas_productos.php");
    }

    public void seleccion (String x){
        bmodificacion.setText(x);
        tfidventa.setText("");
        tfidprod.setText("0");
        tffecha.setText("DD/MM/AAAA");
        tfnombrepro.setText("");
        tfcanpro.setText("0");
        tfprecio.setText("0");
        if (x=="insertar"){
        bmodificacion.setEnabled(false);}else{
        bbuscar.setEnabled(false);
                                bmodificacion.setEnabled(true);
            tfidprod.setEnabled(false);}
        
            tfcanpro.setEnabled(false);
            tfnombrepro.setEnabled(false);
            tffecha.setEnabled(false);
            tfprecio.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfidprod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfidventa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tffecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfcanpro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfnombrepro = new javax.swing.JTextField();
        bmodificacion = new javax.swing.JButton();
        tfprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bbuscar = new javax.swing.JButton();
        bimprimir = new javax.swing.JButton();
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
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 150, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Id_producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 20));

        tfidprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidprodActionPerformed(evt);
            }
        });
        getContentPane().add(tfidprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Id_venta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 20));

        tfidventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidventaActionPerformed(evt);
            }
        });
        getContentPane().add(tfidventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 200, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Fecha_venta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 20));

        tffecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffechaActionPerformed(evt);
            }
        });
        getContentPane().add(tffecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 200, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad_productos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 20));

        tfcanpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcanproActionPerformed(evt);
            }
        });
        getContentPane().add(tfcanpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Nombre_producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 20));

        tfnombrepro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnombreproActionPerformed(evt);
            }
        });
        getContentPane().add(tfnombrepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, 30));

        bmodificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bmodificacion.setText("Modificar ");
        bmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificacionActionPerformed(evt);
            }
        });
        getContentPane().add(bmodificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 150, 30));

        tfprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprecioActionPerformed(evt);
            }
        });
        getContentPane().add(tfprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 200, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 20));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 620, 260));

        bbuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bbuscar.setText("Buscar_producto ");
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(bbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 150, 30));

        bimprimir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bimprimir.setText("imprimir ticket");
        bimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(bimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        menu entrar = new menu();
        entrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void tfidprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidprodActionPerformed

    private void tfidventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidventaActionPerformed

    private void tffechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffechaActionPerformed

    private void tfcanproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcanproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcanproActionPerformed

    private void tfnombreproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnombreproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnombreproActionPerformed

    private void bmodificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificacionActionPerformed
        metodos ne=new metodos();
        try {
                    int id1=Integer.parseInt(tfidprod.getText());
                    int idven=Integer.parseInt(tfidventa.getText());
                    String nombre1=tfnombrepro.getText();
                    String fech=tffecha.getText();
                    op=bmodificacion.getText();
                    int cantidad1=Integer.parseInt(tfcanpro.getText());
                    int precio1=Integer.parseInt(tfprecio.getText());
                    switch(op){
                        case "insertar":
                                if(tfidventa.getText()!="" && tffecha.getText()!="" && tfcanpro.getText() !="" && cantidad > cantidad1){
                                String re =ne.gett("http://localhost/appi/get_ventas_productos.php?id_venta="+idven);
                                JSONArray j= new JSONArray(re);
                                 if (j.length() > 0) {
                                     JOptionPane.showMessageDialog(this, "El producto tiene una ID duplicada a un producto existente");
                                 
                                 }else{
                                     ne.insertar("http://localhost/appi/insertar_venta.php", "id_venta="+idven+"&id_producto="+id1+"&fecha_venta="+fech+"&cantidad_productos="+cantidad1+"&precio="+precio1+"&nombre_producto="+nombre1);
                                     ne.insertar("http://localhost/appi/insertar_venta_actualizacion.php", "numfactura="+idven+"&id="+id1+"&fechcompra="+fech+"&cantidad="+cantidad1);
                                     ne.actualizar("http://localhost/appi/descantar_producto_inventario.php?id"+id1+"&cantidad="+cantidad1);
                                get("http://localhost/appi/get_ventas_productos.php");
                                int total =cantidad1*precio1;
                                JOptionPane.showMessageDialog(this, "La venta se concreto correctamente"
                                                                              + "\n-----------------------------------------\n"
                                                                              + "|id de venta            |"+idven
                                                                              + "\n-----------------------------------------\n"
                                                                              + "|id de producto         |"+id1
                                                                              + "\n-----------------------------------------\n"
                                                                              + "|fecha de la venta      |"+fech
                                                                              + "\n-----------------------------------------\n"
                                                                              + "|nombre del producto    |"+nombre1
                                                                              + "\n-----------------------------------------\n"
                                                                              + "|cantidad del producto  |"+cantidad1
                                                                              + "\n-----------------------------------------\n"
                                                                              + "|precio del producto    |"+precio1
                                                                              + "\n-----------------------------------------\n"
                                                                              + "|total del producto     |"+total
                                                                              + "\n-----------------------------------------\n");
                                
                                 
                                 }
                                    seleccion(bmodificacion.getText());
                                }else if (cantidad < cantidad1){
                                    JOptionPane.showMessageDialog(this, "La cantidad que se quiere comprar es mayor que la del almacen,porfavor de camiar la cantidad");
                                } 
                            break;
                        case "eliminar":
                                
                                String re =ne.gett("http://localhost/appi/get_ventas_productos.php?id_venta="+idven);
                                JSONArray j= new JSONArray(re);
                                 if (j.length() > 0) {
                                   ne.borrar("http://localhost/appi/borrar_venta.php?id_venta="+idven);
                                   get("http://localhost/appi/get_ventas_productos.php");
                                   seleccion(bmodificacion.getText());
                                   JOptionPane.showMessageDialog(this, "El producto se elimino correctamente");
                                 
                                 }else{
                                        JOptionPane.showMessageDialog(this, "El producto no existe");
                                 }
                      break;
                        case "actualizar":
                                 re =ne.gett("http://localhost/appi/get_ventas_productos.php?id_venta="+idven);
                                JSONArray j2= new JSONArray(re);
                                 if (j2.length() > 0 ) {
                                    tfcanpro.setEnabled(true);
                                    tfnombrepro.setEnabled(true);
                                    tffecha.setEnabled(true);
                                    tfprecio.setEnabled(true);
                                    tfidprod.setEnabled(true);
                                     get("http://localhost/appi/get_ventas_productos.php?id_venta="+idven);
                                     if(no==1){
                                     ne.actualizar("http://localhost/appi/actualizar_venta.php?id_venta="+idven+"&id_producto="+id1+"&fecha_venta="+fech+"&cantidad_productos="+cantidad1+"&precio="+precio1+"&nombre_producto="+nombre1);
                                   get("http://localhost/appi/get_ventas_productos.php");
                                   seleccion(bmodificacion.getText());
                                    no=0;
                                     JOptionPane.showMessageDialog(this, "El producto se actualizo");}
                                      no=1;
                                 }else{
                                        JOptionPane.showMessageDialog(this, "El producto no existe");
                                 }
                      break;
                        case "buscar":
                                 re =ne.gett("http://localhost/appi/get_ventas_productos.php?id_venta="+idven);
                                JSONArray jg= new JSONArray(re);
                                 if (jg.length() > 0) {
                                   get("http://localhost/appi/get_ventas_productos.php?id_venta="+idven);
                                     seleccion(bmodificacion.getText());
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
    }//GEN-LAST:event_bmodificacionActionPerformed

    private void tfprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfprecioActionPerformed

    private void bbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuscarActionPerformed
        metodos ne =new metodos();
        try{
            int id1=Integer.parseInt(tfidprod.getText());
        String re =ne.gett("http://localhost/appi/get_registro_producto.php?id="+id1);
        String rer =ne.gett("http://localhost/appi/get_productos_inventario.php?id="+id1);
                                JSONArray j= new JSONArray(re);
                                JSONArray j2= new JSONArray(rer);
                                
                                if (j2.length() > 0) {
                                    for (int i = 0; i < j2.length(); i++) {
                    JSONObject jsonObject = j2.getJSONObject(i);
                     cantidad = jsonObject.getInt("cantidad");}}
                                 if (j.length() > 0) {
                                    for (int i = 0; i < j.length(); i++) {
                    JSONObject jsonObject = j.getJSONObject(i);
                    String nombre2 = jsonObject.getString("nombre");
                    int prec = jsonObject.getInt("precio");
                    String pres = jsonObject.getString("descripcion");
                                    tfprecio.setText(""+prec);
                                    tfnombrepro.setText(nombre2);
                                    JOptionPane.showMessageDialog(this, "El producto es:\n"
                                            + "Nombre: "+nombre2+"\n"
                                            +"Precio: "+prec+"\n"
                                            +"Precentacion: "+pres+"\n");
                                    tfcanpro.setEnabled(true);
                                    tffecha.setEnabled(true);
                                   
                                    }
                                    bmodificacion.setEnabled(true);
                                 }else{
                                 
                                JOptionPane.showMessageDialog(this, "El producto no existe");
                                 
                                 }
        }catch(NumberFormatException g){
                
        } catch (IOException ex) {
            Logger.getLogger(Ventas_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bbuscarActionPerformed

    private void bimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimprimirActionPerformed
         
    }//GEN-LAST:event_bimprimirActionPerformed
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
                
                // Parsear la respuesta JSON
                JSONArray jsonArray = new JSONArray(response.toString());
                model.setRowCount(0);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    int id_venta = jsonObject.getInt("id_venta");
                        int id_producto = jsonObject.getInt("id_producto");
                    String fecha_venta = jsonObject.getString("fecha_venta");
                    int cantidad_productos = jsonObject.getInt("cantidad_productos");
                    int precio = jsonObject.getInt("Precio");
                    String nombre_producto = jsonObject.getString("Nombre_producto");
                    model.addRow(new Object[]{ id_venta, id_producto, fecha_venta, cantidad_productos, precio, nombre_producto});
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
            java.util.logging.Logger.getLogger(Ventas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton bimprimir;
    private javax.swing.JButton bmodificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tfcanpro;
    private javax.swing.JTextField tffecha;
    private javax.swing.JTextField tfidprod;
    private javax.swing.JTextField tfidventa;
    private javax.swing.JTextField tfnombrepro;
    private javax.swing.JTextField tfprecio;
    // End of variables declaration//GEN-END:variables
}
