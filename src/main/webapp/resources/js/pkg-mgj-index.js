!function(e){!function(e){function t(t){var n=e(this),a=null,i=[],s=null,o=null,r=e.extend({rowSelector:"> li",submenuSelector:"*",submenuDirection:"right",tolerance:75,enter:e.noop,exit:e.noop,activate:e.noop,deactivate:e.noop,exitMenu:e.noop},t),l=3,c=300,u=function(e){i.push({x:e.pageX,y:e.pageY}),i.length>l&&i.shift()},d=function(){o&&clearTimeout(o),r.exitMenu(this)&&(a&&r.deactivate(a),a=null)},f=function(){o&&clearTimeout(o),r.enter(this),_(this)},p=function(){r.exit(this)},m=function(){g(this)},g=function(e){e!=a&&(a&&r.deactivate(a),r.activate(e),a=e)},_=function(e){var t=h();t?o=setTimeout(function(){_(e)},t):g(e)},h=function(){function t(e,t){return(t.y-e.y)/(t.x-e.x)}if(!a||!e(a).is(r.submenuSelector))return 0;var o=n.offset(),l={x:o.left,y:o.top-r.tolerance},u={x:o.left+n.outerWidth(),y:l.y},d={x:o.left,y:o.top+n.outerHeight()+r.tolerance},f={x:o.left+n.outerWidth(),y:d.y},p=i[i.length-1],m=i[0];if(!p)return 0;if(m||(m=p),m.x<o.left||m.x>f.x||m.y<o.top||m.y>f.y)return 0;if(s&&p.x==s.x&&p.y==s.y)return 0;var g=u,_=f;"left"==r.submenuDirection?(g=d,_=l):"below"==r.submenuDirection?(g=f,_=d):"above"==r.submenuDirection&&(g=l,_=u);var h=t(p,g),v=t(p,_),y=t(m,g),b=t(m,_);return y>h&&v>b?(s=p,c):(s=null,0)};n.mouseleave(d).find(r.rowSelector).mouseenter(f).mouseleave(p).click(m),e(document).mousemove(u)}e.fn.menuAim=function(e){return this.each(function(){t.call(this,e)}),this}}(jQuery),function(e){function t(t,a){function i(){s.isautoswitch&&(clearInterval(m),m=setInterval(function(){return h?!1:(g++,g=g>=_?0:g,void y(g))},p))}var s=e.extend(!0,{},n,a),o=e(t),r=e(s.elements.list,o),l=r.children("li"),c=(l.first(),l.last(),e(s.elements.nav,o)),u=c.children("li"),d=e(s.elements.arrow,o),f=s.afterSlide,p=s.millisec,m=0,g=0,_=u.length,h=!1,v=s.className.navSelected;if(!(o.data("slideinit")||2>_)){o.data("slideinit",!0);var y=function(t){if(h)return!1;h=!0;var n=l.eq(t),a=u.eq(t);j(t),"fade"==s.isopenstyle?n.css("z-index",2).fadeTo(s.fadespeed,1,function(){e(this).siblings("li").removeClass("banner_show").css({"z-index":0,opacity:0}).end().addClass("banner_show").css("z-index",1),f(),h=!1}):(n.siblings("li").removeClass("banner_show").end().addClass("banner_show"),h=!1),b(t),$(t),a.addClass(v).siblings().removeClass(v)},b=function(t){if(s.isopenskin&&s.elements.skin){var n=l.eq(t),a=e(s.elements.skin),i=e(s.elements.fadebg),o=n.data(),r="";r=o.backcolor?o.backcolor:o.backimg?"#fff url("+o.backimg+") repeat-x center top":s.defaultskin,"fade"==s.isopenstyle?i.css({background:r,display:"block"}).fadeTo(s.fadespeed,1,function(){a.css({background:r}),e(this).css({opacity:0,display:"none"})}):a.css({background:r})}},$=function(t){if(s.isopeninfo){var n=s.elements.info,a=l.eq(t),i=e(n.type,o),r=e(n.title,o),c=e(n.count,o),u=a.data();i.text(u.type||""),r.children("a").text(u.title||"").attr("href",u.link||"#"),c.text(u.count||"")}},j=function(t){var n=t+1>=_?0:t+1,a=[t,n];e.map(a,function(t){var n=l.eq(t).children("a[data-img]");if(n.length>0&&!n.data("lazy")){n.data("lazy",!0);var a=e("<img/>");a.css("display","none").attr("src",n.data().img).on("load",function(){a.css("display","block"),n.css("background-image","none")}),n.prepend(a)}})};u.each(function(){e(this).off(".selected").on("mouseenter.selected switch.selected",function(){{var t=e(this);t.data()}return h?!1:(g=e(this).index(),e(this).addClass(v).siblings().removeClass(v),void y(g))}).on("click.selected",function(){return!1})}),s.isopenarrow&&d.children("a").each(function(){e(this).click(function(){if(h)return!1;var t=e(this),n=t.data();return"prev"==n.arrow?(g--,g=0>g?_-1:g):"next"==n.arrow&&(g++,g=g>=_?0:g),y(g),!1})}),o.off(".m").on("mouseenter.html",function(){s.isopenarrow&&d.show(),clearInterval(m)}).on("mouseleave.html",function(){s.isopenarrow&&d.hide(),i()}),b(g),j(g),i()}}var n={millisec:3e3,itemWidth:"auto",isautoswitch:!0,isopenskin:!1,isopeninfo:!1,isopenarrow:!1,isopenstyle:"",fadespeed:300,defaultskin:"#eee",elements:{skin:null,info:{type:null,title:null,count:null},list:'ul[data-banner="list"]',nav:'ul[data-banner="nav"]',arrow:'div[data-banner="arrow"]'},className:{navSelected:"selected"},afterSlide:e.noop};e.fn.extend({slide:function(n){return e(this).map(function(){t(e(this),n)}),e(this)}})}(jQuery,e),$(function(){!function(e){function t(t){var n=e(t),i=e("div.nav_more",n),s=n.index();i.css(3>s?{top:-(n.offset().top-a.offset().top)-1}:{bottom:-(a.offset().top+501-(n.offset().top+n.height()))}),n.addClass("primary_nav_li_current").siblings().removeClass("primary_nav_li_current")}function n(t){e(t).removeClass("primary_nav_li_current")}var a=e("#j_primary_nav_list");a.menuAim({activate:t,deactivate:n,exitMenu:function(){return!0}})}(jQuery);var e=function(){var e=$("<img/>"),t=$(this);e.css("display","none").attr("src",t.data().img).on("load",function(){e.css("display","block"),t.css("background-image","none")}),t.prepend(e)};$("#j_primary_main_banner").slide({elements:{skin:"#j_mgj_primary",fadebg:"#j_primary_fadebg"},isopenskin:!0,isopenarrow:!0,isopenstyle:"fade",afterSlide:function(){"1"===$("#j_primary_main_banner .banner_bd li").eq(4).css("z-index")&&$(document).trigger("slideAdVisible")}});var t=function(e){var t,n,a,i=e,s=i.attr("href"),o="";if(s.indexOf("?")>0)if(n=s.split("?")[1],n.indexOf("&")>0){a=n.split("&");for(var r=0;r<a.length;r++)t=a[r].indexOf("="),-1!=t&&"cpmt"==a[r].substring(0,t)&&(o=a[r].substring(t+1))}else t=n.indexOf("="),t>0&&"cpmt"==n.substring(0,t)&&(o=n.substring(t+1));i.attr("data-mga",o)};t($("#j_primary_main_banner .banner_pic").eq(4)),$(document).on("slideAdVisible",function(){var e=$("#j_primary_main_banner .banner_pic").eq(4),t=e.attr("data-mga");t&&""!=t&&MOGU.mga.pageview("home","slide5_"+t,e.find("img"))}),$("#j_primary_main_banner .banner_pic").eq(4).on("click",function(){var e=$(this).attr("data-mga");e&&""!=e&&MOGU.mga.triggerEvent("home","click","slide5_"+e,"")}),$("#j_daren_list li.daren_li").each(function(){$("div.daren_ft a[data-img]",this).each(e)}).mouseenter(function(){$(this).data("lazy")||($(this).data("lazy",!0),$("ul.top_list a[data-img]",this).each(e)),$(this).addClass("daren_li_current").siblings().removeClass("daren_li_current")})}),$(function(){var t=function(e,t){$.getJSON(a,{d:e,day:i},function(n){1001==n.status.code&&t&&t(e,n)})},n=function(e){$("li.category_banner_li",u[e]).slide({elements:{info:{type:'h3[data-banner="type"]',title:'p[data-banner="title"]',count:'p[data-banner="count"]'}},isautoswitch:!0,isopeninfo:!0,isopenstyle:"fade"})},a="/less/load",i=$("#day").val(),s={dapei:{arg:"dapei",tpl:"dapei"},cloth:{arg:"cloth_skirt",tpl:"category",fns:[n]},skirt:{arg:"cloth_skirt",tpl:"category",fns:[n]},pants:{arg:"pants_shoes",tpl:"category",fns:[n]},shoes:{arg:"pants_shoes",tpl:"category",fns:[n]},bag:{arg:"bag_accessory",tpl:"category",fns:[n]},accessory:{arg:"bag_accessory",tpl:"category",fns:[n]},tuangou:{arg:"tuangou",tpl:"tuangou"},magic:{arg:"magic",tpl:"magic",apptype:"special_magic",apptpl:"special_magic",fns:[n]}},o={args:{},doTs:{}},r={},l={topbar:$("#j_dot_topbar").html(),dapei:$("#j_dot_dapei").html(),category:$("#j_dot_category").html(),tuangou:$("#j_dot_tuangou").html(),magic:$("#j_dot_magic").html(),special_magic:$("#j_dot_special_magic").html()},c={topbar:l.topbar},u={dapei:$("#j_mgj_dapei"),cloth:$("#j_mgj_cloth"),skirt:$("#j_mgj_skirt"),pants:$("#j_mgj_pants"),shoes:$("#j_mgj_shoes"),bag:$("#j_mgj_bag"),accessory:$("#j_mgj_accessory"),tuangou:$("#j_mgj_tuangou"),magic:$("#j_mgj_magic"),special_magic:$("#j_mgj_special_magic")};for(var d in s){var f=u[d],p=f.offset().top;r[d]={top:p,bottom:p+f.height()}}var m=function(e){var n=s[e].arg||"",a=s[e].apptype||"",i=s[e].fns||[];o.args[n]||(o.args[n]=!0,t(n,function(e,t){var n=e.split("_"),r=e.split("_");a&&r.push(a),$.map(r,function(r){var d=null;d=r==a||1==n.length?t.result[e]:t.result[e][r],d.options={type:r},u[r].html(function(){var t=function(){return r==a?s[e].apptpl:s[r].tpl}(),n=function(e){return o.doTs[t]||(o.doTs[t]=e.template(l[t],void 0,c)),o.doTs[t]}(MoGu.ui.getdoT());return n(d)}),$.map(i,function(e){e&&e(r)})})}))},g=$(e),_=function(){var e=g.scrollTop(),t=g.height()+e;for(var n in r)t+200<r[n].top||e-200>r[n].bottom||m(n)};g.off(".lazy").on("scroll.lazy",function(){_()}),_()})}(window);