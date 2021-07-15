<%-- 
    Document   : Usuario
    Created on : 10/07/2021, 04:02:10
    Author     : Mateu
--%>

<%@page import="formulario.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Usuario usu = (Usuario) session.getAttribute("user");%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bienvenido <% out.print(" "+usu.getNombre()+" "+usu.getApellido());%></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" crossorigin="anonymous">

    </head>
    <body class="bg-dark">
      

        <div class="jumbotron bg-light">
             <div class="container align-self-left"> 
                    <img  src="https://agustinabellone-portfolio.netlify.app/img/program.png" alt="Logo Codo a Codo" >
            </div>
            <header>
                <div class="container align-self-center">
                    <h1 class="text-center display-3"> <% out.print(usu.getNombre()+" "+usu.getApellido());%></h1>
                </div>
            </header>
        </div>

        <div class="jumbotron jumbotron-fluid bg-dark">
            <div class="container align-self-center bg-secondary">
                <section>
                    <div>
                        <div class="card">
                            <div class="card-body">

                                <h3 class="card-title"><% out.print(usu.getCurso());%></h3>
                                <p class="card-text">Comision: <% out.print(usu.getComision());%></p>
                                <p class="card-text">En el transcurso del curso de Codo a Codo hemos aprendido a utilizar
                                    HTML, CSS, Boostrap, JavaScript, GIT, SCRUM, Base De Datos.</p>
                            </div>

                        </div>
                    </div>
                </section>
            </div>
           
        </div>
            <form name="Volver" action="index.html" methos="POST">
                <input type="submit" class="btn btn-link text-light" value="Regresar al formulario"/>
            </form>
    </body>
</html>

