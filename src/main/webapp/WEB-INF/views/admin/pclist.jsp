<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<link href="/shop/resources/admin/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="/shop/resources/admin/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="/shop/resources/admin/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="/shop/resources/admin/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="/shop/resources/admin/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="/shop/resources/admin/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="/shop/resources/admin/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="/shop/resources/admin/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES -->

	<link rel="stylesheet" type="text/css" href="/shop/resources/admin/css/select2_metro.css" />

	<link rel="stylesheet" href="/shop/resources/admin/css/DT_bootstrap.css" />

	<!-- END PAGE LEVEL STYLES -->

	<link rel="shortcut icon" href="/shop/resources/admin/image/favicon.ico" />
<!-- BEGIN BODY -->
<body class="page-header-fixed">
	<!-- BEGIN HEADER -->
	<jsp:include page="layout/header.jsp"></jsp:include>
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->

	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<jsp:include page="layout/sidebar.jsp"></jsp:include>
		<!-- END SIDEBAR -->
		<!-- BEGIN PAGE -->
		<div class="page-content" style="min-height: 823px !important">

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
						<jsp:include page="layout/colorpane.jsp"></jsp:include>
						<!-- END BEGIN STYLE CUSTOMIZER -->

						<!-- BEGIN PAGE TITLE & BREADCRUMB-->

						<h3 class="page-title">

							Editable Tables <small>editable table samples</small>

						</h3>

						<!-- END PAGE TITLE & BREADCRUMB-->

					</div>

				</div>

				<!-- END PAGE HEADER-->

				<!-- BEGIN PAGE CONTENT-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-edit"></i>Editable Table</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body">

								<div class="clearfix">

									<div class="btn-group">

										<button id="sample_editable_1_new" class="btn green">

										Add New <i class="icon-plus"></i>

										</button>

									</div>

									<div class="btn-group pull-right">

										<button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i class="icon-angle-down"></i>

										</button>

										<ul class="dropdown-menu pull-right">

											<li><a href="#">Print</a></li>

											<li><a href="#">Save as PDF</a></li>

											<li><a href="#">Export to Excel</a></li>

										</ul>

									</div>

								</div>

								<table class="table table-striped table-hover table-bordered" id="sample_editable_1">
									<thead>
										<tr>
											<th>Username</th>

											<th>Full Name</th>

											<th>Points</th>

											<th>Edit</th>

											<th>Delete</th>

										</tr>

									</thead>
									<tbody>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END EXAMPLE TABLE PORTLET-->

					</div>

				</div>

				<!-- END PAGE CONTENT -->

			</div>

			<!-- END PAGE CONTAINER-->

		</div>
		<!-- END PAGE -->

	</div>

	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->

	<jsp:include page="layout/footer.jsp"></jsp:include>
	<!-- END FOOTER -->

	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

	<!-- BEGIN CORE PLUGINS -->

	<script src="/shop/resources/admin/js/jquery-1.10.1.min.js" type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

	<script src="/shop/resources/admin/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      

	<script src="/shop/resources/admin/js/bootstrap.min.js" type="text/javascript"></script>

	<!--[if lt IE 9]>

	<script src="/shop/resources/admin/js/excanvas.min.js"></script>

	<script src="/shop/resources/admin/js/respond.min.js"></script>  

	<![endif]-->   

	<script src="/shop/resources/admin/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="/shop/resources/admin/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="/shop/resources/admin/js/jquery.uniform.min.js" type="text/javascript" ></script>

	<!-- END CORE PLUGINS -->

	<!-- BEGIN PAGE LEVEL PLUGINS -->

	<script type="text/javascript" src="/shop/resources/admin/js/select2.min.js"></script>

	<script type="text/javascript" src="/shop/resources/admin/js/jquery.dataTables.js"></script>

	<script type="text/javascript" src="/shop/resources/admin/js/DT_bootstrap.js"></script>

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="/shop/resources/admin/js/app.js"></script>

	<script src="/shop/resources/admin/js/table-editable.js"></script>    

	<script>

		jQuery(document).ready(function() {       

		   App.init();

		   TableEditable.init();

		});

	</script>

<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>

<!-- END BODY -->
</body>
</html>
