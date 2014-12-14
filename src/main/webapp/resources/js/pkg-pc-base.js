define("core/core",[],function(){MoGu={Config:{debug:"@DEBUG@"},version:"undefined@",appEnv:"Env",data:{},APP:{}}}),define("core/error",["$","./core"],function(t){return t.extend(MoGu,{error:function(t){console&&console.log(t)}}),MoGu}),define("fnExtend",["$"],function(){return{alert:function(){console.log(123)}}}),define("fn/fn",["$","fnExtend"],function(t,e){return MoGu.fn={set:function(t,e){MoGu.App[t]&&MoGu.error(t+"包将被替换"),MoGu.App[t]=e},get:function(t){return MoGu.App[t]||!1},parseUrl:function(t,e){return e=e||["?","&","="],{key:value}}},t.extend(MoGu.fn,e),MoGu}),define("uiExtend",[],function(){return{alertUi:function(){alert(123)}}}),define("lib/doT",[],function(){function t(){var t={"&":"&#38;","<":"&#60;",">":"&#62;",'"':"&#34;","'":"&#39;","/":"&#47;"},e=/&(?!#?\w+;)|<|>|"|'|\//g;return function(){return this?this.replace(e,function(e){return t[e]||e}):this}}function e(t,n,r){return("string"==typeof n?n:n.toString()).replace(t.define||o,function(e,n,i,o){return 0===n.indexOf("def.")&&(n=n.substring(4)),n in r||(":"===i?(t.defineParams&&o.replace(t.defineParams,function(t,e,i){r[n]={arg:e,text:i}}),n in r||(r[n]=o)):new Function("def","def['"+n+"']="+o)(r)),""}).replace(t.use||o,function(n,i){t.useParams&&(i=i.replace(t.useParams,function(t,e,n,i){if(r[n]&&r[n].arg&&i){var o=(n+":"+i).replace(/'|\\/g,"_");return r.__exp=r.__exp||{},r.__exp[o]=r[n].text.replace(new RegExp("(^|[^\\w$])"+r[n].arg+"([^\\w$])","g"),"$1"+i+"$2"),e+"def.__exp['"+o+"']"}}));var o=new Function("def","return "+i)(r);return o?e(t,o,r):o})}function n(t){return t.replace(/\\('|\\)/g,"$1").replace(/[\r\t\n]/g," ")}var r={version:"1.0.1",templateSettings:{evaluate:/\{\{([\s\S]+?(\}?)+)\}\}/g,interpolate:/\{\{=([\s\S]+?)\}\}/g,encode:/\{\{!([\s\S]+?)\}\}/g,use:/\{\{#([\s\S]+?)\}\}/g,useParams:/(^|[^\w$])def(?:\.|\[[\'\"])([\w$\.]+)(?:[\'\"]\])?\s*\:\s*([\w$\.]+|\"[^\"]+\"|\'[^\']+\'|\{[^\}]+\})/g,define:/\{\{##\s*([\w\.$]+)\s*(\:|=)([\s\S]+?)#\}\}/g,defineParams:/^\s*([\w$]+):([\s\S]+)/,conditional:/\{\{\?(\?)?\s*([\s\S]*?)\s*\}\}/g,iterate:/\{\{~\s*(?:\}\}|([\s\S]+?)\s*\:\s*([\w$]+)\s*(?:\:\s*([\w$]+))?\s*\}\})/g,varname:"it",strip:!0,append:!0,selfcontained:!1},template:void 0,compile:void 0};String.prototype.encodeHTML=t();var i={append:{start:"'+(",end:")+'",endencode:"||'').toString().encodeHTML()+'"},split:{start:"';out+=(",end:");out+='",endencode:"||'').toString().encodeHTML();out+='"}},o=/$^/;return r.template=function(s,a,u){a=a||r.templateSettings;var c,l,f=a.append?i.append:i.split,h=0,d=a.use||a.define?e(a,s,u||{}):s;d=("var out='"+(a.strip?d.replace(/(^|\r|\n)\t* +| +\t*(\r|\n|$)/g," ").replace(/\r|\n|\t|\/\*[\s\S]*?\*\//g,""):d).replace(/'|\\/g,"\\$&").replace(a.interpolate||o,function(t,e){return f.start+n(e)+f.end}).replace(a.encode||o,function(t,e){return c=!0,f.start+n(e)+f.endencode}).replace(a.conditional||o,function(t,e,r){return e?r?"';}else if("+n(r)+"){out+='":"';}else{out+='":r?"';if("+n(r)+"){out+='":"';}out+='"}).replace(a.iterate||o,function(t,e,r,i){return e?(h+=1,l=i||"i"+h,e=n(e),"';var arr"+h+"="+e+";if(arr"+h+"){var "+r+","+l+"=-1,l"+h+"=arr"+h+".length-1;while("+l+"<l"+h+"){"+r+"=arr"+h+"["+l+"+=1];out+='"):"';} } out+='"}).replace(a.evaluate||o,function(t,e){return"';"+n(e)+"out+='"})+"';return out;").replace(/\n/g,"\\n").replace(/\t/g,"\\t").replace(/\r/g,"\\r").replace(/(\s|;|\}|^|\{)out\+='';/g,"$1").replace(/\+''/g,"").replace(/(\s|;|\}|^|\{)out\+=''\+/g,"$1out+="),c&&a.selfcontained&&(d="String.prototype.encodeHTML=("+t.toString()+"());"+d);try{return new Function(a.varname,d)}catch(p){throw"undefined"!=typeof console&&console.log("Could not create a template function: "+d),p}},r.compile=function(t,e){return r.template(t,null,e)},r}),define("ui/ui",["$","uiExtend","../lib/doT"],function(t,e,n){return MoGu.ui={showMask:function(){t("#M_Mask").show()},hideMask:function(){t("#M_Mask").hide()},showLoading:function(){t("#M_Loading").show()},hideMask:function(){t("#M_Loading").hide()},goTop:function(){},getTemplate:function(t,e){try{return n.template(t)(e)}catch(r){return r}},getdoT:function(){return n}},t.extend(MoGu.ui,e),MoGu}),define("lib/store.js",[],function(){function t(){try{return a in i&&i[a]}catch(t){return!1}}function e(t){return function(){var e=Array.prototype.slice.call(arguments,0);e.unshift(r),c.appendChild(r),r.addBehavior("#default#userData"),r.load(a);var n=t.apply(o,e);return c.removeChild(r),n}}function n(t){return t.replace(h,"___")}var r,i=window,o={},s=i.document,a="localStorage",u="__storejs__";if(o.disabled=!1,o.set=function(){},o.get=function(){},o.remove=function(){},o.clear=function(){},o.transact=function(t,e,n){var r=o.get(t);null==n&&(n=e,e=null),"undefined"==typeof r&&(r=e||{}),n(r),o.set(t,r)},o.getAll=function(){},o.serialize=function(t){return JSON.stringify(t)},o.deserialize=function(t){if("string"!=typeof t)return void 0;try{return JSON.parse(t)}catch(e){return t||void 0}},t())r=i[a],o.set=function(t,e){return void 0===e?o.remove(t):(r.setItem(t,o.serialize(e)),e)},o.get=function(t){return o.deserialize(r.getItem(t))},o.remove=function(t){r.removeItem(t)},o.clear=function(){r.clear()},o.getAll=function(){for(var t={},e=0;e<r.length;++e){var n=r.key(e);t[n]=o.get(n)}return t};else if(s.documentElement.addBehavior){var c,l;try{l=new ActiveXObject("htmlfile"),l.open(),l.write('<script>document.w=window</script><iframe src="/favicon.ico"></iframe>'),l.close(),c=l.w.frames[0].document,r=c.createElement("div")}catch(f){r=s.createElement("div"),c=s.body}var h=new RegExp("[!\"#$%&'()*+,/\\\\:;<=>?@[\\]^`{|}~]","g");o.set=e(function(t,e,r){return e=n(e),void 0===r?o.remove(e):(t.setAttribute(e,o.serialize(r)),t.save(a),r)}),o.get=e(function(t,e){return e=n(e),o.deserialize(t.getAttribute(e))}),o.remove=e(function(t,e){e=n(e),t.removeAttribute(e),t.save(a)}),o.clear=e(function(t){var e=t.XMLDocument.documentElement.attributes;t.load(a);for(var n,r=0;n=e[r];r++)t.removeAttribute(n.name);t.save(a)}),o.getAll=e(function(t){for(var e,r=t.XMLDocument.documentElement.attributes,i={},s=0;e=r[s];++s){var a=n(e.name);i[e.name]=o.deserialize(t.getAttribute(a))}return i})}try{o.set(u,u),o.get(u)!=u&&(o.disabled=!0),o.remove(u)}catch(f){o.disabled=!0}return o.enabled=!o.disabled,o}),define("utilExtend",["./lib/store.js"],function(t){return{inputTextHide:function(t,e){t.focus(function(){var t=$(this);$.trim(t.val())==$.trim(t.attr("def-v"))&&t.val(""),e&&t.addClass(e)}),t.blur(function(){var t=$(this);""==$.trim(t.val())&&(t.val(t.attr("def-v")),e&&t.removeClass(e))})},getStore:function(){return t}}}),define("util/util",["$","utilExtend"],function(t,e){return MoGu.util={setCookie:function(t,e,n){n=n||{},null===e&&(e="",n.expires=-1);var r="";if(n.expires&&("number"==typeof n.expires||n.expires.toUTCString)){var i;"number"==typeof n.expires?(i=new Date,i.setTime(i.getTime()+864e5*n.expires)):i=n.expires,r="; expires="+i.toUTCString()}var o=n.path?"; path="+n.path:"",s=n.secure?"; secure":"",a="";n.domain?a="; domain="+n.domain:(a=document.domain.toString().split("."),a="; domain=."+a[1]+"."+a[2]),document.cookie=[t,"=",encodeURIComponent(e),r,o,a,s].join("")},getCookie:function(t){var e=document.cookie.match(new RegExp("(^| )"+t+"=([^;]*)(;|$)"));return null!==e?decodeURIComponent(e[2]):""},removeCookie:function(t){MGTOOL.setCookie(t,null,{expires:-1})}},t.extend(MoGu.util,e),MoGu}),define("mvc/modules/newModule",["$"],function(t){return function(e){var n={isAutoInit:!0,isAutoRender:!0,initialize:function(){this.isAutoInit&&(this.$el?"string"==typeof this.$el?this.$el=t(this.$el).length?t(this.$el):this._greatElem(this.$el):this.$el instanceof t&&!this.$el.length&&(this.$el=this._greatElem(this.$el)):MoGu.error("没有传入 DOM 节点"),this.addEvent(),this.isAutoRender&&this.model.data&&(this.data=this.model.data))},_greatElem:function(e){var n=e,r='id="';return e instanceof t&&(n=e.selector),0===n.indexOf(".")&&(r='class="'),t("#view").append("<div "+r+n+'" ></div>'),t(n)},_getParam:function(e,n){var r=[];return clickArr=e.split(" "),(executeFn=this[n])?(t.each(clickArr,function(t,e){r.push(e)}),r.push(executeFn),r):(MoGu.error(e+"没有指定 监听的回调函数"),r)},addEvent:function(){for(var t in this.event){var e=this._getParam(t,this.event[t]);this.$el.on.apply(this.$el,e)}},trigger:function(e,n){var r=this.triggerCache[e];if(r){var i=r[0],o=r.length>1?t(r[0]):this.el;o.trigger(i,n)}else MoGu.error(e+"触发了一个不存在的事件")},getData:function(){return t.ajax({url:this.model.url,type:this.model.type||"POST",dataType:this.model.dataType||"json",data:this.model.data||{}})},_updateElDom:function(t){var e=t||this.data,n=MoGu.ui.getTemplate(this.template,e);this.$el.html(n)},render:function(){var t=this;return t.template?t.data?void t._updateElDom():t.getData().done(function(e){t._updateElDom(e)}):void MoGu.error("没有指定模板")}},r=function(){};return r.prototype=t.extend({},n,e),r}}),define("mvc/modules/module",["./newModule"],function(t){return{extend:function(e){var n=t(e),r=new n;return r}}}),define("mvc/router/events",["$"],function(t){var e=0,n=function(t){var n=++e+"";return t?t+n:n},r=function(t){var e,n=!1;return function(){return n?e:(n=!0,e=t.apply(this,arguments),t=null,e)}},i={on:function(t,e,n){if(!eventsApi(this,"on",t,[e,n])||!e)return this;this._events||(this._events={});var r=this._events[t]||(this._events[t]=[]);return r.push({callback:e,context:n,ctx:n||this}),this},once:function(t,e,n){if(!eventsApi(this,"once",t,[e,n])||!e)return this;var i=this,o=r(function(){i.off(t,o),e.apply(this,arguments)});return o._callback=e,this.on(t,o,n)},off:function(t,e,n){if(!this._events||!eventsApi(this,"off",t,[e,n]))return this;if(!t&&!e&&!n)return this._events=void 0,this;for(var r=t?[t]:Object.keys(this._events),i=0,o=r.length;o>i;i++){t=r[i];var s=this._events[t];if(s)if(e||n){for(var a=[],u=0,c=s.length;c>u;u++){var l=s[u];(e&&e!==l.callback&&e!==l.callback._callback||n&&n!==l.context)&&a.push(l)}a.length?this._events[t]=a:delete this._events[t]}else delete this._events[t]}return this},trigger:function(t){if(!this._events)return this;var e=slice.call(arguments,1);if(!eventsApi(this,"trigger",t,e))return this;var n=this._events[t],r=this._events.all;return n&&o(n,e),r&&o(r,arguments),this},stopListening:function(e,n,r){var i=this._listeningTo;if(!i)return this;var o=!n&&!r;r||"object"!=typeof n||(r=this),e&&((i={})[e._listenId]=e);for(var s in i)e=i[s],e.off(n,r,this),(o||t.isEmptyObject(e._events))&&delete this._listeningTo[s];return this}},o=function(t,e){var n,r=-1,i=t.length,o=e[0],s=e[1],a=e[2];switch(e.length){case 0:for(;++r<i;)(n=t[r]).callback.call(n.ctx);return;case 1:for(;++r<i;)(n=t[r]).callback.call(n.ctx,o);return;case 2:for(;++r<i;)(n=t[r]).callback.call(n.ctx,o,s);return;case 3:for(;++r<i;)(n=t[r]).callback.call(n.ctx,o,s,a);return;default:for(;++r<i;)(n=t[r]).callback.apply(n.ctx,e);return}},s={listenTo:"on",listenToOnce:"once"};return t.each(s,function(t,e){i[t]=function(t,r,i){var o=this._listeningTo||(this._listeningTo={}),s=t._listenId||(t._listenId=n("l"));return o[s]=t,i||"object"!=typeof r||(i=this),t[e](r,i,this),this}}),i.bind=i.on,i.unbind=i.off,i}),define("mvc/router/history",["./events"],function(t){var e=/^[#\/]|\s+$/g,n=/^\/+|\/+$/g,r=/#.*$/,i=function(){this.handlers=[],"undefined"!=typeof window&&(this.location=window.location,this.history=window.history)};return i.started=!1,$.extend(i.prototype,t,{atRoot:function(){return this.location.pathname.replace(/[^\/]$/,"$&/")===this.root},getPath:function(){var t=decodeURI(this.location.pathname+this.location.search),e=this.root.slice(0,-1);return t.indexOf(e)||(t=t.slice(e.length)),t.slice(1)},getFragment:function(t){return null==t&&(this._hasPushState||!this._hasPushState)&&(t=this.getPath()),t.replace(e,"")},start:function(t){if(i.started)throw new Error("MOGU.history has already been started");i.started=!0,this.options=$.extend({root:"/"},this.options,t),this.root=this.options.root,this._wantsPushState=!!this.options.pushState,this._hasPushState=this._testPushState();{var e=this.getFragment();document.documentMode}this.root=("/"+this.root+"/").replace(n,"/"),this._hasPushState&&$(window).on("popstate",this.checkUrl.bind(this)),this.fragment=e;this.location;return this.options.silent?void 0:this.loadUrl()},stop:function(){$(window).off("popstate",this.checkUrl.bind(this)),i.started=!1},route:function(t,e){this.handlers.unshift({route:t,callback:e})},checkUrl:function(){var t=this.getFragment();return t===this.fragment&&this.iframe&&(t=this.getFragment(this.getHash(this.iframe))),t===this.fragment?!1:(this.iframe&&this.navigate(t),void this.loadUrl())},loadUrl:function(t){return t=this.fragment=this.getFragment(t),this.handlers.some(function(e){return e.route.test(t)?(e.callback(t),!0):void 0})},navigate:function(t,e){if(!i.started)return!1;void 0===e&&(e=!0),e&&e!==!0||(e={trigger:!!e});var n=this.root+(t=this.getFragment(t||""));return t=t.replace(r,""),this.fragment!==t?(this.fragment=t,""===t&&"/"!==n&&(n=n.slice(0,-1)),this._hasPushState?(this.history[e.replace?"replaceState":"pushState"]({},document.title,n),e.trigger?this.loadUrl(t):void 0):this.location.assign(n)):void 0},_testPushState:function(){var t=!!(this.options.pushState&&this.history&&this.history.pushState);if(t){var e=document.URL;return this.history.replaceState({},document.title,"pushState"),e!==document.location.href?(this.history.replaceState({},document.title,e),!0):!1}return!1}}),i}),define("mvc/router/router",["./history","./events","$"],function(t,e,n){var r={};r.history=new t,n.each(["Arguments","Function","String","Number","Date","RegExp"],function(t,e){r["is"+e]=function(t){return toString.call(t)=="[object "+e+"]"}});var i=function(t){t||(t={}),n.extend(this,t),this._bindRoutes(),this.initialize.apply(this,arguments),r.history.start(t.start)},o=/\((.*?)\)/g,s=/(\(\?)?:\w+/g,a=/\*\w+/g,u=/[\-{}\[\]+?.,\\\^$|#\s]/g;return n.extend(i.prototype,e,{initialize:function(){},route:function(t,e,n){r.isRegExp(t)||(t=this._routeToRegExp(t)),r.isFunction(e)&&(n=e,e=""),n||(n=this.routeFn[e]);var i=this;return r.history.route(t,function(o){var s=i._extractParameters(t,o);i.execute(n,s),i.trigger.apply(i,["route:"+e].concat(s)),i.trigger("route",e,s),r.history.trigger("route",i,e,s)}),this},execute:function(t,e){t&&t.apply(this,e)},navigate:function(t,e){return r.history.navigate(t,e),this},_bindRoutes:function(){if(this.routes)for(var t,e=Object.keys(this.routes);null!=(t=e.pop());)this.route(t,this.routes[t])},_routeToRegExp:function(t){return t=t.replace(u,"\\$&").replace(o,"(?:$1)?").replace(s,function(t,e){return e?t:"([^/?]+)"}).replace(a,"([^?]*?)"),new RegExp("^"+t+"(?:\\?([\\s\\S]*))?$")},_extractParameters:function(t,e){var n=t.exec(e).slice(1);return n.map(function(t,e){return e===n.length-1?t||null:t?decodeURIComponent(t):null})}}),i}),define("mvc/base",["../core/core","./modules/module","./router/router"],function(t,e,n){$.extend(MoGu,{module:e,router:n})}),require(["./core/core","./core/error","./fn/fn","./ui/ui","./util/util","./mvc/base"]),define("base",function(){});