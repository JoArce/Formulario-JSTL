/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Despacho;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public interface DespachoInterface {
    
     public ArrayList<Despacho> ConsultarProductos();
     public ArrayList<Despacho> ConsultarProductos(String id);
   
}
