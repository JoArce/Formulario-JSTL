<%-- 
    Document   : Login
    Created on : 29-11-2016, 14:04:56
    Author     : josue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body class="body">
  <h3>Iniciar Sesion</h3>
        <form method="Post" target="_self" action="./LoginServlet">
            <table bgcolor="grey">
                <tr>
                    <td>Usuario</td>
                    <td>
                        <input type="text" name="user" />
                    </td>
                </tr>
                <tr>
                    <td>Contraseña</td>
                    <td>
                        <input type="password" name="pass" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Iniciar Sesión" />
                    </td>
                </tr>
            </table>
        </form>       
    </body>
</html>
