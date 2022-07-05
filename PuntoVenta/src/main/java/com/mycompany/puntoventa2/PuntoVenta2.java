/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.puntoventa2;

import javax.swing.*;
import java.util.*;



/**
 *
 * @author chyut
 */
public class PuntoVenta2 {

    public static void main(String[] args) {
        
        Local Nunoa = new Local ("Nunoa", "Eduardo Castillo 2021");
        ArrayList <Producto> listaProductos = new ArrayList <>();
        ArrayList <Venta> listaVentas = new ArrayList <>();
        String op = "0";
        
        
        while(!"6".equals(op)){
            System.out.println("MENU:");
            System.out.println(Nunoa.getNombre() + " - " + Nunoa.getDireccion());
            System.out.println("1. Registrar Producto");
            System.out.println("2. Borrar Producto");
            System.out.println("3. Mostrar lista de Productos");
            System.out.println("4. Mostrar lista de Ventas");
            System.out.println("5. Hacer Venta");
            System.out.println("6. Salir");
            System.out.println("");
            op = JOptionPane.showInputDialog("Digite una opcion: ");
        
            switch(op){
                case "1" -> {
                    String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
                    int precioProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
                    String categoriaProducto = JOptionPane.showInputDialog("Ingrese la categoria del producto: ");
                    int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto: "));
                    
                    Producto P = new Producto(nombreProducto, precioProducto, categoriaProducto, cantidadProducto);
                    System.out.println("Producto listado correctamente..!\n" + P.getCodigo() + " - " + P.getNombre() + " - " + P.getPrecio() + " - " + P.getCategoria() + " - " + P.getCantidad());
                    System.out.println(" ");
                    
                    listaProductos.add(P);
                }
                case "2" -> {
                    int borrado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto a borrar: "));
                    
                    for (Producto p : listaProductos){
                        if (p.getCodigo() == borrado){
                            listaProductos.remove(p);
                        }
                    }
                    System.out.println("Producto borrado con exito..!");
                    System.out.println(" ");
                }
                case "3" -> {
                    System.out.println("Lista de productos:");
                    
                    for (Producto p : listaProductos){
                    System.out.println(p.getCodigo() + " - " + p.getNombre() + " - " + p.getPrecio() + " - " + p.getCategoria() + " - " + p.getCantidad());
                    }
                    System.out.println(" ");
                }
                case "4" -> {
                    System.out.println("Lista de ventas:");
                    
                    for (Venta v : listaVentas){
                    System.out.println(v.getCantidad() + " - " + v.getDetalle() + " - " + v.getTotal() + " - " + v.getMedioPago());
                    }
                    System.out.println(" ");
                }
                case "5" -> {
                    int codigoVendido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto: "));
                    int cantidadVendido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
                    String medioPagoVendido = JOptionPane.showInputDialog("Ingrese medio de pago (credito o debito): ");
                    
                    for (Producto p : listaProductos){
                        if(p.getCodigo() == codigoVendido){
                            String detalleVendido = p.getNombre();
                            int totalVendido = cantidadVendido * p.getPrecio();
                            
                            Venta V = new Venta(cantidadVendido, detalleVendido, totalVendido, medioPagoVendido);
                            listaVentas.add(V);
                            p.setCantidad(p.getCantidad() - V.getCantidad());
                            
                            System.out.println("Venta exitosa..!");
                            System.out.println(V.getCantidad() + " - " + V.getDetalle() + " - " + V.getTotal() + " - " + V.getMedioPago());
                            System.out.println(" ");
                        }
                    }
                }
                case "6" -> {
                    System.out.println("Gracias por usar esta aplicacion..!");
                }
                default -> {
                    System.out.println("Opcion no valida..!");
                }
            }//fin switch
        }// fin while
    }// fin main
}// fin clase

