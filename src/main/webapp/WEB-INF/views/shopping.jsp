<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
		<meta name="renderer" content=" " />
		<meta http-equiv="X-UA-Compatible" content=" " />
		<title>我的购物车</title>
		<meta name="keywords" content=" " />
		<meta name="description" content=" " />
		<meta name="copyright" content=" " />
		<meta http-equiv="mobile-agent" content=" " />
		<link rel="search" type="application/opensearchdescription+xml" href=" " />
		<link rel="icon" href=" " type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-base.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-module.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-shopnav.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/module-hide-add-album.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-cart.css" media="all" />
		<script type="text/javascript" src="/shop/resources/js/jquery-migrate-1.2.1.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-pc-base.js"></script>
</head>
<body>
<div id="header" class="header_2014">
			<div class="uinfo_wrap clearfix wrap">
				<a href=" " class="back_to_mogujie fl">蘑菇街首页</a>
				<ul class="header_top">
					<li class="s1 has_icon user_meta">
						<a href=" ">
                                紫色天堂1995                            </a>
						<i class="icon_delta"></i>
						<ol class="ext_mode">
							<li class="s2"><a href=" " class="site_publish_img">分享照片</a>
							</li>
							<li class="s2"><a href=" ">个人设置</a>
							</li>
							<li class="s2"><a href=" ">账号绑定</a>
							</li>
							<li class="s2"><a href=" ">退出</a>
							</li>
						</ol>
					</li>
					<li class="s1 has_line"><a href=" ">关注</a>
					</li>
					<li class="s1"><a href=" ">喜欢</a>
					</li>
					<li class="s1 has_icon message_center">
						<a href=" ">消息<span class="m_num"></span></a>
						<i class="icon_delta"></i>
					</li>
					<li class="s1 has_line">
						<a href=" " target="_blank" class="text display_u">我的订单</a>
					</li>
					<li class="s1 has_line has_icon custom_item">
						<a href=" " target="_blank">帮助中心</a>
						<ol class="ext_mode">
							<li class="s2"><a href=" ">联系合作</a>
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
							<div class="md_process_wrap md_process_step1_5">
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
					<div class="logo logo-cart"></div>
				</div>
			</div>
			<div class="g-wrap wrap">
				<a href=" " target="_blank" style="position:relative;display:block;height:70px;text-align:center;overflow:hidden;margin-bottom:20px;">
					<img style="position:absolute;left:50%;top:0;margin-left:-600px;" src="/shop/resources/img/b-33.jpg" width="1200" height="70" alt="">
				</a>
				<ul class="clearfix cart_slide pb20" id="cartSlide">
					<li>
						<a href=" " class="mr10 cart_slide_item cartSlideItemAll cart_slide_item_cur">
                    全部商品 (<span class="num">1</span>)
                </a>
					</li>
					<li class="cartslide-line">|</li>
					<li>
						<a href=" " class="mr10 cart_slide_item cartSlideItemCut ">
                    优惠 (<span class="num">1</span>)
                </a>
					</li>
					<li class="cartslide-line">|</li>
					<li>
						<a href=" " class="mr10 cart_slide_item cartSlideItemLess cart_disablepointer">
                    库存紧张 (<span class="num">0</span>)
                </a>
					</li>
				</ul>
				<div class="cart_wrap cart_nobdbtm">
					<div class="cart_page_wrap" id="cartPage">
						<input type="hidden" name="shop_domain" id="shop_domain" value="http://shop.mogujie.com" />
						<input type="hidden" name="data_props" id="data_props" value="{&quot;14nji&quot;:[]}" />
						<table class="cart_table" id="cartOrderTable">
							<thead>
								<tr>
									<th class="cart_table_check_wrap cart_alleft pl10">
										<input type="checkbox" name="s_all" class="s_all tr_checkmr" id="s_all_h" />
										<label for="s_all_h">全选</label>
									</th>
									<th class="cart_table_goods_wrap">商品</th>
									<th class="cart_table_goodsinfo_wrap">商品信息</th>
									<th>单价(元)</th>
									<th class="cart_table_goodsnum_wrap">数量</th>
									<th class="cart_table_goodssum_wrap">小计(元)</th>
									<th class="cart_table_goodsctrl_wrap">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr id="shoptit_14nji" data-bid="14nji">
									<td colspan="7" class="cart_group_head">
										<input type="checkbox" class="s_shopall tr_checkmr" data-bid="14nji" name="s_shopall" />
										<label for="" class="cart_lightgray">店铺：</label>
										<a href=" " target="_blank" class="cart_hoverline">oNAirs</a>
										<a href=" " class="cart_im_btn mr5 mogutalk_btn" data-bid=14nji#23>联系客服</a>
										<span class="cart_tip_red">全店铺满2件减5元</span>
									</td>
								</tr>
								<tr class="cart_mitem " data-cut="true" data-stock="false" data-bid="14nji" data-stockid="11335735" data-timestamp="1414138607">
									<td class="vm">
										<input type="checkbox" class="cart_thcheck" />
									</td>
									<td class="cart_table_goods_wrap">
										<a href=" " target="_blank" class="cart_goods_img">
											<img class="cartImgTip" src="/shop/resources/img/b-35.jpg" width="78" height="78" alt="英伦 女 马丁靴" />
										</a>
										<a href=" " target="_blank" class="cart_goods_t cart_hoverline" title="衬衫公主裙两件套">
                英伦 女 马丁靴                </a>
									</td>
									<td>             -->
										<p class="cart_lh20">颜色：黑色</p>
										<p class="cart_lh20">尺码：L（108-115左右）</p>
									</td>
									<td class="cart_alcenter">
										<p class="cart_lh20 cart_throughline cart_lightgray">170.00</p>
										<p class="cart_lh20 cart_bold cart_data_sprice" data-price="119.00">
											119.00 </p>
										<p> <span class="cart_tip_yellow cart_tip_focuswidth">促销7.0折</span> </p>
									</td>
									<td class="cart_alcenter">
										<div class="cart_num cart_counter" data-stockid="11335735" data-stocknum="99" data-timestamp="1414138607">
											<input type="text" class="cart_num_input cart_bold" maxlength="3" value="1" />
											<span class="cart_num_add"></span>
											<span class="cart_num_reduce"></span>
										</div>
									</td>
									<td class="cart_alcenter">
										<p class="cart_red cart_font16 item_sum" data-unit="119.00" data-price="119.00">
											119.00 </p>
									</td>
									<td class="cart_alcenter">
										<a href="" class="cart_hoverline delete">删除</a>
									</td>
								</tr>
								<tr class="J_mundo m-undo">
									<td colspan="7">
										<div class="m-undo-wrap">成功删除 <span class="J_num">1</span> 件商品，如有误，可<a href="javascript:;" class="J_undo">撤销本次删除</a>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="cart_page_wrap" id="cartEmptyPage" style="display:none;">
						<div class="cart_empty">
							<div class="cart_empty_icon"></div>
							<h5 class="mb20">您的购物车还是空的，赶快去挑选商品吧！</h5>
							<ul class="cart_empty_list">
								<li>去看看大家都喜欢的<a href=" " class="cart_red cart_uline">潮流单品</a>
								</li>
								<li>去看看正在折扣中的优品<a href=" " class="cart_red cart_uline">团购</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="cart_paybar wrap" id="cartPaybar">
					<a href=" " class="cart_paybtn fr cart_paybtn_disable" id="payBtn">去付款</a>

					<span class="cart_paybar_info_cost cart_red cart_bold cart_font26 cart_money fr goodsSum">¥ 0.00</span>
					<div class="cart_paybar_info cart_pregray fr">
						共有 <span class="cart_red goodsNum">0</span> 件商品，总计(全国免运费)：
					</div>
					<div class="cart_paybar_vmbox">
						<input type="checkbox" name="s_all" class="s_all_slave cart_vm" id="s_all_f" />
						<label for="s_all_f" class="mr10">全选</label>
						<a href=" " class="mr10 cart_uline cart_pregray" id="cartRemoveChecked">删除</a>
						<a href=" " class="mr10 cart_uline cart_pregray" id="cartRemoveUnuse">清空失效商品</a>
					</div>
				</div>
				<form action="/trade/generateorder/account" id="postform" method="POST">
					<input type="hidden" name="postdata" id="postdata" />
					<input type="hidden" name="traceid" id="traceid" value="mycart_1nusjk58n0u8" />
					<input type="hidden" name="mtk" value="" />
				</form>
			</div>
		</div>
		<div class="g-footer">
			<p title="qihe3086">
				<a href=" " target="_blank">蘑菇街</a> |
				<a href=" " target="_blank">加入开放平台</a> &copy; 2014 Mogujie.com,All Rights Reserved.
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
		<script type="text/javascript" src="/shop/resources/js/pkg-cart.js"></script>
</body>
</html>