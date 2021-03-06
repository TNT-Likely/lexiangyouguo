<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="UTF-8" />
		<meta name="renderer" content="webkit" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<title>用户反馈</title>
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<meta name="copyright" content=" " />
		<meta http-equiv="mobile-agent" content="index.html" />
        <link rel="search" type="application/opensearchdescription+xml" href=" " />
		<link rel="icon" href=" " type="image/x-icon" />
        <link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-base.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-module.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-navigation(2).css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/module-hide-add-album.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/feedback.css" media="all" />
		<script type="text/javascript" src="/shop/resources/js/jquery-migrate-1.2.1.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-pc-base.js"></script>
</head>
<body>
  <jsp:include page="layout/Motherboard.jsp"></jsp:include>
     <div class="header_nav">
<div class="wrap">
<div class="nav_list_wrap clearfix">
<ul class="nav_list">
<li><a  href="index">首页</a>
</li>
<li><a href="buyersrecommend">产地直销</a>
</li>
<li><a href="buyersrecommend">每日鲜果</a>
</li>
<li class="daren">
<a href="buyersrecommend">果V一刻</a>
</li>
<li class="buyer"><a href="buyersrecommend">每日特价</a>
</li>
<li><a href="buyersrecommend">礼品特区</a>
</li>
<li><a href="buyersrecommend">团购</a>
</li>
<li><a class="no_bold " href="buyersrecommend">社区</a>
</li>
</ul>
</div>
</div>
</div>
		<div id="body_wrap">
			<div class="fb_wrap">
				<div class="align_h1">
					<h1>嗨，亲，你好~我是乐享优果的产品经理倪洋，欢迎你为我们提供产品意见和建议</h1>
				</div>
				<form action="">
					<div class="content">
						<label for="fb_txt" class="f_letter"><span class="star">*</span>反馈:</label>
						<textarea id="fb_txt" placeholder="500个汉字以内"></textarea>
					</div>
					<div class="up_img">
						<label for="img_list">上传图片:</label>
						<div id="img_list" class="clearfix">
							<div class="default">
								<p class="add_file"></p>
								<a href="" class="add_pic" title="上传图片"></a>
							</div>
							<span class="tip">最多上传3张</span>
						</div>
					</div>
					<div class="phone">
						<label for="phone">手机号码:</label>
						<input type="text" id="phone" class="phoneno" name="u_phone">
						<span class="tip">方便我们更快向你反馈哦，我们会严格保护你的隐私</span>
					</div>
					<a href=" " class="sub_btn"></a>
				</form>
			</div>
		</div>
		<div class="foot J_footertimer" data-svrtime="1414138433">
			<div class="wrap foot_wrap clearfix">
				<div class="foot_info">
					<a class="info_logo" href=" "></a>
					<div class="info_text">
						<p>营业执照注册号：<a href=" " target="_blank">330106000129004</a>
						</p>
						<p>增值电信业务经营许可证：<a href=" " target="_blank">浙B2-20110349</a>
						</p>
						<p>ICP备案号：皖ICP备10044327号-3</p>
						<p class="mgjhostname" title="qihe6116">©2014 Mogujie.com 安徽乐享优果网络有限公司</p>
					</div>
				</div>
				<div class="foot_link">
					<dl class="link_company">
						<dt>公司</dt>
						<dd><a href="about" target="_blank">关于我们</a>
						</dd>
						<dd><a href="customerservice" target="_blank">招聘信息</a>
						</dd>
						<dd><a href="customerservice" target="_blank">联系我们</a>
						</dd>
					</dl>
					<dl class="link_consumer">
						<dt>消费者</dt>
						<dd><a href="customerservice" target="_blank">帮助中心</a>
						</dd>
						<dd><a href="customerservice" target="_blank">意见反馈</a>
						</dd>
						<dd><a href="customerservice" target="_blank">手机版下载</a>
						</dd>
					</dl>
					<dl class="link_business">
						<dt>商家</dt>
						<dd><a href="customerservice" target="_blank">帮助中心</a>
						</dd>
						<dd><a href="customerservice" target="_blank">商家培训</a>
						</dd>
						<dd><a href="customerservice" target="_blank">入驻开放平台</a>
						</dd>
					</dl>
					<dl class="link_safe">
						<dt>权威认证</dt>
						<dd>
							<a class="pc" href="customerservice" target="_blank"></a>
							<a class="pa" href="customerservice" target="_blank"></a>
							<a class="kx" href="customerservice" target="_blank"></a>
						</dd>
					</dl>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="/shop/resources/js/page-1015walletcge.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-navigation.js"></script>
		<script type="text/javascript" src="/shop/resources/js/feedback.js"></script>
</body>
</html>