<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>确认订单</title>
		<meta name="keywords" content=" ">
		<meta name="description" content=" ">
		<meta name="copyright" content=" ">
		<meta http-equiv="mobile-agent" content=" ">
		<link rel="search" type="application/opensearchdescription+xml" href=" ">
		<link rel="icon" href=" " type="image/x-icon">
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-base.css" media="all">
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-module.css" media="all">
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-shopnav.css" media="all">
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/module-hide-add-album.css" media="all">
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-generator.css" media="all">
		<script type="text/javascript" async="" src="/shop/resources/js/ga.js"></script>
		<script type="text/javascript" src="/shop/resources/js/jquery-migrate-1.2.1.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-pc-base.js"></script>
</head>
<body class="media_screen_1200">
		<div id="header" class="header_2014">
			<div class="uinfo_wrap clearfix wrap">
				<a href="index" class="back_to_mogujie fl">乐享优果首页</a>
				<ul class="header_top">
					<li class="s1 has_icon user_meta">
						<a href="personalhomepage">
                                紫色天堂1995                            </a>
						<i class="icon_delta"></i>
						<ol class="ext_mode">
							<li class="s2"><a href="personalhomepage" class="site_publish_img">分享照片</a>
							</li>
							<li class="s2"><a href="personalhomepage">个人设置</a>
							</li>
							<li class="s2"><a href="binding">账号绑定</a>
							</li>
							<li class="s2"><a href="login">退出</a>
							</li>
						</ol>
					</li>
					<li class="s1 has_line"><a href="index">关注</a>
					</li>
					<li class="s1"><a href="index">喜欢</a>
					</li>
					<li class="s1 has_icon message_center">
						<a href=" ">消息<span class="m_num">(1)</span></a>
						<i class="icon_delta"></i>
						<ul class="ext_mode login_ext message_oper">
							<li class="s2"> <a href="personalhomepage">对话</a>
							</li>
							<li class="s2"> <a href="personalhomepage">喜欢我的</a>
							</li>
							<li class="s2"> <a href="personalhomepage">我的私信</a>
							</li>
							<li class="s2"> <a href="personalhomepage">系统通知<span>(1)</span></a>
							</li>
							<li class="s2"> <a href="personalhomepage">我的粉丝</a>
							</li>
							<li class="s2 clear_notice"><a href="personalhomepage">我知道了</a>
							</li>
						</ul>
					</li>
					<li class="s1 has_line">
						<a href="order" target="_blank" class="text display_u">我的订单</a>
					</li>
					<li class="s1 has_line has_icon custom_item">
						<a href="customerservice" target="_blank">帮助中心</a>
						<ol class="ext_mode">
							<li class="s2"><a href="customerservice">联系合作</a>
							</li>
						</ol>
					</li>
				</ul>
			</div>
		</div>
		<div id="body_wrap">
			<div class="g-header clearfix">
				<div class="g-header-in wrap clearfix">
					<div class="process-bar">
						<div class="md_process md_process_len4">
							<div class="md_process_wrap md_process_step2_5">
								<div class="md_process_sd"></div>
								<i class="md_process_i md_process_i1">
                1                <span class="md_process_tip">购物车</span>
            </i>
								<i class="md_process_i md_process_i2">
                2                <span class="md_process_tip">确认订单</span>
            </i>
								<i class="md_process_i md_process_i3">
                3                <span class="md_process_tip">支付</span>
            </i>
								<i class="md_process_i md_process_i4">
                                <img src=" " width="23" height="23" alt="">
                                <span class="md_process_tip">完成</span>
            </i>
							</div>
						</div>
					</div>
					<div class="logo logo-generate"></div>
				</div>
			</div>
			<div class="g-wrap wrap">
				<div class="cart_wrap">
					<div class="cart_page_wrap pt0">
						<h2 class="cart_stit">选择收货地址
    </h2>
						<div class="cart_address_wrap" id="cartAddress">
							<ul class="cart_address_list clearfix" style="height:151px;" id="cartAddressList">
								<li data-aid="13976340">
									<a href=" " class="cart_address_card addressCard selected" data-aid="13976340">
										<i class="cart_address_default">默认地址</i>
										<h5 class="cart_address_tit">胡</h5>
										<p class="cart_address_street">来安县新安镇</p>
										<p class="cart_address_zipinfo" data-postcode="239200" data-province="安徽省" data-city="黄山市" data-area="休宁县">
											安徽省黄山市休宁县 239200</p>
										<p class="cart_address_mobile">18855972619</p>
										<i class="cart_address_edit" style="display: block;">编辑</i>
									</a>
								</li>
							</ul>
							<ul class="cart_address_ctrl clearfix" id="addressCtrl">
								<li> <a href=" " class="addOtherAddress">使用其它地址</a>
								</li>
								<li> <a href=" " class="cart_icon_link allAddressSwitch" style="display:none">显示全部地址<i class="cart_icon_quarw">down</i></a>
								</li>
								<li> <a href=" " target="_blank">管理收货地址</a>
								</li>
							</ul>
							<div id="J_otherAddrWrap"></div>
							<div class="xm_wrap" id="J_xm_wrap" style="display: none;">
								<div class="xm_line clearfix">
									<span class="fl mr5"><label for="J_xm_check" class="xm_rtip" hidefocus="true">选择小麦公社免费代收</label></span>
									<span class="xm_fw fl">收货不方便，可使用服务站代收包裹，包裹到达后到服务站自提</span>
									<a href=" " class="xm_qatip mt10 fl" id="J_xmhtip"></a>
								</div>
								<div>
									<ul class="cart_address_list clearfix" id="J_xmaddress"></ul>
								</div>
							</div>
						</div>
						<h2 class="cart_stit pt10">确认商品信息</h2>
						<form action="/trade/generateorder/confirmorder" id="orderForm" method="POST" target="_blank">
							<table class="cart_table" id="orderTable">
								<thead>
									<tr>
										<th class="cart_table_goods_wrap">商品</th>
										<th class="cart_table_goodsinfo_wrap">商品信息</th>
										<th width="80">单价(元)</th>
										<th width="80">数量</th>
										<th class="cart_table_goodscut_wrap">优惠</th>
										<th class="cart_table_goodsctrl_wrap">小计(元)</th>
									</tr>
								</thead>
								<tbody>
									<tr data-shopid="14nji">
										<td colspan="6" class="cart_group_head">
											<label for="" class="cart_lightgray">店铺：</label>
											<a href=" " target="_blank" class="cart_hoverline">oNAirs</a>
											<a href=" " class="cart_im_btn mogutalk_btn" data-bid="14nji#23">联系客服</a>
										</td>
									</tr>
									<tr class="tr_checked item4shop14nji" data-stockid="16oftnq">
										<td class="cart_table_goods_wrap">
											<a href="product" target="_blank" class="cart_goods_img">
												<img class="cartImgTip" src="/shop/resources/img/b-35.jpg" width="78" height="78" alt="衬衫公主裙两件套">
											</a>
											<a href="product" target="_blank" class="cart_goods_t cart_hoverline" title="衬衫公主裙两件套">

                    衬衫公主裙两件套
					                </a>
										</td>
										<td>           -->
											<p class="cart_lh20">颜色：黑色</p>
											<p class="cart_lh20">尺码：L（108-115左右）</p>
										</td>
										<td class="cart_alcenter">
											<p class="cart_bold cart_itemUnit">170.00</p>
										</td>
										<td class="cart_alcenter">
											<p class="cart_itemNum">1</p>
										</td>
										<td class="cart_alcenter cartItemPromo" data-itemindex="0" data-shopindex="0" data-groupid="108539-71068177-8-0">
											<select class="stockpro" name="" id="">
												<option value="309545" selected="selected">7折</option>
												<option value="-1">不使用优惠</option>
											</select> <span class="s_disScreen">省51.00元</span>
											<p class="J_extraPromo"></p>
										</td>
										<td class="cart_alcenter">
											<p class="cart_font16 item_sum itemSum" data-price="119.00">119.00</p>
										</td>
									</tr>
									<tr class="tr_checked">
										<td colspan="3" class="pl10 cart_largepding">
											<label for="">备注：</label>
											<input type="text" class="cart_table_note cart_text cart_vm" name="comment108539-71068177-8-0" id="" def-v="补充填写其他信息，如有快递不到也请留言备注" style="color: rgb(204, 204, 204);">
										</td>
										<td colspan="3" class="pr15 cart_largepding">
											<div class="cart_table_discount pt5 fr">
												<label for="">快递免邮：</label>
												<select name="" class="postage cart_vm" data-shopindex="0" data-groupid="108539-71068177-8-0">
													<option value="zhongtong" selected="selected">中通速递</option>
												</select>
											</div>
										</td>
									</tr>
									<tr class="tr_checked">
										<td colspan="6" class="pl10 pr20 cart_largepding">
											<div class="cart_table_disduce cart_lightgray cart_font16 fr">
												合计：<span class="cart_red cart_bold cart_money shopSum">¥ 119.00</span>
												<input type="hidden" class="shoppro" value="-1" name="">
											</div>
										</td>
									</tr>
									<tr id="J_otherCalcResult" class="discart-otherinfo" style="display: none;">
										<td colspan="6" class="pr20" style="text-align:right;border-bottom: none;"></td>
									</tr>
									<tr class="discart-otherinfo">
										<td colspan="6" class="pr20" style="text-align:right;border-bottom: none;">
											<p class="cart_table_discount cart_fix_fbox fr ">
												<label for="" class="cart_vm">全场优惠：</label>
												<select name="" class="cart_vm" id="cashReduce">
													<option value="-1" selected="selected">不使用优惠</option>
												</select>
												<span class="cart_table_disduce cart_vm" id="cashReduceScreen">-0.00元</span>
											</p>
										</td>
									</tr>
								</tbody>
							</table>
							<input type="hidden" name="addressId" id="addressId" value="13976340">
							<input type="hidden" name="xmStoreId" id="xmStoreId" value="">
							<input type="hidden" name="xmMatched" id="xmMatched" value="">
							<input type="hidden" name="traceid" value="generateorder_1nuslkck9gjk">
							<input type="hidden" name="splitabstract" id="postdata" value="{&quot;number&quot;:1,&quot;proid&quot;:-1,&quot;pronum&quot;:1,&quot;finalprice&quot;:&quot;119.00&quot;,&quot;cutprice&quot;:&quot;0.00&quot;,&quot;totalcutprice&quot;:&quot;51.00&quot;,&quot;proshtml&quot;:&quot;<option value=\&quot;-1\&quot; selected=\&quot;selected\&quot;>\u4e0d\u4f7f\u7528\u4f18\u60e0<\/option>&quot;,&quot;modou&quot;:0,&quot;maxModou&quot;:0,&quot;otherCalcResult&quot;:[],&quot;shoplists&quot;:[{&quot;108539-71068177-8-0&quot;:{&quot;shopid&quot;:108539,&quot;type&quot;:8,&quot;processtype&quot;:0,&quot;sellerid&quot;:71068177,&quot;proid&quot;:-1,&quot;pronum&quot;:1,&quot;finalprice&quot;:&quot;119.00&quot;,&quot;cutprice&quot;:&quot;0.00&quot;,&quot;freight&quot;:&quot;0.00&quot;,&quot;logistics&quot;:&quot;zhongtong&quot;,&quot;stocklists&quot;:[{&quot;stockid&quot;:11335735,&quot;number&quot;:1,&quot;proid&quot;:309545,&quot;pronum&quot;:2,&quot;finalprice&quot;:&quot;119.00&quot;,&quot;cutprice&quot;:&quot;51.00&quot;,&quot;totalprice&quot;:&quot;119.00&quot;,&quot;proshtml&quot;:&quot;<option value=\&quot;309545\&quot; selected=\&quot;selected\&quot;>7\u6298<\/option><option value=\&quot;-1\&quot;>\u4e0d\u4f7f\u7528\u4f18\u60e0<\/option>&quot;,&quot;otherproshtml&quot;:&quot;&quot;,&quot;nowprice&quot;:&quot;119.00&quot;}],&quot;proshtml&quot;:&quot;<option value=\&quot;-1\&quot; selected=\&quot;selected\&quot;>\u4e0d\u4f7f\u7528\u4f18\u60e0<\/option>&quot;}}]}">
							<input type="hidden" name="source" value="">
						</form>
					</div>
				</div>
				<div class="">
					<div class="cart_paybar">
						<a href=" " class="cart_surebtn fr  ">去付款</a>
						<span class="cart_paybar_info_cost cart_red cart_bold cart_font26 cart_money fr goodsSum">¥ 119.00</span>
						<div class="cart_paybar_info cart_pregray fr">
							共有 <span class="cart_red goodsNum">1</span> 件商品，总计(全国免运费)：
						</div>
						<a href=" " class="cart_back cart_hoverline cart_pregray">返回购物车</a>
					</div>
				</div>
			</div>
		</div>
		<div class="g-footer">
			<p title="qihe3075">
				<a href="index" target="_blank">乐享优果</a> |
				<a href="index" target="_blank">加入开放平台</a> © 2014 Mogujie.com,All Rights Reserved.
			</p>
			<div class="icons">
				<a class="vs" href=" "></a>
				<a class="mc" href=" "></a>
				<a class="up" href=" "></a>
				<a class="pa" href=" " target="_blank"></a>
				<a class="kx" href=" " target="_blank"></a>
				<a class="pc" href=" " target="_blank"></a>
			</div>
		</div>
		<script type="text/javascript" src="/shop/resources/js/page-1015walletcge.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-navigation.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-generator.js"></script>
		<img id="mogustat_img" alt="mogustat" style="display:none" height="1" width="1" src=" ">
		<div class="widget_mtip_box mtip_right" style="width: auto; left: 197.5px; top: 526px; z-index: auto; display: none;">
			<div class="widget_mtip_line">
				<div class="cart_imgtip_wrap">
					<img src=" " width="240">
				</div>
			</div><i class="widget_mtip_ang widget_mtip_a" style="display: block; left: 0px; right: auto; top: 42px; bottom: auto;"></i><i class="widget_mtip_shadow widget_mtip_a" style="display: block; left: 0px; right: auto; top: 42px; bottom: auto;"></i><a href="javascript:;"
			class="widget_mtip_close" style="display: none;">×</a>
		</div>
		<div class="widget_mtip_box mtip_bottom" style="width: 288px; left: -70px; top: 30px; z-index: auto; display: none;">
			<div class="widget_mtip_line">小麦公社是大学校区内为学生免费代收包裹的服务站，方便你随时取件，保证包裹安全。</div><i class="widget_mtip_ang widget_mtip_a" style="display: block; top: 0px; bottom: auto; left: 70px; right: auto;"></i><i class="widget_mtip_shadow widget_mtip_a" style="display: block; top: 0px; bottom: auto; left: 70px; right: auto;"></i>
			<a href=" " class="widget_mtip_close" style="display: none;">×</a>
		</div>
</body>
</html>