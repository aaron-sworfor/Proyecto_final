/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_datos;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Sworfor
 */
public class venta {
   private ArrayList<Integer> cantidad2 = new ArrayList<>();
   private ArrayList<Integer> precios = new ArrayList<>();
   private ArrayList<String> productos = new ArrayList<>();

    public venta(ArrayList<String> productos,ArrayList<Integer> precios,ArrayList<Integer> cantidad2) {
        
    }
   
    public ArrayList<String> getProductos() {
        return productos;
    }

    public ArrayList<Integer> getPrecios() {
        return precios;
    }

    public ArrayList<Integer> getCantidad2() {
        return cantidad2;
    }
}
