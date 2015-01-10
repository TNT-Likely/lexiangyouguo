<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>乐享优果 - 每日新鲜购!</title>
	<meta name="keywords" content=" ">
	<meta name="description" content=" ">
	<meta name="copyright" content=" ">
	<meta http-equiv="mobile-agent" content=" ">
	<link rel="search" type="application/opensearchdescription+xml" href=" ">
	<link rel="icon" href=" " type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-navigation(2).css" media="all">
	<link rel="stylesheet" type="text/css" href="/shop/resources/css/module-shop-header.css" media="all">
	<link rel="stylesheet" type="text/css" href="/shop/resources/css/page-shop-detail-v2.css" media="all">
	<script type="text/javascript" async="" src="/shop/resources/js/ga.js"></script>
	<script type="text/javascript" src="/shop/resources/js/lib-txua.js"></script>	
	 <script type="text/javascript">
                MOGUPROFILE = { cdnHost:"//s6.mogucdn.com",appEnv:"production",is_subsite:"0",push_serviceHost:"221.228.199.45:117.121.133.44:80",push_ajaxServiceHost:"http://m1.mogujie.com:80",push_ajaxSericeBakHost:"http://221.228.199.50:80",push_token:"",isNewIMShow:"true",logString:"eyJTRVJWRVIiOnsiUVVFUllfU1RSSU5HIjoia29oYW5hX3VyaT1kZXRhaWxcLzE2b2R3MGcmdHJhY2VpZD1ib29rXzF2a2Rkb2xhejdyNCZjcGFyYW09IiwiUkVRVUVTVF9NRVRIT0QiOiJHRVQiLCJDT05URU5UX1RZUEUiOiIiLCJDT05URU5UX0xFTkdUSCI6IiIsIlJFUVVFU1RfVVJJIjoiXC9kZXRhaWxcLzE2b2R3MGc/dHJhY2VpZD1ib29rXzF2a2Rkb2xhejdyNCZjcGFyYW09IiwiU0VSVkVSX1BST1RPQ09MIjoiSFRUUFwvMS4xIiwiUkVNT1RFX0FERFIiOiIxMC4xMS41LjE2MiIsIlJFTU9URV9QT1JUIjoiMzE3MzEiLCJTRVJWRVJfQUREUiI6IjEwLjExLjMuNjAiLCJTRVJWRVJfUE9SVCI6IjgwIiwiU0VSVkVSX05BTUUiOiJzaG9wLm1vZ3VqaWUuY29tIiwiUkVESVJFQ1RfU1RBVFVTIjoiMjAwIiwiQVBQTElDQVRJT05fRU5WIjoicHJvZHVjdGlvbiIsIk1PR1VfRURHRSI6IiIsIkhUVFBfSE9TVCI6InNob3AubW9ndWppZS5jb20iLCJIVFRQX1hfUkVBTF9JUCI6IjIyMC4xNzkuMTI0LjE4MiIsIkhUVFBfWF9GT1JXQVJERURfRk9SIjoiMjIwLjE3OS4xMjQuMTgyIiwiSFRUUF9VU0VSX0FHRU5UIjoiTW96aWxsYVwvNS4wIChXaW5kb3dzIE5UIDYuMTsgcnY6MzQuMCkgR2Vja29cLzIwMTAwMTAxIEZpcmVmb3hcLzM0LjAiLCJIVFRQX0FDQ0VQVCI6InRleHRcL2h0bWwsYXBwbGljYXRpb25cL3hodG1sK3htbCxhcHBsaWNhdGlvblwveG1sO3E9MC45LCpcLyo7cT0wLjgiLCJIVFRQX0FDQ0VQVF9MQU5HVUFHRSI6InpoLWNuLHpoO3E9MC44LGVuLXVzO3E9MC41LGVuO3E9MC4zIiwiSFRUUF9BQ0NFUFRfRU5DT0RJTkciOiJnemlwLCBkZWZsYXRlIiwiSFRUUF9SRUZFUkVSIjoiaHR0cDpcL1wvd3d3Lm1vZ3VqaWUuY29tXC9ib29rXC9zaG9lc1wvMTYzNDg/ZklkPTE2b2R3MGcmZj16bngyMDE1MDExMHRyZW5kMnllbHUiLCJIVFRQX0NPT0tJRSI6Il9fbWdqdXVpZD0xNjE1YzYyMS1mMjM2LTBkM2EtNTBlNy00Y2ZjZGMwMjViM2Q7IF9fdXRtYT0yNDI1NDIxMTAuMTMwMjcyMTU3Ny4xNDE5OTMwNTMwLjE0MjA4NTU1MzcuMTQyMDg1OTg3MS44OyBfX3V0bXo9MjQyNTQyMTEwLjE0MjA4NTU1MzcuNy40LnV0bWNzcj1iYWlkdXx1dG1jY249KG9yZ2FuaWMpfHV0bWNtZD1vcmdhbmljfHV0bWN0cj0lRTglOTglOTElRTglOEYlODclRTglQTElOTc7IEhtX2x2dF8wYjA3YmQ0M2UzMjJkMzVlZTUwZmMzYjY4YjdhNzBiYT0xNDE5OTMwNTM2LDE0MjAwMzIzNjI7IGZyb21fc2l0ZT13d3cuYmFpZHUuY29tJTVFOyBfX2Nwcz0zLTEybTd1dnctd2ViLTE0MjA4MTM0NTQtMS0tLTAtMDsgX19jcHN1aWQ9MTJtN3V2dzsgX19jcHNfdW5pb249NzkxMjUyMzQtMTAxNzQ5OyBfX21vZ3VqaWU9dkptSkFWb2ElMkJVR1pqbkZvZE1XJTJCbWtkJTJGWFhIOUpqVyUyRmlJJTJCOVF1QjZ5a2ZVd0NKQyUyRkd6VjglMkZrbnViSVFrMGZFNDlaRFRNbzFvanAlMkJoMFE0c0NrQ3dnJTNEJTNEOyBfX3V0bWM9MjQyNTQyMTEwOyBsb2NhbD02OyBfX21namNwY3BhZ2U9MTsgX191dG1iPTI0MjU0MjExMC4xLjEwLjE0MjA4NTk4NzEiLCJSRVFVRVNUX1RJTUVfRkxPQVQiOjE0MjA4NTk4NzkuNjE3MSwiUkVRVUVTVF9USU1FIjoxNDIwODU5ODc5fSwidHJhY2UiOnsicHJlSWQiOiJib29rXzF2a2Rkb2xhejdyNCIsImN1cnJlbnRJZCI6ImRldGFpbF8xdmtkZTJiYzYwaHMifX0=",cartStyle:"1",widescreen:"1",userid:"",avatar:"",isBuyer:"false"  };
    </script>

     <script type="text/javascript">
if(is_load_log == undefined || null == is_load_log ) {
     var is_load_log = true;
     var log_stat_url_tmp =  "http://log.juangua.com/mogu.js?sfrom=www.baidu.com%255E&method=GET&time=1420859879&uuid=1615c621-f236-0d3a-50e7-4cfcdc025b3d&areaid=5&hahapoint=4b1e543a8c799f68a200f3525078c689" ;

     if (window.innerWidth){
        var winwidth = window.innerWidth;
     } else if ((document.body) && (document.body.clientWidth)){
        var winwidth = document.body.clientWidth;
     }

     if (document.documentElement  && document.documentElement.clientWidth){
        var winwidth = document.documentElement.clientWidth;
     }
     if(winwidth < 1280 ){ winwidth = 4 }else if(winwidth < 1600 ){ winwidth = 5 }else{ winwidth = 6 }
     log_stat_url_tmp += '&wwidth='+winwidth;

    if (typeof MOGU !== 'undefined' && typeof MOGU.UCLIENT_INFO !== 'undefined') {
        log_stat_url_tmp += '&uclient=' + MOGU.UCLIENT_INFO;
    }



     var log_stat_refer  =  "%2Fdetail%2F16odw0g%3Ftraceid%3Dbook_1vkddolaz7r4%26cparam%3D" ;
     var log_stat_rerefer =  "http%3A%2F%2Fwww.mogujie.com%2Fbook%2Fshoes%2F16348%3FfId%3D16odw0g%26f%3Dznx20150110trend2yelu" ;
     var log_stat_cpsinfo =  "12m7uvw,19";
     var log_stat_anchor =  encodeURIComponent(location.hash);
     var log_stat_url = log_stat_url_tmp +"&refer="+log_stat_refer+ "&rerefer="+log_stat_rerefer+"&anchor="+log_stat_anchor + "&cpsinfo=" + log_stat_cpsinfo;
}
</script>

    <script>window.__trace__headendt = +new Date;</script> 
</head>
<body>
	<div id="header">
		<div class="uinfo_wrap clearfix">
			<div class="info_show clearfix">
				<a href="index" class="back_to_mogujie fl">乐享优果首页</a>
				<ul class="my_btn t_toolbox fr">
					<li class="shoppingcard dropdown-menu">
						<a href="shopping" target="_blank" class="text fl">购物车<span class="num ffred">0</span>件</a>
						<b></b>
						<div id="shopcardfortop"></div>
					</li>
					<li class="fl s_line"></li>
					<li class="custom_help fl clearfix">
						<a target="_blank" class="libg myfavs fl" href="customerservice">客户服务</a>
						<b></b>
					</li>
				</ul>
				<li class="fr s_line"></li>
				<ul class="login_methods fr" id="show_login">
					<li class="fl login_mod_wrap">
						<a href="register" class="regist fl">注册</a>
						<a href="login" class="login  fl">登录</a>
					</li>
					<li class="fl s_line"></li>
					<li class="fl login_mod_wrap">
						<a href="login" class="weibo_login">微博登录</a>
						<a href="login" class="qq_login">QQ登录</a>
					</li>
					<li class="fl login_more_wrap">
						<a href="login" class="more_login">更多<b></b></a>
					</li>
				</ul>
			</div>
			<script type="text/javascript">
    /* 适配浏览器窗口大小 */
    ;(function(){
        var viewWidth = $(window).width(); 
        if(viewWidth < 1212){ 
            $('body').addClass('media_screen_960');
        } else {
            $('body').removeClass('media_screen_960').addClass('media_screen_1200');
        } 
    })(jQuery);
</script>
			<ul id="setting_menu" class="s_m">
				<li class="hs_posr"><a href="personalhomepage">个人动态</a>
				</li>
				<li class="hs_posr"><a href="personalhomepage">个人设置</a>
				</li>
				<li class="hs_posr"><a href="binding">账号绑定</a>
				</li>
				<li><a href="login">退出</a>
				</li>
			</ul>
			<ul id="help_down_list" class="s_m">
				<li><a target="_blank" href="customerservice">联系合作</a>
				</li>
				<li><a target="_blank" href="customerservice">帮助</a>
				</li>
			</ul>

			<ul id="show_more_login" class="login_methods s_m" style="display: none;">
				<li>
					<a href=" " class="login"> 腾讯微博登录</a>
				</li>
				<li>
					<a href=" " class="login">人人网登录</a>
				</li>
				<li>
					<a href=" " class="login">微信登录</a>
				</li>
			</ul>
		</div>
	</div>
	<div class="shop-header">
		<div class="header clearfix">
			<a class="shop-logo fl" href=" " target="_blank"><b class="logo header-icons">乐享优果SHOP</b></a>
			<div class="shop-name fl">
				<span class="name-wrap clearfix">
                <a href=" " class="name" title="小尝鲜">小尝鲜</a>
                 <div class="mogutalk_widget_btn kefu" data-bid="14qz4#23" data-style="widget3" data-from="shop-header"><iframe src=" " width="18" height="22" frameborder="0" scrolling="no" marginheight="0" allowtransparency="true"></iframe></div>
                            </span>
				<p>
					<a href=" " class="shop-follow header-icons " uid="12edmt4">关注本店</a><span class="shop-follow-num"><span class="J_ShopFollowNum">1940</span></span>粉丝
				</p>
			</div>
			<div class="shop-score">
				<p class="mb10">
					<span class="shop-sale">总销量 <b>10774</b></span>
				</p>
				<p>
					<span class="s-cat">卖相<b>4.8</b></span>
					<span class="s-cat">质量<b>4.7</b></span>
					<span class="s-cat">价格<b>4.7</b></span>
					<span class="s-cat">服务<b>4.8</b></span>
				</p>
				<div class="shop-info clearfix">
					<div class="info-box fl">
						<div class="verify">
							<a href=" " target="_blank" class="clearfix">
								<b class="auth header-icons fl"></b>
								<p class="fl">乐享优果商家认证</p>
							</a>
						</div>
						<ol class="li li3">
							<li><span class="tag">所在地区：</span>四川省成都市</li>
							<li><span class="tag">商品数：</span>114</li>
							<li><span class="tag">销售量：</span>10774</li>
							<li><span class="tag">创建时间：</span>2014年04月09日</li>
							<li><span class="tag">店铺保证金：</span><b class="num">20000</b>元</li>
							<li class="tc mt10"><a class="go-detail" href=" " target="_blank">查看详情</a>
							</li>
						</ol>
					</div>
					<ol class="li li1">
						<li class="title">动态评分</li>
						<li>款式新颖：<span class="num">4.8</span>
						</li>
						<li>质量满意：<span class="num">4.7</span>
						</li>
						<li>价格合理：<span class="num">4.7</span>
						</li>
						<li>服务周到：<span class="num">4.8</span>
						</li>
					</ol>
					<ol class="li li2">
						<li class="title">比同行平均</li>
						<li><span class="tag up">高</span><span class="num">2.13%</span>
						</li>
						<li><span class="tag up">高</span><span class="num">0%</span>
						</li>
						<li><span class="tag up">高</span><span class="num">0%</span>
						</li>
						<li><span class="tag up">高</span><span class="num">2.13%</span>
						</li>
					</ol>
					<ol class="li li4">
						<li class="title">本店</li>
						<li>平均发货时间：<span class="low">1.1</span>天</li>
						<li>退货率：<span class="num">0.16</span>%</li>
						<li>有效投诉率：<span class="num">0</span>%</li>
					</ol>
					<ol class="li li5">
						<li class="title">行业</li>
						<li>0.92 天</li>
						<li>0.2 %</li>
						<li>0.15 %</li>
					</ol>
				</div>
			</div>
			<div class="shop-search" id="top_search_form">
				<form target="_blank" action="http://www.mogujie.com/search/" method="get" id="search_form">
					<div class="text-wrap clearfix">
						<input type="text" class="text ts_txt" autocomplete="off" name="q" placeholder="输入商品名称">
						<input type="submit" class="submit-btn" value="搜索">
					</div>
					<input type="hidden" name="t" value="bao" id="select_type">
				</form>
			</div>
			<div class="shop-search-list seatch_type_msearch ts_type fl" id="seach_type" data-fixleft="55" data-fixtop="-18">
				<div class="search-list-box fl">
					<p class="no-tip tip_none">暂无相关热门关键词</p>
					<ul class="search-tip search_tip"></ul>
				</div>
			</div>
		</div>
	</div>
	<div class="ovbox mod_topBanner">
		<div class="mod_list clearfix">
			<div class="mod_item w960" data-id="156149" data-width="960" data-type="topBanner" data-title="">
				<div class="mod_cont topbanner">
					<a class="shop_bg_img" href=" " data-src="/shop/resources/img/a-15.jpg" style="background: url(/shop/resources/img/a-15.jpg) center no-repeat"></a>
				</div>
			</div>
		</div>
	</div>
	<div class="ovbox mod_topNav blackStyle">
		<div class="mod_list clearfix">
			<div class="mod_item w960" data-id="156150" data-width="960" data-type="topNav" data-title="">
				<div class="mod_cont topNav">
					<ol class="clearfix">
						<li>
							<a href="index">首页</a>
						</li>
						<li class="all">
							<a href="index">全部商品</a>
						</li>

						<li>
							<a href="index">12月新品</a>
						</li>
						<li>
							<a href="index">11月新品</a>
						</li>
						<li>
							<a href="index">鲜果</a>
						</li>
						<li>
							<a href="index">礼盒</a>
						</li>
						<li>
							<a href="index">买家须知</a>
						</li>
						<li>
							<a href="index">快捷支付教程</a>
						</li>
					</ol>
					<div class="category_list slideer" style="display: none;">
						<dl>
							<dd>
								<a href="index">12月新品</a>
							</dd>
							<dd>
								<a href="index">11月新品</a>
							</dd>
							<dd>
								<a href="index">11.15新品</a>
							</dd>
							<dd>
								<a href="index">10月新品</a>
							</dd>
							<dd>
								<a href="index">鲜果</a>
							</dd>
							<dd>
								<a href="index">礼盒</a>
							</dd>
							<dd>
								<a href="index">进口水果</a>
							</dd>
							<dd>
								<a href="index">产地直销</a>
							</dd>
							<dd>
								<a href="index">礼品包装</a>
							</dd>
							<dd>
								<a href="index">特价促销</a>
							</dd>
						</dl>
					</div>
				</div>
			</div>
		</div>
	</div>
	<input type="hidden" id="shopbaseurl" value="http://shop.mogujie.com/14epe">
	<input type="hidden" id="now_shop_id" value="102813">
	<input type="hidden" id="now_shop_key" value="14epe">
	<input type='hidden' id='traceid' value='detail_1mko1xj56ku8'>
	<input type='hidden' id='cpcid' value=''>
	<input type='hidden' id='shopid' value='14epe'>
	<input type='hidden' id='iteminfoid' value='127e4a2'>
	<div class="shop-detail ">
		<div class="detail-goods clearfix">
			<div class="goods-left">
				<div class="goods-box clearfix">
					<div class="goods-info fl" id="J_GoodsInfo">
						<div class="goods-info-box">
							<h1 class="goods-title">进口智利蓝莓</h1>
							<div class="goods-price goods-pro">
								<dl class="clearfix">
									<dt>原价：</dt>
									<dd class="price-w"><span>&yen;</span><span id="J_Price">108.00</span>
									</dd>
								</dl>
								<dl class="clearfix">
									<dt class="price-x">现价：</dt>
									<dd>
										<div class="price-box">
											<span class="price-u">&yen;</span>
											<span id="J_NowPrice" class="price-n">75.60</span>
										</div>
									</dd>
								</dl>
							</div>
							<div class="goods-promotion no-border">
								<div class="goods-comment-sale goods-pro">
									<ul class="clearfix">
										<li class="comment-score">
											<p>
												<span class="comment-star"><b style="width:59px;"></b></span>
												<span><b class="num">5</b>分</span>
											</p>
											<p>评价</p>
										</li>
										<li class="sale">
											<p><b class="J_SaleNum num"></b>
											</p>
											<p>销量</p>
										</li>
										<li class="comment-num">
											<p><b class="num">0</b>
											</p>
											<p>累计评价</p>
										</li>
									</ul>
								</div>
							</div>
							<div class="goods-meta goods-pro">
								<dl class="clearfix">
									<dt>优惠：</dt>
									<dd class="clearfix">
										<span class="discount">新品促销★</span>
										<div class="favorable clearfix">
											<span class="info">全店铺满200元减20元</span>
											<span class="more"></span>
											<div class="favorable-list">
												<ul>
													<li><span class="dot">▪</span>全店铺满200元减20元</li>
													<li><span class="dot">▪</span>全店铺满150元减10元</li>
													<li><span class="dot">▪</span>全店铺满100元减5元</li>
												</ul>
												<b></b>
											</div>
										</div>
									</dd>
								</dl>
								<dl class="clearfix">
									<dt>快递：</dt>
									<dd>
										浙江省杭州市 <span class="to">至</span> 全国包邮
									</dd>
								</dl>
								<dl class="clearfix">
									<dt>客服：</dt>
									<dd>
										<div class="mogutalk_widget_btn kefu" data-bid="14epe#23" data-style="default" data-from="goodsdetail_skumtalk">
											<iframe src="/shop/resources/img/a-126.gif" width="85" height="24" frameborder="0" scrolling="no" marginheight="0" allowtransparency="true"></iframe>
										</div>
									</dd>
								</dl>
							</div>
							<div class="goods-sku goods-pro" id="J_GoodsSku">
	<div class="content">
		<div class="pannel-title">
			<b class="J_PannelClose pannel-close">x</b>
		</div>
		<div class="box">
						<dl class="style clearfix" style="display: block;">
				<dt>颜色：</dt>
				<dd>
					<ol class="J_StyleList style-list clearfix">
					<li class="img" data-id="1" data-src="/shop/resources/img/b-40.jpg" title="【独家加厚夹棉款】">
					<img src="/shop/resources/img/b-41.jpg">
					<b>
					</b>
					</li>
					<li class="img disable" data-id="2" data-src="/shop/resources/img/b-40.jpg" title="【常规款】">
					<img src="/shop/resources/img/b-41.jpg">
					<b>
					</b>
					</li>
					</ol>
				</dd>
			</dl>
									<dl class="size clearfix" style="display: block;">
				<dt>尺码：</dt>
				<dd>
					<ol class="J_SizeList size-list clearfix"><li class="" data-id="100" title="S">S</li><li class="" data-id="101" title="M">M</li><li class="" data-id="102" title="L">L</li><li class="" data-id="103" title="XL">XL</li></ol>
				</dd>
			</dl>
						<dl class="clearfix">
				<dt>数量：</dt>
				<dd class="num clearfix">
					<div id="J_GoodsNum" class="goods-num fl" data-stock="584">
						<span class="num-reduce num-disable"></span>
						<input class="num-input" type="text" value="1">
						<span class="num-add"></span>
					</div>
                    <!-- 库存数量 -->
					<div class="J_GoodsStock goods-stock fl">库存584件</div>
                    <input type="hidden" value="=0=0">
                    <!-- 限购状态 -->
                    
                    <!-- 库存提醒 -->
                    <div class="J_GoodsStockTip goods-stock-tip fl">您所填写的商品数量超过库存！</div>
				</dd>
			</dl>
		</div>
	</div>
  
</div>
						 
							<div class="goods-sku goods-pro" id="J_GoodsSku">
								<div class="content">
									<div class="pannel-title">
										<b class="J_PannelClose pannel-close">x</b>
									</div>
									<div class="pannel-action">
										<span class="pannel-tip">请选择你要的商品信息</span>
										<a href="javascript:;" class="J_PannelOK pannel-ok"></a>
									</div>
								</div>
								<div class="goods-buy clearfix">
									<a href="shopping" id="J_BuyNow" class="fl mr20 buy-now buy-btn">立刻购买</a>
									<a href="shopping" id="J_BuyCart" class="fl mr20 buy-cart  buy-btn">加入购物车</a>
									<b class="fl buy-or buy-btn"></b>
									<a href="shopping" id="J_BuyXCHF" class="fl buy-xchf buy-btn" data-id="">先穿后付</a>
								</div>
							</div>
							<div class="goods-social clearfix">
								<div class="fav item" goodsid="127e4a2" tradeitemid="16oc9lc" tid="1lnb4p8"><b></b><span class="fav-num">3</span>
								</div>
								<div class="share item">
									<b></b>分享
									<div class="share-w clearfix">
										<a target="_blank" href="login"
										class="forqzone" title="关注QQ空间"></a>
										<a target="_blank" href="login"
										class="forrenren" title="关注人人"></a>
										<a target="_blank" href="login"
										class="forsina" title="关注sina"></a>
										<a target="_blank" href=" " class="forweixin" title="关注微信"></a>
									</div>
								</div>
								<div class="report"><a target="_blank" href=" " class="goods_report fl">举报</a>
								</div>
							</div>
							<div style="background: url(/shop/resources/img/a-20.png);height: 19px;background-repeat: no-repeat;margin-top: 20px;"></div>
						</div>
					</div>
					<div class="goods-img fl" id="J_GoodsImg">
						<div class="big-img">
							<img id="J_BigImg" src="/shop/resources/img/b-17.jpg" data-main="/shop/resources/img/b-17.jpg" alt="卫衣,加厚,加绒,绒衫,韩版,宽松,套头,长袖,新款,休闲,连帽,学生,中长款,学院风,卡通,韩国,蝙蝠袖,口袋" width="440">
						</div>
					</div>
				</div>
			</div>
			<div id="J_ModuleLook" class="goods-right ex-module">
			</div>
		</div>
		<div class="detail-main" id="J_ModuleDetail">
			<div class="main-nav-wrap">
				<div class="main-nav" id="J_GoodsNav">
					<ul class="list clearfix ">
						<li data-id="J_ModuleDetail" class="c">
							<a href="product">商品详情</a>
						</li>
						<li data-id="J_ModuleComment"><a href="product">买家评价(0)</a>
						</li>
						<li data-id="J_ModuleOrder"><a href="product">90天销量(<span class="J_SaleNum">0</span>)</a>
						</li>
					</ul>
					<div class="tags">
						<a href=" " data-id="anc_size_info">
    							尺码材质</a>
						<b>|</b>
						<a href=" " data-id="anc_model_img">
    							穿着效果</a>
						<b>|</b>
						<a href=" " data-id="anc_baipai_img2">
    							整体款式</a>
						<b>|</b>
						<a href=" " data-id="anc_detail_img">
    							细节做工</a>
						<b>|</b>
					</div>
				</div>
			</div>
			<div class="main-recom detail-module-recom" id="J_ModuleRecom">
			</div>
			<div class="main-top">
				<div class="img-box">
					<div class="item">
						<div class="img">
							<a href="product" target="_blank">
								<img class="img-pre-lazyload" src="/shop/resources/img/a-17.jpg" d-src="" width="1200" height="512">
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="main-size" id="anc_size_info">
				<h1 class="title">尺码材质 size</h1>
				<div class="content">
					<div class="stuff">
						<table>
							<tbody>
								<tr>
									<td>领型：连帽/帽领</td>
									<td>材质：棉</td>
									<td>袖长：长袖</td>
								</tr>
								<tr>
									<td>衣长：中长款（66-80cm）</td>
									<td>版型：宽松</td>
									<td>款式：套头</td>
								</tr>
								<tr>
									<td>厚薄：抓绒</td>
									<td>元素：卡通,涂鸦</td>
							</tbody>
						</table>
					</div>
					<div class="size">
						<table>
							<tbody>
								<tr class="name">
									<td>尺码</td>
									<td>衣长</td>
									<td>袖长</td>
									<td>胸围</td>
								</tr>
								<tr>
									<td>均码【新品特价】</td>
									<td>66-72</td>
									<td>连肩65</td>
									<td>126</td>
								</tr>
							</tbody>
						</table>
						<p class="desc">（测量单位：厘米/CM）——手工测量，误差1-3CM</p>
					</div>
					<div class="img-box">
					</div>
				</div>
			</div>
			<div class="main-show module-item" id="anc_model_img">
				<h1 class="title">水果show</h1>
				<div class="content">
					<div class="desc">
						<p class="start"></p>
						<p class="text">一种小浆果，呈蓝色悦目，色泽美丽，蓝色并被一层白色果粉包裹果肉细腻，营养丰富</p>
						<p class="end"></p>
					</div>
					<div class="img-box">
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="813" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="707" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="821" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="main-look module-item" id="anc_baipai_img2">
				<h1 class="title">整体款式 look</h1>
				<div class="content">
					<div class="img-box">
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="800" height="537" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="800" height="583" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="800" height="544" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="main-detail module-item" id="anc_detail_img">
				<h1 class="title">细节做工 detail</h1>
				<div class="content">
					<div class="img-box">
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="523" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="536" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="529" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="530" />
							</div>
						</div>
						<div class="item">
							<div class="img">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="750" height="529" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="main-bottom">
				<div class="img-box">
					<div class="item">
						<div class="img">
							<a href="product" target="_blank">
								<img class="img-pre-lazyload" src="/shop/resources/img/b-30.jpg" d-src width="880" height="426" />
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="detail-comment" id="J_ModuleComment">
				<h1 class="detail-module-title">买家评价</h1>
				<div class="module-empty">
					还没有买家进行文字或晒图评价哦~
				</div>
			</div>
			<div class="detail-sale" id="J_ModuleOrder">
				<h1 class="detail-module-title">90天销量</h1>
				<div class="module-empty">
					暂时没有人购买
				</div>
			</div>
			<div class="detail-recom detail-module-recom" id="J_ModuleLike">
			</div>
		</div>
	</div>
	<div class="foot J_footertimer" data-svrtime="1413021786">
		<div class="wrap foot_wrap clearfix">
			<div class="foot_info">
				<a class="info_logo" href=" "></a>
				<div class="info_text">
					<p>营业执照注册号：<a href=" " target="_blank">330106000129004</a>
					</p>
					<p>增值电信业务经营许可证：<a href=" " target="_blank">浙B2-20110349</a>
					</p>
					<p>ICP备案号：浙ICP备10044327号-3</p>
					<p class="mgjhostname" title="qihe3077">©2014 Mogujie.com 杭州卷瓜网络有限公司</p>
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
	<div class="back2top_wrap">
		<a href=" " class="ext_module shop_cart" target="_blank"><span class="num">0</span></a>
		<a href=" " class="ext_module mogutalk_btn mogutalk_shop_btn J_msg open_msg micon __trace__" data-from="shopwidget_message" data-trace="global,shopwidget_message,click"><span class="num">0</span></a>
		<a target="_blank" href="feedback" class="ext_module fb_entry">反馈入口</a>
		<a class="ext_module go_top" href="product">回到顶部</a>
	</div>
	<script type="text/javascript" src="/shop/resources/js/module-addfav.js"></script>
	<script type="text/javascript" src="/shop/resources/js/module-shop-header.js"></script>
	<script type="text/javascript" src="/shop/resources/js/page-shop-detail-v2.js"></script>
</body>
</html>