(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/qianshoukuaidi/add-or-update"],{"05e2":function(t,e,n){"use strict";(function(t){function r(t){return r="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&"function"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?"symbol":typeof t},r(t)}function i(){/*! regenerator-runtime -- Copyright (c) 2014-present, Facebook, Inc. -- license (MIT): https://github.com/facebook/regenerator/blob/main/LICENSE */i=function(){return e};var t,e={},n=Object.prototype,a=n.hasOwnProperty,o=Object.defineProperty||function(t,e,n){t[e]=n.value},u="function"==typeof Symbol?Symbol:{},s=u.iterator||"@@iterator",c=u.asyncIterator||"@@asyncIterator",h=u.toStringTag||"@@toStringTag";function l(t,e,n){return Object.defineProperty(t,e,{value:n,enumerable:!0,configurable:!0,writable:!0}),t[e]}try{l({},"")}catch(t){l=function(t,e,n){return t[e]=n}}function f(t,e,n,r){var i=e&&e.prototype instanceof v?e:v,a=Object.create(i.prototype),u=new _(r||[]);return o(a,"_invoke",{value:L(t,n,u)}),a}function d(t,e,n){try{return{type:"normal",arg:t.call(e,n)}}catch(t){return{type:"throw",arg:t}}}e.wrap=f;var g="suspendedStart",p="suspendedYield",m="executing",y="completed",b={};function v(){}function x(){}function k(){}var w={};l(w,s,(function(){return this}));var j=Object.getPrototypeOf,F=j&&j(j(P([])));F&&F!==n&&a.call(F,s)&&(w=F);var S=k.prototype=v.prototype=Object.create(w);function z(t){["next","throw","return"].forEach((function(e){l(t,e,(function(t){return this._invoke(e,t)}))}))}function $(t,e){function n(i,o,u,s){var c=d(t[i],t,o);if("throw"!==c.type){var h=c.arg,l=h.value;return l&&"object"==r(l)&&a.call(l,"__await")?e.resolve(l.__await).then((function(t){n("next",t,u,s)}),(function(t){n("throw",t,u,s)})):e.resolve(l).then((function(t){h.value=t,u(h)}),(function(t){return n("throw",t,u,s)}))}s(c.arg)}var i;o(this,"_invoke",{value:function(t,r){function a(){return new e((function(e,i){n(t,r,e,i)}))}return i=i?i.then(a,a):a()}})}function L(e,n,r){var i=g;return function(a,o){if(i===m)throw new Error("Generator is already running");if(i===y){if("throw"===a)throw o;return{value:t,done:!0}}for(r.method=a,r.arg=o;;){var u=r.delegate;if(u){var s=O(u,r);if(s){if(s===b)continue;return s}}if("next"===r.method)r.sent=r._sent=r.arg;else if("throw"===r.method){if(i===g)throw i=y,r.arg;r.dispatchException(r.arg)}else"return"===r.method&&r.abrupt("return",r.arg);i=m;var c=d(e,n,r);if("normal"===c.type){if(i=r.done?y:p,c.arg===b)continue;return{value:c.arg,done:r.done}}"throw"===c.type&&(i=y,r.method="throw",r.arg=c.arg)}}}function O(e,n){var r=n.method,i=e.iterator[r];if(i===t)return n.delegate=null,"throw"===r&&e.iterator.return&&(n.method="return",n.arg=t,O(e,n),"throw"===n.method)||"return"!==r&&(n.method="throw",n.arg=new TypeError("The iterator does not provide a '"+r+"' method")),b;var a=d(i,e.iterator,n.arg);if("throw"===a.type)return n.method="throw",n.arg=a.arg,n.delegate=null,b;var o=a.arg;return o?o.done?(n[e.resultName]=o.value,n.next=e.nextLoc,"return"!==n.method&&(n.method="next",n.arg=t),n.delegate=null,b):o:(n.method="throw",n.arg=new TypeError("iterator result is not an object"),n.delegate=null,b)}function E(t){var e={tryLoc:t[0]};1 in t&&(e.catchLoc=t[1]),2 in t&&(e.finallyLoc=t[2],e.afterLoc=t[3]),this.tryEntries.push(e)}function T(t){var e=t.completion||{};e.type="normal",delete e.arg,t.completion=e}function _(t){this.tryEntries=[{tryLoc:"root"}],t.forEach(E,this),this.reset(!0)}function P(e){if(e||""===e){var n=e[s];if(n)return n.call(e);if("function"==typeof e.next)return e;if(!isNaN(e.length)){var i=-1,o=function n(){for(;++i<e.length;)if(a.call(e,i))return n.value=e[i],n.done=!1,n;return n.value=t,n.done=!0,n};return o.next=o}}throw new TypeError(r(e)+" is not iterable")}return x.prototype=k,o(S,"constructor",{value:k,configurable:!0}),o(k,"constructor",{value:x,configurable:!0}),x.displayName=l(k,h,"GeneratorFunction"),e.isGeneratorFunction=function(t){var e="function"==typeof t&&t.constructor;return!!e&&(e===x||"GeneratorFunction"===(e.displayName||e.name))},e.mark=function(t){return Object.setPrototypeOf?Object.setPrototypeOf(t,k):(t.__proto__=k,l(t,h,"GeneratorFunction")),t.prototype=Object.create(S),t},e.awrap=function(t){return{__await:t}},z($.prototype),l($.prototype,c,(function(){return this})),e.AsyncIterator=$,e.async=function(t,n,r,i,a){void 0===a&&(a=Promise);var o=new $(f(t,n,r,i),a);return e.isGeneratorFunction(n)?o:o.next().then((function(t){return t.done?t.value:o.next()}))},z(S),l(S,h,"Generator"),l(S,s,(function(){return this})),l(S,"toString",(function(){return"[object Generator]"})),e.keys=function(t){var e=Object(t),n=[];for(var r in e)n.push(r);return n.reverse(),function t(){for(;n.length;){var r=n.pop();if(r in e)return t.value=r,t.done=!1,t}return t.done=!0,t}},e.values=P,_.prototype={constructor:_,reset:function(e){if(this.prev=0,this.next=0,this.sent=this._sent=t,this.done=!1,this.delegate=null,this.method="next",this.arg=t,this.tryEntries.forEach(T),!e)for(var n in this)"t"===n.charAt(0)&&a.call(this,n)&&!isNaN(+n.slice(1))&&(this[n]=t)},stop:function(){this.done=!0;var t=this.tryEntries[0].completion;if("throw"===t.type)throw t.arg;return this.rval},dispatchException:function(e){if(this.done)throw e;var n=this;function r(r,i){return u.type="throw",u.arg=e,n.next=r,i&&(n.method="next",n.arg=t),!!i}for(var i=this.tryEntries.length-1;i>=0;--i){var o=this.tryEntries[i],u=o.completion;if("root"===o.tryLoc)return r("end");if(o.tryLoc<=this.prev){var s=a.call(o,"catchLoc"),c=a.call(o,"finallyLoc");if(s&&c){if(this.prev<o.catchLoc)return r(o.catchLoc,!0);if(this.prev<o.finallyLoc)return r(o.finallyLoc)}else if(s){if(this.prev<o.catchLoc)return r(o.catchLoc,!0)}else{if(!c)throw new Error("try statement without catch or finally");if(this.prev<o.finallyLoc)return r(o.finallyLoc)}}}},abrupt:function(t,e){for(var n=this.tryEntries.length-1;n>=0;--n){var r=this.tryEntries[n];if(r.tryLoc<=this.prev&&a.call(r,"finallyLoc")&&this.prev<r.finallyLoc){var i=r;break}}i&&("break"===t||"continue"===t)&&i.tryLoc<=e&&e<=i.finallyLoc&&(i=null);var o=i?i.completion:{};return o.type=t,o.arg=e,i?(this.method="next",this.next=i.finallyLoc,b):this.complete(o)},complete:function(t,e){if("throw"===t.type)throw t.arg;return"break"===t.type||"continue"===t.type?this.next=t.arg:"return"===t.type?(this.rval=this.arg=t.arg,this.method="return",this.next="end"):"normal"===t.type&&e&&(this.next=e),b},finish:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var n=this.tryEntries[e];if(n.finallyLoc===t)return this.complete(n.completion,n.afterLoc),T(n),b}},catch:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var n=this.tryEntries[e];if(n.tryLoc===t){var r=n.completion;if("throw"===r.type){var i=r.arg;T(n)}return i}}throw new Error("illegal catch attempt")},delegateYield:function(e,n,r){return this.delegate={iterator:P(e),resultName:n,nextLoc:r},"next"===this.method&&(this.arg=t),b}},e}function a(t,e,n,r,i,a,o){try{var u=t[a](o),s=u.value}catch(c){return void n(c)}u.done?e(s):Promise.resolve(s).then(r,i)}function o(t){return function(){var e=this,n=arguments;return new Promise((function(r,i){var o=t.apply(e,n);function u(t){a(o,r,i,u,s,"next",t)}function s(t){a(o,r,i,u,s,"throw",t)}u(void 0)}))}}Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var u=function(){Promise.all([n.e("common/vendor"),n.e("components/w-picker/w-picker")]).then(function(){return resolve(n("e2b1"))}.bind(null,n)).catch(n.oe)},s=function(){n.e("components/xia-editor/xia-editor").then(function(){return resolve(n("064f"))}.bind(null,n)).catch(n.oe)},c=function(){n.e("components/momo-multipleSelect/momo-multipleSelect").then(function(){return resolve(n("bd56"))}.bind(null,n)).catch(n.oe)};e.default={data:function(){return{cross:"",ruleForm:{kuaididanhao:"",kuaidimingcheng:"",tupian:"",kuaidileixing:"",zhanghao:"",xingming:"",shouji:"",cunfangdizhi:"",kuaidijianjie:"",zhuangtai:"待收件",dengjishijian:""},zhanghaoOptions:[],zhanghaoIndex:0,zhuangtaiOptions:[],zhuangtaiIndex:0,user:{},ro:{kuaididanhao:!1,kuaidimingcheng:!1,tupian:!1,kuaidileixing:!1,zhanghao:!1,xingming:!1,shouji:!1,cunfangdizhi:!1,kuaidijianjie:!1,zhuangtai:!1,dengjishijian:!1}}},components:{wPicker:u,xiaEditor:s,multipleSelect:c},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=o(i().mark((function e(n){var r,a,o,u,s=this;return i().wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.ruleForm.dengjishijian=this.$utils.getCurDateTime(),r=t.getStorageSync("nowTable"),e.next=4,this.$api.session(r);case 4:return a=e.sent,this.user=a.data,this.ro.zhuangtai=!0,e.next=9,this.$api.option("yonghu","zhanghao",{});case 9:if(a=e.sent,this.zhanghaoOptions=a.data,this.zhuangtaiOptions="已收件,待收件".split(","),this.ruleForm.userid=t.getStorageSync("appUserid"),n.refid&&(this.ruleForm.refid=Number(n.refid),this.ruleForm.nickname=t.getStorageSync("nickname")),!n.id){e.next=20;break}return this.ruleForm.id=n.id,e.next=18,this.$api.info("qianshoukuaidi",this.ruleForm.id);case 18:a=e.sent,this.ruleForm=a.data;case 20:if(this.cross=n.cross,!n.cross){e.next=72;break}o=t.getStorageSync("crossObj"),e.t0=i().keys(o);case 24:if((e.t1=e.t0()).done){e.next=72;break}if(u=e.t1.value,"kuaididanhao"!=u){e.next=30;break}return this.ruleForm.kuaididanhao=o[u],this.ro.kuaididanhao=!0,e.abrupt("continue",24);case 30:if("kuaidimingcheng"!=u){e.next=34;break}return this.ruleForm.kuaidimingcheng=o[u],this.ro.kuaidimingcheng=!0,e.abrupt("continue",24);case 34:if("tupian"!=u){e.next=38;break}return this.ruleForm.tupian=o[u].split(",")[0],this.ro.tupian=!0,e.abrupt("continue",24);case 38:if("kuaidileixing"!=u){e.next=42;break}return this.ruleForm.kuaidileixing=o[u],this.ro.kuaidileixing=!0,e.abrupt("continue",24);case 42:if("zhanghao"!=u){e.next=46;break}return this.ruleForm.zhanghao=o[u],this.ro.zhanghao=!0,e.abrupt("continue",24);case 46:if("xingming"!=u){e.next=50;break}return this.ruleForm.xingming=o[u],this.ro.xingming=!0,e.abrupt("continue",24);case 50:if("shouji"!=u){e.next=54;break}return this.ruleForm.shouji=o[u],this.ro.shouji=!0,e.abrupt("continue",24);case 54:if("cunfangdizhi"!=u){e.next=58;break}return this.ruleForm.cunfangdizhi=o[u],this.ro.cunfangdizhi=!0,e.abrupt("continue",24);case 58:if("kuaidijianjie"!=u){e.next=62;break}return this.ruleForm.kuaidijianjie=o[u],this.ro.kuaidijianjie=!0,e.abrupt("continue",24);case 62:if("zhuangtai"!=u){e.next=66;break}return this.ruleForm.zhuangtai=o[u],this.ro.zhuangtai=!0,e.abrupt("continue",24);case 66:if("dengjishijian"!=u){e.next=70;break}return this.ruleForm.dengjishijian=o[u],this.ro.dengjishijian=!0,e.abrupt("continue",24);case 70:e.next=24;break;case 72:this.styleChange(),this.$forceUpdate(),t.getStorageSync("raffleType")&&null!=t.getStorageSync("raffleType")&&(t.removeStorageSync("raffleType"),setTimeout((function(){s.onSubmitTap()}),300));case 75:case"end":return e.stop()}}),e,this)})));function n(t){return e.apply(this,arguments)}return n}(),methods:{styleChange:function(){this.$nextTick((function(){}))},zhanghaoChange:function(){var t=o(i().mark((function t(e){var n;return i().wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.zhanghaoIndex=e.target.value,this.ruleForm.zhanghao=this.zhanghaoOptions[this.zhanghaoIndex],t.next=4,this.$api.follow("yonghu","zhanghao",{columnValue:this.ruleForm.zhanghao});case 4:n=t.sent,n.data.xingming&&(this.ruleForm.xingming=n.data.xingming),n.data.shouji&&(this.ruleForm.shouji=n.data.shouji);case 7:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),dengjishijianConfirm:function(t){console.log(t),this.ruleForm.dengjishijian=t.result,this.$forceUpdate()},zhuangtaiChange:function(t){this.zhuangtaiIndex=t.target.value,this.ruleForm.zhuangtai=this.zhuangtaiOptions[this.zhuangtaiIndex]},tupianTap:function(){var t=this;this.$api.upload((function(e){t.ruleForm.tupian="upload/"+e.file,t.$forceUpdate(),t.$nextTick((function(){t.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=o(i().mark((function e(){var n,r,a,o,u,s,c,h,l,f;return i().wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.kuaididanhao){e.next=3;break}return this.$utils.msg("快递单号不能为空"),e.abrupt("return");case 3:if(this.ruleForm.kuaidimingcheng){e.next=6;break}return this.$utils.msg("快递名称不能为空"),e.abrupt("return");case 6:if(this.ruleForm.tupian){e.next=9;break}return this.$utils.msg("图片不能为空"),e.abrupt("return");case 9:if(this.ruleForm.kuaidileixing){e.next=12;break}return this.$utils.msg("快递类型不能为空"),e.abrupt("return");case 12:if(this.ruleForm.zhanghao){e.next=15;break}return this.$utils.msg("账号不能为空"),e.abrupt("return");case 15:if(!this.ruleForm.shouji||this.$validate.isMobile(this.ruleForm.shouji)){e.next=18;break}return this.$utils.msg("手机应输入手机格式"),e.abrupt("return");case 18:if(this.ruleForm.cunfangdizhi){e.next=21;break}return this.$utils.msg("存放地址不能为空"),e.abrupt("return");case 21:if(this.ruleForm.kuaidijianjie){e.next=24;break}return this.$utils.msg("快递简介不能为空"),e.abrupt("return");case 24:if(this.ruleForm.zhuangtai){e.next=27;break}return this.$utils.msg("状态不能为空"),e.abrupt("return");case 27:if(!this.cross){e.next=44;break}if(t.setStorageSync("crossCleanType",!0),u=t.getStorageSync("statusColumnName"),s=t.getStorageSync("statusColumnValue"),""==u){e.next=44;break}if(n||(n=t.getStorageSync("crossObj")),u.startsWith("[")){e.next=40;break}for(c in n)c==u&&(n[c]=s);return h=t.getStorageSync("crossTable"),e.next=38,this.$api.update("".concat(h),n);case 38:e.next=44;break;case 40:r=Number(t.getStorageSync("appUserid")),a=n["id"],o=t.getStorageSync("statusColumnName"),o=o.replace(/\[/,"").replace(/\]/,"");case 44:if(!a||!r){e.next=67;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=a,l={page:1,limit:10,crossuserid:r,crossrefid:a},e.next=50,this.$api.list("qianshoukuaidi",l);case 50:if(f=e.sent,!(f.data.total>=o)){e.next=57;break}return this.$utils.msg(t.getStorageSync("tips")),t.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 57:if(!this.ruleForm.id){e.next=62;break}return e.next=60,this.$api.update("qianshoukuaidi",this.ruleForm);case 60:e.next=64;break;case 62:return e.next=64,this.$api.add("qianshoukuaidi",this.ruleForm);case 64:this.$utils.msgBack("提交成功");case 65:e.next=75;break;case 67:if(!this.ruleForm.id){e.next=72;break}return e.next=70,this.$api.update("qianshoukuaidi",this.ruleForm);case 70:e.next=74;break;case 72:return e.next=74,this.$api.add("qianshoukuaidi",this.ruleForm);case 74:this.$utils.msgBack("提交成功");case 75:case"end":return e.stop()}}),e,this)})));function n(){return e.apply(this,arguments)}return n}(),optionsChange:function(t){this.index=t.target.value},bindDateChange:function(t){this.date=t.target.value},getDate:function(t){var e=new Date,n=e.getFullYear(),r=e.getMonth()+1,i=e.getDate();return"start"===t?n-=60:"end"===t&&(n+=2),r=r>9?r:"0"+r,i=i>9?i:"0"+i,"".concat(n,"-").concat(r,"-").concat(i)},toggleTab:function(t){if(this.ro[t])return!1;this.$refs[t].show()}}}}).call(this,n("255a")["default"])},1450:function(t,e,n){"use strict";(function(t){n("6cdc");r(n("dda7"));var e=r(n("8b28"));function r(t){return t&&t.__esModule?t:{default:t}}t(e.default)}).call(this,n("255a")["createPage"])},"8b28":function(t,e,n){"use strict";n.r(e);var r=n("f5db"),i=n("e541");for(var a in i)["default"].indexOf(a)<0&&function(t){n.d(e,t,(function(){return i[t]}))}(a);n("c305");var o,u=n("7702"),s=Object(u["a"])(i["default"],r["b"],r["c"],!1,null,"5421bb47",null,!1,r["a"],o);e["default"]=s.exports},"951e":function(t,e,n){},c305:function(t,e,n){"use strict";var r=n("951e"),i=n.n(r);i.a},e541:function(t,e,n){"use strict";n.r(e);var r=n("05e2"),i=n.n(r);for(var a in r)["default"].indexOf(a)<0&&function(t){n.d(e,t,(function(){return r[t]}))}(a);e["default"]=i.a},f5db:function(t,e,n){"use strict";n.d(e,"b",(function(){return i})),n.d(e,"c",(function(){return a})),n.d(e,"a",(function(){return r}));var r={wPicker:function(){return Promise.all([n.e("common/vendor"),n.e("components/w-picker/w-picker")]).then(n.bind(null,"e2b1"))}},i=function(){var t=this,e=t.$createElement,n=(t._self._c,t.ruleForm.tupian?t.ruleForm.tupian.split(","):null);t.$mp.data=Object.assign({},{$root:{g0:n}})},a=[]}},[["1450","common/runtime","common/vendor"]]]);