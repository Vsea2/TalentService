import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import baoxiuxinxi from '@/views/modules/baoxiuxinxi/list'
    import weixiuchuli from '@/views/modules/weixiuchuli/list'
    import qianshoukuaidi from '@/views/modules/qianshoukuaidi/list'
    import storeup from '@/views/modules/storeup/list'
    import kuaidixinxi from '@/views/modules/kuaidixinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import shequgonggao from '@/views/modules/shequgonggao/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import shequguanliyuan from '@/views/modules/shequguanliyuan/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '社区资讯',
        component: news
      }
      ,{
	path: '/baoxiuxinxi',
        name: '报修信息',
        component: baoxiuxinxi
      }
      ,{
	path: '/weixiuchuli',
        name: '维修处理',
        component: weixiuchuli
      }
      ,{
	path: '/qianshoukuaidi',
        name: '签收快递',
        component: qianshoukuaidi
      }
      ,{
	path: '/storeup',
        name: '我的收藏',
        component: storeup
      }
      ,{
	path: '/kuaidixinxi',
        name: '快递信息',
        component: kuaidixinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/shequgonggao',
        name: '社区公告',
        component: shequgonggao
      }
      ,{
	path: '/messages',
        name: '留言反馈',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/shequguanliyuan',
        name: '社区管理员',
        component: shequguanliyuan
      }
      ,{
	path: '/newstype',
        name: '社区资讯分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
