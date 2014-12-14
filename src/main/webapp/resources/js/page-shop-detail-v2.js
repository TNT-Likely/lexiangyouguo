!function(r){var n=function(r,n){return r<<n|r>>>32-n},t=function(r,n){var t,o,e,u,f;return e=2147483648&r,u=2147483648&n,t=1073741824&r,o=1073741824&n,f=(1073741823&r)+(1073741823&n),t&o?2147483648^f^e^u:t|o?1073741824&f?3221225472^f^e^u:1073741824^f^e^u:f^e^u},o=function(r,n,t){return r&n|~r&t},e=function(r,n,t){return r&t|n&~t},u=function(r,n,t){return r^n^t},f=function(r,n,t){return n^(r|~t)},i=function(r,e,u,f,i,a,c){return r=t(r,t(t(o(e,u,f),i),c)),t(n(r,a),e)},a=function(r,o,u,f,i,a,c){return r=t(r,t(t(e(o,u,f),i),c)),t(n(r,a),o)},c=function(r,o,e,f,i,a,c){return r=t(r,t(t(u(o,e,f),i),c)),t(n(r,a),o)},C=function(r,o,e,u,i,a,c){return r=t(r,t(t(f(o,e,u),i),c)),t(n(r,a),o)},g=function(r){for(var n,t=r.length,o=t+8,e=(o-o%64)/64,u=16*(e+1),f=Array(u-1),i=0,a=0;t>a;)n=(a-a%4)/4,i=8*(a%4),f[n]=f[n]|r.charCodeAt(a)<<i,a++;return n=(a-a%4)/4,i=8*(a%4),f[n]=f[n]|128<<i,f[u-2]=t<<3,f[u-1]=t>>>29,f},h=function(r){var n,t,o="",e="";for(t=0;3>=t;t++)n=255&r>>>8*t,e="0"+n.toString(16),o+=e.substr(e.length-2,2);return o},d=function(r){r=r.replace(/\x0d\x0a/g,"\n");for(var n="",t=0;t<r.length;t++){var o=r.charCodeAt(t);128>o?n+=String.fromCharCode(o):o>127&&2048>o?(n+=String.fromCharCode(192|o>>6),n+=String.fromCharCode(128|63&o)):(n+=String.fromCharCode(224|o>>12),n+=String.fromCharCode(128|63&o>>6),n+=String.fromCharCode(128|63&o))}return n};r.extend({md5:function(r){var n,o,e,u,f,v,m,S,l,A=Array(),s=7,x=12,y=17,b=22,j=5,p=9,w=14,L=20,Q=4,k=11,q=16,z=23,B=6,D=10,E=15,F=21;for(r=d(r),A=g(r),v=1732584193,m=4023233417,S=2562383102,l=271733878,n=0;n<A.length;n+=16)o=v,e=m,u=S,f=l,v=i(v,m,S,l,A[n+0],s,3614090360),l=i(l,v,m,S,A[n+1],x,3905402710),S=i(S,l,v,m,A[n+2],y,606105819),m=i(m,S,l,v,A[n+3],b,3250441966),v=i(v,m,S,l,A[n+4],s,4118548399),l=i(l,v,m,S,A[n+5],x,1200080426),S=i(S,l,v,m,A[n+6],y,2821735955),m=i(m,S,l,v,A[n+7],b,4249261313),v=i(v,m,S,l,A[n+8],s,1770035416),l=i(l,v,m,S,A[n+9],x,2336552879),S=i(S,l,v,m,A[n+10],y,4294925233),m=i(m,S,l,v,A[n+11],b,2304563134),v=i(v,m,S,l,A[n+12],s,1804603682),l=i(l,v,m,S,A[n+13],x,4254626195),S=i(S,l,v,m,A[n+14],y,2792965006),m=i(m,S,l,v,A[n+15],b,1236535329),v=a(v,m,S,l,A[n+1],j,4129170786),l=a(l,v,m,S,A[n+6],p,3225465664),S=a(S,l,v,m,A[n+11],w,643717713),m=a(m,S,l,v,A[n+0],L,3921069994),v=a(v,m,S,l,A[n+5],j,3593408605),l=a(l,v,m,S,A[n+10],p,38016083),S=a(S,l,v,m,A[n+15],w,3634488961),m=a(m,S,l,v,A[n+4],L,3889429448),v=a(v,m,S,l,A[n+9],j,568446438),l=a(l,v,m,S,A[n+14],p,3275163606),S=a(S,l,v,m,A[n+3],w,4107603335),m=a(m,S,l,v,A[n+8],L,1163531501),v=a(v,m,S,l,A[n+13],j,2850285829),l=a(l,v,m,S,A[n+2],p,4243563512),S=a(S,l,v,m,A[n+7],w,1735328473),m=a(m,S,l,v,A[n+12],L,2368359562),v=c(v,m,S,l,A[n+5],Q,4294588738),l=c(l,v,m,S,A[n+8],k,2272392833),S=c(S,l,v,m,A[n+11],q,1839030562),m=c(m,S,l,v,A[n+14],z,4259657740),v=c(v,m,S,l,A[n+1],Q,2763975236),l=c(l,v,m,S,A[n+4],k,1272893353),S=c(S,l,v,m,A[n+7],q,4139469664),m=c(m,S,l,v,A[n+10],z,3200236656),v=c(v,m,S,l,A[n+13],Q,681279174),l=c(l,v,m,S,A[n+0],k,3936430074),S=c(S,l,v,m,A[n+3],q,3572445317),m=c(m,S,l,v,A[n+6],z,76029189),v=c(v,m,S,l,A[n+9],Q,3654602809),l=c(l,v,m,S,A[n+12],k,3873151461),S=c(S,l,v,m,A[n+15],q,530742520),m=c(m,S,l,v,A[n+2],z,3299628645),v=C(v,m,S,l,A[n+0],B,4096336452),l=C(l,v,m,S,A[n+7],D,1126891415),S=C(S,l,v,m,A[n+14],E,2878612391),m=C(m,S,l,v,A[n+5],F,4237533241),v=C(v,m,S,l,A[n+12],B,1700485571),l=C(l,v,m,S,A[n+3],D,2399980690),S=C(S,l,v,m,A[n+10],E,4293915773),m=C(m,S,l,v,A[n+1],F,2240044497),v=C(v,m,S,l,A[n+8],B,1873313359),l=C(l,v,m,S,A[n+15],D,4264355552),S=C(S,l,v,m,A[n+6],E,2734768916),m=C(m,S,l,v,A[n+13],F,1309151649),v=C(v,m,S,l,A[n+4],B,4149444226),l=C(l,v,m,S,A[n+11],D,3174756917),S=C(S,l,v,m,A[n+2],E,718787259),m=C(m,S,l,v,A[n+9],F,3951481745),v=t(v,o),m=t(m,e),S=t(S,u),l=t(l,f);var G=h(v)+h(m)+h(S)+h(l);return G.toLowerCase()}})}(jQuery);!function(e){var t={},i="lb_login";MOGU.user_handsome_login_init=function(){function o(){var e={title:"登录蘑菇街",lightBoxId:i,contentHtml:a,scroll:!0};t=new MGLightBox(e),t.init()}var a=['<div class="login_box clearfix">','<p class="error_tip">请输入密码！</p>','<div class="lg_form">','<ul class="mod_box lo_mod_box" data-isshow="0">','<li class="login_title">','<a class="fr eb_mod" href="javascript:;">手机动态密码登录</a>',"<b>普通登录</b>","</li>",'<li class="lg_item lg_name">','<b class="lg_icon"></b>','<input type="text" maxlength="32" class="text r3" name="uname" def-v="手机/邮箱/昵称" value="手机/邮箱/昵称" style="border-color: rgb(207, 207, 207); color:#ccc;">',"</li>",'<li class="lg_item u_passwd">','<b class="lg_icon"></b>','<input type="password" name="pass" class="text">',"</li>","</ul>",'<ul class="mod_box eb_mod_box" data-isshow="0">','<li class="login_title">','<a class="fr lo_mod" href="javascript:;">普通登录</a>',"<b>手机动态密码登录</b>","</li>",'<li class="lg_item lg_name">','<b class="lg_icon"></b>','<input type="text" maxlength="32" class="text r3" name="uname" def-v="手机" value="手机" style="border-color: rgb(207, 207, 207); color:#ccc;">',"</li>",'<li class="lg_item lg_code">','<b class="lg_icon"></b>','<input type="text" maxlength="32" class="text r3" name="telcode" def-v="动态密码" value="动态密码" style="border-color: rgb(207, 207, 207); color:#ccc;">',"</li>",'<li class="lg_chk"></li>','<li class="lg_item lg_getcode">','<a href="javascript:;" class="get_tel_code" id="get_tel_code" send-method="nologin" tel-input-id="uname" ready-text="获取手机动态密码" wait-text="重新获取动态密码">获取手机动态密码</a>',"</li>","</ul>",'<div class="lg_remember"><input type="checkbox" name="remember" class="checkbox" checked=""> 记住我（两周免登录）</div>','<div class="lg_login">','<input type="button" value="" class="sub">','<input type="hidden" value="" id="imgcheckvalue">','<a class="ml10" href="http://www.mogujie.com/usersecurity/findpwd" target="_blank">忘记密码？</a>','<a href="http://www.mogujie.com/register/">新用户注册</a>',"</div>","</div>",'<div class="login_other">',"<span>其他登录方式</span>",'<a href="http://www.mogujie.com/oauth/login/qq/mogujie" class="login_qq"></a>','<a href="http://www.mogujie.com/oauth/login/sina/mogujie" class="login_wb"></a>','<a href="http://www.mogujie.com/oauth/login/weixin/mogujie" class="login_wx"></a>',"</div>","</div>"].join("");!function(){e(".light_box").remove(),o()}()},MOGU.user_handsome_login=function(o,a){function s(t){t.on("blur",'.lg_name input[name="uname"]',function(){var i,o=e(this),a=MGTOOL.trim(o.val());return""==a||a==o.attr("def-v")?!1:a==o.attr("data-lastname")?!1:(n.UI.hideError(t),i=t.find(".lg_form").hasClass("easy_buy")?2:1,1==i&&/^1\d{10,10}$/.test(a)?n.UI.ajaxPost({uname:o.val()},"/mlogin/canloginbycode",function(e){1001==e.status.code&&1==e.result?(o.val(o.attr("def-v")).css("color","#ccc"),t.find(".eb_mod_box input[name=uname]").val(a).css("color","#000"),n.UI.turnLoginMod(t,2),t.find(".eb_mod_box input[name=uname]").trigger("blur")):(n.CHECK.checkCodeIsShow(t,o,i),o.attr("data-lastname",o.val()))}):(n.CHECK.checkCodeIsShow(t,o,i),o.attr("data-lastname",o.val())),void 0)}).on("focus",".lg_item input",function(){n.UI.hideError(t)}).on("click",".imgcheck_image_div,#imgcheck_code_change",function(){n.UI.hideError(t)}).on("click",".login_title a",function(){var i,o=e(this);return o.hasClass("tab_on")?!1:(n.UI.hideError(t),i=o.hasClass("lo_mod")?1:2,n.UI.turnLoginMod(t,i),void 0)}).on("click","#get_tel_code",function(){var i=e(this),o=60,a=t.find(".eb_mod_box input[name='uname']").val();if(!e("#get_tel_code:visible").length||i.hasClass("downing"))return!1;if(!/^1\d{10,10}$/.test(a))return n.UI.showError(t,"请输入正确的手机号码"),!1;if(e(".imgcheck_code_img_div:visible").length&&!n.CHECK.isImgcodeCheck(t))return!1;i.addClass("downing").html("正在发送……");var s={uname:a,check:e("#imgcheckvalue").val()};n.UI.ajaxPost(s,"/mlogin/getcode",function(e){if(1001===e.status.code?(i.addClass("downing").html("重新发送(60)"),n.UI.countDownStart(i,o)):i.removeClass("downing").html("获取手机动态密码"),2==e.result){t.find(".eb_mod_box").attr("data-isshow","1");var a='<div id="lg_chk" class="lg_chk"></div>',s=t.find(".lg_remember");n.CHECK.GetImgCheck(a,"#lg_chk",s,t)}e.status.msg&&n.UI.showError(t,e.status.msg)})}).on("click",".lg_login .sub",function(e){e.preventDefault();var i;i=t.find(".lg_form").hasClass("easy_buy")?2:1,n.UI.submitNowForm(t,i)})}var n=this;n.UI={ajaxPost:function(t,i,o){e.ajax({url:i,type:"POST",dataType:"json",data:t,success:function(e){o(e)}})},submitNowForm:function(i,o){var s,l,c=this;if("visible"==i.find(".error_tip").css("visibility"))return!1;var r=i.find(".lg_remember :checkbox").prop("checked");if(2==o){var d=i.find(".eb_mod_box"),u=d.find("input[name=uname]"),m=d.find("input[name='telcode']");if(MGTOOL.trim(u.val())==u.attr("def-v"))return c.showError(i,"请输入"+u.attr("def-v")),!1;if(MGTOOL.trim(m.val())==m.attr("def-v"))return c.showError(i,"请输入"+m.attr("def-v")),!1;s={uname:u.val(),code:m.val(),from:2,remember:r},l="/mlogin/loginbycode"}else{var d=i.find(".lo_mod_box"),u=d.find("input[name=uname]"),g=d.find("input[name=pass]").val();if(MGTOOL.trim(u.val())==u.attr("def-v"))return c.showError(i,"请输入"+u.attr("def-v")),!1;if(""==MGTOOL.trim(g))return c.showError(i,"请输入登录密码"),!1;if(e(".imgcheck_code_img_div:visible").length&&!n.CHECK.isImgcodeCheck(i))return!1;s={uname:u.val(),password:e.md5(g),check:e("#imgcheckvalue").val(),from:2,remember:r},l="/mlogin/login"}var h=function(e){if(1001==e.status.code)MOGUPROFILE.userid=e.result.uid,t.success_close("登录成功！",200),a.callback&&a.callback(e.result.data);else{if(2==e.result){i.find(".mod_box").eq(o-1).attr("data-isshow","1");var s='<div id="lg_chk" class="lg_chk"></div>',l=i.find(".lg_remember");n.CHECK.GetImgCheck(s,"#lg_chk",l,i)}c.showError(i,e.status.msg)}};c.ajaxPost(s,l,h)},showError:function(e,t){t&&e.find(".error_tip").html(t).css("visibility","visible")},hideError:function(e){"visible"==e.find(".error_tip").css("visibility")&&e.find(".error_tip").css("visibility","hidden")},turnLoginMod:function(e,t){var i=e.find(".lg_form");1==t?(i.find(".mod_box").hide().eq(0).show(),i.removeClass("easy_buy")):2==t&&(i.find(".mod_box").hide().eq(1).show(),i.addClass("easy_buy")),1==i.find(".mod_box:visible").attr("data-isshow")?i.find(".lg_chk").show():i.find(".lg_chk").hide()},countDownStart:function(e,t){var i=this;i.timer="";var o=function(e,t){i.timer&&clearTimeout(i.timer),i.timer=setTimeout(function(){0>=t?e.html("重新发送").removeClass("downing"):(t--,e.html("重新发送("+t+")"),o(e,t))},"1000")};o(e,t)}},n.CHECK={FixIe6Bug:function(){e.browser.msie&&"6.0"==e.browser.version&&document.execCommand("BackgroundImageCache",!1,!0)},checkCodeIsShow:function(e,t,i){var o=function(t){if(1001==t.status.code)if(1==t.result)e.find(".mod_box").eq(i-1).attr("data-isshow","0");else if(2==t.result){e.find(".mod_box").eq(i-1).attr("data-isshow","1");var o='<div id="lg_chk" class="lg_chk"></div>',a=e.find(".lg_remember");n.CHECK.GetImgCheck(o,"#lg_chk",a,e)}else 3==t.result&&n.UI.showError(e,t.status.msg)};n.UI.ajaxPost({uname:t.val(),type:i},"/mlogin/getvalidatelevel",o)},GetImgCheck:function(t,i,o,a){return e(i).length>0?(a.find(".lg_chk").show(),e("#imgcheck_code_change").trigger("click"),!1):(o.before(t),n.UI.ajaxPost("","/pcaptcha/getview/nlogin",function(t){if(1001==t.status.code){var o=t.result.captcha;setTimeout(function(){e(i).html(o).css("opacity",0).animate({opacity:1},1e3),e(".lg_chk").show(),MOGU.imgCaptchaInit()},0)}else e(i).remove()}),void 0)},RemoveImgCheck:function(){e("#lg_chk").remove()},isImgcodeCheck:function(t){var i=!0;if(MOGU.imgCodeCheck()){var o=[];e(".img_code_spin").each(function(t,i){var a=e(i).val();o.push(a)}),e("#imgcheckvalue").val(o.join(","))}else n.UI.showError(t,"请先点击图片旋转到正确方向"),i=!1;return i}},function(){MOGU.Globe_Bind_Keybord_Submit("",e("#"+i+" .login_btn"),"not_need_focus"),n.CHECK.FixIe6Bug();var t=e("#lb_login");s(t),MOGU.Globe_Input_Text_Hide(t.find("input[type=text]"))}()},MOGU.User_Other_login=function(){var t=e("#show_more_login");t.size()>0&&e(".more_login").hover(function(){e(this).addClass("more_login_active");var i=e(this).offset().top+25,o=e(this).offset().left-90;t.css({top:i,left:o}).show()},function(){var i=e(this),o=setTimeout(function(){t.hide()},1e3);t.hover(function(){clearTimeout(o)},function(){i.removeClass("more_login_active"),t.hide()})})},MOGU.Globe_Checkcode_Change=function(){0!=e("#checkcode_change").size()&&e("#checkcode_change").click(function(){e.ajax({url:"/users/recaptcha",type:"POST",timeout:6e4,data:"{}",dataType:"json",success:function(t){if(null==t)alert(MGLANG.msgTimeout);else{var i=t.status.code,o=t.status.msg;if(1001==i){var a=t.result.data.captchaId,s=t.result.data.captchaSrc;e("#img_checkcode").attr("src",s),e("#captcha-id").val(a)}else alert(o)}},error:function(e,t){"timeout"==t&&alert(MGLANG.msgTimeout)}})})},jQuery(document).ready(function(){MOGU.User_Other_login()})}(jQuery);(function(e){MOGU.Trade={};(function(){var d=MOGU.Trade;d.Warning=function(b,a){a?alert(b):e.browser.msie||console.log(b)};d.nologin=function(b){MOGU.user_handsome_login_init();MOGU.user_handsome_login(!1,{callback:b})};d.fixPrice=function(b){jQuery.isNumeric(b)||(b=parseFloat(b,10));return b=Math.round(b*100)};d.getDiscount=function(b,a){jQuery.isNumeric(b)||(b=parseFloat(b,10)||0);jQuery.isNumeric(a)||(a=parseFloat(a,10)||0);if(b==0)return 0;return Math.round(b/a*100)/10};d.fixTwoPlace=function(b){b+=
"";var a=b.indexOf("."),c=b.length;a==-1?b+=".00":a===c-2&&(b+="0");return b}})();(function(){MOGU.Trade.subObject=e({});MOGU.Trade.subscribe=function(){MOGU.Trade.subObject.on.apply(MOGU.Trade.subObject,arguments)};MOGU.Trade.unsubscribe=function(){MOGU.Trade.subObject.off.apply(MOGU.Trade.subObject,arguments)};MOGU.Trade.publish=function(){MOGU.Trade.subObject.trigger.apply(MOGU.Trade.subObject,arguments)}})();(function(){var d=MOGU.Trade,b={separator:"&",operator:"=",defaultkey:"scrollto"};d.analyticUrl=
function(a){a=a||{};this.options=e.extend({},b,a||{})};d.analyticUrl.prototype={Init:function(){var a=this.options,c=this.getArgument();e.isPlainObject(c)&&c[a.defaultkey]&&c[a.defaultkey].length>0&&this.goTo(c[a.defaultkey]);return this.Argument=c},getArgument:function(){var a=this.options,c=window.location.href.split("#")[1]||0;if(c===0||c.length==0)return"";c=c.split(a.separator);if(c.length===1&&c[0].indexOf(a.operator)==-1)return c[0];return this._getObject(c)},_getObject:function(a){var c=this.options,
b={};e(a).each(function(a,e){var d=e.split(c.operator);b[d[0]||"notdefiend"]=d[1]||""});return b},setArgument:function(a,c){var b=this.options,d=this.Argument||this.getArgument();e.isPlainObject(d)?d[a]=c:typeof d=="string"?(_obj={},_obj[b.defaultkey]=d,_obj[a]=c,d=_obj):d===0&&(_obj={},_obj[a]=c,d=_obj);this._reSetUrl(d)},removeArgument:function(a){var c=this.Argument||this.getArgument();e.isPlainObject(c)?delete c[a]:typeof c=="string"&&c.replace(a,"");this._reSetUrl(c)},_reSetUrl:function(a){var c=
this.options,b=[];for(key in a)b.push(key+c.operator+a[key]);window.location.href=window.location.href.split("#")[0]+"#"+b.join(c.separator)},goTo:function(a,b,d){d=d||0;a=e((b||"#")+a).offset().top||0;a>0&&e(window).scrollTop(a+d)}}})()})(jQuery);
(function(c){var d=MOGU.Trade;d.stockWidget=function(a,b){b=b||{};this.options=c.extend({},{},b||{});this.container=a;this.init()};d.stockWidget.prototype={init:function(){this.getSoure();this.bindEvent()},getSoure:function(){this.input=this.container.find("input");this.up=this.container.find(".add");this.down=this.container.find(".reduce");this.nownum=parseInt(this.input.val())},bindEvent:function(){var a=this;a.input.blur(function(){a.removeError();var b=c(this).val(),e=a.checkNum(b),d=!0;e==0||
e==2?(a.nownum=1,a.input.val(1),a.down.addClass("disable"),c("body").trigger("numchange",{el:a.container,num:a.nownum})):(a.nownum===b&&(d=!1),a.nownum=b);e>2&&d&&c("body").trigger("numchange",{el:a.container,num:a.nownum})});a.up.click(function(){if(c(this).hasClass("disable"))return!1;a.removeError();a.nownum++;a.input.val(a.nownum);a.checkNum(a.nownum)>1&&c("body").trigger("numchange",{el:a.container,num:a.nownum})});a.down.click(function(){if(c(this).hasClass("disable")||a.nownum<=1)return!1;
a.removeError();a.nownum--;a.input.val(a.nownum);a.checkNum(a.nownum)>1&&c("body").trigger("numchange",{el:a.container,num:a.nownum})})},checkNum:function(a){if(parseInt(a)!=a||a<=0)return 0;a=parseInt(a);return a>this.total?(this.showError("\u5e93\u5b58\u4e0d\u8db3"),this.up.addClass("disable"),1):a==1?(this.down.addClass("disable"),2):(a==this.total&&this.up.addClass("disable"),3)},checkPass:function(){var a=this.input.val(),b=this.checkNum(a);b==0||b==2?(this.nownum=1,this.input.val(1),this.down.addClass("disable")):
(this.nownum===a&&(istrigger=!1),this.nownum=a)},showError:function(a){var b=this.container.find(".error"),c='<span class="error">[text]</span>'.replace("[text]",a);b.length==0?this.container.append(c):b.html(a)},removeError:function(){this.container.find(".error").remove();this.down.removeClass("disable");this.up.removeClass("disable")}}})(jQuery);
var MOGU=MOGU||{};!function(a,b,c,d){function e(a,e,f){this.stamp=+new Date+Math.random()>>>0,this.imgArr=[],this.$els=a,this.settings={preHeight:d.innerHeight||c.documentElement.clientHeight,fade:!0},e&&"object"==typeof e&&(this.settings=b.extend({},this.settings,e)),this.callback=e&&"function"==typeof e?e:f&&"function"==typeof f?f:null,this._filterItems()}var f={cls:"img-lazyload",dsrc:"d-src"};e.prototype._getTargetY=function(a){var b=a.offsetTop;if(a.offsetParent){a=a.offsetParent;do b+=a.offsetTop,a=a.offsetParent;while(a)}return b},e.prototype._filterImgs=function(){var a,c,d=this.callback,e=d?!0:!1;c=f.dsrc,a=this.$els.filter("img").filter("["+c+"]"),a.each(b.proxy(function(a,f){var g=b(f),h=this,i=g.attr(c);i&&(h.settings.fade&&g.css("opacity",0),f.onload=function(){h.settings.fade?b(this).animate({opacity:1},300,function(){e&&d(g)}):e&&d(g)},this.imgArr.push(f),g.targetY=this._getTargetY(g[0]))},this))},e.prototype._filterItems=function(){this._filterImgs()},e.prototype._checkBounding=function(a){var b,e,f,g;return b=c.body.scrollTop||c.documentElement.scrollTop||d.pageYOffset||0,e=d.innerHeight||c.documentElement.clientHeight,g=this.settings.preHeight,f=a.targetY?a.targetY:this._getTargetY(a[0]),Math.abs(f-b)<e+g?!0:!1},e.prototype.throttle=function(a,b,c){var d,e=null;return function(){var f=this,g=arguments,h=+new Date;clearTimeout(e),d||(d=h),h-d>=c?(a.apply(f,g),d=h):e=setTimeout(function(){a.apply(f,g)},b)}},a.lazyload=function(a,c,g){var h=new e(b(a),c,g);b(d).on("scroll.lz"+h.stamp+" resize.lz"+h.stamp,h.throttle(function(){var a,c,e;for(h.imgArr.length<=0&&(b(d).off("scroll.lz"+h.stamp),b(d).off("resize.lz"+h.stamp)),a=0,c=h.imgArr.length;c>a;)if(h.imgArr[a]){e=h.imgArr[a];var g=b(e);h._checkBounding(g)?(g.attr("src",g.attr(f.dsrc)).attr(f.dsrc,""),h.imgArr.splice(a,1),c--):a++}},100,500)).trigger("scroll.lz"+h.stamp)},b(c).ready(function(){a.lazyload("."+f.cls)})}(MOGU,jQuery,document,window);!function(){function e(e){{var o=null;$("#shopbaseurl").val()}e.on("mouseenter",".topNav .all",function(){e.find(".slideer").fadeIn(100)}).on("mouseleave",".topNav li.all",function(){clearTimeout(o),o=setTimeout(function(){e.find(".slideer").hide()},100)}),e.on("mouseenter",".category_list",function(){clearTimeout(o),e.find(".slideer").show()}).on("mouseleave",".category_list",function(){clearTimeout(o),o=setTimeout(function(){e.find(".slideer").hide()},100)})}e($(".mod_topNav"))}(window);!function(a){function b(b){if(!(a(".active_link_box").length>0)){var c=['<a class="active_link_box mt10" target="_blank" href="'+b.imgUrl+'">','<img src="'+b.imgPath+'">',"</a>"].join("");a(".link_entry_detail").html(c)}}if(""!=MOGUPROFILE.userid&&null!=window.store){var c="active_newer_detailbar_disabled",d=new Date,e=MGTOOL.dataFormat(d,"yyyyMMdd");null!=window.store.get(c)&&window.store.get(c)>=e||a.ajax({url:"/bar/detailbar",type:"POST",timeout:25e3,dataType:"json",success:function(a){if(null==a||""==a)window.store.set(c,e);else{var d=a.status.code,f=a.result;1001==d?b(f):window.store.set(c,e)}}})}}(jQuery);(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({"/Users/rufeng/www/shop-detail/api/sku.js":[function(require,module,exports){
/**
 * 依赖于后端输出在页面上的detaiInfo数据源
 */

// sku数据源（后端数据）
var skuData;

// 收集可用数据
var data = {};

/**
 * 设置sku数据源
 */
module.exports.setData = function(data){

    if(!isData(data)){
        return;
    }

    skuData = data;
}

/**
 * 获取总库存
 * @return {Number} 总库存
 */
module.exports.getTotalStock = function(){
    if(!data.totalStock){
        return;
    }
    return data.totalStock;
}

/**
 * 获取颜色集合长度
 * @return {Number} 集合长度
 */
module.exports.getStyleLen = function(){
    return data.styleLen ? data.styleLen : 0;
}

/**
 * 获取尺码集合长度
 * @return {Number} 集合长度
 */
module.exports.getSizeLen = function(){
    return data.sizeLen ? data.sizeLen : 0;
}

/**
 * 根据筛选条件获取sku属性 
 * @param  {Object} filter 筛选条件
 * @param  {Object} skuItems 改良后的sku数据
 * var filter = {
 *      styleId: 2, [颜色]
 *      sizeId:102, [尺码]
 * }
 * @return {Object}       筛选出来的sku属性
 */
module.exports.getSkuItem = function(filter, skuItems){

    if(!filter && !skuItems){
        return;
    }

    var skuItem = {};

    // 如果选中颜色和尺码    
    if(filter.styleId && filter.sizeId){

        // 如果选中的sku类型是颜色
        if(filter.type == 'style'){
            skuItem = {
                price: skuItems.style[filter.styleId].price[filter.sizeId],
                nowprice: skuItems.style[filter.styleId].nowprice[filter.sizeId],
                style: skuItems.style[filter.styleId].style,
                image: skuItems.style[filter.styleId].image,
                stock: skuItems.style[filter.styleId].stocks[filter.sizeId],
                stocks: skuItems.style[filter.styleId].stocks,
                size: skuItems.style[filter.styleId].sizeVals[filter.sizeId],
                id: skuItems.style[filter.styleId].id[filter.sizeId]
            };
        }else{
            skuItem = {
                price: skuItems.size[filter.sizeId].price[filter.styleId],
                nowprice: skuItems.size[filter.sizeId].nowprice[filter.styleId],
                size: skuItems.size[filter.sizeId].size,
                stock: skuItems.size[filter.sizeId].stocks[filter.styleId],
                stocks: skuItems.size[filter.sizeId].stocks,
                style: skuItems.size[filter.sizeId].styleVals[filter.styleId],
                id: skuItems.size[filter.sizeId].id[filter.styleId]
            };
        }
       
    // 如果只选中了颜色
    }else if(filter.styleId){
        skuItem = skuItems.style[filter.styleId];

    // 如果只选中了尺码
    }else if(filter.sizeId){
        skuItem = skuItems.size[filter.sizeId];
    }

    return skuItem || {};

}


/**
 * 根据后端数据改良sku数据
 * @return {Object} skuItems
 */
module.exports.getSkuItems = function(){
    
    // 获取解析后的sku数据
    var _skuItems = parseSkuItems();

    if(typeof _skuItems == 'undefined' || !_skuItems){
        return;
    }

    var 
        // sku属性列表
        skuAttrs = skuData.attribute,

        styleIds = _skuItems.styleIds,

        sizeIds = _skuItems.sizeIds,

        styleLen = styleIds.length,

        sizeLen = sizeIds.length,

        skuItems = {
            style: {},
            size: {}
        };

    // 如果有颜色
    if(styleLen > 0){

        // 如果有尺码
        if(sizeLen > 0){

            // 遍历颜色，收集每个颜色对应尺码的sku数据
            for(var i = 0, len = styleLen; i < len; i++){
                skuItems.style[styleIds[i]] = {};
                skuItems.style[styleIds[i]]['id'] = {};
                skuItems.style[styleIds[i]]['stocks'] = {};
                skuItems.style[styleIds[i]]['sizeVals'] = {};
                skuItems.style[styleIds[i]]['nowprice'] ={};
                skuItems.style[styleIds[i]]['price'] ={};

                // 库存为0的计数器
                var count = 0;

                // 收集当前颜色下对应的所有尺码数据
                for(var j = i * sizeLen, slen = (i + 1) * sizeLen; j < slen; j++){
                    skuItems.style[styleIds[i]]['id'][skuAttrs[j].sizeId] = skuAttrs[j].id;
                    skuItems.style[styleIds[i]]['stocks'][skuAttrs[j].sizeId] = skuAttrs[j].stock;
                    skuItems.style[styleIds[i]]['sizeVals'][skuAttrs[j].sizeId] = skuAttrs[j].size;
                    skuItems.style[styleIds[i]]['nowprice'][skuAttrs[j].sizeId] = skuAttrs[j].nowprice;
                    skuItems.style[styleIds[i]]['price'][skuAttrs[j].sizeId] = skuAttrs[j].price;
                    skuItems.style[styleIds[i]]['image'] = skuAttrs[j].image;
                    skuItems.style[styleIds[i]]['style'] = skuAttrs[j].style;

                    // 如果库存为0，则计数
                    if(skuAttrs[j].stock === 0){
                        ++count;
                    }
                }

                // 如果当前颜色下对应的所有尺码库存为0，则增加disable标记
                if(count == sizeLen){
                    skuItems.style[styleIds[i]]['disable'] = true;
                }
            }

        // 如果没有尺码，直接遍历颜色
        }else{

            // 遍历颜色，收集每个颜色的sku数据
            for(var i = 0, len = styleLen; i < len; i++){
                skuItems.style[styleIds[i]] = {};
                skuItems.style[styleIds[i]]['id'] = skuAttrs[i].id;
                skuItems.style[styleIds[i]]['stock'] = skuAttrs[i].stock;
                skuItems.style[styleIds[i]]['image'] = skuAttrs[i].image;
                skuItems.style[styleIds[i]]['style'] = skuAttrs[i].style;
                skuItems.style[styleIds[i]]['nowprice'] = skuAttrs[i].nowprice;
                skuItems.style[styleIds[i]]['price'] = skuAttrs[i].price;

                // 如果当前颜色库存为0，则增加disable标记
                if(skuAttrs[i].stock === 0){
                    skuItems.style[styleIds[i]]['disable'] = true;
                }

            }

        }

    }

    // 如果有尺码
    if(sizeLen > 0){

        // 如果有颜色
        if(styleLen > 0){

            // 遍历尺码，收集每个尺码对应颜色的sku数据
            for(var i = 0, len = sizeLen; i < len; i++){
                skuItems.size[sizeIds[i]] = {};
                skuItems.size[sizeIds[i]]['id'] = {};
                skuItems.size[sizeIds[i]]['stocks'] = {};
                skuItems.size[sizeIds[i]]['styleVals'] = {};
                skuItems.size[sizeIds[i]]['nowprice'] = {};
                skuItems.size[sizeIds[i]]['price'] = {};

                // 库存为0的计数器
                var count = 0;

                // 收集当前尺码下对应的所有颜色数据
                for(var j = 0, slen = styleLen; j < slen; j++){

                    // 根据后端数据，sku组合公式
                    var n = (j * sizeLen) + i;

                    skuItems.size[sizeIds[i]]['id'][skuAttrs[n].styleId] = skuAttrs[n].id;
                    skuItems.size[sizeIds[i]]['stocks'][skuAttrs[n].styleId] = skuAttrs[n].stock;
                    skuItems.size[sizeIds[i]]['styleVals'][skuAttrs[n].styleId] = skuAttrs[n].style;
                    skuItems.size[sizeIds[i]]['nowprice'][skuAttrs[n].styleId] = skuAttrs[n].nowprice;
                    skuItems.size[sizeIds[i]]['price'][skuAttrs[n].styleId] = skuAttrs[n].price;
                    skuItems.size[sizeIds[i]]['size'] = skuAttrs[n].size;

                    // 如果库存为0，则计数
                    if(skuAttrs[n].stock === 0){
                        ++count;
                    }
                }

                // 如果当前颜色下对应的所有尺码库存为0，则增加disable标记
                if(count == styleLen){
                    skuItems.size[sizeIds[i]]['disable'] = true;
                }
            }

        }else{

            // 遍历颜色，收集每个尺码的sku数据
            for(var i = 0, len = sizeLen; i < len; i++){
                skuItems.size[sizeIds[i]] = {};
                skuItems.size[sizeIds[i]]['id'] = skuAttrs[i].id;
                skuItems.size[sizeIds[i]]['stock'] = skuAttrs[i].stock;
                skuItems.size[sizeIds[i]]['size'] = skuAttrs[i].size;
                skuItems.size[sizeIds[i]]['nowprice'] = skuAttrs[i].nowprice;
                skuItems.size[sizeIds[i]]['price'] = skuAttrs[i].price;

                // 如果当前颜色库存为0，则增加disable标记
                if(skuAttrs[i].stock === 0){
                    skuItems.size[sizeIds[i]]['disable'] = true;
                }
            }
            
        }
    }

    return skuItems;
}

// 解析后端sku数据
var parseSkuItems = function(){

    if(typeof skuData == 'undefined' || !skuData){
        return;
    }

    var 
        // sku属性列表
        skuAttrs = skuData.attribute,

        // 颜色id集合
        styleIds = [], 

        // 颜色名称集合
        styleVals = [],

        // 尺码id集合
        sizeIds = [],

        // 尺码名称集合
        sizeVals = [],

        // 颜色集合长度
        styleLen = 0,

        // 尺码集合长度
        sizeLen = 0,

        // 总库存
        totalStock = 0;

    // 收集颜色和尺码数据
    for(var i = skuAttrs.length - 1; i >= 0; i--){

        // 如果是颜色
        if(skuAttrs[i].styleId){
            styleIds.push(skuAttrs[i].styleId);
            styleVals.push(skuAttrs[i].style);
        }
        
        // 如果是尺码
        if(skuAttrs[i].sizeId){
            sizeIds.push(skuAttrs[i].sizeId);
            sizeVals.push(skuAttrs[i].size);
        }

        totalStock += skuAttrs[i].stock || 0;
    }

    // 过滤重复的值
    styleIds = unique(styleIds);
    sizeIds = unique(sizeIds);

    // 记录sku长度
    data['styleLen'] = styleIds.length;
    data['sizeLen'] = sizeIds.length;

    // 记录总库存
    data['totalStock'] = totalStock;

    return {
        styleIds: styleIds,
        sizeIds: sizeIds
    };
}

// 校验数据
var isData = function(data){
    if(typeof data === 'undefined' 
    || !data 
    || !data.attribute
    || data.attribute.length <= 0){
        return false;
    }else{
        return true;
    }
}

// 数据去重并排序
var unique = function(arr) {
  arr = arr.slice().sort(function(a,b){return a>b?1:-1});
  var i = 0, j, p, l = arr.length;
  for(; i < l; i++) {
    j = i;
    p = arr[i];
    while (j + 1 < l  && arr[j + 1] === p) j++;
    if(j - i){
      j-=i;
      arr.splice(i + 1, j);
      l-=j;
    }
  }
  return arr;
}



},{}],"/Users/rufeng/www/shop-detail/js/module-detail-comment.js":[function(require,module,exports){
/**
 * 商品详情页 - 评价模块
 * by rufeng 2014-8-8
 */
module.exports = function(){

    var 
        dom = {},

        // 评价容器
        $moduleComment = $('#J_ModuleComment'),

        // 评价请求参数列表
        commentParams = {
            sort: 1,
            isNewDetail: 1,
            itemId: window.detailInfo.itemid,
            type: 1

        };

    dom.render = {
        init: function(){
            // todo
        }
    };

    dom.event = {
        init: function(){
            dom.event.showImg();
            dom.event.switchTags();
            dom.event.switchPage();
            dom.event.switchExplain();
            dom.event.getComments();
            dom.event.showComments();
        },

        /**
         * 显示大图
         */
        showImg: function(){
            $(document)

                // 点击小图 && 显示大图
                .on('click', '.show-img li', function(){
                    var 
                        $showImg = $(this).closest('.show-img'),
                        $bigImg = $showImg.find('.big-img'),
                        src = $(this).find('img')[0].src;

                    // 如果大图已经显示，则收起大图
                    if($(this).hasClass('c')){
                        $(this).removeClass('c');
                        $bigImg.removeClass('c').slideUp();
                    }else{
                        $(this).addClass('c').siblings().removeClass('c');
                        // 显示大图
                        $bigImg.find('img').attr('src', src.replace('100x100', '468x468'));
                        $bigImg.addClass('c').slideDown();
                    }
                    
                })

                // 点击大图 && 收起大图
                .on('click', '.show-img .big-img', function(){
                    if(!$(this).hasClass('c')){
                        $(this).slideDown();
                    }else{
                        $(this).removeClass('c').slideUp();
                        $(this).closest('.show-img').find('li').removeClass('c');
                    }
                });
        },

        /**
         * 切换标签
         */
        switchTags: function(){
            $moduleComment
                .on('click', '.tags a', function(){

                    // 清除全部评价和晒图效果
                    $moduleComment.find('.nav a').removeClass('c');

                    // 如果没选中
                    if(!$(this).hasClass('c')){
                        $(this).addClass('c').siblings('a').removeClass('c');
                        commentParams['emotion'] = $(this).attr('data-emotion');
                        commentParams['property'] = $(this).attr('data-property');
                        delete commentParams['isImg'];
                    }else{
                        $(this).removeClass('c');
                        delete commentParams['emotion'];
                        delete commentParams['property'];
                    }

                    // 获取评价列表
                    dom.event.getComments();

                })
                
                //  显示全部标签
                .on('click', '.tags .all', function(){
                    var $tags = $(this).closest('.tags'),
                        $list = $tags.find('.list');
                    
                    $(this).find('b').toggleClass('c');
                    $list.hasClass('show') ? $list.removeClass('show') : $list.addClass('show');                    
                });
        },

        /**
         * 切换分页
         */
        switchPage: function(){
            var navHeight = $('#J_GoodsNav').height();

            $moduleComment
                .on('click', '.pagination a', function(e){
                    e.preventDefault();

                    // 获取分页地址
                    var url = $(this).attr('href');

                    if(!url || url == ''){
                        return;
                    }

                    $.ajax({
                        url: url,
                        type: 'POST',
                        dataType: 'JSON',
                        data: {isNewDetail: 1}
                    })
                    .done(function(json) {
                        if (json == null) {
                            alert(MGLANG.msgTimeout);
                        } else {
                            if(json.status.code == 1001) {
                                var $moduleComments = $('#J_ModuleComments');
                                $moduleComments.html(json.result);

                                // 回到评价起始位置
                                $('html, body').scrollTop($moduleComments.offset().top - navHeight - 30);
                                
                            }else{
                                alert(json.status.msg);
                            }
                        }
                    });

                });
        },

        /**
         * 商家解释
         */
        switchExplain: function(){
            var template = [
                '<div class="info-z seller-explain clearfix">',
                    '<span class="fl">商家解释：</span>',
                    '<div class="content">',
                        '{{=it.content}}',
                    '</div>',
                    '<span class="date fr">{{=it.date}}</span>',
                '</div>'
            ].join('');

            $moduleComment

                // 显示
                .on('click', '.show-explain', function(){
                    $(this).closest('.item').find('.explain-box').show();
                })

                // 确定
                .on('click', '.explain-submit', function(){

                    var 
                        params = {},
                        $item = $(this).closest('.item');

                        params['rateId'] = $(this).attr('data-id');
                        params['comment'] = $.trim($item.find('.explain-text').val());

                    if(params['comment'] == ''){
                        $.alert('请输入解释内容');
                        return;
                    }

                    params['isNewDetail'] = 1;

                    $.ajax({
                        url: '/trade/rate/explain',
                        type: 'POST',
                        dataType: 'JSON',
                        data: params
                    })
                    .done(function(json) {
                        if (json == null) {
                            alert(MGLANG.msgTimeout);
                        } else {
                            if(json.status.code == 1001) {
                                $item.find('.show-explain').remove();
                                $item.find('.explain-box').after(MGTOOL.template(template, {content: params.comment, date: json.result.date})).remove();
                            }else{
                                alert(json.status.msg);
                            }
                        }
                    });

                });
        },

        /**
         * 获取评价数据
         */
        getComments: function(){
           
            // 获取数据
            $.post('/trade/item_detail/ratelist', commentParams, function(data, textStatus, xhr) {
                var data = $.parseJSON(data);
                if(data.status.code == 1001){
                    $('#J_ModuleComments').html(data.result || '');
                }
            });
        },

        /**
         * 显示评价
         */
        showComments: function(){
            $moduleComment

                // 全部评价&晒图
                .on('click', '.nav a:not(.disable)', function(){

                    // 清除标签效果
                    $moduleComment.find('.tags a').removeClass('c');

                    // 如果选中
                    if($(this).hasClass('c')){
                        return; 
                    }

                    // 选中效果
                    $(this).addClass('c').siblings('a').removeClass('c');

                    // 评价类型&晒图
                    if($(this).attr('data-type') == 'img'){
                        commentParams['isImg'] = 1;
                    }else{
                        delete commentParams['isImg'];
                    }

                    delete commentParams['emotion'];
                    delete commentParams['property'];

                    // 获取评价列表
                    dom.event.getComments();
                })

                // 评价排序
                .on('click', '.J_CommentSort', function(){
                    commentParams.sort = $(this).attr('data-type');

                    // 评价排序统计
                    MOGU && MOGU.Globe_Trace_Log(commentParams.sort == 1 ? 'shop-detail-comment-sort-default' : 'shop-detail-comment-sort-time');

                    // 获取评价列表
                    dom.event.getComments();
                });
        }

    }

    // 初始化
    var initialize = function(){
        dom.render.init();
        dom.event.init();
    }

    return {
        init: initialize
    };

}
},{}],"/Users/rufeng/www/shop-detail/js/module-detail-goods.js":[function(require,module,exports){
/**
 * 商品详情页 - 商品模块
 * by rufeng 2014-8-8
 */

/**
 * 导入模块
 */
var 
    // sku api
    sku = require('../api/sku'),

    // 数量调节
    num = require('../js/widget/input-num'),

    // 左右切换图片
    carousel = require('../js/widget/carousel'),

    // 滚动加载
    scroll = require('../js/widget/scroll-load'),

    // 倒计时
    countDown = require('../js/widget/count-down');

// 环境变量
var HOST_URL = MOGUPROFILE.appEnv == 'production' ? 'http://www.mogujie.com' : '';

module.exports = function(){

    var 
        dom = {},

        // 商品容器
        $goodsInfo = $('#J_GoodsInfo'),

        // sku容器
        $goodsSku = $('#J_GoodsSku'),

        // 库存容器
        $goodsStock = $goodsSku.find('.J_GoodsStock'),

        // 大图容器
        $bigImg = $('#J_BigImg'),

        // 小图容器
        $smallImgs = $('#J_SmallImgs'),

        // 数量容器
        $goodsNum = $('#J_GoodsNum');



    // 数据源 start ============================= //

    var data = {

        // sku数据源（后端数据）
        sku: window.detailInfo || {},

        // 重构后端数据生成的新sku
        skuItems: {},

        // sku筛选条件
        filter: {},

        // 选中的sku数据
        choose: null,

        // 是否用户输入正确的库存数量
        isStock: 1

    };

    // ============================= 数据源 end //
    

    // 模板源 start ============================= //
    
    data.template = {

        // sku
        sku: [
            '{{ if(it.img && it.img != ""){ }}',
                '<li class="{{=it.className}}" data-id="{{=it.id}}" data-src="{{=it.bigImg}}" title="{{=it.title}}"><img src="{{=it.img}}"><b></b></li>',
            '{{ }else{ }}',
                '<li class="{{=it.className}}" data-id="{{=it.id}}" title="{{=it.title}}">{{=it.title}}</li>',
            '{{ } }}'
        ].join(''),

        // 显示库存
        stock: '库存{{=it.stock}}件',

        // 添加购物车弹窗
        addcart: [
            "<div class='content'>",
                "<div class='head clearfix'>",
                    "<a href='javascript:;' class='J_Close close-btn'>关闭</a>",
                "</div>",
                "<div class='body'>",
                    "<iframe src='{{=it.src}}' width=\"500\" height=\"{{=it.farameHeight}}\" scrolling=\"no\" frameborder=\"0\">",
                "</div>",
            "</div>"
        ].join(''),

        // 先穿后付欠款弹窗
        xchf: [
            '<div class="content">',
                '<div class="body">',
                    '<h4>菇凉，您有&nbsp;{{=it.num}}&nbsp;笔订单超期未还款</h4>',
                    '<p>请先还款，才能使用先穿后付下单</p>',
                    '<a class="go-pay" href="{{=it.host}}/trade/order/list4buyer/?stage=2&f=fukuan" target="_blank" title="去付款"></a>',
                '</div>',
            '</div>'
        ].join(''),

        // 团购 || 美妆倒计时
        promotion: [
            '<span class="count-num d">{{=it.day}}</span><span class="count-text">天</span>',
            '<span class="count-num h">{{=it.hour}}</span><span class="count-text">时</span>',
            '<span class="count-num m">{{=it.min}}</span><span class="count-text">分</span>',
            '<span class="count-num s">{{=it.sec}}</span><span class="count-text">秒</span>'
        ].join(''),

        // 活动预告
        trailer: [
            '<span class="h">{{=it.hour}}</span>时',
            '<span class="m">{{=it.min}}</span>分',
            '<span class="s">{{=it.sec}}</span>秒'
        ].join('')
    }

    // =============================== 模板源 end //
     
    
    // 视图渲染 start ============================= //
    
    dom.render = {

        // 渲染初始化
        init: function(){

            // 设置数据源
            sku.setData(data.sku);

            // 渲染sku
            dom.render.sku();

            // 渲染总库存
            dom.render.stock(sku.getTotalStock());

            // 渲染小图
            dom.render.smallImgs();
        },

        // 渲染sku
        sku: function(){

            var 
                // sku数据
                skuItems = sku.getSkuItems();

            if(typeof skuItems == 'undefined' || !skuItems){
                return;
            }

            var 
                // 颜色数据
                styleItems = skuItems.style,

                // 颜色数据长度
                styleItemsLen = sku.getStyleLen(),

                // 尺码数据
                sizeItems = skuItems.size,

                // 尺码数据长度
                sizeItemsLen = sku.getSizeLen(),

                // 颜色节点列表
                styleDoms = [],

                // 尺码节点列表
                sizeDoms = [];


            // 如果有颜色
            if(styleItems && styleItemsLen > 0){

                // 遍历颜色
                for(var key in styleItems){

                    var params = {};

                    // 如果有图片
                    if(styleItems[key].image && styleItems[key].image != ''){
                        params = {
                            className: 'img',
                            id: key,
                            title: styleItems[key].style,
                            bigImg: styleItems[key].image,
                            img: styleItems[key].image.replace('468x468', '100x100')
                        };
                    }else{
                        params = {
                            className: '',
                            id: key,
                            title: styleItems[key].style,
                            bigImg: '',
                            img: ''
                        };
                    }

                    // 如果当前颜色有库存
                    if(!styleItems[key].disable){

                        // 如果只有一个颜色
                        if(styleItemsLen == 1){
                            params.className = params.className + ' c';
                            data.filter['styleId'] = key;
                        }
                        
                    }else{
                        params.className = params.className + ' disable';
                    }

                    styleDoms.push(MGTOOL.template(data.template.sku, params));
                }

                // 渲染颜色
                $goodsSku.find('.style').show().find('.J_StyleList').html(styleDoms.join(''));

            }else{
                $goodsSku.find('.style').hide();
            }

            // 如果有尺码
            if(sizeItems && sizeItemsLen > 0){
                for(var key in sizeItems){

                    var params = {
                        className: '',
                        id: key,
                        title: sizeItems[key].size,
                        bigImg: '',
                        img: ''
                    };

                    // 如果当前尺码有库存
                    if(!sizeItems[key].disable){

                        // 如果只有一个尺码
                        if(sizeItemsLen == 1){
                            params.className = params.className + ' c';
                            data.filter['sizeId'] = key;
                        }

                    }else{
                        params.className = params.className + ' disable';
                    }

                    sizeDoms.push(MGTOOL.template(data.template.sku, params));
                }

                // 渲染尺码
                $goodsSku.find('.size').show().find('.J_SizeList').html(sizeDoms.join(''));

            }else{
                $goodsSku.find('.size').hide();
            }

            // 缓存重构后的sku数据
            data.skuItems = skuItems;

            // 更新sku
            dom.render.fresh();

        },

        // 更新sku
        fresh: function(){

            if(typeof data.skuItems == 'undefined' || !data.skuItems){
                return;
            }

            // 筛选sku数据
            var skuItem = sku.getSkuItem(data.filter, data.skuItems);

            if(!skuItem){
                return;
            }

            // 渲染价格
            dom.render.price(skuItem);

            // 渲染库存
            dom.render.stock(skuItem.stock);

            // 渲染sku选项
            dom.render.list(skuItem);

            // 缓存选中数据
            data.choose = skuItem;
        },

        // 渲染库存
        stock: function(stock){
            $goodsStock.html(stock ? MGTOOL.template(data.template.stock, {stock: stock}) : ''); 
            $goodsNum.attr('data-stock', stock);
        },

        // 根据库存渲染sku选项是否禁用
        list: function(skuItem){

            var 
                // 库存集合
                stocks = skuItem.stocks,
                stock = 0;

            if(stocks){
                for(var key in stocks){

                    // 累计库存
                    stock += stocks[key];

                    // 查找sku选项
                    var $li = $goodsSku.find('li[data-id="'+ key +'"]');

                    // 如果库存为0，则禁用
                    stocks[key] === 0 ? $li.addClass('disable') : $li.removeClass('disable');
                }

                // 渲染库存
                if(!skuItem.stock){
                    dom.render.stock(stock);
                }
            }
        },

        // 渲染价格
        price: function(skuItem){

            if(typeof skuItem == 'undefined' || !skuItem){
                return;
            }

            // 如果匹配到原价
            if(typeof skuItem.price == 'string'){
                $('#J_Price').text(skuItem.price);
            }else{
                // 如果有主原价
                if(data.sku.main.price){
                    $('#J_Price').text(data.sku.main.price);
                }
            }

            // 如果匹配到现价
            if(typeof skuItem.nowprice == 'string'){
                $('#J_NowPrice').text(skuItem.nowprice);
            }else{
                // 如果有主现价
                if(data.sku.main.nowprice){
                    $('#J_NowPrice').text(data.sku.main.nowprice);
                }
            }

        },

        // 渲染大图
        bigImg: function(src){

            if(!src || src == ''){
                return;
            }

            $bigImg[0].src = src;
        },

        // 渲染小图
        smallImgs: function(){

            if(typeof data.skuItems == 'undefined' || !data.skuItems){
                return;
            }

            var 
                // 获取颜色列表
                styles = data.skuItems.style,

                // 获取主图
                mainImg = $bigImg.attr('data-main') || '',

                // 每页图片个数
                pageNum = 5,

                doms = [];

            // 如果有颜色列表
            if(!styles){
                return;
            }

            // 如果有主图
            if(mainImg != ''){
                doms.push('<li><img src="'+ mainImg.replace('468x468', '100x100') +'"></li>');
            }

            // 遍历图片列表
            for(var key in styles){

                // 如果没图片会跳过
                if(styles[key].image == ''){
                    continue;
                }
                doms.push('<li><img src="'+ styles[key].image.replace('468x468', '100x100') +'"></li>');
            }

            $smallImgs.find('ul').html(doms.join(''));

        },

        // 先穿后付欠款弹窗
        xchf: function(num){

            var options = {
                title: ' ',
                lightBoxId: 'J_XCHFBox',
                contentHtml: MGTOOL.template(data.template.xchf, {num: num, host: HOST_URL}),
                scroll: false,
                isBgClickClose: false
            };

            var box = new MGLightBox(options);
            box.init();

            // 关闭弹窗
            $('#J_XCHFBox').on('click', '.lb_close, .go-pay',function(){
                box.close();
            });
        }

    }

    // ============================= 视图渲染 end //
    

    // 事件监听 start ============================= //
    
    dom.event = {

        // 初始化
        init: function(){
            dom.event.buyNow();
            dom.event.buyCart();
            dom.event.buyXCHF();
            dom.event.scrollLoad();
            dom.event.updateSku();
            dom.event.chooseSku();
            dom.event.switchImg();
            dom.event.skuPannel();
            dom.event.switchFav();
            dom.event.swicthFavorable();
            dom.event.switchShare();
            dom.event.stockTip();
            dom.event.dotlog();
            num.init($goodsNum);

            // 如果有促销倒计时
            if($('#J_PromotionCountDown').length > 0){
                countDown.init($('#J_PromotionCountDown'), data.template.promotion);
                dom.event.resetFontSize();
            }

            // 如果有活动预告倒计时
            if($('#J_TrailerCountDown').length > 0){
                countDown.init($('#J_TrailerCountDown'), data.template.trailer);
            }
            
        },

        // 选择sku选项
        chooseSku: function(){

            $goodsSku

                .on('click', 'ol li:not(.disable)', function(){

                    // 更新sku
                    $('body').trigger('updateSku', [$(this)]);

                    // 触发库存提醒
                    $('body').trigger('stockTip', [$goodsNum.find('.num-input').val(), $goodsNum.attr('data-stock')]);

                    // 如果可以购买，显示确定按钮
                    if(fn.isBuy()){
                        $goodsSku.find('.J_PannelOK').css('display', 'inline-block').prev().hide();
                    }

                });
                
        },

        // 更新sku
        updateSku: function(){

            $('body').on('updateSku', function(event, $elem){

                var $ol = $elem.closest('ol');

                // 如果已经选中
                if($elem.hasClass('c')){

                    // 如果选择的是颜色
                    if($ol.hasClass('J_StyleList')){
                        
                        // 如果颜色只有一个选项
                        if(sku.getStyleLen() === 1){
                            return;
                        }

                        // 取消颜色选中
                        $elem.removeClass('c');

                        // 删除颜色条件
                        delete data.filter.styleId;

                        // 重置所有sku
                        dom.render.sku();

                        // 如果有尺码
                        if(sku.getSizeLen() > 0){
                            
                            // 如果有尺码被选中过，取消选中
                            if(data.filter.sizeId){

                                // 重新选中尺码
                                var $currentSize = $('.J_SizeList li[data-id="'+ data.filter.sizeId +'"]').removeClass('c');
                                $('body').trigger('updateSku', [$currentSize]);
                            }

                        }

                        // 渲染大图
                        dom.render.bigImg($bigImg.data('main'));
                    }

                    // 如果选择的是尺码
                    if($ol.hasClass('J_SizeList')){

                        // 如果尺码只有一个选项
                        if(sku.getSizeLen() === 1){
                            return;
                        }
                        
                        // 取消尺码选中
                        $elem.removeClass('c');

                        // 删除尺码条件
                        delete data.filter.sizeId;

                        // 重置所有sku
                        dom.render.sku();

                        // 如果有颜色
                        if(sku.getStyleLen() > 0){
                            
                            // 如果有颜色被选中过，取消选中
                            if(data.filter.styleId){

                                // 重选选中的颜色
                                var $currentStyle = $('.J_StyleList li[data-id="'+ data.filter.styleId +'"]').removeClass('c');
                                $('body').trigger('updateSku', [$currentStyle]);
                            }
                            
                        }
                    }
                    
                }else{
                    
                    // 选中
                    $elem.addClass('c').siblings().removeClass('c');

                    // 如果选择的是颜色
                    if($ol.hasClass('J_StyleList')){
                        data.filter['styleId'] = $elem.data('id');
                        data.filter['type'] = 'style';

                        // 渲染大图
                        dom.render.bigImg($elem.data('src'));
                    }

                    // 如果选择的是尺码
                    if($ol.hasClass('J_SizeList')){
                        data.filter['sizeId'] = $elem.data('id');
                        data.filter['type'] = 'size';
                    }

                    // 更新sku
                    dom.render.fresh();

                }


            });
        },

        // 库存提醒
        stockTip: function(){

            /**
             * 监听库存变化
             * @param  {[type]} e     无用
             * @param  {[type]} num   用户输入的数量
             * @param  {[type]} stock 当前库存数量
             */
            $('body').on('stockTip', function(e, num, stock){
                var $goodsStockTip = $goodsSku.find('.J_GoodsStockTip');

                // 如果超过库存，显示库存提醒
                if(+num > +stock){
                    $goodsStockTip.show();
                    data.isStock = 0;
                }else{
                    $goodsStockTip.hide();
                    data.isStock = 1;
                }
            });
        },

        // 小图切换
        switchImg: function(){

            $smallImgs

                .on('mouseenter', 'li', function(){

                    // 获取图片地址
                    var src = $(this).find('img').eq(0).attr('src');

                    // 选中效果
                    $(this).addClass('c').siblings().removeClass('c');

                    // 渲染大图
                    $bigImg[0].src = src.replace('_100x100.jpg', '');

                });

            // 如果图片个数大于一页，初始化轮播
            if($smallImgs.find('li').length > 5){
                carousel.init($smallImgs, {width: 370, height: 59});
                $smallImgs.find('ul').addClass('carousel');
                $smallImgs.find('.right-btn').show();
            }else{
                $smallImgs.find('ul').css('text-align', 'center');
            }

        },

        // 立刻购买
        buyNow: function(){

            $('#J_BuyNow')

                .on('click', function(){

                    // 记录触发按钮
                    $goodsSku.data('btn', $(this));

                    // 是否可以购买
                    if(!fn.isBuy()){
                        $goodsSku.addClass('goods-pannel');
                        return;
                    }

                    // 触发库存提醒
                    $('body').trigger('stockTip', [$goodsNum.find('.num-input').val(), $goodsNum.attr('data-stock')]);

                    // 如果超出当前库存数量
                    if(!data.isStock){
                        return;
                    }

                    var params = fn.getParams();
                    submitForm(params);

                    // 解决IE6无法提交
                    return false;

                });


            // 提交
            var submitForm = function(params){
                var $form = $('<form>');
                $form.attr({
                    action: HOST_URL + '/trade/generateorder/account?click=likegoumai',
                    method: 'POST'
                }).html('<input type="hidden" name="postdata" value="'+ params.id +','+ params.num +'" />');

                $('body').append($form);
                $form[0].submit();
            }

        },

        // 加入购物车
        buyCart: function(){

            $('#J_BuyCart')

                .on('click', function(){

                    // 记录触发按钮
                    $goodsSku.data('btn', $(this));

                    // 是否可以购买
                    if(!fn.isBuy()){
                        $goodsSku.addClass('goods-pannel');
                        return;
                    }

                    // 触发库存提醒
                    $('body').trigger('stockTip', [$goodsNum.find('.num-input').val(), $goodsNum.attr('data-stock')]);

                    // 如果超出当前库存数量
                    if(!data.isStock){
                        return;
                    }

                    // 获取提交参数
                    var params = fn.getParams();

                    // for 微信支付
                    if(top.location != self.location){
                        var weixin = fn.getBuyURL('WX_CART', params);
                        window.open(weixin);
                        return;
                    }

                    // 考虑到购物车弹窗里的推荐列表，美妆商品图片是110高度，其他是165高度
                    // 这里判断是否为美妆，设置固定iframe高度
                    var frameHeight = $('.detail-beauty').length > 0 ? 340 : 395;

                    var options = {
                        title : '添加购物车', 
                        lightBoxId : 'J_AddCartBox', 
                        contentHtml : MGTOOL.template(data.template.addcart, {src: fn.getBuyURL('CART', params), farameHeight: frameHeight}), 
                        scroll : false
                    };

                    var box = new MGLightBox(options);
                    box.init();

                    // 关闭弹窗
                    $('#J_AddCartBox').on('click', '.J_Close', function(){
                        box.close();
                    }).find('.lb_bd').css({padding: 0, background: 'none'}).prev().remove();
                
                });

        },

        // 先穿后付
        buyXCHF: function(){

            $('#J_BuyXCHF')

                .on('click', function(){

                    var $self = $(this);

                    // 记录触发按钮
                    $goodsSku.data('btn', $self);

                    // 验证是否登录
                    if(MOGUPROFILE.userid === '') {
                        MOGU.user_handsome_login_init();
                        callback_option = {
                            callback: function() {
                                $self.trigger('click');
                            }
                        };
                        MOGU.user_handsome_login(false,  callback_option);
                        return;
                    }

                    // 验证是否可以购买
                    if(!fn.isBuy()){
                        $goodsSku.addClass('goods-pannel');
                        return;
                    }

                    // 触发库存提醒
                    $('body').trigger('stockTip', [$goodsNum.find('.num-input').val(), $goodsNum.attr('data-stock')]);

                    // 如果超出当前库存数量
                    if(!data.isStock){
                        return;
                    }

                    // 如果要显示先穿后付欠款弹窗，则返回
                    if(dom.event.xchf()){
                        return;
                    }

                    var params = fn.getParams();
                    submitForm(params);

                    // 解决IE6无法提交
                    return false;
                   
                });

                // 提交
                var submitForm = function(params){

                    var $form = $([
                        '<form action="'+ HOST_URL +'/trade/generateorder/account?click=xianchuanhoufu" method="POST">',
                            '<input type="hidden" name="postdata" value="'+ params.id +','+ params.num +'" />',
                            '<input type="hidden" name="outPayType" value="9"/>',
                        '</form>'
                    ].join(''));

                    $('body').append($form);
                    $form[0].submit();
                }

        },

        // 先穿后付欠款弹窗
        xchf: function(){

            var isxchf = false;
            
            $.ajax({
                url: "/trade/credit/expirednotrepay",
                type: "POST",
                timeout: 25000,
                dataType: 'json',
                async: false,
                success: function(json){
                    var code = json.status.code;
                    var res = json.result;
                    if(code == 1001 && res && res > 0) {
                        isxchf = true;
                        dom.render.xchf(res);
                    }
                }
            });

            return isxchf;
        },

        // sku面板里的一些事件
        skuPannel: function(){

            $goodsSku

                // 关闭面板
                .on('click', '.J_PannelClose', function(){
                    $goodsSku.removeClass('goods-pannel');
                })

                // 确定
                .on('click', '.J_PannelOK', function(){
                    $goodsSku.removeClass('goods-pannel').data('btn').trigger('click');
                });
        },

        // 喜欢
        switchFav: function(){

            var isAjax = false;

            $goodsInfo

                // 喜欢
                .on('click', '.fav', function(){

                    var params = {},
                        $self = $(this);

                    // 验证是否登录
                    if(MOGUPROFILE.userid === '') {
                        MOGU.user_handsome_login_init();
                        callback_option = {
                            callback: function() {
                                $self.trigger('click');
                            }
                        };
                        MOGU.user_handsome_login(false,  callback_option);
                        return;
                    }
                    
                    // 收集参数
                    params['twitterid'] = $self.attr('tid');
                    params['tradeitemid'] = $self.attr('tradeitemid');
                    params['content'] = '';
                    params['local'] = MOGUPROFILE.local;

                    // 如果正在请求
                    if(isAjax){
                        return;
                    }

                    isAjax = true;

                    $.ajax({
                        url: '/collect/favtwitter',
                        type: 'POST',
                        dataType: 'JSON',
                        data: params
                    })
                    .done(function(json) {
                        if(json == null){
                            alert(MGLANG.msgTimeout);
                            return;
                        }

                        var code = json.status.code;

                        if(code == 1001){
                            $self
                                .removeClass('fav')
                                .addClass('faved')
                                .find('.fav-num').text(json.result.data.cfav);
                        }
                    })
                    .fail(function() {

                    })
                    .always(function() {
                        isAjax = false;
                    });

                })

                // 取消喜欢
                .on('click', '.faved', function(){
                    var 
                        params = {},
                        $self = $(this);

                    // 收集参数
                    params['twitterid'] = $self.attr('tid');
                    params['tradeitemid'] = $self.attr('tradeitemid');

                    // 如果正在请求
                    if(isAjax){
                        return;
                    }

                    isAjax = true;

                    $.ajax({
                        url: '/collect/delfav',
                        type: 'POST',
                        dataType: 'JSON',
                        data: params
                    })
                    .done(function(json) {
                        if(json == null){
                            alert(MGLANG.msgTimeout);
                            return;
                        }

                        var code = json.status.code;

                        if(code == 1001){
                            $self
                                .removeClass('faved')
                                .addClass('fav')
                                .find('.fav-num').text(json.result.data.cfav);
                        }
                    })
                    .fail(function() {

                    })
                    .always(function() {
                        isAjax = false;
                    });

                });
            
        },

        // 切换分享
        switchShare: function(){
            dom.event.switchElem($goodsInfo.find('.share'), $goodsInfo.find('.share-w'));
        },

        // 切换优惠
        swicthFavorable: function(){
            var $list = $goodsInfo.find('.favorable-list');

            // 如果没有优惠列表
            if($list.length <= 0){
                return;
            }

            dom.event.switchElem($goodsInfo.find('.favorable'), $list);
        },

        /**
         * 切换元素显示或隐藏
         * @param  {jQuery} $hover 触发元素
         * @param  {jQuery} $elem  显示隐藏元素
         */
        switchElem: function($hover, $elem){
            var timer = null;

            $hover
                .hover(function(){
                    timer && clearTimeout(timer);
                    $elem.show();
                }, function(){
                    timer = setTimeout(function(){
                        $elem.hide();
                    }, 100);
                });
        },

        // 重置团购价大小，防止溢出
        resetFontSize: function(){
            var $price = $goodsInfo.find('.price');
                priceWidth = $price.width();

            // 如果宽度大于220
            if(priceWidth > 220){
                $price.find('.price-u').css('font-size', 25).end().find('.price-n').css('font-size', 25);
            }
        },

        // 日志打点
        dotlog: function(){
            if(!window.detailInfo){
                return;
            }

            var 
                shopid = $('#shopid').val(),
                cpcid = $('#cpcid').val(),
                itemid = window.detailInfo.itemid,
                logString = MOGUPROFILE && MOGUPROFILE.logString;

            $.ajax({
                url: '/trade/item_detail/dotlog',
                type: 'POST',
                dataType: 'json',
                data: {itemId: itemid, shopId: shopid, cpcId: cpcid, logString: logString}
            })
            .done(function(json) {
                var result = json.result;
                if(result){
                    $('#cpcid').val(result);
                }
            });
           
        },

        // 滚动加载
        scrollLoad: function(){

            var 
                shopId = $('#shopid').val(),
                modules = [

                    // 正在热卖
                    {
                        name: 'ModuleLook',
                        url: '/trade/item_detail/hotlist?type=lookbox&shopId='+ shopId +'&itemId='+ data.sku.itemid +'&isNewDetail=1',
                        callback: function(data){
                            if(data.status.code == 1001){
                                $('#J_ModuleLook').html(data.result || '');
                            }
                            
                        }
                    },

                    // 店主推荐
                    {
                        name: 'ModuleRecom',
                        url:  '/trade/item_detail/hotlist?type=shoprecm&shopId='+ shopId +'&itemId='+ data.sku.itemid +'&isNewDetail=1',
                        callback: function(data){
                            if(data.status.code == 1001){
                                $('#J_ModuleRecom').html(data.result || '');
                            }
                        }
                    },

                    // 相似商品
                    {
                        name: 'ModuleLike',
                        url:  '/trade/item_detail/hotlist?type=hotlist&shopId='+ shopId +'&itemId='+ data.sku.itemid +'&isNewDetail=1',
                        callback: function(data){
                            if(data.status.code == 1001){
                                $('#J_ModuleLike').html(data.result || '');
                            }
                        }
                    }

                    
                ];

            scroll.init(modules);
        }

    }

    // ============================= 事件监听 end //        


    var fn = {

        // 验证数据，是否可以购买
        isBuy: function(){

            var styleLen = sku.getStyleLen();
            var sizeLen = sku.getSizeLen();

            // 如果有颜色和尺码
            if(styleLen > 0 && sizeLen > 0){

                // 并且选中颜色和尺码
                return (data.filter.styleId && data.filter.sizeId) ? 1 : 0;
            
            // 如果有颜色，没有尺码
            }else if(styleLen > 0 && sizeLen <= 0){

                // 并且选中了颜色
                return data.filter.styleId ? 1 : 0;

            // 如果没颜色，有尺码
            }else if(styleLen <= 0 && sizeLen > 0){

                // 并且选中了尺码
                return data.filter.sizeId ? 1 : 0;
            }

            // 如果没有颜色和尺码
            if(styleLen <= 0 && sizeLen <= 0){
                var attrs = window.detailInfo.attribute;

                // 如果有一个sku
                if(attrs && attrs.length == 1){
                    data.choose = attrs[0];
                    return 1;
                }else{
                    return 0;
                }
            }

        },

        // 获取提交参数
        getParams: function(){

            /**
             * 收集提交参数
             * 目前是选中sku的id和数量
             * 参数格式: '2610651,1'
             */
            
            var params = {};

            // 选中sku的id
            params['id'] = data.choose.id;

            // 数量
            params['num'] = +$goodsNum.find('.num-input').val();

            params['traceid'] = $('#traceid').val() || '';

            params['cpcid'] = $('#cpcid').val() || '';

            return params;

        },

        // 获取提交地址
        getBuyURL: function(type, params){
            var url = [HOST_URL];

            switch(type){
                case 'WX_CART': 
                    url.push('/add2cart2');
                    break;
                case 'CART':
                    url.push('/trade/cart/add2cart2');
                    break;              
            }

            url.push(
                '?stockId='+ params.id +
                '&number='+ params.num +
                '&traceid='+ params.traceid +
                '&cpcid='+ params.cpcid
            );

            return url.join('');
        }

    }

    // 初始化
    var initialize = function(){
        dom.render.init();
        dom.event.init();
    }

    return {
        init: initialize
    };

}
},{"../api/sku":"/Users/rufeng/www/shop-detail/api/sku.js","../js/widget/carousel":"/Users/rufeng/www/shop-detail/js/widget/carousel.js","../js/widget/count-down":"/Users/rufeng/www/shop-detail/js/widget/count-down.js","../js/widget/input-num":"/Users/rufeng/www/shop-detail/js/widget/input-num.js","../js/widget/scroll-load":"/Users/rufeng/www/shop-detail/js/widget/scroll-load.js"}],"/Users/rufeng/www/shop-detail/js/module-detail-main.js":[function(require,module,exports){
/**
 * 商品详情页 - 详情模块
 * by rufeng 2014-8-8
 */
module.exports = function(){

    var 
        dom = {},
        $navBox = $('#J_NavBox'),
        $goodsNav = $('#J_GoodsNav');

    dom.render = {
        init: function(){
            dom.render.code();
        },

        // 渲染二维码
        code: function(){
            if($goodsNav.find('.code').length <= 0){
                return;
            }
            $goodsNav.find('.code').qrcode({
                size: 80,
                width: 80,
                height: 80,
                ecLevel: 'L',
                text: $goodsNav.find('.code-url').val()
            });
        }
    };

    dom.event = {
        init: function(){
            // 图片懒加载
            MOGU.lazyload('.img-pre-lazyload', {
                preHeight: 500,
                fade: false
            });

            dom.event.chooseNav();
            dom.event.fixedNav();
            dom.event.showCode();
        },

        // 商品导航切换
        chooseNav: function(){
            // 导航高度
            var $list = $goodsNav.find('.list'),
                $tags = $goodsNav.find('.tags'),
                listHeight = $list.height(),
                tagsHeight = $tags.height(),
                navTop = 0;

            $goodsNav
                .on('click', 'li:not(.other), .tags a', function(){
                    var id = $(this).data('id');

                    // 选中效果
                    $(this).addClass('c').siblings().removeClass('c');

                    // 如果元素不存在
                    if($('#'+ id).length <= 0){
                        return;
                    }

                    // 如果点击的不是商品详情
                    if(id == 'J_ModuleComment' || id == 'J_ModuleOrder'){
                        navTop = listHeight;
                        $tags.hide();
                    }else if(id == 'J_ModuleDetail'){
                        navTop = -28;
                        $tags.show();
                    }else{
                        navTop = listHeight + tagsHeight;
                    }

                    $('html, body').scrollTop($('#'+ id).offset().top - navTop - 28);

                });
        },

        // 导航定位
        fixedNav: function(){

            var 
                // 导航位置
                navTop = $goodsNav.offset().top + 30,

                // 导航宽度
                navWidth = $goodsNav.width();

            // 监听滚动事件
            $(window).scroll(function(event) {

                // 获取滚动高度
                var top = document.body.scrollTop || document.documentElement.scrollTop;

                // 如果滚动高度大于导航位置，导航浮起来
                if(top >= navTop){
                    $goodsNav.addClass('main-nav-fixed').width(navWidth);
                }else{
                    $goodsNav.removeClass('main-nav-fixed').width('');
                }
            });
        },

        // 显示扫码
        showCode: function(){
            if($goodsNav.find('.code').length <= 0){
                return;
            }

            var 
                $other = $goodsNav.find('li.other'),
                $code = $other.find('.scan-code'),
                $buy = $other.find('.scan-buy'),
                $b = $code.find('b'),
                timer = null;

            $other
                .hover(
                    function(){
                        timer && clearTimeout(timer);
                        $b.addClass('c');
                        $buy.show();
                    },
                    function(){
                        timer = setTimeout(function(){
                            $b.removeClass('c');
                            $buy.hide();
                        }, 100);
                    }
                );
        }

    }

    // 初始化
    var initialize = function(){
        dom.render.init();
        dom.event.init();
    }

    return {
        init: initialize
    };

}
},{}],"/Users/rufeng/www/shop-detail/js/module-detail-sale.js":[function(require,module,exports){
/**
 * 商品详情页 - 销量模块
 * by rufeng 2014-8-8
 */
module.exports = function(){

    var 
        dom = {},

        // 销量容器
        $moduleOrder = $('#J_ModuleOrder');

    dom.render = {
        init: function(){
            // todo
        }
    };

    dom.event = {
        init: function(){
            dom.event.switchPage();
            dom.event.getSales();
        },

        // 切换分页
        switchPage: function(){
            var navHeight = $('#J_GoodsNav').height();

            $moduleOrder
                .on('click', '.pagination a', function(e){
                    e.preventDefault();

                    var url = $(this).attr('href');

                    if(!url || url == ''){
                        return;
                    }

                    $.ajax({
                        url: url,
                        type: 'POST',
                        dataType: 'JSON',
                        data: {isNewDetail: 1}
                    })
                    .done(function(json) {
                        if (json == null) {
                            alert(MGLANG.msgTimeout);
                        } else {
                            if(json.status.code == 1001) {
                                var $moduleOrders = $('#J_ModuleOrders');
                                $moduleOrders.html(json.result.html);
                                
                                // 回到销量起始位置
                                $('html, body').scrollTop($moduleOrders.offset().top - navHeight);
                            }else{
                                alert(json.status.msg);
                            }
                        }
                    })
                    .fail(function() {

                    })
                    .always(function() {

                    });

                });
        },

        // 获取销量列表
        getSales: function(){
            if(!window.detailInfo){
                return;
            }

            var shopId = $('#shopid').val();

            $.post('/trade/item_detail/orderlist?itemId='+ window.detailInfo.itemid +'&page=1&isNewDetail=1', {}, function(data, textStatus, xhr) {
                var data = $.parseJSON(data);
                if(data.status.code == 1001){
                    $('#J_ModuleOrders').html(data.result.html || '');
                    $('.J_SaleNum').html(data.result.count || 0);
                }
            });
        }

    }

    // 初始化
    var initialize = function(){
        dom.render.init();
        dom.event.init();
    }

    return {
        init: initialize
    };

}
},{}],"/Users/rufeng/www/shop-detail/js/page-shop-detail.js":[function(require,module,exports){
/**
 * 商品详情页 - 入口
 * by rufeng 2014-8-8
 */

// 初始化各模块
var MDGoods = require('./module-detail-goods');
var MMGoods = require('./module-detail-main');
var MCGoods = require('./module-detail-comment');
var MSGoods = require('./module-detail-sale');

MDGoods().init();
MMGoods().init();
MCGoods().init();
MSGoods().init();


},{"./module-detail-comment":"/Users/rufeng/www/shop-detail/js/module-detail-comment.js","./module-detail-goods":"/Users/rufeng/www/shop-detail/js/module-detail-goods.js","./module-detail-main":"/Users/rufeng/www/shop-detail/js/module-detail-main.js","./module-detail-sale":"/Users/rufeng/www/shop-detail/js/module-detail-sale.js"}],"/Users/rufeng/www/shop-detail/js/widget/carousel.js":[function(require,module,exports){
/**
 * 轮播组件
 * @param  {jQuery} $container 容器
 * @param  {Object} options    {width: 200, height: 200} 容器大小
 */
module.exports.init = function($container, options){

    // 默认参数
    var defaults = {};

    // 合并参数
    var options = $.extend(defaults, options);

    // 初始化变量
    var 
        $ul = $container.find('ul'),

        $li = $ul.find('li').eq(0),

        len = $ul.find('li').length,

        marginRight = parseInt($li.css('margin-right')),

        // 位移最大范围
        maxWidth = ($li.width() + marginRight) * len,

        // 位移
        left = 0,

        // 是否正在播放动画
        isAnimate = false;

    // 设置容器大小
    $container
    
        .find('.list')
        .width(options.width)
        .height(options.height)
        .end()

        // 向右滚
        .on('click', '.right-btn', function(){

            var $self = $(this);

            if(-left >= maxWidth - options.width || isAnimate){
                return;
            }
            
            left = left - options.width;


            $ul.animate({left: left}, 'slow', 'swing', function(){

                // 控制按钮显示
                if(-left >= maxWidth - options.width){
                    $self.hide().prev().show();
                }else{
                    $self.prev().show();
                }

                isAnimate = false;
            });

            isAnimate = true;
           
        })

        // 向左滚
        .on('click', '.left-btn', function(){
            
            var $self = $(this);

            if(-left <= 0 || isAnimate){
                return;
            }
            
            left = left + options.width;
            $ul.animate({left: left}, 'slow', 'swing', function(){

                // 控制按钮显示
                if(-left <= 0){
                    $self.hide().next().show();
                }else{
                    $self.next().show();
                }

                isAnimate = false;
            });

            isAnimate = true;
        });
    
}
},{}],"/Users/rufeng/www/shop-detail/js/widget/count-down.js":[function(require,module,exports){
/**
 * 简单倒计时
 */
module.exports.init = function($container, template){
    
    if($container.length <= 0){
        return;
    }

    var time = $container.attr('cut-time');
    updateTime(time, $container, template);

}


// 更新时间
var updateTime = function(time, $container, template){
    if(time <= 0){
        window.location.reload();
        return;
    }

    time--;

    var data = getTime(time);

    // 渲染视图
    var html = doT.template(template)(data);
    $container.html(html);

    setTimeout(function(){
        updateTime(time, $container, template);
    },1000);
}

// 获取时间
var getTime = function(time){

    var 
        sec = 1,
        minute = 60,
        hour = 3600,
        day = 86400,
        d = parseInt(time / day),
        h = parseInt(time / hour) - d * 24,
        m = parseInt(time / minute) - parseInt(time / hour) * 60,
        s = parseInt(time / sec) - parseInt(time / minute) * 60;

    return {
        day : d,
        hour: h,
        min : m,
        sec : s
    };

}

},{}],"/Users/rufeng/www/shop-detail/js/widget/input-num.js":[function(require,module,exports){
/**
 * 数值文本框计数 
 * @param  {$jQuery} $container 容器
 */
module.exports.init = function($container){

    var 

        // 数值文本框
        $input = $container.find('.num-input'),

        // 增加
        $add = $container.find('.num-add'),

        // 减少
        $reduce = $container.find('.num-reduce'),

        num = +$input.val() || 1;

    // 初始化视图
    var initView = function(){
        if(num <= 1){
            $reduce.addClass('num-disable');
        }
    }
    
    // 事件监听
    var domEvent = function(){

        // 增加
        $add.on('click', function(){
            // 获取库存
            var stock = +$container.attr('data-stock');

            num = +$input.val();
            if(!/^\d+$/.test(num)){
                return;
            }

            ++num;

            if(num > 1){
                $reduce.removeClass('num-disable');
            }

            $input.val(num);

            // 触发库存提醒
            $('body').trigger('stockTip', [num, stock]);

        });

        // 减少
        $reduce.on('click', function(){
            // 获取库存
            var stock = +$container.attr('data-stock');

            num = +$input.val();
            if(!/^\d+$/.test(num) || $reduce.hasClass('num-disable')){
                return;
            }

            $input.val(--num);

            if(num <= 1){
                $reduce.addClass('num-disable');
            }

            // 触发库存提醒
            $('body').trigger('stockTip', [num, stock]);

        });

        // 数值文本框变化
        $input.on('change', function(){
            // 获取库存
            var stock = +$container.attr('data-stock');

            num = +$input.val();
            if(!/^\d+$/.test(num) || num === 0 || num === ''){
                $input.val(1);

                // 触发库存提醒
                $('body').trigger('stockTip', [1, stock]);
                return;
            }

            if(num > 1){
                $reduce.removeClass('num-disable');
            }

            if(num <= 1){
                $reduce.addClass('num-disable');
            }
           
            $input.val(num);

            // 触发库存提醒
            $('body').trigger('stockTip', [num, stock]);

        });

    }

    // 初始化
    var initialize = function(){
        initView();
        domEvent();
    }

    initialize();

}
},{}],"/Users/rufeng/www/shop-detail/js/widget/scroll-load.js":[function(require,module,exports){

/**
 * 滚动加载模块
 * 支持多模块加载
 * @param  {Array} modules 模块列表 
 * | var modules = ['hot', 'new', 'other'];
 * | 最好以容器的id命名，方便查找元素，最后调用形式$('#J_'+ modules[0])
 * @param  {Array} urls    各模块对应的请求地址
 */
module.exports.init = function(modules){

    var 
        // 模块个数
        moduleNum = modules.length, 

        // 已载入模块
        loaded = 0,

        // 可视高度
        clientHeight = window.innerHeight || document.documentElement.clientHeight,

        // 预加载高度
        preHeight = 600,

        // 是否正在加载
        isLoad = false;


    // 检测元素是否进入视野
    var checkReach = function($elem){

        if($elem.length <= 0){
            loaded++;
            return;
        }

        var 
            // 元素距窗口的高度
            elemTop = $elem.offset().top,

            // 滚动高度
            scrollTop = document.body.scrollTop || document.documentElement.scrollTop || 0;

        if(scrollTop + clientHeight + preHeight >= elemTop && loaded <= moduleNum){
            isLoad = true;
            return true;
        }else{
            return false;
        }

    }

    // 加载数据
    var loadData = function(){

        $.ajax({
            url: modules[loaded].url,
            type: 'get',
            dataType: 'json',
            cache: false,
            data: {}
        })

        // success
        .done(function(data) {
            modules[loaded].callback && modules[loaded].callback(data);
        })

        // error
        .fail(function() {

        })
        
        // complete
        .always(function() {
            loaded++;
            isLoad = false;
        });
    }

    // 滚起来
    var scrollTo = function(){
        // 判断模块是否全部加载完成
        if(loaded >= moduleNum){
            return;
        }
        
        var $elem = $('#J_'+ modules[loaded].name);
        !isLoad && checkReach($elem) && loadData();
    }

    // 节流函数
    var throttle = function(fn, delay){
        var timer = null;
        return function(){
            var context = this, args = arguments;
            clearTimeout(timer);
            timer = setTimeout(function(){
                fn.apply(context, args);
            }, delay);
        };
    }

    window.onscroll = throttle(scrollTo, 50);
}
},{}]},{},["/Users/rufeng/www/shop-detail/js/page-shop-detail.js"]);
