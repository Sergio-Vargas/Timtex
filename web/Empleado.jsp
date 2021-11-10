<%-- 
    Document   : Empleado
    Created on : 26-jun-2021, 20:01:05
    Author     : sergio saenz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
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

        rol = usuVO.getIdCargoFK();
        if (rol.equals("3")) {

    %>
    
<body class="app sidebar-mini rtl" >
	<div id="global-loader" ></div>
	<div class="page">
		<div class="page-main">
			<!-- Sidebar menu-->
			<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
			<aside class="app-sidebar ">
				<div class="sidebar-img">
					<a class="navbar-brand" href="index-2.html"><img alt="..." class="navbar-brand-img main-logo" src="assets/img/brand/logo-dark.png"> <img alt="..." class="navbar-brand-img logo" src="assets/img/brand/logo.png"></a>
					<ul class="side-menu">
						<li class="slide">
							<a class="side-menu__item active" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-home"></i><span class="side-menu__label">Inicio</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a class="slide-item" href="index-2.html">Ventas</a>
								</li>
								<li>
									<a class="slide-item" href="dashboard-social.html">Panel Social</a>
								</li>
								<li>
									<a class="slide-item" href="dashboard-marketing.html">Marketing</a>
								</li>
								<li>
									<a class="slide-item" href="dashboard-it.html">Estadisticas</a>
								</li>
								<li>
									<a class="slide-item" href="dashboard-cryptocurrency.html">Criptomoneda</a>
								</li>

							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-grid"></i><span class="side-menu__label">Aplicaciones</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="cards.html" class="slide-item">Tarjetas</a>
								</li>
								<li>
									<a href="dragable-cards.html" class="slide-item">Dragable Cards</a>
								</li>
								<li>
									<a href="widgets.html" class="slide-item">Widgets</a>
								</li>
								<li>
									<a href="full-calendar.html" class="slide-item">Calendario</a>
								</li>
								<li>
									<a href="range-slider.html" class="slide-item">Slider</a>
								</li>
								<li>
									<a href="scroll-bar.html" class="slide-item">Barra deslizadora</a>
								</li>
								<li>
									<a href="sweet-alerts.html" class="slide-item">Sweet Alerts</a>
								</li>
								<li>
									<a href="timeline.html" class="slide-item">Linea de tiempo</a>
								</li>
								<li>
									<a href="users.html" class="slide-item">Usuarios</a>
								</li>
							</ul>
						</li>

						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-edit"></i><span class="side-menu__label">Formularios</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="forms.html" class="slide-item">Basicos</a>
								</li>
								<li>
									<a href="form-select2.html" class="slide-item">Formularios Select2</a>
								</li>
								<li>
									<a href="file-uploads.html" class="slide-item">Formularios Update</a>
								</li>
								<li>
									<a href="form-wizard.html" class="slide-item">Formulario Wizard</a>
								</li>
								<li>
									<a href="datepicker.html" class="slide-item">Formulario Datepicker</a>
								</li>
								<li>
									<a href="form-switches.html" class="slide-item">Formulario con switches</a>
								</li>
							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-map"></i><span class="side-menu__label">Mapas</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="maps.html" class="slide-item">Google Maps</a>
								</li>
								<li>
									<a href="vector-map.html" class="slide-item">Vector Map</a>
								</li>
							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-file-text"></i><span class="side-menu__label">Tablas</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="tables.html" class="slide-item">Tablas</a>
								</li>
								<li>
									<a href="datatable.html" class="slide-item">Data Tables</a>
								</li>
							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-bar-chart-2"></i><span class="side-menu__label">Tipos de Gráficos</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="chart-flot.html" class="slide-item">Gráficos de Flot</a>
								</li>
								<li>
									<a href="chart-high.html" class="slide-item">High Charts </a>
								</li>
								<li>
									<a href="charts-chartjs.html" class="slide-item">Gráficos Chartjs</a>
								</li>
								<li>
									<a href="charts-echarts.html" class="slide-item">Gráficos de Echart</a>
								</li>
								<li>
									<a href="charts-morris.html" class="slide-item">Gráficos de Morris</a>
								</li>
							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-folder"></i><span class="side-menu__label">Paginas</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="user-profile.html" class="slide-item">Perfil</a>
								</li>
								<li>
									<a href="email-inbox.html" class="slide-item">Bandeja de Entrada</a>
								</li>
								<li>
									<a href="email-compose.html" class="slide-item">Correo</a>
								</li>
								<li>
									<a href="gallery.html" class="slide-item">Galeria</a>
								</li>
								<li>
									<a href="invoice.html" class="slide-item">Facturas</a>
								</li>
								<li>
									<a href="pricing.html" class="slide-item">Tablas de Precios</a>
								</li>
								<li>
									<a href="empty.html" class="slide-item">Vacio</a>
								</li>
								<li>
									<a href="under-construction.html" class="slide-item">En Construccion</a>
								</li>
								<li>
									<a href="400.html" class="slide-item">Pagina 400</a>
								</li>
								<li>
									<a href="404.html" class="slide-item">Pagina 404</a>
								</li>
								<li>
									<a href="500.html" class="slide-item">Pagina 500</a>
								</li>
								<li>
									<a href="505.html" class="slide-item">Pagina 505</a>
								</li>
							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-italic"></i><span class="side-menu__label">Iconos</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="icons-feather.html" class="slide-item">Iconos de plumas</a>
								</li>
								<li>
									<a href="icons-fontawesome.html" class="slide-item"> Iconos geniales de fuentes</a>
								</li>
								<li>
									<a href="icons-ion.html" class="slide-item">Iconos de iones</a>
								</li>
								<li>
									<a href="icons-materialdesign.html" class="slide-item">Iconos de Materialdesign</a>
								</li>
								<li>
									<a href="icons-nucleo.html" class="slide-item">Iconos de Nucleo</a>
								</li>
								<li>
									<a href="icons-pe7.html" class="slide-item">Iconos de pe7</a>
								</li>
								<li>
									<a href="icons-simpleline.html" class="slide-item">Iconos de Linea simple</a>
								</li>
								<li>
									<a href="icons-themify.html" class="slide-item">Iconos de tema</a>
								</li>
							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-underline"></i><span class="side-menu__label">Elementos UI</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="accordion.html" class="slide-item">Acordion</a>
								</li>
								<li>
									<a href="alerts.html" class="slide-item">Alertas</a>
								</li>
								<li>
									<a href="badges.html" class="slide-item">Insignias</a>
								</li>
								<li>
									<a href="buttons.html" class="slide-item">Botones</a>
								</li>
								<li>
									<a href="carousel.html" class="slide-item">Carousels</a>
								</li>
								<li>
									<a href="colors.html" class="slide-item">Colores</a>
								</li>
								<li>
									<a href="dropdowns.html" class="slide-item">Listas desplegables</a>
								</li>
								<li>
									<a href="grids.html" class="slide-item">Red</a>
								</li>
								<li>
									<a href="modal.html" class="slide-item">Modelo</a>
								</li>
								<li>
									<a href="navigation.html" class="slide-item">Navigacion</a>
								</li>
								<li>
									<a href="pagination.html" class="slide-item">Paginacion</a>
								</li>
								<li>
									<a href="popovers.html" class="slide-item">Popovers</a>
								</li>
								<li>
									<a href="progress.html" class="slide-item">Progreso</a>
								</li>
								<li>
									<a href="tabs.html" class="slide-item">Pestañas</a>
								</li>
								<li>
									<a href="tooltip.html" class="slide-item">Herramientas</a>
								</li>
								<li>
									<a href="typography.html" class="slide-item">Tipografia</a>
								</li>
							</ul>
						</li>

						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-user"></i><span class="side-menu__label">Cuenta</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="login.html" class="slide-item">Login</a>
								</li>
								<li>
									<a href="register.html" class="slide-item">Registrar</a>
								</li>
								<li>
									<a href="forgot.html" class="slide-item">Contraseña olvidada</a>
								</li>
								<li>
									<a href="lockscreen.html" class="slide-item">Pantalla bloqueada</a>
								</li>
							</ul>
						</li>
						<li class="slide">
							<a class="side-menu__item" data-toggle="slide" href="#"><i class="side-menu__icon fe fe-shopping-cart"></i><span class="side-menu__label">Comercio</span><i class="angle fa fa-angle-right"></i></a>
							<ul class="slide-menu">
								<li>
									<a href="shop.html" class="slide-item">Productos</a>
								</li>
								<li>
									<a href="cart.html" class="slide-item">Carrito</a>
								</li>
							</ul>
						</li>

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
						<div class="p-2 d-block d-sm-none navbar-sm-search">
							<!-- Form -->
							<form class="navbar-search navbar-search-dark form-inline ml-lg-auto">
								<div class="form-group mb-0">
									<div class="input-group input-group-alternative">
										<div class="input-group-prepend">
											<span class="input-group-text"><i class="fas fa-search"></i></span>
										</div><input class="form-control" placeholder="Search" type="text">
									</div>
								</div>
							</form>
						</div>
		<!-- Top navbar -->
                    <nav class="navbar navbar-top  navbar-expand-md navbar-dark" id="navbar-main">
                            <div class="container-fluid">
                                    <a aria-label="Hide Sidebar" class="app-sidebar__toggle" data-toggle="sidebar" href="#"></a>

                                    <!-- Horizontal Navbar -->
                                    <ul class="navbar-nav align-items-center d-none d-xl-block">
                                        <li class="nav-item dropdown">
                                                            Empleado
                                                    
                                            </li>
                                            <li class="nav-item dropdown">
                                                    <a aria-expanded="false" aria-haspopup="true" class="nav-link pr-md-0 d-none d-lg-block" data-toggle="dropdown" href="#" role="button">
                                                            Configuracion<span class="fas fa-caret-down"></span>
                                                    </a>
                                                    <div class="dropdown-menu dropdown-menu-arrow dropdown-menu-right">
                                                            <a class="dropdown-item" href="#"><span>Perfil del Administrador</span></a>
                                                            <a class="dropdown-item" href="#"><span>Temas</span></a>
                                                            <a class="dropdown-item" href="#"><span>Contraseñas</span></a>
                                                            <a class="dropdown-item" href="#"><span>Métodos de pago</span></a>
                                                            <a class="dropdown-item" href="#"><span>Otras configuraciones</span></a>
                                                    </div>
                                            </li>
                                           
                                    </ul>

                                    <!-- Brand -->
                                    <a class="navbar-brand pt-0 d-md-none" href="index-2.html">
                                            <img src="assets/img/brand/logo-light.png" class="navbar-brand-img" alt="...">
                                    </a>
                                    <!-- Form -->
                                    <form class="navbar-search navbar-search-dark form-inline mr-3 ml-lg-auto">
                                            <div class="form-group mb-0">
                                                    <div class="input-group input-group-alternative">
                                                            <div class="input-group-prepend">
                                                                    <span class="input-group-text"><i class="fas fa-search"></i></span>
                                                            </div><input class="form-control" placeholder="Search" type="text">
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
                                                                <h2><%=usuario%></h2>
                                                            </div>
                                                    </div></a>
                                                    <div class="dropdown-menu dropdown-menu-arrow dropdown-menu-right">
                                                            <div class=" dropdown-header noti-title">
                                                                    <h6 class="text-overflow m-0">¡Bienvenido!</h6>
                                                            </div>
                                                            <a class="dropdown-item" href="user-profile.html"><i class="ni ni-single-02"></i> <span>Mi perfil</span></a>
                                                            <a class="dropdown-item" href="#"><i class="ni ni-settings-gear-65"></i> <span>Ajustes</span></a>
                                                            <a class="dropdown-item" href="#"><i class="ni ni-calendar-grid-58"></i> <span>Actividad</span></a>
                                                            <a class="dropdown-item" href="#"><i class="ni ni-support-16"></i> <span>Soporte</span></a>
                                                            <form method="post" action="Sesiones">
                                                            <input class="dropdown-item" type="submit" value="Cerrar Sesion">
                                                            </form>
                                                            <input type="hidden" value="<%=id%>">
                                                    </div>
                                            </li>
                                    </ul>
                            </div>
                    </nav>
                    <!-- Top navbar-->

						<!-- Page content -->
						<div class="container-fluid pt-8">
							<div class="page-header mt-0 shadow p-3">
								<ol class="breadcrumb mb-sm-0">
									<li class="breadcrumb-item"><a href="#">Home</a></li>
									<li class="breadcrumb-item active" aria-current="page">Ventas</li>
								</ol>
								<div class="btn-group mb-0">
									<button type="button" class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Acciones</button>
									<div class="dropdown-menu">
										<a class="dropdown-item" href="#"><i class="fas fa-plus mr-2"></i>Añadir una pagina</a>
										<a class="dropdown-item" href="#"><i class="fas fa-eye mr-2"></i>Ver detalles</a>
										<a class="dropdown-item" href="#"><i class="fas fa-edit mr-2"></i>Editar página</a>
										<div class="dropdown-divider"></div>
										<a class="dropdown-item" href="#"><i class="fas fa-cog mr-2"></i> Ajustes</a>
									</div>
								</div>
							</div>
							<div class="card shadow overflow-hidden">
								<div class="">
									<div class="row">
										<div class="col-xl-2 col-lg-4 col-md-6 col-sm-6 stats">
											<div class="text-center">
												<p class="text-light">
													<i class="fas fa-chart-line mr-2"></i>
													Ventas de hoy
												</p>
												<h2 class="text-primary text-xxl">1235</h2>
												<a href="#" class="btn btn-outline-primary btn-pill btn-sm">30% disminución</a>
											</div>
										</div>
										<div class="col-xl-2 col-lg-4 col-md-6 col-sm-6 stats">
											<div class="text-center">
												<p class="text-light">
												  <i class="fas fa-users mr-2"></i>
												  Nuevos Usuarios
												</p>
												<h2 class="text-yellow text-xxl">523</h2>
												<a href="#" class="btn btn-outline-yellow btn-pill btn-sm">10% incremento</a>
											</div>
										</div>
										<div class="col-xl-2 col-lg-4 col-md-6 col-sm-6 stats">
											<div class="text-center">
												<p class="text-light">
												  <i class="fas fa-cart-arrow-down mr-2"></i>
												  Ordenes de hoy
												</p>
												<h2 class="text-warning text-xxl">785</h2>
												<a href="#" class="btn btn-outline-warning btn-pill btn-sm">9% disminución</a>
											</div>
										</div>
										<div class="col-xl-2 col-lg-4 col-md-6 col-sm-6 stats">
											<div class="text-center">
												<p class="text-light">
												  <i class="fas fa-signal mr-2"></i>
													Ingresos por ventas de hoy 
												</p>
												<h2 class="text-danger text-xxl">$ 125</h2>
												<a href="#" class="btn btn-outline-danger btn-pill btn-sm">10% disminución</a>
											</div>
										</div>
										<div class="col-xl-2 col-lg-4 col-md-6 col-sm-6 stats">
											<div class="text-center">
												<p class="text-light">
												  <i class="fas fa-dollar-sign mr-2"></i>
												  Beneficio de hoy
												</p>
												<h2 class="text-success text-xxl">$ 30</h2>
												<a href="#" class="btn btn-outline-success btn-pill btn-sm">5% incremento</a>
											</div>
										</div>
										<div class="col-xl-2 col-lg-4 col-md-6 col-sm-6 stats">
											<div class="text-center">
												<p class="text-light">
												  <i class="fas fa-briefcase mr-2"></i>
												 Valor del mercado
												</p>
												<h2 class="text-primary text-xxl">12</h2>
												<a href="#" class="btn btn-outline-primary btn-pill btn-sm">Vistas</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-xl-3">
									<div class="card shadow overflow-hidden">
										<div class="card-body">
											<div class="widget text-center">
												<div><i class="fas fa-users fa-5x text-yellow"></i></div>
												<h4 class="text-muted mt-2 mb-0">Usuarios en Linea</h4>
												<h2 class="display-2 mb-0">25,685</h2>
												<a href="#" class="btn btn-outline-yellow mt-3 btn-sm btn-pill">Ver todos</a>
											</div>
										</div>
										<span class="updating-chart" data-peity='{ "fill": ["#ffa21d"]}'>5,3,9,6,5,9,2,5,3,6,7,8,6</span>
									</div>
								</div>
								<div class="col-xl-3">
									<div class="">
										<div class="">
											<div class="row">
												<div class="col-xl-12 col-lg-12 col-sm-12">
													<div class="card shadow overflow-hidden">
														<div class="card-body pb-0">
															<div class="widget text-center">
																<small class="text-muted">Ventas mensuales</small>
																<h2 class="text-xxl mb-0">$ 8,343</h2>
															</div>
														</div>
														<span class="bar" data-peity='{ "fill": ["#00c3ed"]}'>5,4,5,2,8,4,5,6,5,2,4,4,8,4,6,2,3,4</span>
													</div>
													<div class="card shadow overflow-hidden">
														<div class="card-body pb-0">
															<div class="widget text-center">
																<small class="text-muted">Ventas semanales</small>
																<h2 class="text-xxl mb-0">$ 683</h2>
															</div>
														</div>
														<span class="bar" data-peity='{ "fill": ["#18b16f"]}'>5,4,5,2,8,4,5,6,5,2,4,4,8,4,6,2,3,4</span>

													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-xl-6">
									<div class="">
										<div class="">
											<div class="row">
												<div class="col-xl-6 col-lg-6 col-sm-6">
													<div class="card shadow">
														<div class="card-body">
															<div class="widget text-center">
																<small class="">Ingresos promedio por unidad</small>
																<h2 class="text-xxl mb-1 text-success">$ 142</h2>
																<p class="mb-0"><span class=""><i class="fas fa-caret-up ml-1 text-success"></i> 4%</span>  el ultimo mes</p>
															</div>
														</div>
													</div>
													<div class="card shadow">
														<div class="card-body">
															<div class="widget text-center">
																<small class="">Valor de por vida del cliente</small>
																<h2 class="text-xxl mb-1 text-yellow">$ 256</h2>
																<p class="mb-0"><span class=""><i class="fas fa-caret-down text-danger ml-1"></i> 5%</span> el ultimo mes</p>
															</div>
														</div>
													</div>
												</div>
												<div class="col-xl-6 col-lg-6 col-sm-6">
													<div class="card shadow">
														<div class="card-body">
															<div class="widget text-center">
																<small class="">Costo de adquisición de clientes</small>
																<h2 class="text-xxl text-primary mb-1">$ 329</h2>
																<p class="mb-0"><span class=""><i class="fas fa-caret-up text-success ml-1"></i> 6%</span> el ultimo mes</p>
															</div>
														</div>
													</div>
													<div class="card shadow">
														<div class="card-body">
															<div class="widget text-center">
																<small class="">Crecimiento de ventas mensual</small>
																<h2 class="text-xxl text-danger mb-1">12%</h2>
																<p class="mb-0"><span class=""><i class="fas fa-caret-down text-danger ml-1"></i> 8%</span> el ultimo mes</p>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-xl-7">
									<div class="card  shadow overflow-hidden">
										<div class="card-header bg-transparent ">
											<div class="row align-items-center">
												<div class="col">
													<h6 class="text-uppercase text-light ls-1 mb-1">Visión general</h6>
													<h2 class="mb-0">Detalles de ingresos y ganancias</h2>
												</div>

											</div>
										</div>
										<div class="card-body">
											<!-- Chart -->
											<div id="echart" class="chart-dropshadow h-400"></div>
										</div>
									</div>
								</div>
								<div class="col-xl-5">
									<div class="card  shadow overflow-hidden">
										<div class="card-header bg-transparent">
											<div class="row align-items-center">
												<div class="col">
													<h6 class="text-uppercase text-light ls-1 mb-1">Visión general</h6>
													<h2 class="mb-0">Rendimiento de ventas mensual</h2>
												</div>

											</div>
										</div>
										<div class="card-body">
											<!-- Chart -->
											<div id="echart2" class="chart-dropshadow h-400"></div>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="card shadow">
										<div class="card-header bg-transparent">
											<div class="row align-items-center">
												<div class="col">
													<h6 class="text-uppercase text-light ls-1 mb-1">Ingresos</h6>
													<h2 class="mb-0">Ingresos generados por país</h2>
												</div>
											</div>
										</div>
										<div class="">
											<div class="row">
												<div class="col-xl-4">
													<div class="card-body">
														<div class="progress-wrapper pt-2">
															<div class="progress-info">
																<div class="progress-label">
																	<span>India</span>
																</div>
																<div class="progress-percentage">
																	<span>70%</span>
																</div>
															</div>
															<div class="progress">
																<div class="progress-bar bg-primary" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%;"></div>
															</div>
														</div>
														<div class="progress-wrapper pt-2">
															<div class="progress-info">
																<div class="progress-label">
																	<span>Singapur</span>
																</div>
																<div class="progress-percentage">
																	<span>45%</span>
																</div>
															</div>
															<div class="progress">
																<div class="progress-bar bg-warning" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%;"></div>
															</div>
														</div>
														<div class="progress-wrapper pt-2">
															<div class="progress-info">
																<div class="progress-label">
																	<span>Bahrain</span>
																</div>
																<div class="progress-percentage">
																	<span>60%</span>
																</div>
															</div>
															<div class="progress">
																<div class="progress-bar bg-info" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;"></div>
															</div>
														</div>
														<div class="progress-wrapper pt-2">
															<div class="progress-info">
																<div class="progress-label">
																	<span>Maldivas</span>
																</div>
																<div class="progress-percentage">
																	<span>56%</span>
																</div>
															</div>
															<div class="progress">
																<div class="progress-bar bg-success" role="progressbar" aria-valuenow="56" aria-valuemin="0" aria-valuemax="100" style="width: 56%;"></div>
															</div>
														</div>
														<div class="progress-wrapper pt-2">
															<div class="progress-info">
																<div class="progress-label">
																	<span>Canada</span>
																</div>
																<div class="progress-percentage">
																	<span>30%</span>
																</div>
															</div>
															<div class="progress">
																<div class="progress-bar bg-danger" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%;"></div>
															</div>
														</div>
														<div class="progress-wrapper pt-2">
															<div class="progress-info">
																<div class="progress-label">
																	<span>Palaos</span>
																</div>
																<div class="progress-percentage">
																	<span>42%</span>
																</div>
															</div>
															<div class="progress mb-0">
																<div class="progress-bar bg-default" role="progressbar" aria-valuenow="42" aria-valuemin="0" aria-valuemax="100" style="width: 42%;"></div>
															</div>
														</div>
													</div>
												</div>
												<div class="col-xl-8 worldmap">
													<div class="card-body">
														<div id="world-map-markers" class="worldh h-400" ></div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col">
									<div class="card shadow">
										<div class="card-header bg-transparent border-0">
											<h2 class=" mb-0">Tablas de ventas de productos</h2>
										</div>
										<div class="">
											<div class="grid-margin">
												<div class="">
													<div class="table-responsive">
														<table class="table card-table table-vcenter text-nowrap align-items-center">
															<thead class="thead-light">
																<tr>
																	<th>Producto</th>
																	<th>Vendido</th>
																	<th>Record</th>
																	<th>Existencias</th>
																	<th>Cantidad</th>
																	<th>Estado del inventario</th>
																</tr>
															</thead>
															<tbody>
																<tr>
																	<td class="text-sm font-weight-600">Cartera Mujer-E32N</td>
																	<td>18</td>
																	<td>05</td>
																	<td>112</td>
																	<td>$ 2,356</td>
																	<td>En existencia</td>
																</tr>
																<tr>
																	<td class="text-sm font-weight-600">Teléfono-345S</td>
																	<td >10</td>
																	<td>04</td>
																	<td>210</td>
																	<td>$ 3,522</td>
																	<td>En existencia</td>
																</tr>
																<tr>
																	<td class="text-sm font-weight-600">Muñeco-Elefante</td>
																	<td >15</td>
																	<td>05</td>
																	<td>215</td>
																	<td>$ 5,362</td>
																	<td>En existencia</td>
																</tr>
																<tr>
																	<td class="text-sm font-weight-600">Mujeres-Kurtis</td>
																	<td>21</td>
																	<td>07</td>
																	<td>102</td>
																	<td>$ 1,326</td>
																	<td>En existencia</td>
																</tr>
																<tr>
																	<td class="text-sm font-weight-600">Zapatos de hombre</td>
																	<td>34</td>
																	<td>10</td>
																	<td>325</td>
																	<td>$ 5,234</td>
																	<td>En existencia</td>
																</tr>
																<tr>
																	<td class="text-sm font-weight-600">Reloj de metal dorado para hombre</td>
																	<td>11</td>
																	<td>04</td>
																	<td>5</td>
																	<td>$ 3,256</td>
																	<td>
																		<i class="fas fa-exclamation-triangle text-warning"></i>  Agotado
																	</td>
																</tr>
																<tr>
																	<td class="text-sm font-weight-600">Laptop</td>
																	<td>60</td>
																	<td>10</td>
																	<td>0</td>
																	<td>$ 7,652</td>
																	<td>
																		<i class="fas fa-exclamation-triangle text-danger"></i> Agotado
																	</td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						<!-- Footer -->
							<footer class="footer">
								<div class="row align-items-center justify-content-xl-between">
									<div class="col-xl-6">
										<div class="copyright text-center text-xl-left text-muted">
											<p class="text-sm font-weight-500">Copyright 2021</p>
										</div>
									</div>
							
								</div>
							</footer>
							<!-- Footer -->
						</div>
					</div>
				</div>
			</div>
			<!-- app-content-->
		</div>
	</div>
         <%        } else {
%>    
no tiene permitido este modulo
<%}%>                                           
	<!-- Back to top -->
	<a href="#top" id="back-to-top"><i class="fa fa-angle-up"></i></a>

	<!-- Ansta Scripts -->
	<!-- Core -->
	<script src="assets/plugins/jquery/dist/jquery.min.js"></script>
	<script src="assets/js/popper.js"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>

	<!-- Echarts JS -->
	<script src="assets/plugins/chart-echarts/echarts.js"></script>

	<!-- Fullside-menu Js-->
	<script src="assets/plugins/toggle-sidebar/js/sidemenu.js"></script>

	<!-- Custom scroll bar Js-->
	<script src="assets/plugins/customscroll/jquery.mCustomScrollbar.concat.min.js"></script>

	<!-- peitychart -->
	<script src="assets/plugins/peitychart/jquery.peity.min.js"></script>
	<script src="assets/plugins/peitychart/peitychart.init.js"></script>

	<!-- Vector Plugin -->
	<script src="assets/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js"></script>
	<script src="assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script src="assets/plugins/jvectormap/gdp-data.js"></script>
	<script src="assets/plugins/jvectormap/jquery-jvectormap-us-aea-en.js"></script>
	<script src="assets/plugins/jvectormap/jquery-jvectormap-uk-mill-en.js"></script>
	<script src="assets/plugins/jvectormap/jquery-jvectormap-au-mill.js"></script>
	<script src="assets/plugins/jvectormap/jquery-jvectormap-ca-lcc.js"></script>
	<script src="assets/js/dashboard2map.js"></script>

	<!-- Ansta JS -->
	<script src="assets/js/custom.js"></script>
	<script src="assets/js/dashboard-sales.js"></script>

</body>

</html>

