<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title>登录_乐享优果</title>
		<meta name="keywords" content=" " />
		<meta name="description" content=" " />
		<meta name="renderer" content=" " />
		<meta http-equiv="X-UA-Compatible" content=" " />
		<meta name="copyright" content=" " />
		<meta http-equiv="mobile-agent" content=" " />
		<link rel="search" type="application/opensearchdescription+xml" href=" " />
		<link rel="icon" href=" " type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-navigation(2).css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/module-captcha.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/page-login.css" media="all" />
		<script type="text/javascript" src="/shop/resources/js/lib-txua.js"></script>
</head>
<body>
<div id="content_body">
			<div class="login_wrap">
				<div class="logo">
					<a title="蘑菇街" href=" " class="logo_img"></a>
				</div>
				<div class="content clearfix">
					<div class="lg_banner">
						<a href=" " target="_blank" class="banner1">
							<img src="/shop/resources/img/d-7.jpg" />
						</a>
					</div>
					<div class="lg_left" id="lg_content">
						<div class="login_mod_tab">
							<a class="lo_mod fl tab_on" lo-mod="normal" href=" " title="普通登入">普通登录</a>
							<a class="eb_mod fl" lo-mod="ebmod" href=" " title="手机免密码登入">手机无密码登录</a>
						</div>
						<p class="error_tip">登录名或密码错误</p>
						<div class="lg_form">
							<form method="post">
								<div class="mod_box lo_mod_box" data-isshow="0">
									<div class="lg_item lg_name">
										<b class="lg_icon"></b>
										<input type="text" maxlength="32" class="text r3" name="uname" def-v="手机/邮箱/昵称" value="" style="border-color:#CFCFCF; color:#999;">
									</div>
									<div class="lg_item lg_pass">
										<b class="lg_icon"></b>
										<input type="password" maxlength="32" class="text r3" name="pass" value="" style="border-color:#CFCFCF; color:#999;">
									</div>
								</div>
								<div class="mod_box eb_mod_box" data-isshow="0">
									<div class="lg_item lg_name">
										<b class="lg_icon"></b>
										<input type="text" maxlength="32" class="text r3" name="uname" def-v="手机" value="手机" style="border-color:#CFCFCF; color:#999;">
									</div>
									<div class="lg_item lg_code">
										<b class="lg_icon"></b>
										<input type="text" maxlength="32" class="text r3" name="telcode" def-v="动态密码" value="动态密码" style="border-color:#CFCFCF; color:#999;">
									</div>
									<div class="lg_chk"></div>
									<div class="lg_item lg_getcode">
										<a href=" " class="get_tel_code" id="get_tel_code">获取手机动态密码</a>
									</div>
								</div>
								<div class="lg_remember">
									<label>
										<input type="checkbox" value="1" name="remember" class="check" checked="checked" /><span> 记住我（两周免登录）</span>
									</label>
								</div>
								<div class="lg_login clearfix">
									<input type="submit" value="" class="sub">
<<<<<<< HEAD
									<a class="ml15" href=" ">忘记密码？</a>
									<a class="ml5" href="zhuce2.html">新用户注册</a>
								</div>
								<input name="refer" value="" type="hidden" />
								<input name="mgj_secret" value="" id='mgj_secret' type="hidden" />
								<input type="hidden" value="" id="imgcheckvalue">
								<input type="hidden" value="" id="noCheck" name="noCheck">
								<input type="hidden" id="jsalgo" name="mgj_algo" value="Sr373ojxmKk=" />
							</form>
							<div class="ot_login">
								<span>你也可以用以下方式登录：</span>
								<div class="ot_btn clearfix">
									<a href=" ">
										<img src="/shop/resources/img/a-34.png">
									</a>
									<a href=" ">
										<img src="/shop/resources/img/a-31.png">
									</a>
									<a href=" ">
										<img src=" ">
									</a>
									<a href="/oauth/login/renren/mogujie">
										<img src="/shop/resources/img/a-33.png">
									</a>
									<a href="/oauth/login/weixin/mogujie">
										<img src="/shop/resources/img/a-32.png">
									</a>
								</div>
							</div>
						</div>
					</div>
					<input type="hidden" value="" id="isban" />
				</div>
			</div>
			<div class="login_foot">
				<div class="login_foot_con">
					<div class="qr_code_box fr">
						<h3>蘑菇街移动客户端</h3>
						<a class="qr_code" href=" " target="_blank"></a>
					</div>
					<ul class="link_list clearfix">
						<li>
							<h3>新手帮助</h3>
							<a href=" " target="_blank">如何购买</a>
							<a href=" " target="_blank">支付教程</a>
							<a href=" " target="_blank">优惠券使用</a>
							<a href=" " target="_blank">常见问题</a>
						</li>
						<li>
							<h3>权益保障</h3>
							<p>全国包邮</p>
							<p>7天无理由退货</p>
							<p>退货运费补贴</p>
							<p>72小时发货</p>
						</li>
						<li>
							<h3>商家服务</h3>
							<a href=" " target="_blank">帮助中心</a>
							<a href=" " target="_blank">商家平台</a>
									<a class="ml15" href="register">忘记密码？</a>
									<a class="ml5" href="register">新用户注册</a>
								</div>
								<input name="refer" value="" type="hidden" />
								<input name="mgj_secret" value="" id='mgj_secret' type="hidden" />
								<input type="hidden" value="" id="imgcheckvalue">
								<input type="hidden" value="" id="noCheck" name="noCheck">
								<input type="hidden" id="jsalgo" name="mgj_algo" value="Sr373ojxmKk=" />
							</form>
							<div class="ot_login">
								<span>你也可以用以下方式登录：</span>
								<div class="ot_btn clearfix">
									<a href="login">
										<img src="/shop/resources/img/a-34.png">
									</a>
									<a href="login">
										<img src="/shop/resources/img/a-31.png">
									</a>
									<a href="login">
										<img src="/shop/resources/img/a-33.png">
									</a>
									<a href="login">
										<img src="/shop/resources/img/a-32.png">
									</a>
								</div>
							</div>
						</div>
					</div>
					<input type="hidden" value="" id="isban" />
				</div>
			</div>
			<div class="login_foot">
				<div class="login_foot_con">
					<div class="qr_code_box fr">
						<h3>蘑菇街移动客户端</h3>
						<a class="qr_code" href="customerservice" target="_blank"></a>
					</div>
					<ul class="link_list clearfix">
						<li>
							<h3>新手帮助</h3>
							<a href="customerservice" target="_blank">如何购买</a>
							<a href="customerservice" target="_blank">支付教程</a>
							<a href="customerservice" target="_blank">优惠券使用</a>
							<a href="customerservice" target="_blank">常见问题</a>
						</li>
						<li>
							<h3>权益保障</h3>
							<p>全国包邮</p>
							<p>7天无理由退货</p>
							<p>退货运费补贴</p>
							<p>72小时发货</p>
						</li>
						<li>
							<h3>商家服务</h3>
							<a href="customerservice" target="_blank">帮助中心</a>
							<a href="customerservice" target="_blank">商家平台</a>
						</li>
					</ul>
					<p title="SERVER: qihe2055" class="copyright">©Copyright 2010-2014 蘑菇街 Mogujie.com (增值电信业务经营许可证：浙B2-20110349)</p>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="/shop/resources/js/module-addfav.js"></script>
		<script type="text/javascript" src="/shop/resources/js/module-captcha.js"></script>
		<script type="text/javascript" src="/shop/resources/js/module-loginremind.js"></script>
		<script type="text/javascript" src="/shop/resources/js/page-login.js"></script>
</body>
</html>
