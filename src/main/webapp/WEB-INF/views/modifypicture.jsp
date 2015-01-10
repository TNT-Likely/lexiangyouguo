<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title> 乐享优果 - 每日新鲜购!</title>
		<meta name="keywords" content=" " />
		<meta name="description" content=" " />
		<meta name="renderer" content="webkit" />
		<meta http-equiv="X-UA-Compatible" content=" " />
		<meta name="copyright" content=" " />
		<meta http-equiv="mobile-agent" content=" " />
		<link rel="search" type="application/opensearchdescription+xml" href=" " />
		<link rel="icon" href=" " type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-navigation(2).css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/module-captcha.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/page-setting.css" media="all" />
		<script type="text/javascript" src="/shop/resources/js/lib-txua.js"></script>
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
    <div id="body" class="fm960">
        <div class="mu_wrap clearfix">
            <div class="mu_nav_wrap">
                <link rel="stylesheet" href="css/level.css"/>
<div class="mu_nav_info">
    <div class="mu_nav_info_avatar">
        <div class="mu_nav_info_avatar_mk"></div>
        <img src="/shop/resources/img/a-49.jpg" width="100" height="100" alt="紫色天堂1995" title="紫色天堂1995"/>
    </div>
    <p class="mu_nav_info_uname">紫色天堂1995</p>
    <a target="_blank" style="width:45px;" class="mu_nav_info_ulot" href=" "><span id="vip_level" class='vip_level1' style="float:left;width: 45px; display: inline-block; height: 14px; margin-top: 3px;"></span></a>
</div>
<dl class="mu_nav">
    <dt>我的订单</dt>
    <dd>
        <a href="order">全部</a>
    </dd>
    <dd>
        <a href="order">待付款 <i class="mu_nav_count">1<i class="mu_nav_count_arw"></i></i></a>
    </dd>
    <dd>
        <a href="order">待确认收货 </a>
    </dd>
    <dd>
        <a href="order">待评价 </a>
    </dd>
                <dd> <a href="order">预售 </a> </dd>
    </dl>

<dl class="mu_nav">
    <dt>优惠特权</dt>
    <dd> <a href="memberlevel" target="_blank">钻石会员</a> </dd>
    <dd> <a href="memberlevel" target="_blank">先尝后付</a> </dd>
    <dd> <a href="memberlevel" >我的积分</a> </dd>
    <dd> <a href="memberlevel">现金券 </a> </dd>
    <dd> <a href="memberlevel">店铺优惠券 </a> </dd>
</dl>
    <dl class="mu_nav">
        <dt style="position:relative;*zoom:1;">我的钱包<i style="position:absolute;font-size: 12px;font-style: normal;width: 60px;height: 18px;color: #fff;background: #FF288F;line-height: 17px;text-align: center;font-weight: normal;right: -21px;top: 6px;border-radius: 2px;">充值返现</i></dt>
        <dd> <a href="personalhomepage">钱包首页</a> </dd>
        <dd> <a href="personalhomepage">我的银行卡</a> </dd>
        <dd> <a href="personalhomepage">资金明细</a> </dd>
        <dd> <a href="personalhomepage">实名认证</a> </dd>
    </dl>
<dl class="mu_nav">
    <dt><a href=" ">地址管理</a></dt>
</dl>
<dl class="mu_nav">
    <dt><a href=" ">安全设置</a></dt>
</dl>
<dl class="mu_nav">
    <dt>维权管理</dt>
    <dd><a href="">投诉管理</a></dd>
    <dd><a href=" ">举报管理</a></dd>
</dl>
<dl class="mu_nav pb40">
    <dt>帐号设置</dt>
    <dd> <a href="information">基本信息</a> </dd>
    <dd> <a href="modifypicture">修改头像</a> </dd>
    <dd class="c"> <a href="bindingl">帐号绑定</a> </dd>
    <dd> <a href="binding">微信绑定</a> </dd>
    <dd> <a href="personalhomepage">个人封面</a> </dd>
    <dd> <a href="personalhomepage">个性域名</a> </dd>
    <dd> <a href="personalhomepage">黑名单</a> </dd>
</dl>
            </div>
					<div class="mu_content_wrap">
						<div id="setting_box" class="fl">
							<div class="settings_title">
								<span>修改头像</span>
							</div>
							<div id="setting_form" class="setting_avartar">
								<form id="avartarForm" enctype="multipart/form-data" method="POST" action="/upload/addpic">
									<input type="hidden" name="type" value="avatar" />
									<dl>
										<dd>当前头像：</dd><dt><img class="head_bd r3" src="img/a-49.jpg" alt=""></dt>
										<dd>上传新头像：</dd><dt style="position:relative;"><input type="text" id="viewAvartar" readonly="readonly" class="gray_text" onmouseout="document.getElementById('uploadAvartar').style.display='none';"/><input type="button" class="gray_button" onmouseover="document.getElementById('uploadAvartar').style.display='block';"  value="浏览..."/><input type="file" onchange="document.getElementById('viewAvartar').value=this.value;this.style.display='none';" class="tfile" id="uploadAvartar" name="avatar"/></dt>
										<dd class="msg">&nbsp;</dd><dt class="msg">建议使用正方形的图片，支持JPG、GIF、JPEG格式，100K以内。</dt>
										<dd class="preview">预览：</dd><dt class="preview"></dt>
										<dd class="avartar_confirm">&nbsp;</dd><dt class="avartar_confirm"><input type="button" value="确定" class="green_button"/></dt>
									</dl>
								</form>
							</div>
							<input type="hidden" id="refer" value=" ">
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="foot J_footertimer" data-svrtime="1414140305">
			<div class="wrap foot_wrap clearfix">
				<div class="foot_info">
					<a class="info_logo" href=" "></a>
					<div class="info_text">
						<p>营业执照注册号：<a href=" " target="_blank">330106000129004</a>
						</p>
						<p>增值电信业务经营许可证：<a href=" " target="_blank">浙B2-20110349</a>
						</p>
						<p>ICP备案号：浙ICP备10044327号-3</p>
						<p class="mgjhostname" title="qihe3082">©2014 Mogujie.com 杭州卷瓜网络有限公司</p>
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
		<script type="text/javascript" src="/shop/resources/js/module-addfav.js"></script>
		<script type="text/javascript" src="/shop/resources/js/module-captcha.js"></script>
		<script type="text/javascript" src="/shop/resources/js/page-coupon-prompt.js"></script>
</body>
</html>