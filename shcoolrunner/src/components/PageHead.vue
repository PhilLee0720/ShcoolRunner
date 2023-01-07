<template>
<div class="nav">
<div class="line"></div>
<el-menu 
  :default-active="activeIndex2"
  class="el-menu-demo"
  mode="horizontal"
  @select="handleSelect"
  background-color="#008c8c"
  text-color="#fff"
  active-text-color="#409EFF">
  <el-menu-item index="1"><router-link to="/">接收订单</router-link></el-menu-item>
  <el-menu-item index="2"><router-link to="/system-notice">系统公告</router-link></el-menu-item>
  <el-menu-item index="3"><router-link to="/order-release">发布订单</router-link></el-menu-item>
  <el-menu-item index="4"><router-link to="/myOrder">我的订单</router-link></el-menu-item>
  <el-menu-item index="5"><router-link to="/leave-word">在线留言</router-link></el-menu-item>
  <el-menu-item index="6"><router-link to="/personal-center">个人中心</router-link></el-menu-item>
  <el-menu-item index="7"><router-link to="/login">登录</router-link></el-menu-item>
  <el-menu-item index="8"><router-link to="register">注册</router-link></el-menu-item>
</el-menu>
</div>
</template>

<script>
import { RouterLink } from 'vue-router';

 export default{
    name: "PageHead",
    data() {
        return {
            activeIndex: "1",
            activeIndex2: "1"
        };
    },
    methods: {
        handleSelect(key, keyPath) {
            console.log(key, keyPath);
        }
    },
    components: { RouterLink }
}
</script>

<style scoped>
.nav{
  width: 1344px;
  height: 40px;
  margin: 0 auto;
}
.el-menu-demo li{
  width:  80px;
  height: 40px;
  font-size: 10px;
  line-height: 40px;
}
.el-menu-demo li:first-child{
  margin-left: 300px;
}
.el-menu-demo li:nth-child(7){
  margin-left: 200px;
}
</style>