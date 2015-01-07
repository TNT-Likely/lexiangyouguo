<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8" />
<title>Metronic | Admin Dashboard Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="/shop/resources/admin/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/shop/resources/admin/css/bootstrap-responsive.min.css"
	rel="stylesheet" type="text/css" />
<link href="/shop/resources/admin/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link href="/shop/resources/admin/css/style-metro.css" rel="stylesheet"
	type="text/css" />
<link href="/shop/resources/admin/css/style.css" rel="stylesheet"
	type="text/css" />
<link href="/shop/resources/admin/css/style-responsive.css"
	rel="stylesheet" type="text/css" />
<link href="/shop/resources/admin/css/default.css" rel="stylesheet"
	type="text/css" id="style_color" />
<link href="/shop/resources/admin/css/uniform.default.css"
	rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="/shop/resources/admin/css/jquery.gritter.css"
	rel="stylesheet" type="text/css" />

<link href="/shop/resources/admin/css/daterangepicker.css"
	rel="stylesheet" type="text/css" />

<link href="/shop/resources/admin/css/fullcalendar.css" rel="stylesheet"
	type="text/css" />

<link href="/shop/resources/admin/css/jqvmap.css" rel="stylesheet"
	type="text/css" media="screen" />

<link href="/shop/resources/admin/css/jquery.easy-pie-chart.css"
	rel="stylesheet" type="text/css" media="screen" />
<!-- END PAGE LEVEL STYLES -->
<link rel="shortcut icon" href="/shop/resources/admin/img/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
	<!-- BEGIN HEADER -->
	<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- BEGIN TOP NAVIGATION BAR -->
		<div class="navbar-inner">
			<div class="container-fluid">
				<!-- BEGIN LOGO -->
				<a class="brand" href="/Areas/Admin/Base/Index"> <img
					src="/shop/resources/admin/img/logo.png" alt="logo" /> 0
				</a>
				<!-- END LOGO -->
				<!-- BEGIN RESPONSIVE MENU TOGGLER -->
				<a href="javascript:;" class="btn-navbar collapsed"
					data-toggle="collapse" data-target=".nav-collapse"> <img
					src="/shop/resources/admin/img/menu-toggler.png" alt="" />
				</a>
				<!-- END RESPONSIVE MENU TOGGLER -->
				<!-- BEGIN TOP NAVIGATION MENU -->

				<ul class="nav pull-right">

					<!-- BEGIN NOTIFICATION DROPDOWN -->

					<li class="dropdown" id="header_notification_bar"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"> <i
							class="icon-warning-sign"></i> <span class="badge">6</span>

					</a>

						<ul class="dropdown-menu extended notification">

							<li>

								<p>You have 14 new notifications</p>

							</li>

							<li><a href="#"> <span class="label label-success"><i
										class="icon-plus"></i></span> New user registered. <span class="time">Just
										now</span>

							</a></li>

							<li><a href="#"> <span class="label label-important"><i
										class="icon-bolt"></i></span> Server #12 overloaded. <span
									class="time">15 mins</span>

							</a></li>

							<li><a href="#"> <span class="label label-warning"><i
										class="icon-bell"></i></span> Server #2 not respoding. <span
									class="time">22 mins</span>

							</a></li>

							<li><a href="#"> <span class="label label-info"><i
										class="icon-bullhorn"></i></span> Application error. <span
									class="time">40 mins</span>

							</a></li>

							<li><a href="#"> <span class="label label-important"><i
										class="icon-bolt"></i></span> Database overloaded 68%. <span
									class="time">2 hrs</span>

							</a></li>

							<li><a href="#"> <span class="label label-important"><i
										class="icon-bolt"></i></span> 2 user IP blocked. <span class="time">5
										hrs</span>

							</a></li>

							<li class="external"><a href="#">See all notifications <i
									class="m-icon-swapright"></i></a></li>

						</ul></li>

					<!-- END NOTIFICATION DROPDOWN -->
					<!-- BEGIN INBOX DROPDOWN -->

					<li class="dropdown" id="header_inbox_bar"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"> <i
							class="icon-envelope"></i> <span class="badge">5</span>

					</a>

						<ul class="dropdown-menu extended inbox">

							<li>

								<p>You have 12 new messages</p>

							</li>

							<li><a href="inbox.html?a=view"> <span class="photo"><img
										src="/shop/resources/admin/img/avatar2.jpg" alt="" /></span> <span
									class="subject"> <span class="from">Lisa Wong</span> <span
										class="time">Just Now</span>

								</span> <span class="message"> Vivamus sed auctor nibh congue
										nibh. auctor nibh auctor nibh... </span>

							</a></li>

							<li><a href="inbox.html?a=view"> <span class="photo"><img
										src=".//shop/resources/admin/img/avatar3.jpg" alt="" /></span> <span
									class="subject"> <span class="from">Richard Doe</span> <span
										class="time">16 mins</span>

								</span> <span class="message"> Vivamus sed congue nibh auctor
										nibh congue nibh. auctor nibh auctor nibh... </span>

							</a></li>

							<li><a href="inbox.html?a=view"> <span class="photo"><img
										src=".//shop/resources/admin/img/avatar1.jpg" alt="" /></span> <span
									class="subject"> <span class="from">Bob Nilson</span> <span
										class="time">2 hrs</span>

								</span> <span class="message"> Vivamus sed nibh auctor nibh
										congue nibh. auctor nibh auctor nibh... </span>

							</a></li>

							<li class="external"><a href="inbox.html">See all
									messages <i class="m-icon-swapright"></i>
							</a></li>

						</ul></li>

					<!-- END INBOX DROPDOWN -->
					<!-- BEGIN TODO DROPDOWN -->

					<li class="dropdown" id="header_task_bar"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"> <i
							class="icon-tasks"></i> <span class="badge">5</span>

					</a>

						<ul class="dropdown-menu extended tasks">

							<li>

								<p>You have 12 pending tasks</p>

							</li>

							<li><a href="#"> <span class="task"> <span
										class="desc">New release v1.2</span> <span class="percent">30%</span>

								</span> <span class="progress progress-success "> <span
										style="width: 30%;" class="bar"></span>

								</span>

							</a></li>

							<li><a href="#"> <span class="task"> <span
										class="desc">Application deployment</span> <span
										class="percent">65%</span>

								</span> <span class="progress progress-danger progress-striped active">

										<span style="width: 65%;" class="bar"></span>

								</span>

							</a></li>

							<li><a href="#"> <span class="task"> <span
										class="desc">Mobile app release</span> <span class="percent">98%</span>

								</span> <span class="progress progress-success"> <span
										style="width: 98%;" class="bar"></span>

								</span>

							</a></li>

							<li><a href="#"> <span class="task"> <span
										class="desc">Database migration</span> <span class="percent">10%</span>

								</span> <span class="progress progress-warning progress-striped">

										<span style="width: 10%;" class="bar"></span>

								</span>

							</a></li>

							<li><a href="#"> <span class="task"> <span
										class="desc">Web server upgrade</span> <span class="percent">58%</span>

								</span> <span class="progress progress-info"> <span
										style="width: 58%;" class="bar"></span>

								</span>

							</a></li>

							<li><a href="#"> <span class="task"> <span
										class="desc">Mobile development</span> <span class="percent">85%</span>

								</span> <span class="progress progress-success"> <span
										style="width: 85%;" class="bar"></span>

								</span>

							</a></li>

							<li class="external"><a href="#">See all tasks <i
									class="m-icon-swapright"></i></a></li>

						</ul></li>

					<!-- END TODO DROPDOWN -->
					<!-- BEGIN USER LOGIN DROPDOWN -->

					<li class="dropdown user"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <img alt=""
							src="/shop/resources/admin/img/avatar1_small.jpg" /> <span
							class="username">管理员</span> <i class="icon-angle-down"></i>

					</a>

						<ul class="dropdown-menu">

							<li><a href="extra_profile.html"><i class="icon-user"></i>
									我的配置</a></li>

							<li><a href="page_calendar.html"><i
									class="icon-calendar"></i> 我的日程</a></li>

							<li><a href="inbox.html"><i class="icon-envelope"></i>
									我的消息(3)</a></li>

							<li><a href="#"><i class="icon-tasks"></i> 我的任务</a></li>

							<li class="divider"></li>

							<li><a href="extra_lock.html"><i class="icon-lock"></i>
									锁定屏幕</a></li>

							<li><a href="login.html"><i class="icon-key"></i> 注销</a></li>

						</ul></li>

					<!-- END USER LOGIN DROPDOWN -->

				</ul>

				<!-- END TOP NAVIGATION MENU -->

			</div>

		</div>

		<!-- END TOP NAVIGATION BAR -->

	</div>

	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->

	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar nav-collapse collapse">
			<ul class="page-sidebar-menu">

				<li>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->

					<div class="sidebar-toggler hidden-phone"></div> <!-- BEGIN SIDEBAR TOGGLER BUTTON -->

				</li>

				<li>
					<!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->

					<form class="sidebar-search">

						<div class="input-box">

							<a href="javascript:;" class="remove"></a> <input type="text"
								placeholder="搜索..." /> <input type="button" class="submit"
								value=" " />

						</div>

					</form> <!-- END RESPONSIVE QUICK SEARCH FORM -->

				</li>

				<li class="start active "><a href="/Admin/Base/Index"> <i
						class="icon-home"></i> <span class="title">控制面板</span> <span
						class="selected"></span>

				</a></li>
				<li class=""><a href="javascript:;"> <i class="icon-group"></i>

						<span class="title">用户模块</span> <span class="arrow "></span>

				</a>

					<ul class="sub-menu">

						<li><a href="layout_horizontal_sidebar_menu.html"> 用户管理 </a>

						</li>

						<li><a href="layout_horizontal_menu1.html"> 角色管理 </a></li>

						<li><a href="layout_horizontal_menu2.html"> 个人信息 </a></li>

					</ul></li>

				<li class=""><a href="javascript:;"> <i class="icon-plane"></i>

						<span class="title">商品管理</span> <span class="arrow "></span>

				</a>

					<ul class="sub-menu">
						<li><a href="pcategory">商品分类</a></li>
						<li><a href="/Admin/MSiteNav/Category"> 栏目管理 </a></li>
					</ul></li>
			</ul>
			<!-- END SIDEBAR MENU -->
		</div>

		<!-- END SIDEBAR -->
		<!-- BEGIN PAGE -->
		<div class="page-content">

			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<div id="portlet-config" class="modal hide">

				<div class="modal-header">

					<button data-dismiss="modal" class="close" type="button"></button>

					<h3>portlet Settings</h3>

				</div>

				<div class="modal-body">

					<p>Here will be a configuration form</p>

				</div>

			</div>

			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<!-- BEGIN PAGE CONTAINER-->

			<div class="container-fluid">

				<!-- BEGIN PAGE HEADER-->   

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN STYLE CUSTOMIZER -->

						<div class="color-panel hidden-phone">

							<div class="color-mode-icons icon-color"></div>

							<div class="color-mode-icons icon-color-close"></div>

							<div class="color-mode">

								<p>THEME COLOR</p>

								<ul class="inline">

									<li class="color-black current color-default" data-style="default"></li>

									<li class="color-blue" data-style="blue"></li>

									<li class="color-brown" data-style="brown"></li>

									<li class="color-purple" data-style="purple"></li>

									<li class="color-grey" data-style="grey"></li>

									<li class="color-white color-light" data-style="light"></li>

								</ul>

								<label>

									<span>Layout</span>

									<select class="layout-option m-wrap small">

										<option value="fluid" selected="">Fluid</option>

										<option value="boxed">Boxed</option>

									</select>

								</label>

								<label>

									<span>Header</span>

									<select class="header-option m-wrap small">

										<option value="fixed" selected="">Fixed</option>

										<option value="default">Default</option>

									</select>

								</label>

								<label>

									<span>Sidebar</span>

									<select class="sidebar-option m-wrap small">

										<option value="fixed">Fixed</option>

										<option value="default" selected="">Default</option>

									</select>

								</label>

								<label>

									<span>Footer</span>

									<select class="footer-option m-wrap small">

										<option value="fixed">Fixed</option>

										<option value="default" selected="">Default</option>

									</select>

								</label>

							</div>

						</div>

						<!-- END BEGIN STYLE CUSTOMIZER -->  

						<h3 class="page-title">

							Form Layouts

							 <small>form layouts and more</small>

						</h3>

						<ul class="breadcrumb">

							<li>

								<i class="icon-home"></i>

								<a href="index.html">Home</a> 

								<span class="icon-angle-right"></span>

							</li>

							<li>

								<a href="#">Form Stuff</a>

								<span class="icon-angle-right"></span>

							</li>

							<li><a href="#">Form Layouts</a></li>

						</ul>

					</div>

				</div>

				<!-- END PAGE HEADER-->

				<!-- BEGIN PAGE CONTENT-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN SAMPLE FORM PORTLET-->   

						<div class="portlet box blue tabbable">

							<div class="portlet-title">

								<div class="caption">

									<i class="icon-reorder"></i>

									<span class="hidden-480">General Layouts</span>

								</div>

							</div>

							<div class="portlet-body form">

								<div class="tabbable portlet-tabs">

									<ul class="nav nav-tabs">

										<li><a href="#portlet_tab3" data-toggle="tab">Inline</a></li>

										<li><a href="#portlet_tab2" data-toggle="tab">Grid</a></li>

										<li class="active"><a href="#portlet_tab1" data-toggle="tab">Default</a></li>

									</ul>

									<div class="tab-content">

										<div class="tab-pane active" id="portlet_tab1">

											<!-- BEGIN FORM-->

											<form action="#" class="form-horizontal">

												<div class="control-group">

													<label class="control-label">Small Input</label>

													<div class="controls">

														<input type="text" placeholder="small" class="m-wrap small">

														<span class="help-inline">Some hint here</span>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Meduam Input</label>

													<div class="controls">

														<input type="text" placeholder="medium" class="m-wrap medium">

														<span class="help-inline">Some hint here</span>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Large Input</label>

													<div class="controls">

														<input type="text" placeholder="large" class="m-wrap large">

														<span class="help-inline">Some hint here</span>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Huge Input</label>

													<div class="controls">

														<input type="text" placeholder="huge" class="m-wrap huge">

														<span class="help-inline">Some hint here</span>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Disabled Input</label>

													<div class="controls">   

														<input class="m-wrap medium" type="text" placeholder="Disabled input here..." disabled="">

														<span class="help-inline">Some hint here</span>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Readonly Input</label>

													<div class="controls">   

														<input class="m-wrap medium" readonly="" type="text" placeholder="Readonly input here..." disabled="">

														<span class="help-inline">Some hint here</span>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Small Dropdown</label>

													<div class="controls">

														<select class="small m-wrap" tabindex="1">

															<option value="Category 1">Category 1</option>

															<option value="Category 2">Category 2</option>

															<option value="Category 3">Category 5</option>

															<option value="Category 4">Category 4</option>

														</select>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Medium Dropdown</label>

													<div class="controls">

														<select class="medium m-wrap" tabindex="1">

															<option value="Category 1">Category 1</option>

															<option value="Category 2">Category 2</option>

															<option value="Category 3">Category 5</option>

															<option value="Category 4">Category 4</option>

														</select>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Large Dropdown</label>

													<div class="controls">

														<select class="large m-wrap" tabindex="1">

															<option value="Category 1">Category 1</option>

															<option value="Category 2">Category 2</option>

															<option value="Category 3">Category 5</option>

															<option value="Category 4">Category 4</option>

														</select>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Radio Buttons</label>

													<div class="controls">

														<label class="radio">

														<div class="radio"><span><input type="radio" name="optionsRadios1" value="option1"></span></div>

														Option 1

														</label>

														<label class="radio">

														<div class="radio"><span class="checked"><input type="radio" name="optionsRadios1" value="option2" checked=""></span></div>

														Option 2

														</label>  

														<label class="radio">

														<div class="radio"><span><input type="radio" name="optionsRadios1" value="option2"></span></div>

														Option 3

														</label>  

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Radio Buttons</label>

													<div class="controls">

														<label class="radio line">

														<div class="radio"><span><input type="radio" name="optionsRadios2" value="option1"></span></div>

														Option 1

														</label>

														<label class="radio line">

														<div class="radio"><span class="checked"><input type="radio" name="optionsRadios2" value="option2" checked=""></span></div>

														Option 2

														</label>  

														<label class="radio line">

														<div class="radio"><span><input type="radio" name="optionsRadios2" value="option2"></span></div>

														Option 3

														</label>  

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Checkbox</label>

													<div class="controls">

														<label class="checkbox">

														<div class="checker"><span><input type="checkbox" value=""></span></div> Checkbox 1

														</label>

														<label class="checkbox">

														<div class="checker"><span><input type="checkbox" value=""></span></div> Checkbox 2

														</label>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Checkbox</label>

													<div class="controls">

														<label class="checkbox line">

														<div class="checker"><span><input type="checkbox" value=""></span></div> Checkbox 1

														</label>

														<label class="checkbox line">

														<div class="checker"><span><input type="checkbox" value=""></span></div> Checkbox 2

														</label>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Textarea</label>

													<div class="controls">

														<textarea class="medium m-wrap" rows="3"></textarea>

													</div>

												</div>

												<div class="control-group">

													<label class="control-label">Large Textarea</label>

													<div class="controls">

														<textarea class="large m-wrap" rows="3"></textarea>

													</div>

												</div>

												<div class="form-actions">

													<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>

													<button type="button" class="btn">Cancel</button>

												</div>

											</form>

											<!-- END FORM-->  

										</div>

										<div class="tab-pane " id="portlet_tab2">

											<form>

												<div class="controls controls-row">

													<input class="span12 m-wrap" type="text" placeholder=".span12">

												</div>

												<div class="controls controls-row">

													<input class="span11 m-wrap" type="text" placeholder=".span11">

													<input class="span1 m-wrap" type="text" placeholder=".span1">

												</div>

												<div class="controls controls-row">

													<input class="span10 m-wrap" type="text" placeholder=".span10">

													<input class="span2 m-wrap" type="text" placeholder=".span2">

												</div>

												<div class="controls controls-row">

													<input class="span9 m-wrap" type="text" placeholder=".span9">

													<input class="span3 m-wrap" type="text" placeholder=".span3">

												</div>

												<div class="controls controls-row">

													<input class="span8 m-wrap" type="text" placeholder=".span8">

													<input class="span4 m-wrap" type="text" placeholder=".span4">

												</div>

												<div class="controls controls-row">

													<input class="span7 m-wrap" type="text" placeholder=".span7">

													<input class="span5 m-wrap" type="text" placeholder=".span5">

												</div>

												<div class="controls controls-row">

													<input class="span6 m-wrap" type="text" placeholder=".span6">

													<input class="span6 m-wrap" type="text" placeholder=".span6">

												</div>

												<div class="controls controls-row">

													<input class="span5 m-wrap" type="text" placeholder=".span5">

													<input class="span7 m-wrap" type="text" placeholder=".span7">

												</div>

												<div class="controls controls-row">

													<input class="span4 m-wrap" type="text" placeholder=".span4">

													<input class="span8 m-wrap" type="text" placeholder=".span8">

												</div>

												<div class="controls controls-row">

													<input class="span3 m-wrap" type="text" placeholder=".span3">

													<input class="span9 m-wrap" type="text" placeholder=".span9">

												</div>

												<div class="controls controls-row">

													<input class="span2 m-wrap" type="text" placeholder=".span2">

													<input class="span10 m-wrap" type="text" placeholder=".span10">

												</div>

												<div class="controls controls-row">

													<input class="span1 m-wrap" type="text" placeholder=".span1">

													<input class="span11 m-wrap" type="text" placeholder=".span11">

												</div>

												<div class="controls controls-row">

													<input class="span2 m-wrap" type="text" placeholder=".span2">

													<input class="span3 m-wrap" type="text" placeholder=".span3">

													<input class="span4 m-wrap" type="text" placeholder=".span4">

													<input class="span2 m-wrap" type="text" placeholder=".span2">

													<input class="span1 m-wrap" type="text" placeholder=".span1">

												</div>

											</form>

										</div>

										<div class="tab-pane " id="portlet_tab3">

											<h4>Login Form</h4>

											<form action="#">

												<input type="text" class="m-wrap" placeholder="Email"><br>

												<input type="password" class="m-wrap" placeholder="Password">

												<label class="checkbox">

												<div class="checker"><span><input type="checkbox"></span></div> Remember me

												</label>

												<button type="submit" class="btn green">Sign in</button>

											</form>

											<hr>

											<h4>Login Form</h4>

											<form action="#">

												<div class="input-icon left">

													<i class="icon-envelope"></i>

													<input type="text" class="m-wrap" placeholder="Email">

												</div>

												<div class="input-icon left">                                          

													<i class="icon-lock"></i>

													<input type="password" class="m-wrap" placeholder="Password">

												</div>

												<label class="checkbox">

												<div class="checker"><span><input type="checkbox"></span></div> Remember me

												</label>

												<button type="submit" class="btn purple">Sign in</button>

											</form>

											<hr>

											<form action="#">

												<div class="input-prepend">                

													<button class="btn blue">Login</button><input class="m-wrap" size="16" type="password" placeholder="Your Password">

												</div>

											</form>

											<h4>Search Form</h4>

											<form action="#">

												<div class="input-append hidden-phone">  

													<input class="m-wrap medium" size="10" type="text" placeholder="Twitter Username"><button class="btn red">Search</button><button class="btn black">Back</button>

												</div>

												<div class="input-append visible-phone">  

													<input class="m-wrap" size="10" type="text" placeholder="Twitter Username"><button class="btn red">Search</button><button class="btn black">Back</button>

												</div>

											</form>

											<hr>

											<form action="#" class="form-search">

												<div class="input-append">

													<input class="m-wrap" type="text"><button class="btn green" type="button">Search!</button>

												</div>

											</form>

										</div>

									</div>

								</div>

							</div>

						</div>

						<!-- END SAMPLE FORM PORTLET-->

					</div>

				</div>

				<!-- END PAGE CONTENT-->         

			</div>

			<!-- END PAGE CONTAINER-->

		</div>
		<!-- END PAGE -->

	</div>

	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->

	<div class="footer">

		<div class="footer-inner">2013 &copy; Metronic by keenthemes.</div>

		<div class="footer-tools">

			<span class="go-top"> <i class="icon-angle-up"></i>

			</span>

		</div>

	</div>
	<!-- BEGIN CORE PLUGINS -->

	<script src="/shop/resources/admin/js/jquery-1.10.1.min.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery-migrate-1.2.1.min.js"
		type="text/javascript"></script>

	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

	<script src="/shop/resources/admin/js/jquery-ui-1.10.1.custom.min.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/bootstrap.min.js"
		type="text/javascript"></script>

	<!--[if lt IE 9]>

    <script src="/shop/resources/admin/js/excanvas.min.js"></script>

    <script src="/shop/resources/admin/js/respond.min.js"></script>

    <![endif]-->

	<script src="/shop/resources/admin/js/jquery.slimscroll.min.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.blockui.min.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.cookie.min.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.uniform.min.js"
		type="text/javascript"></script>

	<!-- END CORE PLUGINS -->
	<script src="/shop/resources/admin/js/jquery.vmap.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.vmap.russia.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.vmap.world.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.vmap.europe.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.vmap.germany.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.vmap.usa.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.vmap.sampledata.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.flot.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.flot.resize.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.pulsate.min.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/date.js" type="text/javascript"></script>

	<script src="/shop/resources/admin/js/daterangepicker.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.gritter.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/fullcalendar.min.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.easy-pie-chart.js"
		type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.sparkline.min.js"
		type="text/javascript"></script>

	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="/shop/resources/admin/js/app.js" type="text/javascript"></script>

	<script src="/shop/resources/admin/js/index.js" type="text/javascript"></script>

	<!-- END PAGE LEVEL SCRIPTS -->

	<script>

    jQuery(document).ready(function () {

        App.init(); // initlayout and core plugins

        Index.init();

        Index.initJQVMAP(); // init index page's custom scripts

        Index.initCalendar(); // init index page's custom scripts

        Index.initCharts(); // init index page's custom scripts

        Index.initChat();

        Index.initMiniCharts();

        Index.initDashboardDaterange();

        Index.initIntro();

    });

</script>

	<!-- END JAVASCRIPTS -->

	<script type="text/javascript">  var _gaq = _gaq || []; _gaq.push(['_setAccount', 'UA-37564768-1']); _gaq.push(['_setDomainName', 'keenthemes.com']); _gaq.push(['_setAllowLinker', true]); _gaq.push(['_trackPageview']); (function () { var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true; ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js'; var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s); })();</script>

</body>
</html>
