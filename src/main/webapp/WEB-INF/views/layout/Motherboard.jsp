<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="lxyg.domain.Member"%>
<script>
	curl = {
		apiName : 'require'
	};
	var MOGU = {};
</script>
<script type="text/javascript">
	MOGUPROFILE = {
		cdnHost : "//s6.mogucdn.com",
		appEnv : "production",
		is_subsite : "0",
		push_serviceHost : "221.228.199.44:117.121.133.45:80",
		push_ajaxServiceHost : "http://m1.mogujie.com:80",
		push_ajaxSericeBakHost : "http://221.228.199.50:80",
		push_token : "",
		isNewIMShow : "true",
		userid : "",
		avatar : "",
		isBuyer : "false"
	};
</script>

<script>
	window.__trace__headendt = +new Date;
</script>

<script type="text/javascript">
	/**
	 ** for layout 960
	 **/
	(function() {
		var wWidth = $(window).width();
		if (wWidth < 1212) {
			$('body').addClass('media_screen_960');
		} else {
			$('body').addClass('media_screen_1200');
		}
		//initTime for log 判断对象是否存在
		window.MoGu && $.isFunction(MoGu.set)
				&& MoGu.set('initTime', (new Date()).getTime());

		var ua = navigator.userAgent;
		// 判断是否是ipad
		var is_plat_ipad = ua.match(/(iPad).*OS\s([\d_]+)/);
		if (is_plat_ipad) {
			$('body').addClass('media_ipad');
		}
		// 判断是否是ipadApp
		var is_plat_ipadApp = ua.indexOf('MogujieHD') >= 0
				|| ua.indexOf('Mogujie4iPad') >= 0
				|| location.href.indexOf('_atype=ipad') >= 0;
		if (is_plat_ipadApp) {
			$('body').addClass('media_ipad_app');
			// 隐藏头尾
			$('body')
					.append(
							'<style type="text/css">.header_2014,.header_nav,.foot .foot_wrap{display: none;}.foot{height: 0;background: none;}.back2top_wrap{height:0;width:0;overflow:hidden;opacity:0;}</style>');
			// 移除购物车，返回顶部
			setTimeout(function() {
				$('.back2top_wrap').remove();
			}, 1000)
		}
	})();
</script>
<div class="header_2014">
	<div class="wrap clearfix">
		<ul class="header_top">
			<%
				Member info = (Member) request.getSession().getAttribute(
						"memberInfo");
				if (info != null) {
			%>
			<li class="s1 has_icon user_meta"><a
				href="personalhomepage?mid=<%=info.getId()%>"> <%=info.getMemberName()%></a>
				<i class="icon_delta"></i>
				<ol class="ext_mode">
					<li class="s2"><a
						href="personalhomepage?mid=<%=info.getId()%>">个人设置</a></li>
					<li class="s2"><a href="binding?mid=<%=info.getId()%>">账号绑定</a>
					</li>
					<li class="s2"><a href="login">退出</a></li>
				</ol></li>
			<li class="s1 has_icon has_line user_fav"><a href="index">喜欢</a>
				<ul class="ext_mode">
					<li class="s2"><a href="index">关注的店铺</a></li>
					<li class="s2"><a href="index">浏览记录</a></li>
				</ul></li>
			<li class="s1 has_icon message_center has_line"><a href="index">消息<span
					class="m_num"></span></a> <i class="icon_delta"></i></li>
			<%
				} else {
			%>
			<li class="s1"><a href="register">注册</a></li>
			<li class="s1"><a href="login">登录</a></li>
			<li class="s1 has_line"><a href="login">QQ登录</a></li>
			<li class="s1"><a href="login">微信登录</a></li>
			<li class="s1"><a href="login">微博登录</a></li>
			<%
				}
			%>
			<li class="s1 has_line has_icon top_app"><a>手机乐享优果</a>
				<ol class="ext_mode">
					<li class="s2"><img src=" " alt="扫描下载客户端"></li>
				</ol></li>
			<li class="s1 has_line custom_item"><a href="customerservice"
				target="_blank">帮助中心</a></li>
		</ul>
		<div class="header_mid clearfix">
			<a href="index" class="logo" title="乐享优果首页">乐享优果|www.lexiangyouguo.com</a>
			<div class="top_nav_search" id="nav_search_form">
				<div class="selectbox" data-v="1">
					<span class="selected">搜商品</span>
					<ol>
						<li class="current" data-index="bao"><a href="index">商品</a></li>
						<li data-index="shop"><a href="index">店铺</a></li>
					</ol>
				</div>
				<form target="_blank" action="/search/" method="get"
					id="top_nav_form">
					<input id="psearch" type="text" data-tel="search_book" name="q"
						class="ts_txt fl" data-def="兔毛" value="软妹最爱温暖“兔毛”毛衫"
						autocomplete="off" def-v="软妹最爱温暖“兔毛”毛衫" /> 
						<input type="submit"
						value="搜 索" class="ts_btn" /> <input type="hidden" name="t"
						value="bao" id="select_type" />
				</form>
				<div id="qsearchTips" class="top_search_hint" style="display: none;">
					<div class="search_tip_box fl">
						<<div class="search_hot_wrap">
							<h3 class="search_tip_title hot_title">热门关键词</h3>
							<ul class="hot_list clearfix">
								<li><span>呢外套</span></li>
								<li><span>新款卫衣</span></li>
								<li><span>打底衫</span></li>
								<li><span>皮草 外套</span></li>
								<li><span>围巾</span></li>
								<li><span>保湿补水</span></li>
								<li><span>润唇膏</span></li>
								<li><span>短靴</span></li>
								<li><span>长裙</span></li>
								<li><span>手套</span></li>
							</ul>
						</div>
						<div class="mr300 tip_wrap">
							<h3 class="search_tip_title local_title clearfix">历史记录</h3>
							<ul class="search_tip"></ul>
						</div>
					</div>
				</div>
				<div class="top_search_hint"></div>
			</div>
			<div class="mid_fr">
				<a class="nav_my_order" href="order" target="_blank">我的订单</a>
				<div class="shopping_cart_v2">
					<!-- sc_on -->
					<a class="cart_info_wrap" target="_blank" href="shopping"> <span
						class="cart_info">购物车<b>0</b>件
					</span> <b class="icon_delta"></b>
					</a> <!-- <span class="shopping_cart_loading"></span> -->
					<div class="shop_cart_info empty_cart">购物车里没有商品！</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	 $(function(){
		$(".shopping_cart_v2").mouseover(function(){
			$(this).addClass("sc_on");
		});
		$(".shopping_cart_v2").mouseout(function(){
			$(this).removeClass("sc_on");
		});
	/* 	$("#psearch").focus(function(){
			$("#qsearchTips").show();
		});
		$("#psearch").blur(function(){
			$("#qsearchTips").hide();
		}); */
	}); 
</script>
