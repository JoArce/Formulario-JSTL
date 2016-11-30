<%-- 
    Document   : Productos
    Created on : 29-11-2016, 14:17:44
    Author     : josue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="u" scope="session" class="Modelo.Usuario" />
<jsp:useBean id="despacho" class="Controlador.DespachoBusiness" />


<jsp:setProperty name="u" property="*"  />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="CSS/estilos.css" rel="stylesheet" type="text/css">

        <title>Lista Productos</title>
    </head>
    <body class="producto">
        

             
            <h3>Productos</h3>
            <p style="text-align: right">Bienvenido</p>
            <p style="text-align: right">
                   <jsp:getProperty name="u" property="nombre" />       
            </p>
            <p style="text-align: right"><a href="Login.jsp">Cerrar Sesion</a></p>
            

             
            <table bgcolor="grey">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Producto</th>
                    <th>Cantidad</th>
                    <th>Fecha</th>
                                                       
                </tr>
                </thead>
                <tbody>
                <c:forEach var="d" items="${despacho.ConsultarProductos()}">
                    <tr>
                        <td>${d.getIdDespacho()}</td>
                        <td>${d.getProducto()}</td>
                        <td>${d.getCantidad()}</td>
                        <td>${d.getFecha()}</td>

                    </tr>
                    
                </c:forEach>
                </tbody>
                
            </table>
             <form action="Detalle.jsp" method="post">
                 <table bgcolor="grey">
                     <tr>
                         <td><input type="text" name="id" value="${d.getIdDespacho()}"></td>
                         <td><input type="submit" value="Detalle" /></td>
                     </tr>
                 </table>
        </form>
                          
       
    </body>
</html>
