<%-- 
    Document   : Sesiones
    Created on : 26-jun-2021, 19:40:42
    Author     : sergio saenz
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    HttpSession buscarSesion = (HttpSession) request.getSession();

    String usuario = "";
    String id = "";
    String correo = "";
    String rol = "";

    if (buscarSesion.getAttribute("datosUsuario") != null) {

        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");

        usuario = usuVO.getNombreUsuario();
        id = usuVO.getIdUsuario();
        correo = usuVO.getCorreoDatos();
        rol = usuVO.getIdCargoFK();
    } else {
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timtex</title>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">
        <meta content="Start your development with a Dashboard for Bootstrap 4." name="description">
        <meta content="Spruko" name="author">


        <!-- Favicon -->
        <link href="assets/img/brand/favicon.png" rel="icon" type="image/png">

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800" rel="stylesheet">

        <!-- Icons -->
        <link href="assets/css/icons.css" rel="stylesheet">

        <!--Bootstrap.min css-->
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">

        <!-- Ansta CSS -->
        <link href="assets/css/dashboard.css" rel="stylesheet" type="text/css">

        <!-- Tabs CSS -->
        <link href="assets/plugins/tabs/style.css" rel="stylesheet" type="text/css">

        <!-- jvectormap CSS -->
        <link href="assets/plugins/jvectormap/jquery-jvectormap-2.0.2.css" rel="stylesheet" />

        <!-- Custom scroll bar css-->
        <link href="assets/plugins/customscroll/jquery.mCustomScrollbar.css" rel="stylesheet" />

        <!-- Sidemenu Css -->
        <link href="assets/plugins/toggle-sidebar/css/sidemenu.css" rel="stylesheet">

    </head>
    <%    UsuarioVO usuVO = new UsuarioVO();
        usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
    %>
    <body class="app sidebar-mini rtl" >
       
        <div id="global-loader" ></div>
       
        <div class="page">
            <div class="page-main">
                <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
                <aside class="app-sidebar">
                    <div class="sidebar-img">
                        <a class="navbar-brand" href="#"><img alt="..." class="navbar-brand-img main-logo" src="assets/img/brand/logo-dark.png"> <img alt="..." class="navbar-brand-img logo" src="assets/img/brand/favicon.png"></a>
                        <%    
                        rol = usuVO.getIdCargoFK();
                                if (rol.equals("1") || rol.equals("3")) {

                            %>
                        <a class="side-menu__item active"  href="Usuario.jsp"><i class="side-menu__icon fas fa-home"></i><span class="side-menu__label">Inicio</span></a>
                        <%}%>
                        <%    
                        rol = usuVO.getIdCargoFK();
                                if (rol.equals("2")) {

                            %>
                        <a class="side-menu__item active"  href="Cliente.jsp"><i class="side-menu__icon fas fa-home"></i><span class="side-menu__label">Inicio</span></a>
                        <%}%>

                        <ul class="side-menu">
                            <%
                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1") || rol.equals("3")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-shopping-cart"></i><span class="side-menu__label">Ordenes</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <a href="consultarOrden.jsp" class="slide-item">Consultar Ordenes</a>
                                    </li>

                                </ul>

                            </li><%}%>
                            <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-clock"></i><span class="side-menu__label">Procesos</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <a href="consultarProceso.jsp" class="slide-item">Consultar Procesos</a>
                                    </li>

                                </ul>

                            </li><%}%>
                            <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-users"></i><span class="side-menu__label">Empleado</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <a href="consultarUsuario.jsp" class="slide-item">Consultar Empleados</a>
                                    </li>
                                    <li>
                                        <a href="registrarEmpleado.jsp" class="slide-item">Registrar Empleados</a>
                                    </li>

                                </ul>

                            </li><%}%>
                            <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-user"></i><span class="side-menu__label">Usuario</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <a href="consultarDatosPersonales.jsp" class="slide-item">Consultar Datos</a>
                                    </li>
                                    <li>
                                        <a href="consultarIngreso.jsp" class="slide-item">Consultar Usuario</a>
                                    </li>
                                </ul>

                            </li>
                            <%}%>
                               <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("1")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-tshirt"></i><span class="side-menu__label">Prenda</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <a href="registrarPrenda.jsp" class="slide-item">Registrar Prenda</a>
                                        <a href="consultarPrenda.jsp" class="slide-item">Consultar Prenda</a>
                                    </li>

                                </ul>
                            </li>                
                            <%}%>
                            
                           
                            <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("2")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-shopping-cart"></i><span class="side-menu__label">Ordenes</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <form method="post" action="Orden">
                                        <input type="hidden" value="<%=id%>" name="textIdDato"> 
                                       <button type="submit" class="btn btn-primary">Consultar Ordenes</button>
                                        <input type="hidden" value="5" name="opcion">
                                        </form>
                                    </li>

                                </ul>
                            </li>
                            <%}%>
                            <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("3")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-clock"></i><span class="side-menu__label">Proceso</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <a href="registrarProceso.jsp" class="slide-item">Registrar Proceso</a>
                                        
                                        <a href="consultarProceso.jsp" class="slide-item">Consultar Proceso</a>
                                    </li>

                                </ul>
                            </li>                
                            <%}%>
                             <%

                                rol = usuVO.getIdCargoFK();
                                if (rol.equals("3")) {

                            %>
                            <li class="slide">
                                <a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fas fa-users"></i><span class="side-menu__label">Asignación</span><i class="angle fa fa-angle-right"></i></a>
                                <ul class="slide-menu">
                                    <li>
                                        <a href="registrarAsignar.jsp" class="slide-item">Asignar Orden</a>    
                                        <a href="consultarAsignar.jsp" class="slide-item">Consultar Asignación</a>    
                                    </li>

                                </ul>
                            </li>                
                            <%}%>
                            
                         
                            <li>
                                <a class="side-menu__item" href="https://themeforest.net/user/sprukosoft/portfolio"><i class="side-menu__icon fa fa-question-circle"></i><span class="side-menu__label">Ayuda y Soporte</span></a>
                            </li>

                        </ul>
                    </div>
                </aside>
                <!-- Sidebar menu-->

                <!-- app-content-->
                <div class="app-content ">
                    <div class="side-app">
                        <div class="main-content">

                            <!-- Top navbar -->
                            <nav class="navbar navbar-top  navbar-expand-md navbar-dark" id="navbar-main">
                                <div class="container-fluid">
                                    <a aria-label="Hide Sidebar" class="app-sidebar__toggle" data-toggle="sidebar" href="#"></a>

                                    <!-- Horizontal Navbar -->
                                    <ul class="navbar-nav align-items-center d-none d-xl-block">
                                        <%

                                            rol = usuVO.getIdCargoFK();
                                            if (rol.equals("1")) {

                                        %>
                                        <li class="nav-item dropdown">
                                            Administrador
                                        </li>
                                        <%}%>
                                        <%

                                            rol = usuVO.getIdCargoFK();
                                            if (rol.equals("2")) {

                                        %>
                                        <li class="nav-item dropdown">
                                            Cliente
                                        </li>
                                        <%}%>
                                        <%

                                            rol = usuVO.getIdCargoFK();
                                            if (rol.equals("3")) {

                                        %>
                                        <li class="nav-item dropdown">
                                            Empleado
                                        </li>
                                        <%}%>


                                    </ul>

                                    <!-- Brand -->
                                    <a class="navbar-brand pt-0 d-md-none" href="#">
                                        <img src="assets/img/brand/logo-dark.png" class="navbar-brand-img" alt="...">
                                    </a>
                                    <!-- Form -->
                                    <form class="navbar-search navbar-search-dark form-inline mr-3 ml-lg-auto">
                                        <div class="form-group mb-0">
                                            <div class="input-group input-group-alternative">
                                                <div class="input-group-prepend">

                                                </div><input class="form-control" type="hidden">
                                            </div>
                                        </div>
                                    </form>
                                    <!-- User -->
                                    <ul class="navbar-nav align-items-center ">
                                        <li class="nav-item d-none d-md-flex">
                                            <div class="dropdown d-none d-md-flex mt-2 ">
                                                <a class="nav-link full-screen-link pl-0 pr-0"><i class="fe fe-maximize-2 floating " id="fullscreen-button"></i></a>
                                            </div>
                                        </li>
                                        <li class="nav-item dropdown d-none d-md-flex">
                                            <a aria-expanded="false" aria-haspopup="true" class="nav-link pr-0" data-toggle="dropdown" href="#" role="button">
                                                <div class="media align-items-center">
                                                    <i class="fe fe-user "></i>
                                                </div></a>
                                            <div class="dropdown-menu dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right">
                                                <a class="dropdown-item d-flex" href="#">
                                                    <span class="avatar brround mr-3 align-self-center"> <img src="assets/img/faces/male/4.jpg" alt="imag" ></span>
                                                    <div>
                                                        <strong>Madeleine Scott</strong> te mando una solicitud
                                                        <div class=" mt-2 small text-muted">
                                                            <span class="btn btn-sm btn-primary">Confirmar</span>
                                                            <span class="btn btn-sm btn-outline-primary">Eliminar</span>
                                                        </div>
                                                    </div>
                                                </a>
                                                <a class="dropdown-item d-flex" href="#">
                                                    <span class="avatar brround mr-3 align-self-center"><img src="assets/img/faces/female/14.jpg" alt="imag" ></span>
                                                    <div>
                                                        <strong>rebica</strong> te mando una solicitud
                                                        <div class=" mt-2 small text-muted">
                                                            <span class="btn btn-sm btn-primary">Confirmar</span>
                                                            <span class="btn btn-sm btn-outline-primary">Eliminar</span>
                                                        </div>
                                                    </div>
                                                </a>
                                                <a class="dropdown-item d-flex" href="#">
                                                    <span class="avatar brround mr-3 align-self-center"><img src="assets/img/faces/male/1.jpg" alt="imag"></span>
                                                    <div>
                                                        <strong>Devid robott</strong> te mando una solicitud
                                                        <div class=" mt-2 small text-muted">
                                                            <span class="btn btn-sm btn-primary">Confirmar</span>
                                                            <span class="btn btn-sm btn-outline-primary">Eliminar</span>
                                                        </div>
                                                    </div>
                                                </a>
                                                <div class="dropdown-divider"></div><a class="dropdown-item text-center text-muted-dark" href="#">Ver todas las solicitudes</a>
                                            </div>
                                        </li>

                                        <li class="nav-item dropdown d-none d-md-flex">
                                            <a aria-expanded="false" aria-haspopup="true" class="nav-link pr-0" data-toggle="dropdown" href="#" role="button">
                                                <div class="media align-items-center">
                                                    <i class="fe fe-mail "></i>
                                                </div></a>
                                            <div class="dropdown-menu  dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right">
                                                <a href="#" class="dropdown-item text-center">12 Nuevos Mensajes</a>
                                                <div class="dropdown-divider"></div>
                                                <a href="#" class="dropdown-item d-flex">
                                                    <span class="avatar brround mr-3 align-self-center"><img src="assets/img/faces/male/41.jpg" alt="img"></span>
                                                    <div>
                                                        <strong>Madeleine</strong> ¡Hola! Estoy disponible
                                                        <div class="small text-muted">Hace 3 horas</div>
                                                    </div>
                                                </a>
                                                <a href="#" class="dropdown-item d-flex">
                                                    <span class="avatar brround mr-3 align-self-center"><img src="assets/img/faces/female/1.jpg" alt="img" ></span>
                                                    <div>
                                                        <strong>Anthony</strong> Nuevo producto publicando...
                                                        <div class="small text-muted">Hace 5 horas</div>
                                                    </div>
                                                </a>
                                                <div class="dropdown-divider"></div>
                                                <a href="#" class="dropdown-item text-center">Ver todos los mensajes</a>
                                            </div>
                                        </li>
                                        <li class="nav-item dropdown d-none d-md-flex">
                                            <a aria-expanded="false" aria-haspopup="true" class="nav-link pr-0" data-toggle="dropdown" href="#" role="button">
                                                <div class="media align-items-center">
                                                    <i class="fe fe-bell f-30 "></i>
                                                </div></a>
                                            <div class="dropdown-menu dropdown-menu-lg dropdown-menu-arrow dropdown-menu-right">
                                                <a href="#" class="dropdown-item d-flex">
                                                    <div>
                                                        <strong>Alguien le dio link a tus publicaciones</strong>
                                                        <div class="small text-muted">Hace 3 horas</div>
                                                    </div>
                                                </a>
                                                <a href="#" class="dropdown-item d-flex">
                                                    <div>
                                                        <strong> 3 Nuevos comentarios</strong>
                                                        <div class="small text-muted">Hace 5 horas</div>
                                                    </div>
                                                </a>
                                                <a href="#" class="dropdown-item d-flex">
                                                    <div>
                                                        <strong> Servidor reseteado</strong>
                                                        <div class="small text-muted">Hace 45 minutos</div>
                                                    </div>
                                                </a>
                                                <div class="dropdown-divider"></div>
                                                <a href="#" class="dropdown-item text-center">Ver todas las notificaciones</a>
                                            </div>
                                        </li>
                                        <li class="nav-item dropdown">
                                            <a aria-expanded="false" aria-haspopup="true" class="nav-link pr-md-0" data-toggle="dropdown" href="#" role="button">
                                                <div class="media align-items-center">

                                                    <div class="media-body ml-5 d-none d-lg-block">
                                                        <h3 class="mb-0"><%=usuario%></h3>
                                                    </div>
                                                </div></a>
                                            <div class="dropdown-menu dropdown-menu-arrow dropdown-menu-right">
                                                <div class=" dropdown-header noti-title">
                                                    <h6 class="text-overflow m-6">¡Bienvenid@!</h6>
                                                </div>
                                                  <a href="Actualizarclave.jsp" class="text-left text-muted"><input type="submit" class="dropdown-item" value="Actualizar Clave"></a>

                                                <form method="post" action="Sesiones">
                                                    <input class="dropdown-item" type="submit" value="Cerrar Sesión">
                                                </form>
                                                <input type="hidden" value="<%=id%>">
                                                    
                                               
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                            
                            </nav>


                            </body>
 </html> 
                                                 




