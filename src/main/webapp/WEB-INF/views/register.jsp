<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title>注册_乐享优果 </title>
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
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/page-register.css" media="all" />
		<script type="text/javascript" src="/shop/resources/js/lib-txua.js"></script>
	    <script type="text/javascript" src="/shop/resources/js/ga.js"></script>
	      <script type="text/javascript" src="/shop/resources/js/h.js"></script>
	      <script type="text/javascript">
			MOGUPROFILE = { cdnHost:"//s9.mogujie.com",appEnv:"production",is_subsite:"0",push_serviceHost:"221.228.199.45:117.121.133.44:80",push_ajaxServiceHost:"http://m1.mogujie.com:80",push_ajaxSericeBakHost:"http://221.228.199.50:80",push_token:"",isNewIMShow:"true",userid:"",avatar:"",isBuyer:"false"  };
		</script>
	 
</head>
<body>
<div id="body_wrap">
			<div id="body" class="container">
				<div class="registerbox">
					<div class="reg_hd">
						<span class="fr">已经有账号了？<a href="login">去登录</a></span>
						<a href="index" title="蘑菇街首页" class="logo_img"></a>
					</div>
					<div class="reg_bd formbox">
						<form class="formelem" action="register" method="post" data-action="/registermg/postform">
							<h3>新用户注册</h3>
							<ul>
								<li>
									<label class="label_title">手机/邮箱：</label>
									<div class="inputbox">
										<input type="text" name="Email" data-defultmsg="推荐使用手机注册，购物更安全" data-type="useraccount" data-errormsg="请填写正确的手机或邮箱" data-ajaxurl="/registermg/mobilemail" class="normalText display_u js_text_input">
										<input type="hidden" name="register_type" />
									</div>
								</li>
								<li>
									<label class="label_title">创建昵称：</label>
									<div class="inputbox">
										<input type="text" name="MemberName" def-v="5-20个字符，推荐使用中文名" data-type="username" data-errormsg="昵称不符合规范" data-defultmsg="支持中文，不能以数字开头，5-20个字符，中文算两个字符" data-ajaxurl="/registermg/ajaxcheck" class="normalText display_u js_text_input">
									</div>
								</li>
								<li>
									<label class="label_title">创建密码：</label>
									<div class="inputbox">
										<input type="password" name="Password" def-v="6-20个字符，可以是数字、字母和符号" data-defultmsg="6-20个字母、数字或者符号" data-type="password" id="js_passbox" data-errormsg="密码需要是字母或数字，最小6位，最大20位" class="normalText display_u js_text_input">
									</div>
								</li>
								<li>
									<label class="label_title" for="">确认密码：</label>
									<div class="inputbox">
										<input type="password" def-v="请再次确认密码" data-type="repass" data-rebox="js_passbox" data-errormsg="2次输入的密码不一致" class="normalText display_u js_text_input">
									</div>
								</li>
								<li class="imgcheck_box hidden">
									<label class="label_title" for="">验证码：</label>
									<div class="inputbox pt10">
										<div class="imgcheck_code_main clearfix">
											<span class="notice">请点击下方图片,将她们转到正确方向</span>
											<a href="javascript:void(0);" id="imgcheck_code_change" style="float: none">换一组</a>
											<div class="imgcheck_code_img_div" onselectstart="return false">
												<div class="imgcheck_image_div" f="0" style="background:url( ) no-repeat; background-position: 0px 0;"></div>
												<input type="hidden" class="img_code_spin" id="img_code_spin_0" name="check[]" value="0" autocomplete="off">
												<div class="imgcheck_image_div" f="1" style="background:url( ) no-repeat; background-position: -75px 0;"></div>
												<input type="hidden" class="img_code_spin" id="img_code_spin_1" name="check[]" value="0" autocomplete="off">
												<div class="imgcheck_image_div" f="2" style="background:url( ) no-repeat; background-position: -150px 0;"></div>
												<input type="hidden" class="img_code_spin" id="img_code_spin_2" name="check[]" value="0" autocomplete="off">
												<div class="imgcheck_image_div" f="3" style="background:url( ) no-repeat; background-position: -225px 0;"></div>
												<input type="hidden" class="img_code_spin" id="img_code_spin_3" name="check[]" value="0" autocomplete="off">
											</div>
										</div>
										<input name="check" type="hidden" id="imgcheckvalue" />
									</div>
								</li>
								<li class="phonecheck_box hidden">
									<label class="label_title" for="">手机验证码：</label>
									<div class="inputbox">
										<input type="text" name="code" data-type="codenum" data-errormsg="请输入验证码" class="normalText display_u js_text_input">
										<a href=" " data-ajaxurl="/registermg/sendcode" class="btn_phone js_getcheck">获取验证码</a>
									</div>
								</li>
								<li class="checkbox">
									<input type="checkbox" name="register_agreement" id="agreement" checked>
									<label for="agreement">我已看过并同意<a href=" " target="_blank">《蘑菇街网络服务使用协议》</a>
									</label>
								</li>
							</ul>
							<div class="subbox">
								<button class="btn_register js_postcurrentform"></button>
							</div>
						</form>
					</div>
				</div>
				<div class="reg_ft" title="SERVER: qihe2052">
					&copy;Copyright 2010-2014 蘑菇街 Mogujie.com (增值电信业务经营许可证：浙B2-20110349)
				</div>
			</div>
		</div>
		<script type="text/javascript" src="/shop/resources/js/module-addfav.js"></script>
		<script type="text/javascript" src="/shop/resources/js/module-captcha.js"></script>
		<script type="text/javascript" src="/shop/resources/js/page-register.js"></script>
		<script type="text/javascript">
			(function(){
			        // 如果base.js 或者module.js 或者功能module 没加载的话       
			        if(!MOGU){
			
			            var nowDate = new Date(),
			                imgloader = new Image();
			
			            //启动一个加载图片的进程，来判断当前用户的网速
			            // 图片大小 22KB
			            imgloader.onload = function(){
			
			                var endTime = new Date(),
			                    loadTime = endTime.getTime() - nowDate.getTime();
			
			                //拼装地址
			                var post_url = ['http://www.mogujie.com/mbs.htm?sform=',window.location.href,'&amp;imgloadTime=',loadTime,'&amp;serivetime=',1420032361].join('');
			                //发送请求
			                new Image().src = post_url;
			
			            }
			
			            imgloader.src = 'http://s6.mogujie.cn/b7/pic/140106/153jss_kqze6r27krbdiwtwgfjeg5sckzsew_600x600.jpg_225x999.jpg';
			
			        }
			
			    })();
		</script>



	 



		<script type="text/javascript">
			// log 判断如果是在客户端里访问h5页面，则不打点。因为客户端本身就有打点。@beile 2014-09-12
			    document.write('&lt;img id="mogustat_img" alt="mogustat" style="display:none" height="1" width="1" src="');
			    document.write(log_stat_url);
			    document.write('" /&gt;');
			
			  var _gaq = _gaq || [];
			
			    _gaq.push(['_setAccount', 'UA-25590490-1']);
			    _gaq.push(['_setDomainName', 'mogujie.com']);
			
			    _gaq.push(['_setSampleRate', '20']);
			    _gaq.push(['_trackPageview']);
			
			    (function () {
			        var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
			        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
			        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
			    })();
		</script>
		<img width="1" height="1" src="https://www.mogujie.com/mogu.js?sfrom=&amp;method=GET&amp;time=1420032361&amp;uuid=1615c621-f236-0d3a-50e7-4cfcdc025b3d&amp;areaid=5&amp;hahapoint=beb6022f59b37b252d77d9b8d649654c&amp;wwidth=5&amp;uclient=firefox*34||windows*6.1&amp;refer=%2Fregistermg&amp;rerefer=http%3A%2F%2Fwww.mogujie.com%2F&amp;anchor=&amp;cpsinfo="
		style="display:none" alt="mogustat" id="mogustat_img">
		
</body>
</html>