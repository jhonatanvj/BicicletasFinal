<%-- 
    Document   : index
    Created on : 22/05/2024, 8:39:25 a. m.
    Author     : estudiantes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulario de Usuario</title>
        <link rel="stylesheet" href="estilo1.css">
        <script src="funcionalidad.js" defer></script>
    </head>





    <body>

    <center>
        <button onclick="toggleForm('form1')">Registrarse</button>
        <button onclick="toggleForm('form2')">Iniciar Sesión</button>
        <form action="InicioViewUsuario" method="get" style="display:inline;">
            <button type="submit">Ver Usuarios</button>
        </form>
    </center>
    <br>
    <div id="form1" style="display: none;">
        <center>
            <form action="RegistroUsuario" method="post">
                <div class='mi-div' align="center">
                    <h2><label for="nombre">Nombre</label></h2>
                    <br>
                    <input type="text" id="nombre" name="nombre"><br>
                </div>
                <br>
                <div class='mi-div' align="center">
                    <h2><label for="apellido">Apellido</label></h2>
                    <br>
                    <input type="text" id="apellido" name="apellido"><br>
                </div>
                <br>
                <div class='mi-div' align="center"> 
                    <h2><label for="email">Email</label></h2>
                    <br>
                    <input type="text" id="email" name="email"><br>
                </div>
                <br>
                <div class='mi-div' align="center">
                    <h2><label for="contraseña">Contraseña</label></h2>
                    <br>
                    <input type="text" id="contraseña" name="contraseña"><br>
                </div>
                <br>

                <input type="submit" value="Registrarse">

            </form>


        </center>
    </div>

    <div id="form2" style="display: none;">
        <center>
            <form action="VerificarUsuario" method="post">


                <div class='mi-div' align="center"> 
                    <h2><label for="email">Email</label></h2>
                    <br>
                    <input type="text" id="email" name="email"><br>
                </div>
                <br>
                <div class='mi-div' align="center">
                    <h2><label for="contraseña">Contraseña</label></h2>
                    <input type="text" id="contraseña" name="contraseña"><br>
                    <br>
                </div>

                <br>
                <input type="submit" value="Iniciar Sesión">

                </body>
                </html>

