<template>
<div class="home-preview" :style='{"width":"100%","margin":"0 auto","flexDirection":"column","display":"flex"}'>




		


<!-- 商品推荐 -->
<div id="animate_recommendtijianxiangmu" class="recommend animate__animated" :style='{"padding":"0 10%","margin":"0 0 0","background":"url(http://codegen.caihongy.cn/20231129/5a039ebb9e0649cda7b9abfefc729de8.png)","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","order":"4"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"200px","margin":"50px auto","lineHeight":"54px","textAlign":"center","background":"none"}'>
		<span :style='{"color":"#fff","fontSize":"32px"}'>体检项目推荐</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"60px 0","flexWrap":"wrap","background":"none","display":"flex","height":"auto"}'>
		<div :style='{"border":"1px solid #E0E0E0","padding":"40px 20px","margin":"0","flexWrap":"wrap","background":"#fff","display":"flex","width":"25%","position":"relative","height":"auto"}' v-for="(item,index) in tijianxiangmuRecommend" :key="index" @click="toDetail('tijianxiangmuDetail', item)" class="list-item animation-box">

			<img :style='{"width":"100%","margin":"0 auto","objectFit":"cover","display":"block","height":"190px","order":"1"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
			<img :style='{"width":"100%","margin":"0 auto","objectFit":"cover","display":"block","height":"190px","order":"1"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"padding":"10px","color":"#000","textAlign":"center","width":"100%","lineHeight":"1.5","fontSize":"16px","fontWeight":"bold","order":"2"}'>{{item.xiangmumingcheng}}</div>
			<div :style='{"width":"50%","padding":"0 10px 10px","textAlign":"center","order":"7"}'>
			  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
			  <span class="text" :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{item.addtime}}</span>
			</div>
			<div :style='{"width":"calc(100% / 3)","padding":"0 10px 10px","textAlign":"center","order":"4"}'>
			  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#909090"}'></span>
			  <span class="text" :style='{"color":"#909090","lineHeight":"1.5","fontSize":"12px"}'>{{item.storeupnum}}</span>
			</div>
			<div :style='{"width":"calc(100% / 3)","padding":"0 10px 10px","textAlign":"center","order":"5"}'>
			  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#909090"}'></span>
			  <span class="text" :style='{"color":"#909090","lineHeight":"1.5","fontSize":"12px"}'>{{item.clicknum}}</span>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	
	







	
	<div @click="moreBtn('tijianxiangmu')" :style='{"border":"0","margin":"10px auto","textAlign":"center","background":"#409EFF","display":"none","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"12px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

<!-- 商品推荐 -->
<div id="animate_recommendtaocanxinxi" class="recommend animate__animated" :style='{"padding":"0 10%","margin":"0 0 0","background":"url(http://codegen.caihongy.cn/20231129/5a039ebb9e0649cda7b9abfefc729de8.png)","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","order":"4"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"200px","margin":"50px auto","lineHeight":"54px","textAlign":"center","background":"none"}'>
		<span :style='{"color":"#fff","fontSize":"32px"}'>套餐信息推荐</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"60px 0","flexWrap":"wrap","background":"none","display":"flex","height":"auto"}'>
		<div :style='{"border":"1px solid #E0E0E0","padding":"40px 20px","margin":"0","flexWrap":"wrap","background":"#fff","display":"flex","width":"25%","position":"relative","height":"auto"}' v-for="(item,index) in taocanxinxiRecommend" :key="index" @click="toDetail('taocanxinxiDetail', item)" class="list-item animation-box">

			<img :style='{"width":"100%","margin":"0 auto","objectFit":"cover","display":"block","height":"190px","order":"1"}' v-if="preHttp(item.fengmian)" :src="item.fengmian.split(',')[0]" alt="" />
			<img :style='{"width":"100%","margin":"0 auto","objectFit":"cover","display":"block","height":"190px","order":"1"}' v-else :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"padding":"10px","color":"#000","textAlign":"center","width":"100%","lineHeight":"1.5","fontSize":"16px","fontWeight":"bold","order":"2"}'>{{item.taocanmingcheng}}</div>
			<div :style='{"width":"50%","padding":"0 10px 10px","textAlign":"center","order":"7"}'>
			  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
			  <span class="text" :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{item.addtime}}</span>
			</div>
			<div :style='{"width":"calc(100% / 3)","padding":"0 10px 10px","textAlign":"center","order":"4"}'>
			  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#909090"}'></span>
			  <span class="text" :style='{"color":"#909090","lineHeight":"1.5","fontSize":"12px"}'>{{item.storeupnum}}</span>
			</div>
			<div :style='{"width":"calc(100% / 3)","padding":"0 10px 10px","textAlign":"center","order":"5"}'>
			  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#909090"}'></span>
			  <span class="text" :style='{"color":"#909090","lineHeight":"1.5","fontSize":"12px"}'>{{item.clicknum}}</span>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	
	







	
	<div @click="moreBtn('taocanxinxi')" :style='{"border":"0","margin":"10px auto","textAlign":"center","background":"#409EFF","display":"none","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"12px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],
        tijianxiangmuRecommend: [],
        taocanxinxiRecommend: [],



		newsIndex18: 0,


      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getList();
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},
		newsMouseove18(index) {
			this.newsIndex18 = index
		},

		listIndexClick11(index, name) {
			this['listIndex11' + name] = index[this['listColumn11' + name]]
			this.getList()
		},

		handleScroll() {
			let arr = [
				{id:'search',css:'animate__pulse'},
				{id:'about',css:'animate__backInRight'},
				{id:'system',css:'animate__backInLeft'},
				{id:'animate_recommendtijianxiangmu',css:'animate__fadeIn'},
				{id:'animate_recommendtaocanxinxi',css:'animate__fadeIn'},
				{id:'msgs',css:'animate__rubberBand'},
				{id:'friendly',css:'animate__bounce'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "tijianxiangmu/autoSort";
			data = {
				page: 1,
				limit: 8,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.tijianxiangmuRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
          autoSortUrl = "taocanxinxi/autoSort";
			data = {
				page: 1,
				limit: 8,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.taocanxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 0;
			border-radius: 30px 0 0 30px;
			padding: 0 30px 0 10px;
			box-shadow: none;
			outline: none;
			color: #fff;
			background: rgba(0,0,0,.3);
			width: 200px;
			font-size: 16px;
			text-align: center;
			height: 60px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 0;
			border-radius: 0 30px 30px 0;
			padding: 0 10px;
			box-shadow: none;
			outline: none;
			color: #fff;
			background: rgba(0,0,0,.3);
			width: 100%;
			font-size: 16px;
			height: 60px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(4deg, 4deg) translate3d(0px, -20px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(-6deg, 6deg) translate3d(0px, -10px, -10px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -20px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(0.9) skew(0deg, 0deg) translate3d(20px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(-4deg, -4deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	




	.home-preview .news .list18 .left .list .item {
				cursor: pointer;
				border: 1px solid #E0E0E0;
				padding: 0 20px;
				background: #fff;
				display: flex;
				width: 100%;
				align-items: center;
				height: 15%;
			}
	
	.home-preview .news .list18 .left .list .item:hover {
				background: #3B2E7E;
			}
	
	.home-preview .news .list18 .left .list .item .name {
				overflow: hidden;
				color: #000;
				white-space: nowrap;
				font-size: 18px;
				line-height: 1.5;
				text-overflow: ellipsis;
			}
	
	.home-preview .news .list18 .left .list .item:hover .name {
				color: #fff;
			}
	
	.home-preview .news .list18 .right .list .item .dian {
				border-radius: 100%;
				margin: 0 6px;
				background: #333;
				display: none;
				width: 4px;
				height: 4px;
			}
	.home-preview .news .list18 .right .list .item:hover .dian {
				background: red;
			}
	
	.home-preview .news .list18 .right .list .item .title {
				color: #333;
				flex: 1;
				font-size: 14px;
				line-height: 24px;
				transition: 0.3s;
			}
	.home-preview .news .list18 .right .list .item:hover .title {
				color: #3B2E7E;
				font-weight: bold;
			}
	
	.home-preview .news .list18 .right .list .item .time .icon {
				color: #666;
				font-size: 12px;
				line-height: 24px;
			}
	.home-preview .news .list18 .right .list .item:hover .time .icon {
				color: red;
			}
	.home-preview .news .list18 .right .list .item .time .text {
				color: #666;
				font-size: 12px;
				line-height: 24px;
			}
	.home-preview .news .list18 .right .list .item:hover .time .text {
				color: red;
			}






</style>
