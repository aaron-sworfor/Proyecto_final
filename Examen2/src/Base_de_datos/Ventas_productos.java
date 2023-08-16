/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.*;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;

import static java.nio.file.Files.lines;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import java.awt.Desktop;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import org.json.*;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.printing.*;
public class Ventas_productos extends javax.swing.JFrame {
    int no=0;
    String op="";
    int cantidad=0;
    int id1;
    int idven;
    String avb="";
    String fech;
    ArrayList<Integer> cantidad2 = new ArrayList<>();
    ArrayList<Integer> precios = new ArrayList<>();
    ArrayList<String> productos = new ArrayList<>();
    
    int id_factura;
    int i=0;
    int total=0;
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
        model.addColumn("id_factura");
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
        tffactura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tftotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 20));

        tfidprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidprodActionPerformed(evt);
            }
        });
        getContentPane().add(tfidprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 200, 30));

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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 20));

        tffecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffechaActionPerformed(evt);
            }
        });
        getContentPane().add(tffecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad_productos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 20));

        tfcanpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcanproActionPerformed(evt);
            }
        });
        getContentPane().add(tfcanpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 200, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Nombre_producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 20));

        tfnombrepro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnombreproActionPerformed(evt);
            }
        });
        getContentPane().add(tfnombrepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 200, 30));

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
        getContentPane().add(tfprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 200, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 20));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 620, 260));

        bbuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bbuscar.setText("Buscar_producto ");
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(bbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 150, 30));

        bimprimir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bimprimir.setText("generar ticket");
        bimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(bimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 150, 30));

        tffactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffacturaActionPerformed(evt);
            }
        });
        getContentPane().add(tffactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 200, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("id_factura");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 20));

        jLabel11.setText("Total ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        tftotal.setText("0");
        getContentPane().add(tftotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 100, 40));

        jButton1.setText("imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Nombre_producto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Nombre_producto");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 20));

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
                     id1=Integer.parseInt(tfidprod.getText());
                     idven=Integer.parseInt(tfidventa.getText());
                    String nombre1=tfnombrepro.getText();
                    fech=tffecha.getText();
                    op=bmodificacion.getText();
                    int cantidad1=Integer.parseInt(tfcanpro.getText());
                    int precio1=Integer.parseInt(tfprecio.getText());
                     id_factura=Integer.parseInt(tffactura.getText());
                    switch(op){
                        case "insertar":
                                if(tfidventa.getText()!="" && tffecha.getText()!="" && tfcanpro.getText() !="" && cantidad > cantidad1){
                                String re =ne.gett("http://localhost/appi/get_ventas_productos.php?id_venta="+idven);
                                JSONArray j= new JSONArray(re);
                                 if (j.length() > 0) {
                                     JOptionPane.showMessageDialog(this, "El producto tiene una ID duplicada a un producto existente");
                                 
                                 }else{
                                     ne.insertar("http://localhost/appi/insertar_venta.php", "id_venta="+idven+"&id_producto="+id1+"&fecha_venta="+fech+"&cantidad_productos="+cantidad1+"&precio="+precio1+"&nombre_producto="+nombre1+"&id_factura="+id_factura);
                                     ne.insertar("http://localhost/appi/insertar_venta_actualizacion.php", "numfactura="+idven+"&id="+id1+"&fechcompra="+fech+"&cantidad="+cantidad1);
                                 total=total + (cantidad1*precio1);
                                precios.add(precio1);
                                productos.add(avb);
                               cantidad2.add(cantidad1);
                                     cantidad1=cantidad1 * -1;
                                     tftotal.setText(""+total);
                                   ne.actualizar("http://localhost/appi/actualizar_producto_inventario.php?id="+id1+"&cantidad="+cantidad1);
                                get("http://localhost/appi/buscar_factura.php?id_factura="+id_factura);
                                    
                                i++;
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
                                     ne.actualizar("http://localhost/appi/actualizar_venta.php?id_venta="+idven+"&id_producto="+id1+"&fecha_venta="+fech+"&cantidad_productos="+cantidad1+"&precio="+precio1+"&nombre_producto="+nombre1+"&id_factura="+id_factura);
                                   get("http://localhost/appi/get_ventas_productos.php");
                                   seleccion(bmodificacion.getText());
                                    no=0;
                                     JOptionPane.showMessageDialog(this, "El Registro se actualizo");}
                                      no=1;
                                 }else{
                                        JOptionPane.showMessageDialog(this, "El Registro no existe");
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
                     avb = jsonObject.getString("abrevia");
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
                                    tffactura.setEnabled(false);
                                   
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
        System.out.println("                    venta                     ");
        System.out.println("----------------------------------------------");
        System.out.println(  " fecha de venta "+fech);
        System.out.println(  " id de factura  "+id_factura);
        System.out.println("----------------------------------------------");
        for(i=0; i< productos.size();i++){
        System.out.println(" "+productos.get(i)+"                   ..... $"+precios.get(i)+" * "+cantidad2.get(i));
        }
        System.out.println("----------------------------------------------");
        System.out.println(  " total ........."+total);
        String filepad="C:/Users/Aaron/Documents/NetBeansProjects/Examen2/Venta num."+id_factura+".pdf";
       File pdfFile = Paths.get(filepad).toFile();
          try {
       File file = new File("C:/Users/Aaron/Documents/NetBeansProjects/Examen2/Venta num."+id_factura+".pdf");
        file.getParentFile().mkdirs();
        PdfWriter writer;
      
            writer = new PdfWriter(file);
        
        PdfDocument pdf = new PdfDocument(writer);
            try (Document document = new Document(pdf, PageSize.A7) ) {
                document.setMargins(10, 10, 10, 10);
                Paragraph header = new Paragraph("Ticket de Compra").setTextAlignment(TextAlignment.CENTER);
                
                document.add(header);
                document.add(new Paragraph("-----------------------------------------------"));
                Paragraph info = new Paragraph("Número de Factura: " + id_factura + "\nFecha: " + fech);
                document.add(info);
                document.add(new Paragraph("-----------------------------------------------"));
                for (int i = 0; i < productos.size(); i++) {
                    
                    document.add(new Paragraph(" "+productos.get(i)+"............... $ "+precios.get(i)+" * "+cantidad2.get(i)).setTextAlignment(TextAlignment.CENTER));
                }
                
                double total = 0.0;
                for (int i = 0; i < productos.size(); i++) {
                    double subtotal =cantidad2.get(i) * precios.get(i);
                    total += subtotal;
                }
                
                document.add(new Paragraph("-----------------------------------------------"));
                Paragraph totalInfo = new Paragraph("Total: $" + total).setTextAlignment(TextAlignment.RIGHT);
                document.add(totalInfo);
                 document.close();
                 
             }} catch (FileNotFoundException ex) {
            Logger.getLogger(Ventas_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        seleccion(bmodificacion.getText());
        tffactura.setEnabled(true);
        tffactura.setText("0");
        
    }//GEN-LAST:event_bimprimirActionPerformed

    private void tffacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffacturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String filepad="C:/Users/Aaron/Documents/NetBeansProjects/Examen2/Proyecto final.pdf";
        File pdfFile = Paths.get(filepad).toFile();
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.PRINT)) {
                try {
                    desktop.print(pdfFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("La acción de impresión no es compatible.");
            }
        } else {
            System.out.println("El soporte de Desktop no está disponible en este sistema.");
       }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void get(String x){
        try {
          
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
                    int id_factura =jsonObject.getInt("id_factura");
                    model.addRow(new Object[]{ id_venta, id_producto, fecha_venta, cantidad_productos, precio, nombre_producto, id_factura});
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tfcanpro;
    private javax.swing.JTextField tffactura;
    private javax.swing.JTextField tffecha;
    private javax.swing.JTextField tfidprod;
    private javax.swing.JTextField tfidventa;
    private javax.swing.JTextField tfnombrepro;
    private javax.swing.JTextField tfprecio;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
