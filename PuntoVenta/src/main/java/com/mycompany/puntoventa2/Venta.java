/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puntoventa2;

/**
 *
 * @author chyut
 */
public class Venta {
    private int cantidad;
    private String detalle;
    private int total;
    private String medioPago;

    public Venta(int cantidad, String detalle, int total, String medioPago) {
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.total = total;
        this.medioPago = medioPago;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getTotal() {
        return total;
    }

    public String getMedioPago() {
        return medioPago;
    }
    
}
