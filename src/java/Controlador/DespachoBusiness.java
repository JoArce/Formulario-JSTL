/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.Conexion;
import Modelo.Despacho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class DespachoBusiness implements DespachoInterface{

    @Override
    public ArrayList<Despacho> ConsultarProductos() {
         Connection c = Conexion.DB();
        ArrayList<Despacho> despachos = new ArrayList<>();
        String query = "SELECT idDespacho,producto,cantidad, fecha FROM despachos ";
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Despacho d = new Despacho();
                d.setIdDespacho(rs.getInt("idDespacho"));
                d.setProducto(rs.getString("producto"));
                d.setCantidad(rs.getInt("cantidad"));
                d.setFecha(rs.getDate("fecha"));
                despachos.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DespachoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(DespachoBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return despachos;
    }

    @Override
    public ArrayList<Despacho> ConsultarProductos(String id) {
            ArrayList<Despacho> despachos = null;
        try{
            despachos = new ArrayList<>();
            Connection c = Conexion.DB();
            String query="select * from despachos where idDespacho = ?";
            PreparedStatement stmt=c.prepareStatement(query);
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Despacho des = new Despacho();
                des.setIdDespacho(rs.getInt("idDespacho"));
                des.setProducto(rs.getString("producto"));
                des.setCantidad(rs.getInt("cantidad"));
                des.setFecha(rs.getDate("fecha"));
                des.setSucursal(rs.getString("sucursal"));
                des.setDireccionEntrega(rs.getString("direccionEntrega"));
                des.setCosto(rs.getInt("costo"));
                des.setDescripcion(rs.getString("descripcion"));
                des.setIdEstado(rs.getInt("idEstado"));
                despachos.add(des);
            }
        }catch(SQLException w){
            System.out.println("Error SQL: " + w.getMessage());
        }catch(Exception e){
            System.out.println("Error Desconocido: " + e.getMessage());
        }
      return despachos;
    }

 
    
    
    }

  
    

