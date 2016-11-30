<%-- 
    Document   : Detalle
    Created on : 29-11-2016, 17:15:25
    Author     : josue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="d" scope="request" class="Controlador.DespachoBusiness" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css">

        <title>Detalle Productos</title>
    </head>
    <body class="detalle">
        <h3>Detalle</h3>
        <c:forEach var="par" items="${param}">
            <table bgcolor="grey">
                 <tr>
                        <td>Id</td>
                         <td><input type="text" value=" ${par.value}"></td>
                    </tr>
           
            
            <c:forEach var="v" items="${d.ConsultarProductos(par.value)}">
               
                   
                    <tr>
                        <td>Producto</td>
                        <td><input type="text" value="${v.getProducto()}"></td>
                    </tr>
                     <tr>
                        <td>Cantidad</td>
                        <td><input type="text" value="${v.getCantidad()}"></td>
                    </tr>
                    <tr>
                        <td>Fecha</td>
                        <td><input type="text" value="${v.getFecha()}"></td>
                    </tr>
                    <tr>
                        <td>Sucursal</td>
                        <td><input type="text" value="${v.getSucursal()}"></td>
                    </tr> 
                    <tr>
                        <td>Direccion Entrega</td>
                        <td><input type="text" value="${v.getDireccionEntrega()}"></td>
                    </tr> 
                    <tr>
                        <td>Costo</td>
                        <td><input type="text" value="${v.getCosto()}"></td>
                    </tr> 
                    <tr>
                        <td>Descripcion</td>
                        <td><input type="text" value="${v.getDescripcion()}"></td>
                    </tr> 
                    <tr>
                        <td>Estado</td>
                        <td><input type="text" value="${v.getIdEstado()}"></td>
                    </tr>
                    
                    <tr>
                        <td><a href="Productos.jsp"><input type="submit" value="Volver"></a></td>
                    </tr>
                    
                </table>
                
                
           </c:forEach>
            
        </c:forEach>
    </body>
</html>
