(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shequgonggao-add-or-update"],{"3c4d":function(e,t,r){"use strict";r.r(t);var i=r("dfba"),n=r("c941");for(var a in n)"default"!==a&&function(e){r.d(t,e,(function(){return n[e]}))}(a);r("72fc");var o,s=r("f0c5"),u=Object(s["a"])(n["default"],i["b"],i["c"],!1,null,"8a70b266",null,!1,i["a"],o);t["default"]=u.exports},"72fc":function(e,t,r){"use strict";var i=r("8c32"),n=r.n(i);n.a},"8c32":function(e,t,r){var i=r("e442");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var n=r("4f06").default;n("37f3e93b",i,!0,{sourceMap:!1,shadowMode:!1})},c941:function(e,t,r){"use strict";r.r(t);var i=r("f570"),n=r.n(i);for(var a in i)"default"!==a&&function(e){r.d(t,e,(function(){return i[e]}))}(a);t["default"]=n.a},dfba:function(e,t,r){"use strict";var i={"xia-editor":r("064f").default,"w-picker":r("e2b1").default},n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-uni-view",{staticClass:"content"},[r("v-uni-view",{style:{width:"100%",padding:"0",position:"relative",background:"#fff",height:"100%"}},[r("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx",background:"#fff",display:"block",height:"auto"}},[r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("公告标题")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.gonggaobiaoti,placeholder:"公告标题",type:"text"},model:{value:e.ruleForm.gonggaobiaoti,callback:function(t){e.$set(e.ruleForm,"gonggaobiaoti",t)},expression:"ruleForm.gonggaobiaoti"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("类型")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.leixing,placeholder:"类型",type:"text"},model:{value:e.ruleForm.leixing,callback:function(t){e.$set(e.ruleForm,"leixing",t)},expression:"ruleForm.leixing"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.tupianTap.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("图片")]),e.ruleForm.tupian?r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.tupian.split(",")[0],mode:"aspectFill"}}):r("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",alignItems:"center",borderWidth:"0 0 2rpx 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("发布日期")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"rgb(0, 0, 0)",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.faburiqi,placeholder:"发布日期"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.toggleTab("faburiqi")}},model:{value:e.ruleForm.faburiqi,callback:function(t){e.$set(e.ruleForm,"faburiqi",t)},expression:"ruleForm.faburiqi"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"center",fontWeight:"500"}},[e._v("内容")]),r("xia-editor",{ref:"editor",style:{minHeight:"360rpx",border:"2rpx solid #efefef",width:"100%",height:"auto"},attrs:{placeholder:"内容"},on:{editorChange:function(t){arguments[0]=t=e.$handleEvent(t),e.neirongChange.apply(void 0,arguments)}},model:{value:e.ruleForm.neirong,callback:function(t){e.$set(e.ruleForm,"neirong",t)},expression:"ruleForm.neirong"}})],1),r("v-uni-view",{staticClass:"btn",style:{width:"100%",alignItems:"center",justifyContent:"center",display:"flex",height:"auto"}},[r("v-uni-button",{staticClass:"bg-red",style:{border:"0",padding:"0px",margin:"0",color:"rgb(255, 255, 255)",background:"#D4CF5D",width:"48%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1),r("w-picker",{ref:"faburiqi",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(t){arguments[0]=t=e.$handleEvent(t),e.faburiqiConfirm.apply(void 0,arguments)}}})],1)],1)},a=[];r.d(t,"b",(function(){return n})),r.d(t,"c",(function(){return a})),r.d(t,"a",(function(){return i}))},e442:function(e,t,r){var i=r("24fb");t=i(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-8a70b266]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=t},f570:function(e,t,r){"use strict";var i=r("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,r("a481"),r("f559"),r("ac6a"),r("28a5"),r("c5f6"),r("96cf");var n=i(r("3b8d")),a=i(r("e2b1")),o=i(r("064f")),s=i(r("bd56")),u={data:function(){return{cross:"",ruleForm:{gonggaobiaoti:"",leixing:"",tupian:"",neirong:"",faburiqi:""},user:{},ro:{gonggaobiaoti:!1,leixing:!1,tupian:!1,neirong:!1,faburiqi:!1}}},components:{wPicker:a.default,xiaEditor:o.default,multipleSelect:s.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(t){var r,i,n,a,o=this;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.ruleForm.faburiqi=this.$utils.getCurDateTime(),r=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(r);case 4:if(i=e.sent,this.user=i.data,this.ruleForm.userid=uni.getStorageSync("appUserid"),t.refid&&(this.ruleForm.refid=Number(t.refid),this.ruleForm.nickname=uni.getStorageSync("nickname")),!t.id){e.next=14;break}return this.ruleForm.id=t.id,e.next=12,this.$api.info("shequgonggao",this.ruleForm.id);case 12:i=e.sent,this.ruleForm=i.data;case 14:if(this.cross=t.cross,!t.cross){e.next=42;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 18:if((e.t1=e.t0()).done){e.next=42;break}if(a=e.t1.value,"gonggaobiaoti"!=a){e.next=24;break}return this.ruleForm.gonggaobiaoti=n[a],this.ro.gonggaobiaoti=!0,e.abrupt("continue",18);case 24:if("leixing"!=a){e.next=28;break}return this.ruleForm.leixing=n[a],this.ro.leixing=!0,e.abrupt("continue",18);case 28:if("tupian"!=a){e.next=32;break}return this.ruleForm.tupian=n[a].split(",")[0],this.ro.tupian=!0,e.abrupt("continue",18);case 32:if("neirong"!=a){e.next=36;break}return this.ruleForm.neirong=n[a],this.ro.neirong=!0,e.abrupt("continue",18);case 36:if("faburiqi"!=a){e.next=40;break}return this.ruleForm.faburiqi=n[a],this.ro.faburiqi=!0,e.abrupt("continue",18);case 40:e.next=18;break;case 42:this.styleChange(),this.$forceUpdate(),uni.getStorageSync("raffleType")&&null!=uni.getStorageSync("raffleType")&&(uni.removeStorageSync("raffleType"),setTimeout((function(){o.onSubmitTap()}),300));case 45:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),methods:{neirongChange:function(e){this.ruleForm.neirong=e},styleChange:function(){this.$nextTick((function(){}))},faburiqiConfirm:function(e){console.log(e),this.ruleForm.faburiqi=e.result,this.$forceUpdate()},tupianTap:function(){var e=this;this.$api.upload((function(t){e.ruleForm.tupian="upload/"+t.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var t,r,i,n,a,o,s,u,l,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.gonggaobiaoti){e.next=3;break}return this.$utils.msg("公告标题不能为空"),e.abrupt("return");case 3:if(this.ruleForm.leixing){e.next=6;break}return this.$utils.msg("类型不能为空"),e.abrupt("return");case 6:if(!this.cross){e.next=23;break}if(uni.setStorageSync("crossCleanType",!0),a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=23;break}if(t||(t=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=19;break}for(s in t)s==a&&(t[s]=o);return u=uni.getStorageSync("crossTable"),e.next=17,this.$api.update("".concat(u),t);case 17:e.next=23;break;case 19:r=Number(uni.getStorageSync("appUserid")),i=t["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 23:if(!i||!r){e.next=46;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=i,l={page:1,limit:10,crossuserid:r,crossrefid:i},e.next=29,this.$api.list("shequgonggao",l);case 29:if(c=e.sent,!(c.data.total>=n)){e.next=36;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 36:if(!this.ruleForm.id){e.next=41;break}return e.next=39,this.$api.update("shequgonggao",this.ruleForm);case 39:e.next=43;break;case 41:return e.next=43,this.$api.add("shequgonggao",this.ruleForm);case 43:this.$utils.msgBack("提交成功");case 44:e.next=54;break;case 46:if(!this.ruleForm.id){e.next=51;break}return e.next=49,this.$api.update("shequgonggao",this.ruleForm);case 49:e.next=53;break;case 51:return e.next=53,this.$api.add("shequgonggao",this.ruleForm);case 53:this.$utils.msgBack("提交成功");case 54:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var t=new Date,r=t.getFullYear(),i=t.getMonth()+1,n=t.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),i=i>9?i:"0"+i,n=n>9?n:"0"+n,"".concat(r,"-").concat(i,"-").concat(n)},toggleTab:function(e){if(this.ro[e])return!1;this.$refs[e].show()}}};t.default=u}}]);