<template>
<view class="content">
	<view class="box" :style='{"padding":"80rpx 0 0 0","backgroundColor":"#fff","backgroundImage":"url(http://codegen.caihongy.cn/20231129/e8410bdf8b224d6fb345eb65254a74e8.png)","width":"100%","backgroundSize":"100% 100%","position":"relative","height":"100%"}'>
		<view :style='{"width":"100%","padding":"24rpx 100rpx","display":"block","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">账号：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.zhanghao"  type="text"  class="uni-input" name="" placeholder="账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">确认密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">姓名：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.xingming"  type="text"  class="uni-input" name="" placeholder="姓名" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">性别：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexWrap":"wrap","display":"flex","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
					<view>
						<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#D4CF5D"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">手机：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.shouji"  type="text"  class="uni-input" name="" placeholder="手机" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">头像：</view>
				<image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">密保问题：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.pquestion"  type="text"  class="uni-input" name="" placeholder="密保问题" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">密保答案：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.panswer"  type="text"  class="uni-input" name="" placeholder="密保答案" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">管理员号：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.guanliyuanhao"  type="text"  class="uni-input" name="" placeholder="管理员号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">管理员名：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.guanliyuanming"  type="text"  class="uni-input" name="" placeholder="管理员名" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">确认密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">性别：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexWrap":"wrap","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'"  @change="shequguanliyuanxingbieChange" :value="shequguanliyuanxingbieIndex" :range="shequguanliyuanxingbieOptions">
					<view>
						<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#D4CF5D"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">联系电话：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.lianxidianhua"  type="text"  class="uni-input" name="" placeholder="联系电话" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='shequguanliyuan'" @tap="shequguanliyuantouxiangTap" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">头像：</view>
				<image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<button :style='{"border":"0","padding":"0px","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"8rpx","background":"#D4CF5D","width":"100%","lineHeight":"88rpx","fontSize":"48rpx","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
			
			<view class="idea1" :style='{"color":"#000000","top":"40rpx","display":"none","width":"100%","fontSize":"72rpx","position":"absolute","height":"80rpx"}'>欢迎注册</view>
			<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
			<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
                shequguanliyuanxingbieOptions: [],
                shequguanliyuanxingbieIndex: 0,
				ruleForm: {
                zhanghao: '',
                mima: '',
                xingming: '',
                xingbie: '',
                shouji: '',
                touxiang: '',
                pquestion: '',
                panswer: '',
                guanliyuanhao: '',
                guanliyuanming: '',
                mima: '',
                xingbie: '',
                lianxidianhua: '',
                touxiang: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='shequguanliyuan'){
                this.shequguanliyuanxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.shequguanliyuanxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },
            // 下拉变化
            shequguanliyuanxingbieChange(e) {
                    this.shequguanliyuanxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.shequguanliyuanxingbieOptions[this.shequguanliyuanxingbieIndex]
            },
            shequguanliyuantouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				
				if((!this.ruleForm.zhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.xingming) && `yonghu` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.pquestion==''){
				    this.$utils.msg(`密保问题不能为空`);
				    return
				}
				if(`yonghu` == this.tableName && this.ruleForm.panswer==''){
				    this.$utils.msg(`密保答案不能为空`);
				    return
				}
                if(`shequguanliyuan` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if(`shequguanliyuan` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
