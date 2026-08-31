<template>
  <div>
    <div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20230929/286f0f899e854f018a0be9e85e43d46d.jpg)","display":"flex","width":"100%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
      <el-form :style='{"border":"1px solid #f6f6f6","minHeight":"600px","padding":"30px 45% 20px 5%","margin":"50px auto 50px","borderRadius":"8px","textAlign":"center","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230929/b96e0afa9486481d971edb8e706fdbe8.jpg) no-repeat right center / 50% 100%,#fff","display":"flex","width":"80%","fontSize":"14px","height":"auto"}'>
        <div v-if="true" :style='{"padding":"0px","margin":"0px auto 10px","borderColor":"#ddd","color":"#1e3c4f","textAlign":"center","display":"inline-block","background":"none","borderWidth":"0px","width":"100%","lineHeight":"40px","fontSize":"24px","borderStyle":"solid","fontWeight":"600"}' class="title-container">基于Java的医院体检预约管理系统 设计与实现登录</div>
        <div v-if="loginType==1" class="list-item" :style='{"width":"100%","margin":"0 auto 20px","position":"relative","alignItems":"center","flexWrap":"wrap","display":"flex"}'>
          <div v-if="true" class="lable" :style='{"width":"100%","lineHeight":"44px","fontSize":"inherit","color":"#666","textAlign":"left"}'>用户名：</div>
          <input :style='{"border":"2px solid #002052","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .3)","outline":"0px solid #eee","color":"#666","outlineOffset":"0px","borderRadius":"0px","background":"#fff","width":"100%","fontSize":"inherit","height":"50px"}' placeholder="请输入用户名" name="username" type="text" v-model="rulesForm.username">
        </div>
        <div v-if="loginType==1" class="list-item" :style='{"width":"100%","margin":"0 auto 20px","position":"relative","alignItems":"center","flexWrap":"wrap","display":"flex"}'>
          <div v-if="true" class="lable" :style='{"width":"100%","lineHeight":"44px","fontSize":"inherit","color":"#666","textAlign":"left"}'>密码：</div>
          <input :style='{"border":"2px solid #002052","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .3)","outline":"0px solid #eee","color":"#666","outlineOffset":"0px","borderRadius":"0px","background":"#fff","width":"100%","fontSize":"inherit","height":"50px"}' placeholder="请输入密码" name="password" type="password" v-model="rulesForm.password">
        </div>
        <div class="list-code" v-if="true && loginType==1" :style='{"width":"100%","boxShadow":"0 0 0px rgba(64, 158, 255, .3)","margin":"20px auto","alignItems":"center","flexWrap":"wrap","display":"flex"}'>
          <input :style='{"border":"2px solid #002052","padding":"0 10px","outline":"none","color":"#666","borderRadius":"0px 0 0 0px","background":"#fff","width":"calc(100% - 100px)","fontSize":"inherit","height":"50px"}' placeholder="请输入验证码" name="code" type="text" v-model="rulesForm.code">
          <div class="getCodeBt" :style='{"cursor":"pointer","borderColor":"#002052","alignItems":"center","borderRadius":"0px","borderWidth":"2px 2px 2px 0","background":"#fff","display":"flex","width":"100px","borderStyle":"solid","justifyContent":"center","height":"50px"}' @click="getRandCode(4)">
            <span :style="{color:item.color,transform:item.rotate,fontSize:item.size,padding: '0 3px',display:'inline-block'}" v-for="(item, index) in codes" :key="index">{{ item.num }}</span>
          </div>
        </div>

        <div :style='{"width":"100%","margin":"20px auto 0","fontSize":"inherit","textAlign":"center"}' v-if="roles.length>1" prop="loginInRole" class="list-type">
          <el-radio v-if="loginType==1||(loginType==2&&item.roleName!='管理员')" v-for="item in roles" v-bind:key="item.roleName" v-model="rulesForm.role" :label="item.roleName">{{item.roleName}}</el-radio>
        </div>

		
        <div :style='{"margin":"0px auto 0","alignItems":"center","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"16px","position":"relative","justifyContent":"center"}'>
          <el-button v-if="loginType==1" :style='{"border":"0","cursor":"pointer","padding":"0px","margin":"0 auto 20px","color":"#fff","textAlign":"center","outline":"none","borderRadius":"0px","background":"#1e3c4f","width":"100%","fontSize":"16px","fontWeight":"600","height":"50px","order":"2"}' type="primary" @click="login()" class="loginInBt">登录</el-button>
        </div>
      </el-form>

    </div>
  </div>
</template>
<script>
import menu from "@/utils/menu";
export default {
  data() {
    return {
		verifyCheck2: false,
		flag: false,
      baseUrl:this.$base.url,
      loginType: 1,
      rulesForm: {
        username: "",
        password: "",
        role: "",
        code: '',
      },
      menus: [],
      roles: [],
      tableName: "",
      codes: [{
        num: 1,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      },{
        num: 2,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      },{
        num: 3,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      },{
        num: 4,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      }],
    };
  },
  mounted() {
    let menus = menu.list();
    this.menus = menus;

    for (let i = 0; i < this.menus.length; i++) {
      if (this.menus[i].hasBackLogin=='是') {
        this.roles.push(this.menus[i])
      }
    }

  },
  created() {

    this.getRandCode()
  },
  destroyed() {
	    },
  components: {
  },
  methods: {

    //注册
    register(tableName){
		this.$storage.set("loginTable", tableName);
		this.$router.push({path:'/register',query:{pageFlag:'register'}})
    },
    // 登陆
    login() {
		let code = ''
		for(let i in this.codes) {
			code += this.codes[i].num
		}
		if (true && !this.rulesForm.code) {
			this.$message.error("请输入验证码");
			return;
		}
		if (true && this.rulesForm.code.toLowerCase() != code.toLowerCase()) {
			this.$message.error("验证码输入有误");
			this.getRandCode()
			return;
		}

		if (!this.rulesForm.username) {
			this.$message.error("请输入用户名");
			return;
		}
		if (!this.rulesForm.password) {
			this.$message.error("请输入密码");
			return;
		}
		if(this.roles.length>1) {
			if (!this.rulesForm.role) {
				this.$message.error("请选择角色");
				return;
			}

			let menus = this.menus;
			for (let i = 0; i < menus.length; i++) {
				if (menus[i].roleName == this.rulesForm.role) {
					this.tableName = menus[i].tableName;
				}
			}
		} else {
			this.tableName = this.roles[0].tableName;
			this.rulesForm.role = this.roles[0].roleName;
		}
		
		this.loginPost()
    },
	loginPost() {
		this.$http({
			url: `${this.tableName}/login?username=${this.rulesForm.username}&password=${this.rulesForm.password}`,
			method: "post"
		}).then(({ data }) => {
			if (data && data.code === 0) {
				this.$storage.set("Token", data.token);
				this.$storage.set("role", this.rulesForm.role);
				this.$storage.set("sessionTable", this.tableName);
				this.$storage.set("adminName", this.rulesForm.username);
				this.$router.replace({ path: "/" });
			} else {
				this.$message.error(data.msg);
				this.getRandCode()
			}
		});
	},
    getRandCode(len = 4){
		this.randomString(len)
    },
    randomString(len = 4) {
      let chars = [
          "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
          "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
          "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G",
          "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2",
          "3", "4", "5", "6", "7", "8", "9"
      ]
      let colors = ["0", "1", "2","3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"]
      let sizes = ['14', '15', '16', '17', '18']

      let output = [];
      for (let i = 0; i < len; i++) {
        // 随机验证码
        let key = Math.floor(Math.random()*chars.length)
        this.codes[i].num = chars[key]
        // 随机验证码颜色
        let code = '#'
        for (let j = 0; j < 6; j++) {
          let key = Math.floor(Math.random()*colors.length)
          code += colors[key]
        }
        this.codes[i].color = code
        // 随机验证码方向
        let rotate = Math.floor(Math.random()*60)
        let plus = Math.floor(Math.random()*2)
        if(plus == 1) rotate = '-'+rotate
        this.codes[i].rotate = 'rotate('+rotate+'deg)'
        // 随机验证码字体大小
        let size = Math.floor(Math.random()*sizes.length)
        this.codes[i].size = sizes[size]+'px'
      }
    },
  }
}
</script>

<style lang="scss" scoped>
.container {
  min-height: 100vh;
  position: relative;
  background-repeat: no-repeat;
  background-position: center center;
  background-size: cover;
      background: url(http://codegen.caihongy.cn/20230929/286f0f899e854f018a0be9e85e43d46d.jpg);
        
  .list-item /deep/ .el-input .el-input__inner {
		border: 2px solid #002052;
		border-radius: 0px;
		padding: 0 10px;
		box-shadow: 0 0 0px rgba(64, 158, 255, .3);
		outline: 0px solid #eee;
		color: #666;
		background: #fff;
		width: 100%;
		font-size: inherit;
		outline-offset: 0px;
		height: 50px;
	  }
  
  .list-item.select /deep/ .el-select .el-input__inner {
		border: 1px solid #eee;
		border-radius: 0px;
		padding: 0 10px;
		color: #666;
		width: 276px;
		font-size: 14px;
		height: 40px;
	  }
  
  .list-code /deep/ .el-input .el-input__inner {
  	  	border: 2px solid #002052;
  	  	border-radius: 0px 0 0 0px;
  	  	padding: 0 10px;
  	  	outline: none;
  	  	color: #666;
  	  	background: #fff;
  	  	width: calc(100% - 100px);
  	  	font-size: inherit;
  	  	height: 50px;
  	  }

  .list-type /deep/ .el-radio__input .el-radio__inner {
		border-radius: 0;
		background: rgba(53, 53, 53, 0);
		border-color: #666666;
	  }
  .list-type /deep/ .el-radio__input.is-checked .el-radio__inner {
        border-radius: 0;
        background: #018af3;
        border-color: #018af3;
      }
  .list-type /deep/ .el-radio__label {
		color: #666666;
		font-size: 16px;
	  }
  .list-type /deep/ .el-radio__input.is-checked+.el-radio__label {
        color: #000;
        font-size: 16px;
      }
}

</style>
