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
    import taocanxinxi from '@/views/modules/taocanxinxi/list'
    import taocanleixing from '@/views/modules/taocanleixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import quxiaotaocanyuyue from '@/views/modules/quxiaotaocanyuyue/list'
    import taocanyuyue from '@/views/modules/taocanyuyue/list'
    import tijianbaogao from '@/views/modules/tijianbaogao/list'
    import config from '@/views/modules/config/list'
    import tijianxiangmu from '@/views/modules/tijianxiangmu/list'
    import tijianleixing from '@/views/modules/tijianleixing/list'
    import tijianyuyue from '@/views/modules/tijianyuyue/list'
    import quxiaotijianyuyue from '@/views/modules/quxiaotijianyuyue/list'


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
	path: '/taocanxinxi',
        name: '套餐信息',
        component: taocanxinxi
      }
      ,{
	path: '/taocanleixing',
        name: '套餐类型',
        component: taocanleixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/quxiaotaocanyuyue',
        name: '取消套餐预约',
        component: quxiaotaocanyuyue
      }
      ,{
	path: '/taocanyuyue',
        name: '套餐预约',
        component: taocanyuyue
      }
      ,{
	path: '/tijianbaogao',
        name: '体检报告',
        component: tijianbaogao
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/tijianxiangmu',
        name: '体检项目',
        component: tijianxiangmu
      }
      ,{
	path: '/tijianleixing',
        name: '体检类型',
        component: tijianleixing
      }
      ,{
	path: '/tijianyuyue',
        name: '体检预约',
        component: tijianyuyue
      }
      ,{
	path: '/quxiaotijianyuyue',
        name: '取消体检预约',
        component: quxiaotijianyuyue
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
