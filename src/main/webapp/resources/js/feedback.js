define("feedback",[],function(){function t(t){var e='<span>{{=content}}</span><div class="lb_btn"><a href="javascript:void(0);">确定</a></div>'.replace("{{=content}}",t),i={title:"温馨提示",lightBoxId:"lb_tip",contentHtml:e,scroll:!1},n=new MGLightBox(i);n.init(),$("#lb_tip").on("click",".lb_btn",function(){n.close()})}var e=[],i=$("#fb_txt"),n=$("#phone"),o=0,r={},a=function(t){var e=new RegExp(t+"=([^&]*)"),i=location.href.match(e)||[];return i[1]||null};r.device=navigator.userAgent,r.sourceurl=document.referrer?document.referrer:"http://www.mogujie.com",r.source=decodeURIComponent(a("source"));var s=function(){this.triggerEl=$(".default"),this.name="image",this.action="http://upload.mogujie.com/upload/addpic/",this.data=null,this.change=null,this.accept="image/*",this.error=null,this.success=null,this.className="_widget_upload_",this.fileName=null,this.init()};s.prototype={init:function(){if(this.triggerEl.length){var t=$.extend({},this.data||{},this.triggerEl.data()||{});this.data=t,this.renderUploadForm(),this.addEvt()}},addEvt:function(){var t=this;this.triggerEl.on("click",function(){t.file.trigger("click")}),this.file.on("change",function(){t.fileName=$(this).val(),t.upload()})},renderUploadForm:function(){$(".upform").length?$(".upform").empty():$("body").append('<div class="upform"></div>'),this.el=$(".upform"),this.randomId=parseInt(100*Math.random()),this.el.hide().html($(['<form action="',this.action,'" method="post" enctype="multipart/form-data" target="">','<input type="file" class="_w_u_file" name="',this.name,'" ',this.accept?'accept="'+this.accept+'"':""," />",'<input type="hidden" name="callback" value="publish_tool_photo_success_'+this.randomId+'" />','<input type="hidden" value="'+location.host+'" name="host">',"</form>"].join(""))),this.el.find("._w_u_file").attr("hidefocus",!0).css({position:"absolute",top:0,right:0,opacity:0,outline:0,cursor:"pointer",height:this.triggerEl.outerHeight(),fontSize:Math.max(64,5*this.triggerEl.outerHeight())}),this.el.find("form").css({position:"absolute",top:this.triggerEl.offset().top,left:this.triggerEl.offset().left,overflow:"hidden",width:this.triggerEl.outerWidth(),height:this.triggerEl.outerHeight(),zIndex:300}),this.el.show(),this.uForm=this.el.find("form"),this.file=this.el.find('input[type="file"]')},upload:function(){var t=this,i=this.newIframe();this.uForm.attr("target",i.attr("name")),this.el.append(i),window["publish_tool_photo_success_"+t.randomId]=function(){o++;var i={path:arguments[3],imgId:arguments[1]},n=['<div class="img_wrap">','<img src="{{= it.path}}" class="r5">','<a href="javascript:;" class="del" iid="{{=it.imgId }}"></a>',"</div>"].join("");return $(".default").before(MoGu.ui.getTemplate(n,i)),e.push(i.path),o>=3?($(".default").hide(),void $(".upform").remove()):($(".default").show(),t.renderUploadForm(),void t.addEvt())},i.one("load",function(){$('<iframe src="javascript:false;"></iframe>').appendTo(t.el.find("form")).remove();var e;$(this).remove(),e?$.isFunction(t.success)&&t.success(e):$.isFunction(t.error)&&t.error(t.fileName)}),t.uForm.trigger("submit")},newIframe:function(){var t="iframe-uploader-"+this.id,e=$('<iframe name="'+t+'" />').hide();return e},onSuccess:function(t){return this.success=function(e){$.isFunction(t)&&t(e)},this},onError:function(t){var e=this;return this.set("error",function(){$.isFunction(t)&&t(e.get("fileName"))}),this}},new s,$(".sub_btn").on("click",function(){var o=i.val();return""==o?(t("反馈内容不能为空哦~"),!1):o.length>500?(i.val(o.substring(0,499)),t("反馈内容字数多于500字！"),!1):$("input[name=u_phone]").val()&&!/^(13[0-9]|14[0-9]|15[0-9]|18[0-9])\d{8}$/.test($("input[name=u_phone]").val())?(t("请输入正确的手机号码！"),!1):(r.imgs=e,r.content=i.val(),r.phone=n.val(),void $.ajax({url:"/feedback/face/create",data:r,type:"POST",dataType:"json"}).done(function(e){if(1001==e.status.code){var i="";i=document.referrer?encodeURIComponent(document.referrer):"http://www.mogujie.com",window.location.href="/feedback/face/success?sourceurl="+i}else t(e.result)}))})}),require(["feedback"]),define("pages/feedback/feedback",function(){});