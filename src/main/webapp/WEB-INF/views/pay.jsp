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
		<meta name="copyright" content="mogujie.com" />
		<meta http-equiv="mobile-agent" content=" " />
		<link rel="search" type="application/opensearchdescription+xml" href=" " />
		<link rel="icon" href=" " type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-base.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-module.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-shopnav.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/module-hide-add-album.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/shop/resources/css/pkg-cashier.css" media="all" />
		<script type="text/javascript" src="/shop/resources/js/jquery-migrate-1.2.1.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-pc-base.js"></script>
</head>
<body>
<div id="header" class="header_2014">
			<div class="uinfo_wrap clearfix wrap">
				<a href=" " class="back_to_mogujie fl">蘑菇街首页</a>
				<ul class="header_top">
					<li class="s1 has_icon user_meta">
<<<<<<< HEAD
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
							<div class="md_process_wrap md_process_step3_5">
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
                4               
                                <span class="md_process_tip">完成</span>
            </i>
							</div>
						</div>
					</div>
					<div class="logo logo-cashier"></div>
				</div>
			</div>

			<div class="g-wrap wrap">
				<form action="/trade/mgjpay/confirm" method="post" id="J_cashierForm">
					<input type="hidden" name="pcPay" value="pc">
					<input type="hidden" name="pay_tag" value="" id="J_paytag">
					<input type="hidden" name="payId" id="payId" value="410240140008268338" />
					<input type="hidden" name="jumpUrl" id="jumpUrl" value="" />
					<input type="hidden" id="pcPay" name="pcPay" value="pc" />
					<div class="m-tt">
						<p class="fr">
							<span class="order_n">支付订单号：133541902</span>
							<input type="hidden" name="orderId" value="133541902">
							<span class="order_m">应付金额：</span>
							<b class="order_m_b">¥ 119.00</b>
						</p>
						<h3>订单提交成功，请您尽快付款！</h3>
						<div class="info clearfix">
							<div class="info-sp">
								<div class="use_modou_box clearfix">
									<div class="check_box fl">
										<input type="checkbox" class="use_modou_check" id="use_modou_check" value="">
										<label for="use_modou_check" id="J_modouable">蘑豆抵现<span>（可用0颗）</span>
										</label>
									</div>
									<div class="modou_inputbox fl" style="display: none;">
										<input type="text" class="use_modou_num fl" id="use_modou_num" value="" old-value="0">
										<p class="modou_to_money fl"><span>&nbsp;粒&nbsp;&nbsp;</span>-<span class="modou_youhui">0.00</span>
										</p>
										<div class="modou_use_errortip">
											<p class="fl"></p><i class="fl"></i>
										</div>
									</div>
									<input type="hidden" id="modou_max" value="0" data-fpay="0" data-normal="0">
									<input type="hidden" name="modouMoney" id="sub_modou_num" value="0">
								</div>
							</div>
						</div>
					</div>
					<div class="m-main">
						<div id="J_othPayMethod" class="m-oth-paymethod ">
							<a href=" " class="olink J_openOtherPayMethod">
                    选择其它支付方式
                    <span class="more_tips"></span>
                </a>
							<div class="m-oth-paymethod-bk">
								<div class="m-paytags J_paytags">
									<ul class="clearfix">
										<li paytag="2" class="c">
											银行卡
											<i class="act-2yuan-tag">返利2元</i>
										</li>
										<li paytag="1">
											支付平台
										</li>
									</ul>
								</div>
								<div class="m-paybox J_paybox deposit_box show" data-tag="2">
									<div class="pay_bk">
										<div class="m-fppay">
											<h5 class="paytitle">
                        <span>快捷支付</span>
                        安全可靠，便利快捷
                                                    <i class="act-2yuan-tip">使用快捷支付首单返利2元（200蘑豆）</i>
                                            </h5>
											<ul class="m-banklist J_banklist clearfix  J_BanklistFlist">
												<li class="b b_cur ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_ABC_C" id="deposit_q_abc" value="Q_ABC_D" checked="checked">
													<label for="deposit_q_abc" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_ICBC_C" id="deposit_q_icbc" value="Q_ICBC_D">
													<label for="deposit_q_icbc" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CCB_C" id="deposit_q_ccb" value="Q_CCB_D">
													<label for="deposit_q_ccb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CMB_C" id="deposit_q_cmb" value="Q_CMB_D">
													<label for="deposit_q_cmb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_BOCSH_C" id="deposit_q_bocsh" value="Q_BOCSH_D">
													<label for="deposit_q_bocsh" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_GDB_C" id="deposit_q_gdb" value="Q_GDB_D">
													<label for="deposit_q_gdb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CIB_C" id="deposit_q_cib" value="Q_CIB_D">
													<label for="deposit_q_cib" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_SPDB_C" id="deposit_q_spdb" value="Q_SPDB_D">
													<label for="deposit_q_spdb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CMBC_C" id="deposit_q_cmbc" value="Q_CMBC_D">
													<label for="deposit_q_cmbc" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CNCB_C" id="deposit_q_cncb" value="Q_CNCB_D">
													<label for="deposit_q_cncb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_PAB_C" id="deposit_q_pab" value="Q_PAB_D">
													<label for="deposit_q_pab" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_BOS_C" id="deposit_q_bos" value="Q_BOS_D">
													<label for="deposit_q_bos" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
											</ul>
											<script type="text/template" id="tpl_banklist">
												<ul class="m-banklist {{=it.bankListClass || 'J_banklist'}} clearfix"></ul>
											</script>
											<script type="text/template" id="tpl_banklist_item">
												<li class="b {{=it.selected ? 'b_cur' : '' }}">
													<input type="radio" name="{{=it.formname || 'outPayType'}}" {{=it.credit_value ? 'data-cvalue="' + it.credit_value + '"' : '' }} id="{{=it.k}}" value="{{=it.value}}" {{=it.selected ? 'checked="checked"' : '' }}>
													<label for="{{=it.k}}" class="posr">
														<img src="{{=it.icon}}" alt=""> {{ if (it.showtype) { }}
														<span class="ctype">
                {{=it.showtype}}
            </span> {{ } }}
													</label>
													{{ if (it.recom) { }}
													<b class="l{{=it.recom}}"></b> {{ } }}
												</li>
											</script>
											<script type="text/template" id="tpl_bankPop">
												<div class="m-bankpop">
													{{=it.banklist}}
													<a href=" " class="J_ok okbtn">确 定</a>
												</div>
											</script>
										</div>
										<div class="m-pay">
											<div class="title">
												<span>网上银行：</span> 需跳转银行页面
												<a href=" " class="bankmore J_deposit_more">
                    选择银行
                    <span class="more_tips"></span>
                </a>
											</div>
											<ul class="m-banklist J_banklist clearfix  J_depositBanklist">
												<li class="more_b more_b_hide">
													<a href=" " class="J_more"></a>
													<input type="hidden" class="J_banklist_hidden" name="hiddenbanks" value='{"deposit_abc":{"value":"ABC","icon":"http:\/\/www.mogujie.com\/img\/bank\/0002.jpg","formname":"outPayTypeEx"},"deposit_icbc":{"value":"ICBC_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0001.jpg","formname":"outPayTypeEx"},"deposit_ccb":{"value":"CCB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0004.jpg","formname":"outPayTypeEx"},"deposit_cmb":{"value":"CMB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0005.jpg","formname":"outPayTypeEx"},"deposit_boc":{"value":"BOC_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0003.jpg","formname":"outPayTypeEx"},"deposit_gdb":{"value":"GDB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0007.jpg","formname":"outPayTypeEx"},"deposit_cib":{"value":"CIB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0011.jpg","formname":"outPayTypeEx"},"deposit_spdb":{"value":"SPDB","icon":"http:\/\/www.mogujie.com\/img\/bank\/0006.jpg","formname":"outPayTypeEx"},"deposit_cmbc":{"value":"CMBC_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0010.jpg","formname":"outPayTypeEx"},"deposit_citic":{"value":"CITIC","icon":"http:\/\/www.mogujie.com\/img\/bank\/0009.jpg","formname":"outPayTypeEx"},"deposit_psbc":{"value":"POSTGC","icon":"http:\/\/www.mogujie.com\/img\/bank\/0016.jpg","formname":"outPayTypeEx"},"deposit_bankcomm":{"value":"COMM_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0008.jpg","formname":"outPayTypeEx"},"deposit_ceb":{"value":"CEB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0012.jpg","formname":"outPayTypeEx"},"deposit_pinganbank":{"value":"PAB","icon":"http:\/\/www.mogujie.com\/img\/bank\/0019.jpg","formname":"outPayTypeEx"},"deposit_bjbank":{"value":"BOB","icon":"http:\/\/www.mogujie.com\/img\/bank\/0017.jpg","formname":"outPayTypeEx"}}'>
												</li>
											</ul>
										</div>
									</div>
								</div>
								<div class="m-paybox J_paybox platform_box " data-tag="1">
									<div class="pay_bk">
										<div class="m-pay">
											<ul class="m-banklist J_banklist clearfix  ">
												<li class="b  ">
													<input type="radio" name="outPayType" id="weipay" value="60000">
													<label for="weipay" class="posr">
														<img src=" " alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayType" id="chinapay" value="3">
													<label for="chinapay" class="posr">
														<img src=" " alt="">
													</label>
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="m-ft">
						<div class="pay_e clearfix fr">
							<span class="sp">应付金额：</span>
							<span class="sp bt">¥ <span data-overage="-" data-oldprice="119.00" id="J_oldPrice">119.00</span></span>
						</div>
						<a href=" " class="btn J_Submit">确认并付款</a>
					</div>
				</form>
			</div>
			<script type="text/template" id="tpl_bankcardno">
				<div class="m-pop-bankcardno">
					<input class="txt J_cardNoInput" type="text" maxlength="24" autocomplete="off">
					<p class="not clearfix">
						<span class="bankinfo" style="background:url({{=it.bankImgPath || 'about:blank'}}) center center no-repeat;"></span>
						<span class="notice J_notice"></span>
					</p>
					<p class="sp_ge">
						<a class="link J_otherBank" href="javascript:;">
                选择其它付款方式
                <span class="more_tips"></span>
            </a>
					</p>
					<p>
						<a class="btn J_next" href=" ">下一步</a>
					</p>
				</div>
			</script>
			<a href=" " class="mogutalk_btn m-float-mgimservice" data-bid="14ejg#101" data-from="quickpay"></a>
			<script type="text/tpl" id="validatorDialogTpl">
				<div class="validator-dialog">
					<table>
						<tr>
							<th>手机号码:</th>
							<td class="grey">无</td>
						</tr>
						<tr>
							<th>手机验证码:</th>
							<td>
								<div class="text">
									<input type="text" class="text J-validator-code" value="" maxlength="6" placeholder="验证码" />
									<input type="button" class="btn J-get-validator-code" value="发送验证码" />
									<span class="tips J-validator-tips">验证码填写错误，请重新填写！</span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="2" class="control">
								<input type="submit" class="smt J-send-validator-code" value="确认支付" />
							</td>
						</tr>
					</table>
				</div>
			</script>
		</div>
		<div class="g-footer">
			<p title="qihe6119">
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
=======
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
					<li class="s1 has_line"><a href="personalhomepage">关注</a>
					</li>
					<li class="s1"><a href="personalhomepage">喜欢</a>
					</li>
					<li class="s1 has_icon message_center">
						<a href="personalhomepage">消息<span class="m_num"></span></a>
						<i class="icon_delta"></i>
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
							<div class="md_process_wrap md_process_step3_5">
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
                4               
                                <span class="md_process_tip">完成</span>
            </i>
							</div>
						</div>
					</div>
					<div class="logo logo-cashier"></div>
				</div>
			</div>

			<div class="g-wrap wrap">
				<form action="/trade/mgjpay/confirm" method="post" id="J_cashierForm">
					<input type="hidden" name="pcPay" value="pc">
					<input type="hidden" name="pay_tag" value="" id="J_paytag">
					<input type="hidden" name="payId" id="payId" value="410240140008268338" />
					<input type="hidden" name="jumpUrl" id="jumpUrl" value="" />
					<input type="hidden" id="pcPay" name="pcPay" value="pc" />
					<div class="m-tt">
						<p class="fr">
							<span class="order_n">支付订单号：133541902</span>
							<input type="hidden" name="orderId" value="133541902">
							<span class="order_m">应付金额：</span>
							<b class="order_m_b">¥ 119.00</b>
						</p>
						<h3>订单提交成功，请您尽快付款！</h3>
						<div class="info clearfix">
							<div class="info-sp">
								<div class="use_modou_box clearfix">
									<div class="check_box fl">
										<input type="checkbox" class="use_modou_check" id="use_modou_check" value="">
										<label for="use_modou_check" id="J_modouable">蘑豆抵现<span>（可用0颗）</span>
										</label>
									</div>
									<div class="modou_inputbox fl" style="display: none;">
										<input type="text" class="use_modou_num fl" id="use_modou_num" value="" old-value="0">
										<p class="modou_to_money fl"><span>&nbsp;粒&nbsp;&nbsp;</span>-<span class="modou_youhui">0.00</span>
										</p>
										<div class="modou_use_errortip">
											<p class="fl"></p><i class="fl"></i>
										</div>
									</div>
									<input type="hidden" id="modou_max" value="0" data-fpay="0" data-normal="0">
									<input type="hidden" name="modouMoney" id="sub_modou_num" value="0">
								</div>
							</div>
						</div>
					</div>
					<div class="m-main">
						<div id="J_othPayMethod" class="m-oth-paymethod ">
							<a href=" " class="olink J_openOtherPayMethod">
                    选择其它支付方式
                    <span class="more_tips"></span>
                </a>
							<div class="m-oth-paymethod-bk">
								<div class="m-paytags J_paytags">
									<ul class="clearfix">
										<li paytag="2" class="c">
											银行卡
											<i class="act-2yuan-tag">返利2元</i>
										</li>
										<li paytag="1">
											支付平台
										</li>
									</ul>
								</div>
								<div class="m-paybox J_paybox deposit_box show" data-tag="2">
									<div class="pay_bk">
										<div class="m-fppay">
											<h5 class="paytitle">
                        <span>快捷支付</span>
                        安全可靠，便利快捷
                                                    <i class="act-2yuan-tip">使用快捷支付首单返利2元（200蘑豆）</i>
                                            </h5>
											<ul class="m-banklist J_banklist clearfix  J_BanklistFlist">
												<li class="b b_cur ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_ABC_C" id="deposit_q_abc" value="Q_ABC_D" checked="checked">
													<label for="deposit_q_abc" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_ICBC_C" id="deposit_q_icbc" value="Q_ICBC_D">
													<label for="deposit_q_icbc" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CCB_C" id="deposit_q_ccb" value="Q_CCB_D">
													<label for="deposit_q_ccb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CMB_C" id="deposit_q_cmb" value="Q_CMB_D">
													<label for="deposit_q_cmb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_BOCSH_C" id="deposit_q_bocsh" value="Q_BOCSH_D">
													<label for="deposit_q_bocsh" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_GDB_C" id="deposit_q_gdb" value="Q_GDB_D">
													<label for="deposit_q_gdb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CIB_C" id="deposit_q_cib" value="Q_CIB_D">
													<label for="deposit_q_cib" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_SPDB_C" id="deposit_q_spdb" value="Q_SPDB_D">
													<label for="deposit_q_spdb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CMBC_C" id="deposit_q_cmbc" value="Q_CMBC_D">
													<label for="deposit_q_cmbc" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_CNCB_C" id="deposit_q_cncb" value="Q_CNCB_D">
													<label for="deposit_q_cncb" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_PAB_C" id="deposit_q_pab" value="Q_PAB_D">
													<label for="deposit_q_pab" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayTypeEx" data-cvalue="Q_BOS_C" id="deposit_q_bos" value="Q_BOS_D">
													<label for="deposit_q_bos" class="posr">
														<img src="/shop/resources/img/a-68.jpg" alt="">
													</label>
												</li>
											</ul>
										</div>
										<div class="m-pay">
											<div class="title">
												<span>网上银行：</span> 需跳转银行页面
												<a href=" " class="bankmore J_deposit_more">
                    选择银行
                    <span class="more_tips"></span>
                </a>
											</div>
											<ul class="m-banklist J_banklist clearfix  J_depositBanklist">
												<li class="more_b more_b_hide">
													<a href=" " class="J_more"></a>
													<input type="hidden" class="J_banklist_hidden" name="hiddenbanks" value='{"deposit_abc":{"value":"ABC","icon":"http:\/\/www.mogujie.com\/img\/bank\/0002.jpg","formname":"outPayTypeEx"},"deposit_icbc":{"value":"ICBC_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0001.jpg","formname":"outPayTypeEx"},"deposit_ccb":{"value":"CCB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0004.jpg","formname":"outPayTypeEx"},"deposit_cmb":{"value":"CMB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0005.jpg","formname":"outPayTypeEx"},"deposit_boc":{"value":"BOC_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0003.jpg","formname":"outPayTypeEx"},"deposit_gdb":{"value":"GDB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0007.jpg","formname":"outPayTypeEx"},"deposit_cib":{"value":"CIB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0011.jpg","formname":"outPayTypeEx"},"deposit_spdb":{"value":"SPDB","icon":"http:\/\/www.mogujie.com\/img\/bank\/0006.jpg","formname":"outPayTypeEx"},"deposit_cmbc":{"value":"CMBC_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0010.jpg","formname":"outPayTypeEx"},"deposit_citic":{"value":"CITIC","icon":"http:\/\/www.mogujie.com\/img\/bank\/0009.jpg","formname":"outPayTypeEx"},"deposit_psbc":{"value":"POSTGC","icon":"http:\/\/www.mogujie.com\/img\/bank\/0016.jpg","formname":"outPayTypeEx"},"deposit_bankcomm":{"value":"COMM_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0008.jpg","formname":"outPayTypeEx"},"deposit_ceb":{"value":"CEB_D","icon":"http:\/\/www.mogujie.com\/img\/bank\/0012.jpg","formname":"outPayTypeEx"},"deposit_pinganbank":{"value":"PAB","icon":"http:\/\/www.mogujie.com\/img\/bank\/0019.jpg","formname":"outPayTypeEx"},"deposit_bjbank":{"value":"BOB","icon":"http:\/\/www.mogujie.com\/img\/bank\/0017.jpg","formname":"outPayTypeEx"}}'>
												</li>
											</ul>
										</div>
									</div>
								</div>
								<div class="m-paybox J_paybox platform_box " data-tag="1">
									<div class="pay_bk">
										<div class="m-pay">
											<ul class="m-banklist J_banklist clearfix  ">
												<li class="b  ">
													<input type="radio" name="outPayType" id="weipay" value="60000">
													<label for="weipay" class="posr">
														<img src=" " alt="">
													</label>
												</li>
												<li class="b  ">
													<input type="radio" name="outPayType" id="chinapay" value="3">
													<label for="chinapay" class="posr">
														<img src=" " alt="">
													</label>
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="m-ft">
						<div class="pay_e clearfix fr">
							<span class="sp">应付金额：</span>
							<span class="sp bt">¥ <span data-overage="-" data-oldprice="119.00" id="J_oldPrice">119.00</span></span>
						</div>
						<a href=" " class="btn J_Submit">确认并付款</a>
					</div>
				</form>
			</div>
			<a href=" " class="mogutalk_btn m-float-mgimservice" data-bid="14ejg#101" data-from="quickpay"></a>
		</div>
		<div class="g-footer">
			<p title="qihe6119">
				<a href="index" target="_blank">蘑菇街</a> |
				<a href="customerservice" target="_blank">加入开放平台</a> &copy; 2014 Mogujie.com,All Rights Reserved.
			</p>
			<div class="icons">
				<a class="vs" href="customerservice"></a>
				<a class="mc" href="customerservice"></a>
				<a class="up" href="customerservice"></a>
				<a class="pa" href="customerservice" target="_blank"></a>
				<a class="kx" href="customerservice" target="_blank"></a>
				<a class="pc" href="customerservice" target="_blank"></a>
>>>>>>> refs/remotes/origin/master
			</div>
		</div>
		<script type="text/javascript" src="/shop/resources/js/page-1015walletcge.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-navigation.js"></script>
		<script type="text/javascript" src="/shop/resources/js/pkg-cashier.js"></script>
</body>
</html>
