<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="utf-8" />
	<title>乐享优果 | 登录</title>
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
	<link href="/shop/resources/admin/css/login.css" rel="stylesheet" type="text/css"/>
	<!-- END PAGE LEVEL STYLES -->
	<link rel="shortcut icon" href="/shop/resources/admin/img/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
	<!-- BEGIN LOGO -->
	<div class="logo">
		<p class="">乐享优果B2C电子商务后台</p>
	</div>
	<!-- END LOGO -->
	<!-- BEGIN LOGIN -->
	<div class="content">
		<!-- BEGIN LOGIN FORM -->
		<form class="form-vertical login-form" action="login" method="post">
			<h3 class="form-title">登录</h3>
			<div class="alert alert-error hide">
				<button class="close" data-dismiss="alert"></button>
				<span>输入用户名和密码.</span>
			</div>
			<div class="control-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">用户名</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Username" name="username"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">密码</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i>
						<input class="m-wrap placeholder-no-fix" type="password" placeholder="Password" name="password"/>
					</div>
				</div>
			</div>
			<div class="form-actions">
				<label class="checkbox">
				<input type="checkbox" name="remember" value="1"/> 记住我
				</label>
				<button type="submit" class="btn green pull-right">
				登录 <i class="m-icon-swapright m-icon-white"></i>
				</button>            
			</div>
		</form>

	</div>
		<!-- END LOGIN FORM -->        
	<!-- BEGIN COPYRIGHT -->
	<div class="copyright">
		 &copy; lexiangyouguo 2014.
	</div>
	<!-- END COPYRIGHT -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS --
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
	<script src="/shop/resources/admin/js/jquery.validate.min.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="/shop/resources/admin/js/app.js" type="text/javascript"></script>
	<script src="/shop/resources/admin/js/login.js" type="text/javascript"></script>      
	<!-- END PAGE LEVEL SCRIPTS --> 
	<script>
		jQuery(document).ready(function() {     
		  App.init();
		  Login.init();
		});
	</script>
	<!-- END JAVASCRIPTS -->
	<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script>
	</body>
<!-- END BODY -->
</html>