<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
		<meta name="renderer" content=" " />
		<meta http-equiv="X-UA-Compatible" content=" " />
		<title> 乐享优果 - 每日新鲜购!</title>
		<meta name="keywords" content=" " />
		<meta name="description" content=" " />
		<meta name="copyright" content=" " />
		<meta http-equiv="mobile-agent" content=" " />
		<link rel="search" type="application/opensearchdescription+xml" href="product" />
		<link rel="icon" href="product" type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-base.css" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-base.css" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-module.css" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-navigation(2).css" />
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
			<div class="page_activity">
				<style type="text/css">
					.MOD_ID_238 .goods {
						width: 960px;
						margin: 0 auto;
						overflow: hidden;
					}
					.MOD_ID_238 .goods a,
					.MOD_ID_238 .goods img {
						border: none;
					}
					.MOD_ID_238 .goods .clearfix:after {
						content: "";
						display: block;
						height: 0;
						overflow: hidden;
						clear: both;
					}
					.MOD_ID_238 .goods h2 img {
						vertical-align: top;
					}
					.MOD_ID_238 .goods .clearfix {
						zoom: 1;
					}
					.MOD_ID_238 .goods h2,
					.MOD_ID_238 .goods ul {
						margin: 0;
						padding: 0;
					}
					.MOD_ID_238 .goods ul {
						list-style: none;
						width: 1000px;
					}
					.MOD_ID_238 .goods li {
						width: 220px;
						height: 410px;
						float: left;
						position: relative;
						margin-right: 26px;
					}
					.MOD_ID_238 .goods ul a.pic {
						position: absolute;
						left: 0;
						top: 0;
						width: 220px;
						height: 320px;
						background: #eee;
						overflow: hidden;
					}
					.MOD_ID_238 .goods ul a.pic img {
						display: block;
						width: 100%;
						height: 100%;
					}
					.MOD_ID_238 .goods ul h2 {
						position: absolute;
						left: .5em;
						top: 330px;
						font-size: 14px;
						font-weight: normal;
						white-space: nowrap;
						width: 94%;
						overflow: hidden;
						text-overflow: ellipsis;
					}
					.MOD_ID_238 .goods ul h2 a {
						text-decoration: none;
						color: #666;
					}
					.MOD_ID_238 .goods ul em {
						position: absolute;
						left: .5em;
						top: 357px;
						font-weight: normal;
						font-style: normal;
						font-size: 14px;
						color: #ff4070;
					}
					.MOD_ID_238 .goods ul span.love {
						position: absolute;
						right: 3px;
						top: 357px;
						font-size: 12px;
						background: url( ) left center no-repeat;
						padding-left: 18px;
						color: #999;
					}
					.MOD_ID_238 .pagination a {
						margin: 0 1em;
						cursor: pointer;
					}
					i,
					b {
						font-style: normal;
						font-weight: normal;
					}
					#header {
						margin-bottom: 0;
						height: 132px;
					}
					#body {
						width: auto;
					}
					#body_wrap {
						background: #f7f7f7;
					}
					#foot_wrap.foot_wrap {
						margin-top: 0;
					}
					.header_nav {
						margin-bottom: 0;
					}
					.pr {
						position: relative;
					}
					.page_activity .mod_row {
						width: 100%;
					}
					.page_activity .simple-banner {
						width: 960px;
						margin: 0 auto;
					}
					.w960 {
						width: 960px;
						margin: 0 auto;
					}
					.act-header .w960 {
						position: relative;
						margin-top: 0;
					}
					.act-topbanner {
						height: 519px;
						background: url(' ') no-repeat center 0;
					}
					.act-coupon {
						height: 442px;
						background: url(' ') no-repeat center 0;
					}
					.act-body .wrap {
						width: 960px;
						margin: 0 auto;
					}
					.act-footer {
						padding: 100px 0 0 0;
					}
					.act-package {
						border: 2px solid #ff4479;
						width: 956px;
					}
					.act-package .act-s-title {
						margin-bottom: 25px;
					}
					.act-package .act-item {
						width: 200px;
						height: 248px;
					}
					.act-recomend {
						height: 56px;
						background: url(' ') no-repeat center 0;
					}
					.act-list-wrapper {
						margin-bottom: 35px;
						margin-left: 25px;
						margin-right: -25px;
					}
					.a-i {
						padding-top: 15px;
					}
					.a-i .a-i-inner {
						position: relative;
						padding: 10px 0 0 11px;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 160px;
						height: 201px;
						background: url(' ') no-repeat;
					}
					.a-i s {
						float: right;
						display: inline;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 14px;
						height: 14px;
						background: url(' ') no-repeat;
						margin: 90px 20px 0;
					}
					.a-i s.equal {
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 15px;
						height: 14px;
						background: url(' ') no-repeat;
					}
					.a-i .pic {
						width: 150px;
						height: 143px;
						overflow: hidden;
						display: block;
					}
					.a-i .pic img {
						width: 100%;
						vertical-align: top;
					}
					.a-i .title {
						width: 90%;
						padding-top: 5px;
						font-size: 14px;
						overflow: hidden;
						white-space: nowrap;
						text-overflow: ellipsis;
						-o-text-overflow: ellipsis;
					}
					.a-i .price .p-1 {
						color: #ff4163;
						font-size: 20px;
					}
					.a-i .price .p-2 {
						margin-left: 5px;
						color: #777;
						text-decoration: line-through;
					}
					.a-i .dis {
						position: absolute;
						top: 0;
						left: 0;
						color: #fff;
						text-align: center;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 55px;
						height: 48px;
						background: url(' ') no-repeat;
					}
					.a-r {
						position: relative;
						padding-top: 0;
					}
					.a-r .a-i-inner {
						padding: 14px 0 0 17px;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 183px;
						height: 234px;
						background: url(' ') no-repeat;
					}
					.a-r .pic {
						width: 170px;
						height: 160px;
						overflow: hidden;
						display: block;
					}
					.a-r .pic img {
						width: 100%;
						vertical-align: top;
					}
					.a-r .text {
						font-size: 14px;
						text-align: center;
						line-height: 1.4;
					}
					.a-r .text em {
						font-style: normal;
						color: #fd8080;
					}
					.a-r .buy-btn {
						display: block;
						width: 100%;
						height: 35px;
						position: absolute;
						bottom: 0;
						left: 0;
					}
					.a-r .dis {
						left: -10px;
						font-size: 13px;
						padding: 0 20px;
						line-height: 1.3;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 28px;
						height: 64px;
						background: url(' ') no-repeat;
					}
					.act-month {
						border: 2px solid #ff4479;
					}
					.act-goods {
						background: #fff;
					}
					.act-goods .a-i {
						margin: 0 35px 35px 0;
						padding-top: 0;
					}
					.act-goods .a-i .title {
						font-size: 16px;
					}
					.act-goods .a-i-inner {
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 189px;
						height: 238px;
						background: url(' ') no-repeat;
					}
					.act-goods .pic {
						width: 180px;
						height: 170px;
					}
					.act-goods .act-list-wrapper {
						margin-bottom: 0;
					}
					.act-left {
						font-size: 21px;
						position: absolute;
						bottom: 95px;
						left: 510px;
					}
					.red {
						color: #f51e67;
						font-size: 29px;
					}
					.act-action {
						position: absolute;
						bottom: 137px;
						left: 513px;
						width: 225px;
						height: 80px;
					}
					.aa-got {
						cursor: default;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 224px;
						height: 77px;
						background: url(' ') no-repeat;
						background-size: 100% 100%;
					}
					.aa-finish {
						cursor: default;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 224px;
						height: 77px;
						background: url(' ') no-repeat;
						background-size: 100% 100%;
					}
					.act-coupon .w960 {
						height: 442px;
					}
					.get_user_warp {
						overflow: hidden;
						position: absolute;
						top: 375px;
						left: 495px;
						width: 460px;
						height: 50px;
						font-size: 20px;
					}
					.get_user_list {
						position: absolute;
						width: 9000px;
						height: 20px;
						line-height: 20px;
						top: 0;
						left: 0;
					}
					.get_user_list li {
						float: left;
						margin-right: 10px;
						line-height: 20px;
						color: #000;
					}
					.get_user_list .uname {
						margin-right: 5px;
						color: #000;
					}
					.act-nav {
						z-index: 100;
						background: url( ) no-repeat 0 0;
						width: 79px;
						padding-top: 88px;
						position: fixed;
						right: 10px;
						top: 40px;
						_position: absolute;
					}
					.act-nav .act-nav-item a {
						display: block;
						height: 41px;
						line-height: 41px;
						text-align: center;
						font-size: 18px;
						background: #ff689b;
						border-top: 1px solid #e84a58;
						border-left: 1px solid #ff538d;
						border-right: 1px solid #ff538d;
						color: #fff;
					}
					.act-nav .act-nav-item .backtop {
						background: url( ) no-repeat;
						width: 79px;
						height: 35px;
						text-indent: -99999px;
						border: none;
					}
					#lb_notice_id .lb_hd {
						display: none;
					}
					#lb_notice_id .lb_bd {
						padding: 0;
						background: transparent;
						border-radius: 0;
					}
					#lb_notice_id .lb_wrap {
						border-radius: 0;
						background: transparent;
					}
					.act_dialog_newuser .act_link {
						position: absolute;
						top: 200px;
						left: 50%;
						margin-left: -110px;
						width: 220px;
						height: 70px;
						z-index: 2;
						overflow: hidden;
						text-indent: -999em;
					}
					.act_dialog_newuser .act_close {
						position: absolute;
						top: 0;
						right: 0;
						z-index: 3;
						width: 40px;
						height: 40px;
						overflow: hidden;
						text-indent: -999em;
						cursor: pointer;
					}
					.act_dialog_newuser .act_bg {
						width: 496px;
						height: 327px;
						display: block;
					}
					.act_dialog_newuser .act_success {
						background: url( ) no-repeat 0 0;
					}
					.MOD_ID_1810 .act-goods {
						background: #fff;
						width: 960px;
						margin: 0 auto;
					}
					.MOD_ID_1810 .act-goods h2 img {
						width: 960px;
					}
					.MOD_ID_1810 .act-goods .a-i-inner {
						display: inline-block;
						width: 189px;
						height: 238px;
						background: url(' ') no-repeat;
						position: relative;
						padding: 10px 0 0 11px;
					}
					.MOD_ID_1810 .act-month {
						border: 2px solid #ff4479;
						margin-top: 15px;
						margin-left: auto;
						margin-right: auto;
						width: 960px;
					}
					.MOD_ID_1810 .act-list-wrapper {
						margin-bottom: 35px;
						margin-left: 25px;
						margin-right: -25px;
					}
					.MOD_ID_1810 .act-goods .pic {
						width: 180px;
						height: 170px;
						overflow: hidden;
						display: block;
					}
					.MOD_ID_1810 .act-goods .pic img {
						width: 180px;
						vertical-align: top;
					}
					.MOD_ID_1810 .act-goods .a-i {
						margin: 0 35px 35px 0;
						padding-top: 0;
					}
					.MOD_ID_1810 .act-goods .a-i .title {
						font-size: 16px;
					}
					.MOD_ID_1810 .act-goods .a-i-inner {
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 189px;
						height: 238px;
						background: url(' ') no-repeat;
					}
					.MOD_ID_1810 .act-goods .pic {
						width: 180px;
						height: 170px;
					}
					.MOD_ID_1810 .act-goods .act-list-wrapper {
						margin-bottom: 0;
					}
					.MOD_ID_1810 .act-left {
						font-size: 21px;
						position: absolute;
						bottom: 95px;
						left: 510px;
					}
					.MOD_ID_1810 .a-i {
						padding-top: 15px;
					}
					.MOD_ID_1810 .a-i s {
						float: right;
						display: inline;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 14px;
						height: 14px;
						background: url(' ') no-repeat;
						margin: 90px 20px 0;
					}
					.MOD_ID_1810 .a-i s.equal {
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 15px;
						height: 14px;
						background: url(' ') no-repeat;
					}
					.MOD_ID_1810 .a-i .title {
						width: 90%;
						padding-top: 5px;
						font-size: 14px;
						overflow: hidden;
						white-space: nowrap;
						text-overflow: ellipsis;
						-o-text-overflow: ellipsis;
					}
					.MOD_ID_1810 .a-i .price .p-1 {
						color: #ff4163;
						font-size: 20px;
					}
					.MOD_ID_1810 .a-i .price .p-2 {
						margin-left: 5px;
						color: #777;
						text-decoration: line-through;
					}
					.MOD_ID_1810 .a-i .dis {
						position: absolute;
						top: 0;
						left: 0;
						color: #fff;
						text-align: center;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 55px;
						height: 48px;
						background: url(' ') no-repeat;
					}
					.MOD_ID_1810 .a-r {
						position: relative;
						padding-top: 0;
					}
					.MOD_ID_1810 .a-r .a-i-inner {
						padding: 14px 0 0 17px;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 183px;
						height: 234px;
						background: url(' ') no-repeat;
					}
					.MOD_ID_1810 .a-r .pic {
						width: 170px;
						height: 160px;
						overflow: hidden;
						display: block;
					}
					.MOD_ID_1810 .a-r .pic img {
						width: 100%;
						vertical-align: top;
					}
					.MOD_ID_1810 .a-r .text {
						font-size: 14px;
						text-align: center;
						line-height: 1.4;
					}
					.MOD_ID_1810 .a-r .text em {
						font-style: normal;
						color: #fd8080;
					}
					.MOD_ID_1810 .a-r .buy-btn {
						display: block;
						width: 100%;
						height: 35px;
						position: absolute;
						bottom: 0;
						left: 0;
					}
					.MOD_ID_1810 .a-r .dis {
						left: -10px;
						font-size: 13px;
						padding: 0 20px;
						line-height: 1.3;
						display: inline-block;
						*display: inline;
						*zoom: 1;
						width: 26px;
						height: 64px;
						background: url(' ') no-repeat;
					}
					.MOD_ID_101 .simple-banner {
						display: block;
					}
					.MOD_ID_101 .simple-banner img {
						display: block;
						width: 100%;
					}
				</style>
				<div class="module_row MOD_ID_238" data-mid="1695" data-editable="0">
					<div class="mod_row MOD_ID_1695">
						<div class="act-header">
							<div style="background: url(/shop/resources/img/d-23.jpg) no-repeat center 0;height: 509px"></div>
						</div>
						<div class="act-body">
							<div class="act-package w960" id="F_Box2">
								<div class="act-s-title">
									<img src=" " alt="">
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">资生堂 豪华嘉美艳容露150ml</div>
												<div class="price">
													<span class="p-1">￥55.00</span>
												</div>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src=" /shop/resources/img/b-2.jpg">
												</a>
												<div class="title">资生堂 洗颜专科泡沫洁面乳120g</div>
												<div class="price">
													<span class="p-1">￥39.20</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src=" /shop/resources/img/b-2.jpg">
												</a>
												<div class="title">御宅女 OTAKU 面膜系列套装/礼盒</div>
												<div class="price">
													<span class="p-1">￥39.20</span>
												</div>
												<span class="dis">7.0折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src=" /shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降53元</em>
												<br>用美妆优惠券<em>再降20元</em>
											</div>
											<span class="dis">折后再降73元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">我的美丽日记纳豆面膜单片23ml</div>
												<div class="price">
													<span class="p-1">￥16.48</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">Za姬芮真皙美白隔离霜35g</div>
												<div class="price">
													<span class="p-1">￥59.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">Za姬芮净颜深层清洁卸妆油100ml</div>
												<div class="price">
													<span class="p-1">￥65.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src="/shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降21元</em>
												<br>用美妆优惠券<em>再降20元</em>
											</div>
											<span class="dis">折后再降41元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥45.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥45.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥35.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src="/shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降27元</em>
												<br>用美妆优惠券<em>再降20元</em>
											</div>
											<span class="dis">折后再降47元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥48.75</span>
												</div>
												<span class="dis">6.5折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥55.44</span>
												</div>
												<span class="dis">5.6折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥19.50</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src="/shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降24元</em>
												<br>用美妆优惠券<em>再降20元</em>
											</div>
											<span class="dis">折后再降44元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥58.14</span>
												</div>
												<span class="dis">7.9折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥20.01</span>
												</div>
												<span class="dis">6.9折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥27.00</span>
												</div>
												<span class="dis">7.5折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src="/shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降6元</em>
												<br>用美妆优惠券<em>再降20元</em>
											</div>
											<span class="dis">折后再降26元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">Lucky Trendy 波点指甲油套装</div>
												<div class="price">
													<span class="p-1">￥29.00</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥59.40</span>
												</div>
												<span class="dis">6.0折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥29.50</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src="/shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降18元</em>
												<br>用美妆优惠券<em>再降20元</em>
											</div>
											<span class="dis">折后再降38元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">日本ALOVIVI卸妆皇后卸妆水</div>
												<div class="price">
													<span class="p-1">￥65.07</span>
												</div>
												<span class="dis">7.7折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥48.40</span>
												</div>
												<span class="dis">8.8折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">千妇恋CHIFURE化妆棉 卸妆棉</div>
												<div class="price">
													<span class="p-1">￥15.80</span>
												</div>
												<span class="dis">7.9折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src="/shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降30元</em>
												<br>用美妆优惠券<em>再降20元</em>
											</div>
											<span class="dis">折后再降50元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
								<div class="act-list-wrapper clearfix">
									<ul class="fl act-list">
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥68.00</span>
												</div>
											</div>
										</li>
										<li class="fl a-i">
											<s class=""></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">韩国dodo红色恋人散粉5g蜜粉</div>
												<div class="price">
													<span class="p-1">￥38.34</span>
												</div>
												<span class="dis">7.1折</span>
											</div>
										</li>
										<li class="fl a-i">
											<s class="equal"></s>
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">韩国dodo四色眼影</div>
												<div class="price">
													<span class="p-1">￥40.50</span>
												</div>
												<span class="dis">3.0折</span>
											</div>
										</li>
									</ul>
									<div class="fl a-i a-r">
										<div class="a-i-inner">
											<a href="product" class="pic" target="_blank">
												<img src="/shop/resources/img/b-2.jpg">
											</a>
											<div class="text">购买组合<em>直降77元</em>
												<br>用美妆专用券<em>再降20元</em>
											</div>
											<span class="dis">折后再降97元</span>
										</div>
										<a href="product" class="buy-btn"></a>
									</div>
								</div>
							</div>
							<div id="F_Box3"></div>
						</div>
						<div class="act-nav">
							<ul class="act-nav-list">
								<li class="act-nav-item"><a href="product" class="lemon tab_on">我要领券</a>
								</li>
								<li class="act-nav-item"><a href="product" class="lemon">省钱套餐</a>
								</li>
								<li class="act-nav-item"><a href="product" class="lemon">爆款推荐</a>
								</li>
								<li class="act-nav-item"><a href="product" class="backtop">TOP</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1823" data-editable="0">
					<div class="mod_row MOD_ID_1823">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">百雀羚水嫩盈透洁面泡沫150g</div>
												<div class="price">
													<span class="p-1">￥45.50</span>
													<span class="p-2">原价:￥70.00</span>
												</div>
												<span class="dis">6.5折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥78.32</span>
													<span class="p-2">原价:￥178.00</span>
												</div>
												<span class="dis">4.4折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝 </div>
												<div class="price">
													<span class="p-1">￥78.00</span>
													<span class="p-2">原价:￥150.00</span>
												</div>
												<span class="dis">5.2折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥96.00</span>
												</div>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1824" data-editable="0">
					<div class="mod_row MOD_ID_1824">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥68.00</span>
													<span class="p-2">原价:￥85.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥85.00</span>
													<span class="p-2">原价:￥106.25</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥93.33</span>
													<span class="p-2">原价:￥153.00</span>
												</div>
												<span class="dis">6.1折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥88.06</span>
													<span class="p-2">原价:￥238.00</span>
												</div>
												<span class="dis">3.7折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥49.14</span>
													<span class="p-2">原价:￥126.00</span>
												</div>
												<span class="dis">3.9折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">stylenanda 3CE光滑肌肤打底霜</div>
												<div class="price">
													<span class="p-1">￥147.50</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">魔法森林猫咪粉饼（2#自然色）</div>
												<div class="price">
													<span class="p-1">￥86.00</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥55.00</span>
													<span class="p-2">原价:￥68.75</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1825" data-editable="0">
					<div class="mod_row MOD_ID_1825">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">canmake井田保湿发光防晒唇彩膏</div>
												<div class="price">
													<span class="p-1">￥48.97</span>
													<span class="p-2">原价:￥59.00</span>
												</div>
												<span class="dis">8.3折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥55.76</span>
													<span class="p-2">原价:￥68.00</span>
												</div>
												<span class="dis">8.2折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">too cool for school染色唇彩</div>
												<div class="price">
													<span class="p-1">￥36.97</span>
													<span class="p-2">原价:￥46.80</span>
												</div>
												<span class="dis">7.9折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">Cherry me VE修护润唇膏3.5g</div>
												<div class="price">
													<span class="p-1">￥28.00</span>
													<span class="p-2">原价:￥35.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">3CE滋润荧光嫩粉色唇膏/口红</div>
												<div class="price">
													<span class="p-1">￥98.00</span>
													<span class="p-2">原价:￥122.50</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">Forencos 浪漫口红2.5g</div>
												<div class="price">
													<span class="p-1">￥97.44</span>
													<span class="p-2">原价:￥168.00</span>
												</div>
												<span class="dis">5.8折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">EOS 球型天然润唇膏 7g 薄荷味</div>
												<div class="price">
													<span class="p-1">￥35.00</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥72.50</span>
												</div>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1826" data-editable="0">
					<div class="mod_row MOD_ID_1826">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥58.80</span>
													<span class="p-2">原价:￥98.00</span>
												</div>
												<span class="dis">6.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">百雀羚水嫩精纯明星美肌水100ml</div>
												<div class="price">
													<span class="p-1">￥84.42</span>
													<span class="p-2">原价:￥134.00</span>
												</div>
												<span class="dis">6.3折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">科颜氏金盏花植物精华化妆水</div>
												<div class="price">
													<span class="p-1">￥62.30</span>
													<span class="p-2">原价:￥89.00</span>
												</div>
												<span class="dis">7.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">倩碧天才黄油15ML*2个组合</div>
												<div class="price">
													<span class="p-1">￥45.36</span>
													<span class="p-2">原价:￥108.00</span>
												</div>
												<span class="dis">4.2折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">日本Eyelid Gel胶原蛋白弹力保湿眼霜2支装</div>
												<div class="price">
													<span class="p-1">￥29.50</span>
													<span class="p-2">原价:￥59.00</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥38.64</span>
													<span class="p-2">原价:￥69.00</span>
												</div>
												<span class="dis">5.6折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥88.48</span>
													<span class="p-2">原价:￥158.00</span>
												</div>
												<span class="dis">5.6折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥139.30</span>
													<span class="p-2">原价:￥199.00</span>
												</div>
												<span class="dis">7.0折</span>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1827" data-editable="0">
					<div class="mod_row MOD_ID_1827">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥89.68</span>
													<span class="p-2">原价:￥118.00</span>
												</div>
												<span class="dis">7.6折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">蓝玉米磨砂面膜125g</div>
												<div class="price">
													<span class="p-1">￥69.66</span>
													<span class="p-2">原价:￥129.00</span>
												</div>
												<span class="dis">5.4折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥39.60</span>
													<span class="p-2">原价:￥99.00</span>
												</div>
												<span class="dis">4.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥49.50</span>
													<span class="p-2">原价:￥99.00</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥29.50</span>
													<span class="p-2">原价:￥59.00</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥29.50</span>
													<span class="p-2">原价:￥59.00</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">悦诗风吟火山泥面膜100ml</div>
												<div class="price">
													<span class="p-1">￥75.00</span>
													<span class="p-2">原价:￥93.75</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">森田药妆 复合原液面膜10片</div>
												<div class="price">
													<span class="p-1">￥59.00</span>
													<span class="p-2">原价:￥100.00</span>
												</div>
												<span class="dis">5.9折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥48.64</span>
													<span class="p-2">原价:￥128.00</span>
												</div>
												<span class="dis">3.8折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥32.00</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥35.00</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥189.00</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥111.25</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥73.75</span>
												</div>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1828" data-editable="0">
					<div class="mod_row MOD_ID_1828">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥69.42</span>
													<span class="p-2">原价:￥89.00</span>
												</div>
												<span class="dis">7.8折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥43.20</span>
													<span class="p-2">原价:￥45.00</span>
												</div>
												<span class="dis">9.6折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥23.36</span>
													<span class="p-2">原价:￥32.00</span>
												</div>
												<span class="dis">7.3折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥18.02</span>
													<span class="p-2">原价:￥19.80</span>
												</div>
												<span class="dis">9.1折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥39.00</span>
													<span class="p-2">原价:￥48.75</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥79.20</span>
													<span class="p-2">原价:￥120.00</span>
												</div>
												<span class="dis">6.6折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥60.00</span>
												</div>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥20.00</span>
												</div>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1829" data-editable="0">
					<div class="mod_row MOD_ID_1829">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥46.40</span>
													<span class="p-2">原价:￥58.00</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥54.60</span>
													<span class="p-2">原价:￥60.00</span>
												</div>
												<span class="dis">9.1折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥65.88</span>
													<span class="p-2">原价:￥122.00</span>
												</div>
												<span class="dis">5.4折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥55.04</span>
													<span class="p-2">原价:￥128.00</span>
												</div>
												<span class="dis">4.3折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥29.02</span>
													<span class="p-2">原价:￥46.80</span>
												</div>
												<span class="dis">6.2折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥39.50</span>
													<span class="p-2">原价:￥79.00</span>
												</div>
												<span class="dis">5.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥49.00</span>
													<span class="p-2">原价:￥70.00</span>
												</div>
												<span class="dis">7.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥58.14</span>
													<span class="p-2">原价:￥73.59</span>
												</div>
												<span class="dis">7.9折</span>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_1810" data-mid="1884" data-editable="0">
					<div class="mod_row MOD_ID_1884">
						<div class="act-month">
							<div class="act-goods">
								<h2><img src="/shop/resources/img/b-2.jpg" /></h2>
								<div class="act-list-wrapper">
									<ul class="clearfix list J-scroll-wrapper">
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥36.58</span>
													<span class="p-2">原价:￥59.00</span>
												</div>
												<span class="dis">6.2折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥19.80</span>
													<span class="p-2">原价:￥45.00</span>
												</div>
												<span class="dis">4.4折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥44.25</span>
													<span class="p-2">原价:￥59.00</span>
												</div>
												<span class="dis">7.5折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥38.00</span>
													<span class="p-2">原价:￥47.50</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">美丽法则零晕染炫黑眼线液笔</div>
												<div class="price">
													<span class="p-1">￥25.00</span>
													<span class="p-2">原价:￥31.25</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">悦诗风吟 纤巧精细睫毛膏</div>
												<div class="price">
													<span class="p-1">￥58.00</span>
													<span class="p-2">原价:￥72.50</span>
												</div>
												<span class="dis">8.0折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥61.50</span>
													<span class="p-2">原价:￥82.00</span>
												</div>
												<span class="dis">7.5折</span>
											</div>
										</li>
										<li class="a-i fl">
											<div class="a-i-inner">
												<a href="product" class="pic" target="_blank">
													<img src="/shop/resources/img/b-2.jpg">
												</a>
												<div class="title">印度小巧菠萝</div>
												<div class="price">
													<span class="p-1">￥67.86</span>
													<span class="p-2">原价:￥78.00</span>
												</div>
												<span class="dis">8.7折</span>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="module_row MOD_ID_101" data-mid="1889" data-editable="0">
					<div class="mod_row MOD_ID_1889">
						<a class="anchor" style="left: 15.45%; top: 5.63%; width: 68.52%; height: 89.37%;" href="../magic/outlets/mall.html" target="_blank"></a>
						<div class='simple-banner'>
							<img src="/shop/resources/img/b-2.jpg" />
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="foot J_footertimer" data-svrtime="1411904325">
			<div class="wrap foot_wrap clearfix">
				<div class="foot_info">
					<a class="info_logo" href="product"></a>
					<div class="info_text">
						<p>营业执照注册号：<a href="product" target="_blank">330106000129004</a>
						</p>
						<p>增值电信业务经营许可证：<a href="product" target="_blank">浙B2-20110349</a>
						</p>
						<p>ICP备案号：浙ICP备10044327号-3</p>
						<p class="mgjhostname" title="qihe3083">©2014 Mogujie.com 杭州卷瓜网络有限公司</p>
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
		<script type="text/javascript" src="/shop/resources/js/mga.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-navigation.js"></script>
		<script type="text/javascript" src="/shop/resources/js/md5.js"></script>
		<script type="text/javascript" src="/shop/resources/js/module-login-dialog.js"></script>
</body>
</html>