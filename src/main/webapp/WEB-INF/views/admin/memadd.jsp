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
	<jsp:include page="layout/header.jsp"></jsp:include>
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->

	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<jsp:include page="layout/sidebar.jsp"></jsp:include>
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

						<jsp:include page="layout/colorpane.jsp"></jsp:include>

						<!-- END BEGIN STYLE CUSTOMIZER -->  

						<h3 class="page-title">
							会员管理 <small>添加会员</small>
						</h3>

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
									<span class="hidden-480">添加会员</span>
								</div>
							</div>

							<div class="portlet-body form">
								<div class="tabbable portlet-tabs">
										<div class="tab-pane active" id="portlet_tab1">
											<!-- BEGIN FORM-->
											<form id="form_sample_2" action="/shop/admin/memadd" class="form-horizontal" method="post">
												<div class="alert alert-error hide">
													<button class="close" data-dismiss="alert"></button>
													你有一些错误，请检查下列。
												</div>
												<div class="alert alert-success hide">
												<button class="close" data-dismiss="alert"></button>
													表单验证成功!
												</div>
												<div class="control-group">
													<label class="control-label">邮箱:<span class="required">*</span></label>
													<div class="controls">
														<input name="" type="text" placeholder="medium" class="m-wrap medium" name="email">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">昵称:<span class="required">*</span></label>
													<div class="controls">
														<input type="text" placeholder="medium" class="m-wrap medium" name="memberName">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">真实姓名:</label>
													<div class="controls">
														<input type="text" placeholder="medium" class="m-wrap medium" name="memberRealName">
														<span class="help-inline">....</span>
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">密码:</label>
													<div class="controls">
														<input type="password" placeholder="medium" class="m-wrap medium" name="password">
														<span class="help-inline">....</span>
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">生日:</label>
													<div class="controls">
														<div class="input-append date form_datetime">
															<input size="16" type="text" value="" readonly="" class="m-wrap" name="memberRegisteredTime">
															<span class="add-on"><i class="icon-remove"></i></span>
															<span class="add-on"><i class="icon-calendar"></i></span>
														</div>
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">性别:</label>
													<div class="controls">
														<select class="medium m-wrap" tabindex="1">
															<option value="1">男</option>
															<option value="0">女</option>
														</select>
													</div>
												</div>
												<div class="form-actions">
													<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
												</div>
											</form>
											<!-- END FORM-->  
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

	<jsp:include page="layout/footer.jsp"></jsp:include>
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
	<script type="text/javascript" src="/shop/resources/admin/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="/shop/resources/admin/js/jquery.validate.min.js"></script>
	<script type="text/javascript" src="/shop/resources/admin/js/select2.min.js"></script>
	<script type="text/javascript" src="/shop/resources/admin/js/chosen.jquery.min.js"></script>
	<script type="text/javascript" src="/shop/resources/admin/js/form-validation.js"></script>
	<script>

    jQuery(document).ready(function () {
    	
    	$(".form_datetime").datetimepicker({
            format: "yyyy-mm-dd hh:mm:ss",
            pickerPosition: (App.isRTL() ? "bottom-right" : "bottom-left")
        });
        App.init(); // initlayout and core plugins

        Index.init();

        Index.initJQVMAP(); // init index page's custom scripts

        Index.initCalendar(); // init index page's custom scripts

        Index.initCharts(); // init index page's custom scripts

        Index.initChat();

        Index.initMiniCharts();

        Index.initDashboardDaterange();

        Index.initIntro();
        
        FormValidation.init();

    });

</script>

	<!-- END JAVASCRIPTS -->

	<script type="text/javascript">  var _gaq = _gaq || []; _gaq.push(['_setAccount', 'UA-37564768-1']); _gaq.push(['_setDomainName', 'keenthemes.com']); _gaq.push(['_setAllowLinker', true]); _gaq.push(['_trackPageview']); (function () { var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true; ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js'; var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s); })();</script>

</body>
</html>
