/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author josue
 */
public class Despacho {
    
    private int idDespacho;
    private String producto;
    private int cantidad;
    private Date fecha;
    private String sucursal;
    private String direccionEntrega;
    private int costo;
    private String descripcion;
    private int idEstado;

    public Despacho(int idDespacho, String producto, int cantidad, Date fecha, String sucursal, String direccionEntrega, int costo, String descripcion, int idEstado) {
        this.idDespacho = idDespacho;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.sucursal = sucursal;
        this.direccionEntrega = direccionEntrega;
        this.costo = costo;
        this.descripcion = descripcion;
        this.idEstado = idEstado;
    }
    
    public Despacho()
    {}

    public int getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    
    
}
