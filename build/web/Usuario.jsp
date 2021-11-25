<%-- 
    Document   : menu.jsp
    Created on : 22-ago-2021, 21:25:27
    Author     : Luis Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
      <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Timtex</title>

        
        <!-- Favicon -->
        <link href="assets/img/brand/favicon.png" rel="icon" type="image/png">

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Nunito:300,400,600,700,800" rel="stylesheet">

        <!-- Icons -->
        <link href="assets/css/icons.css" rel="stylesheet">


    </head><!--/head-->
</html>
<%@include file="Sesiones.jsp"%>

<% 
        UsuarioVO usuVO1 = new UsuarioVO();
        usuVO1 = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");

        rol = usuVO1.getIdCargoFK();
        if (rol.equals("3")||rol.equals("1")) {
            
    %>	

                    <!-- Page content -->
						<div class="container-fluid pt-8">
							<div class="page-header mt-0 shadow p-3">
								<ol class="breadcrumb mb-sm-0">
									<li class="breadcrumb-item active">Inicio</li>
								</ol>
								
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
						
						</div>
<%@include file="footer.jsp"%>	
		</div>
					</div>
				</div>
			</div>
			<!-- app-content-->
		</div>
	</div>

<% }else{%> 
                                no tiene permitido este modulo
                                
<%}%>                   
 <!-- Ansta Scripts -->
                            
                    

                          

