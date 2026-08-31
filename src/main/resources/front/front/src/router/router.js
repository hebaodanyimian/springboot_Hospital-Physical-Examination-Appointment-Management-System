import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import tijianxiangmuList from '../pages/tijianxiangmu/list'
import tijianxiangmuDetail from '../pages/tijianxiangmu/detail'
import tijianxiangmuAdd from '../pages/tijianxiangmu/add'
import tijianleixingList from '../pages/tijianleixing/list'
import tijianleixingDetail from '../pages/tijianleixing/detail'
import tijianleixingAdd from '../pages/tijianleixing/add'
import tijianyuyueList from '../pages/tijianyuyue/list'
import tijianyuyueDetail from '../pages/tijianyuyue/detail'
import tijianyuyueAdd from '../pages/tijianyuyue/add'
import quxiaotijianyuyueList from '../pages/quxiaotijianyuyue/list'
import quxiaotijianyuyueDetail from '../pages/quxiaotijianyuyue/detail'
import quxiaotijianyuyueAdd from '../pages/quxiaotijianyuyue/add'
import tijianbaogaoList from '../pages/tijianbaogao/list'
import tijianbaogaoDetail from '../pages/tijianbaogao/detail'
import tijianbaogaoAdd from '../pages/tijianbaogao/add'
import taocanleixingList from '../pages/taocanleixing/list'
import taocanleixingDetail from '../pages/taocanleixing/detail'
import taocanleixingAdd from '../pages/taocanleixing/add'
import taocanxinxiList from '../pages/taocanxinxi/list'
import taocanxinxiDetail from '../pages/taocanxinxi/detail'
import taocanxinxiAdd from '../pages/taocanxinxi/add'
import taocanyuyueList from '../pages/taocanyuyue/list'
import taocanyuyueDetail from '../pages/taocanyuyue/detail'
import taocanyuyueAdd from '../pages/taocanyuyue/add'
import quxiaotaocanyuyueList from '../pages/quxiaotaocanyuyue/list'
import quxiaotaocanyuyueDetail from '../pages/quxiaotaocanyuyue/detail'
import quxiaotaocanyuyueAdd from '../pages/quxiaotaocanyuyue/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'tijianxiangmu',
					component: tijianxiangmuList
				},
				{
					path: 'tijianxiangmuDetail',
					component: tijianxiangmuDetail
				},
				{
					path: 'tijianxiangmuAdd',
					component: tijianxiangmuAdd
				},
				{
					path: 'tijianleixing',
					component: tijianleixingList
				},
				{
					path: 'tijianleixingDetail',
					component: tijianleixingDetail
				},
				{
					path: 'tijianleixingAdd',
					component: tijianleixingAdd
				},
				{
					path: 'tijianyuyue',
					component: tijianyuyueList
				},
				{
					path: 'tijianyuyueDetail',
					component: tijianyuyueDetail
				},
				{
					path: 'tijianyuyueAdd',
					component: tijianyuyueAdd
				},
				{
					path: 'quxiaotijianyuyue',
					component: quxiaotijianyuyueList
				},
				{
					path: 'quxiaotijianyuyueDetail',
					component: quxiaotijianyuyueDetail
				},
				{
					path: 'quxiaotijianyuyueAdd',
					component: quxiaotijianyuyueAdd
				},
				{
					path: 'tijianbaogao',
					component: tijianbaogaoList
				},
				{
					path: 'tijianbaogaoDetail',
					component: tijianbaogaoDetail
				},
				{
					path: 'tijianbaogaoAdd',
					component: tijianbaogaoAdd
				},
				{
					path: 'taocanleixing',
					component: taocanleixingList
				},
				{
					path: 'taocanleixingDetail',
					component: taocanleixingDetail
				},
				{
					path: 'taocanleixingAdd',
					component: taocanleixingAdd
				},
				{
					path: 'taocanxinxi',
					component: taocanxinxiList
				},
				{
					path: 'taocanxinxiDetail',
					component: taocanxinxiDetail
				},
				{
					path: 'taocanxinxiAdd',
					component: taocanxinxiAdd
				},
				{
					path: 'taocanyuyue',
					component: taocanyuyueList
				},
				{
					path: 'taocanyuyueDetail',
					component: taocanyuyueDetail
				},
				{
					path: 'taocanyuyueAdd',
					component: taocanyuyueAdd
				},
				{
					path: 'quxiaotaocanyuyue',
					component: quxiaotaocanyuyueList
				},
				{
					path: 'quxiaotaocanyuyueDetail',
					component: quxiaotaocanyuyueDetail
				},
				{
					path: 'quxiaotaocanyuyueAdd',
					component: quxiaotaocanyuyueAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
