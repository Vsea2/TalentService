<template>
<view class="content">
	<view :style='{"width":"100%","padding":"10rpx 2%","position":"relative","background":"#DFD8CC","height":"auto"}'>
		<swiper :style='{"width":"100%","overflow":"hidden","borderRadius":"10rpx","background":"#fff","height":"360rpx"}' class="swiper" :indicator-dots='true' :autoplay='true' :circular='true' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='true'>
			<swiper-item :style='{"width":"100%","background":"#fff","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333","background":"#fff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>
		<!-- menu -->
		<view v-if="true" class="menu" :style='{"width":"100%","padding":"0","margin":"0","flexWrap":"wrap","display":"flex","height":"auto"}'>
            <block v-for="(item,index1) in menuList" v-bind:key="item.roleName">
                <block v-if="index1==0" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"width":"23%","padding":"12rpx 0","margin":"10rpx 1%","height":"auto"}' class="menu-list" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2(child.tableName)">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0","margin":"0px auto","color":"#333","borderRadius":"10rpx","textAlign":"center","background":"#D4CF5D","display":"block","width":"100rpx","lineHeight":"100rpx","fontSize":"64rpx","height":"100rpx"}'></view>
                                <view :style='{"padding":"0","margin":"12rpx auto 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		<!-- 商品列表 -->
		<view class="listBox list" :style='{"width":"100%","margin":"0 0 20rpx","overflow":"hidden","borderRadius":"20rpx","background":"#fff"}'>
			<view class="title" :style='{"width":"100%","padding":"0 24rpx","margin":"0","background":"#D4CF5D","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"color":"#fff","fontSize":"48rpx","lineHeight":"88rpx"}'>社区公告</view>
				<view :style='{"alignItems":"center","justifyContent":"center","display":"flex"}' @tap="onPageTap('shequgonggao')">
				  <text :style='{"color":"#fff","fontSize":"28rpx"}'>更多</text>
				  <text class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"28rpx"}'></text>
				</view>
			</view>
		  <!-- 样式4 -->
		  <view v-if="4 == 4" class="list-box style4" :style='{"width":"100%","padding":"24rpx","margin":"0","height":"auto"}'>
			<view class="list-item" :style='{"width":"100%","padding":"0","margin":"0 0 20rpx","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view v-if="homeshequgonggaolist.length > 0" @tap="onDetailTap('shequgonggao',homeshequgonggaolist[0].id)" class="box box1" :style='{"padding":"0","margin":"0","overflow":"hidden","borderRadius":"20rpx","width":"60%","position":"relative","height":"auto"}'>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"672rpx"}' class="list-item-image" mode="aspectFill" v-if="homeshequgonggaolist[0].tupian.substring(0,4)=='http'" :src="homeshequgonggaolist[0].tupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"672rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeshequgonggaolist[0].tupian?baseUrl+homeshequgonggaolist[0].tupian.split(',')[0]:''"></image>
				<view :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(223,216,204,0.7)"}'>
					<view :style='{"padding":"0 20rpx","lineHeight":"1.5","fontSize":"32rpx","color":"#000000"}' class="title ">{{homeshequgonggaolist[0].gonggaobiaoti}}</view>
					<view :style='{"padding":"0 20rpx","display":"none"}'>
					  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#000000"}'></text>
					  <text :style='{"color":"#000000","lineHeight":"1.5","fontSize":"24rpx"}'>{{homeshequgonggaolist[0].addtime}}</text>
					</view>
				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"38%","padding":"0","margin":"0","height":"auto"}'>
				<view v-if="homeshequgonggaolist.length > 1" @tap="onDetailTap('shequgonggao',homeshequgonggaolist[1].id)" class="box box2" :style='{"padding":"0","margin":"0 0 20rpx","overflow":"hidden","borderRadius":"20rpx","width":"100%","position":"relative","height":"auto"}'>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeshequgonggaolist[1].tupian.substring(0,4)=='http'" :src="homeshequgonggaolist[1].tupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeshequgonggaolist[1].tupian?baseUrl+homeshequgonggaolist[1].tupian.split(',')[0]:''"></image>
				  <view :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(223,216,204,0.7)"}'>
					<view :style='{"padding":"0 20rpx","lineHeight":"1.5","fontSize":"32rpx","color":"#000000"}' class="title ">{{homeshequgonggaolist[1].gonggaobiaoti}}</view>
					<view :style='{"padding":"0 20rpx","display":"none"}'>
					  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#000000"}'></text>
					  <text :style='{"color":"#000000","lineHeight":"1.5","fontSize":"24rpx"}'>{{homeshequgonggaolist[1].addtime}}</text>
					</view>
				  </view>
				</view>
				<view v-if="homeshequgonggaolist.length > 2" @tap="onDetailTap('shequgonggao',homeshequgonggaolist[2].id)" class="box box3" :style='{"padding":"0","margin":"0","overflow":"hidden","borderRadius":"20rpx","width":"100%","position":"relative","height":"auto"}'>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeshequgonggaolist[2].tupian.substring(0,4)=='http'" :src="homeshequgonggaolist[2].tupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeshequgonggaolist[2].tupian?baseUrl+homeshequgonggaolist[2].tupian.split(',')[0]:''"></image>
				  <view :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(223,216,204,0.7)"}'>
					<view :style='{"padding":"0 20rpx","lineHeight":"1.5","fontSize":"32rpx","color":"#000000"}' class="title ">{{homeshequgonggaolist[2].gonggaobiaoti}}</view>
					<view :style='{"padding":"0 20rpx","display":"none"}'>
					  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#000000"}'></text>
					  <text :style='{"color":"#000000","lineHeight":"1.5","fontSize":"24rpx"}'>{{homeshequgonggaolist[2].addtime}}</text>
					</view>
				  </view>
				</view>
			  </view>
			</view>
			<view class="list-item" :style='{"width":"100%","padding":"0","margin":"0 0 20rpx","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view v-if="homeshequgonggaolist.length > 3" @tap="onDetailTap('shequgonggao',homeshequgonggaolist[3].id)" class="box box4" :style='{"padding":"0","margin":"0","overflow":"hidden","borderRadius":"20rpx","width":"60%","position":"relative","height":"auto"}'>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeshequgonggaolist[3].tupian.substring(0,4)=='http'" :src="homeshequgonggaolist[3].tupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeshequgonggaolist[3].tupian?baseUrl+homeshequgonggaolist[3].tupian.split(',')[0]:''"></image>
				<view :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(223,216,204,0.7)"}'>
					<view :style='{"padding":"0 20rpx","lineHeight":"1.5","fontSize":"32rpx","color":"#000000"}' class="title ">{{homeshequgonggaolist[3].gonggaobiaoti}}</view>
					<view :style='{"padding":"0 20rpx","display":"none"}'>
					  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#000000"}'></text>
					  <text :style='{"color":"#000000","lineHeight":"1.5","fontSize":"24rpx"}'>{{homeshequgonggaolist[3].addtime}}</text>
					</view>
				</view>
			  </view>
			  <view v-if="homeshequgonggaolist.length > 4" @tap="onDetailTap('shequgonggao',homeshequgonggaolist[4].id)" class="box box5" :style='{"padding":"0","margin":"0","overflow":"hidden","borderRadius":"20rpx","width":"38%","position":"relative","height":"auto"}'>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeshequgonggaolist[4].tupian.substring(0,4)=='http'" :src="homeshequgonggaolist[4].tupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeshequgonggaolist[4].tupian?baseUrl+homeshequgonggaolist[4].tupian.split(',')[0]:''"></image>
				<view :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(223,216,204,0.7)"}'>
					<view :style='{"padding":"0 20rpx","lineHeight":"1.5","fontSize":"32rpx","color":"#000000"}' class="title ">{{homeshequgonggaolist[4].gonggaobiaoti}}</view>
					<view :style='{"padding":"0 20rpx","display":"none"}'>
					  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#000000"}'></text>
					  <text :style='{"color":"#000000","lineHeight":"1.5","fontSize":"24rpx"}'>{{homeshequgonggaolist[4].addtime}}</text>
					</view>
				</view>
			  </view>
			</view>
			<view v-if="homeshequgonggaolist.length > 5" @tap="onDetailTap('shequgonggao',homeshequgonggaolist[5].id)" class="box box6" :style='{"padding":"0","margin":"0","overflow":"hidden","borderRadius":"20rpx","width":"100%","position":"relative","height":"auto"}'>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeshequgonggaolist[5].tupian.substring(0,4)=='http'" :src="homeshequgonggaolist[5].tupian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeshequgonggaolist[5].tupian?baseUrl+homeshequgonggaolist[5].tupian.split(',')[0]:''"></image>
				<view :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(223,216,204,0.7)"}'>
					<view :style='{"padding":"0 20rpx","lineHeight":"1.5","fontSize":"32rpx","color":"#000000"}' class="title ">{{homeshequgonggaolist[5].gonggaobiaoti}}</view>
					<view :style='{"padding":"0 20rpx","display":"none"}'>
					  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#000000"}'></text>
					  <text :style='{"color":"#000000","lineHeight":"1.5","fontSize":"24rpx"}'>{{homeshequgonggaolist[5].addtime}}</text>
					</view>
				</view>
			</view>
		  </view>
		</view>
		<!-- 商品列表 -->
		<!-- 新闻资讯 -->
		<view class="listBox news" :style='{"width":"100%","margin":"0 0 20rpx","overflow":"hidden","borderRadius":"20rpx","background":"#fff"}'>
			<view class="title" :style='{"width":"100%","padding":"0 24rpx","margin":"0","background":"#D4CF5D","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"color":"#fff","fontSize":"48rpx","lineHeight":"88rpx"}'>社区资讯</view>
				<view :style='{"alignItems":"center","justifyContent":"center","display":"flex"}' @tap="onPageTap('news')">
				  <text :style='{"color":"#fff","fontSize":"28rpx"}'>更多</text>
				  <text class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"28rpx"}'></text>
				</view>
			</view>
		  <!-- 样式5 -->
		  <view class="news-box2" :style='{"width":"100%","padding":"24rpx","margin":"0","height":"auto"}'>
			<block v-for="(item,index) in news" :key="index">
			  <view @tap="onNewsDetailTap(item.id)" v-if="index==0" class="list-item" :style='{"padding":"0","margin":"0 0 20rpx","overflow":"hidden","borderRadius":"20rpx","width":"100%","position":"relative","height":"auto"}'>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"400rpx"}' mode="aspectFill" class="listmpic" :src="baseUrl+item.picture"></image>
				<view :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(0,0,0,.3)"}'>
					<view :style='{"padding":"0 20rpx","lineHeight":"1.5","fontSize":"32rpx","color":"#fff"}' class="title">{{item.title}}</view>
					<view :style='{"padding":"0 20rpx","margin":"0","overflow":"hidden","color":"#fff","width":"100%","lineHeight":"50rpx","fontSize":"28rpx","height":"50rpx"}' class="text">{{item.introduction}}</view>
					<view :style='{"padding":"0 20rpx"}'>
					  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#fff"}'></text>
					  <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.addtime}}</text>
					</view>
					<view :style='{"padding":"0 20rpx"}'>
					  <text class="icon iconfont icon-geren16" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#fff"}'></text>
					  <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.name}}</text>
					</view>
					<view :style='{"padding":"0 20rpx","display":"inline-block"}'>
					  <text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#fff"}'></text>
					  <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.thumbsupnum}}</text>
					</view>
					<view :style='{"padding":"0 20rpx","display":"inline-block"}'>
					  <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#fff"}'></text>
					  <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.storeupnum}}</text>
					</view>
					<view :style='{"padding":"0 20rpx","display":"inline-block"}'>
					  <text class="icon iconfont icon-chakan9" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#fff"}'></text>
					  <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.clicknum}}</text>
					</view>
				</view>
			  </view>
			  <view @tap="onNewsDetailTap(item.id)" v-if="index>0" class="list-item" :style='{"padding":"20rpx 0","borderColor":"#ccc","margin":"0 0 20rpx 0","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
				<view :style='{"width":"100%","padding":"0 20rpx","lineHeight":"1.5","fontSize":"28rpx","color":"#333"}' class="title">{{item.title}}</view>
				<view :style='{"padding":"0 20rpx","margin":"0","overflow":"hidden","color":"#666","width":"100%","lineHeight":"40rpx","fontSize":"28rpx","height":"80rpx"}' class="text">{{item.introduction}}</view>
				<view :style='{"padding":"0 20rpx","order":"2"}'>
				  <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
				  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.addtime}}</text>
				</view>
				<view :style='{"padding":"0 20rpx"}'>
				  <text class="icon iconfont icon-geren16" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
				  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.name}}</text>
				</view>
				<view :style='{"padding":"0 20rpx","display":"inline-block"}'>
				  <text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
				  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.thumbsupnum}}</text>
				</view>
				<view :style='{"padding":"0 20rpx","display":"inline-block"}'>
				  <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
				  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.storeupnum}}</text>
				</view>
				<view :style='{"padding":"0 20rpx","display":"inline-block"}'>
				  <text class="icon iconfont icon-chakan9" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
				  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.clicknum}}</text>
				</view>
			  </view>
			</block>
		  </view>
		</view>
		<!-- 新闻资讯 -->
	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
				iconArr: [
				  'cuIcon-same',
				  'cuIcon-deliver',
				  'cuIcon-evaluate',
				  'cuIcon-shop',
				  'cuIcon-ticket',
				  'cuIcon-cascades',
				  'cuIcon-discover',
				  'cuIcon-question',
				  'cuIcon-pic',
				  'cuIcon-filter',
				  'cuIcon-footprint',
				  'cuIcon-pulldown',
				  'cuIcon-pullup',
				  'cuIcon-moreandroid',
				  'cuIcon-refund',
				  'cuIcon-qrcode',
				  'cuIcon-remind',
				  'cuIcon-profile',
				  'cuIcon-home',
				  'cuIcon-message',
				  'cuIcon-link',
				  'cuIcon-lock',
				  'cuIcon-unlock',
				  'cuIcon-vip',
				  'cuIcon-weibo',
				  'cuIcon-activity',
				  'cuIcon-friendadd',
				  'cuIcon-friendfamous',
				  'cuIcon-friend',
				  'cuIcon-goods',
				  'cuIcon-selection'
				],
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				homeshequgonggaolist: [],
				news: [],
			}
		},
		watch: {
		},
		mounted() {
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
        async onLoad(){
            
        },
		async onShow() {
			this.swiperMenuList = []
			this.role = uni.getStorageSync("appRole");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
			this.menuList.forEach((item,key) => {
			    if(key==0) {
			        item.frontMenu.forEach((item2,key2) => {
			            if(item2.child[0].buttons.indexOf("查看")>-1) {
			                this.swiperMenuList.push(item2);
			            }
			        })
			    }
			})
            // let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name,
						url: item.url
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			

			this.getRecommendList()
			this.getHomeList()
			this.getNewsList()
		},
		methods: {
			uGetRect(selector, all) {
				return new Promise(resolve => {
					uni.createSelectorQuery()
					.in(this)
					[all ? 'selectAll' : 'select'](selector)
					.boundingClientRect(rect => {
						if (all && Array.isArray(rect) && rect.length) {
							resolve(rect);
						}
						if (!all && rect) {
							resolve(rect);
						}
					})
					.exec();
				});
			},
			cloneData(data) {
				return JSON.parse(JSON.stringify(data));
			},
			newsTabClick2(index){
				this.newsIndex2 = index
				this.getNewsList()
			},
			async getNewsList(){
				let res;
				let params = {
					page: 1,
					limit: 6,
					sort: 'id',
					order: 'desc',
				}
				// 社区资讯
				res = await this.$api.list('news', params)
				this.news = res.data.list
			},
			homeTabClick2(index,name){
				this['home' + name + 'Index2'] = index
				this.getHomeList()
			},
			async getHomeList(){
				let res;
				let params;
				params = {
					page:1,
					limit: 6,
				}
				res = await this.$api.list('shequgonggao', params);
				this.homeshequgonggaolist = res.data.list
			},
			recommendTabClick2(index,name){
				this[name + 'Index2'] = index
				this.getRecommendList()
			},
			async getRecommendList(){
				let res;
				let params;
			},
			//轮播图跳转
			onSwiperTap(e) {
				if(e.url) {
					if (e.url.indexOf('https') != -1) {
						window.open(e.url)
					} else {
						this.$utils.jump(e.url)
					}
				}
			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(index) {
				let url = '../' + index + '/list'
				if(index=='forum'){
					url = '../forum-index/forum-index'
				}
                uni.setStorageSync("useridTag",0);
                uni.navigateTo({
                    url: url,
                    fail: function() {
                        uni.switchTab({
                            url: url
                        });
                    }
                });
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
