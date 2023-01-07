<template>
<div id="order-a-s">
    <h1 style="color: white;">订单接收情况</h1>
    <div class="order-a-user-info">
        <span class="title">接收当前订单用户信息:</span>
    <el-descriptions class="margin-top" :column="3" :size="small" >
    <el-descriptions-item>
      <template slot="label">
        <i class="el-icon-user"></i>
        用户昵称
      </template>
      kooriookami
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        <i class="el-icon-mobile-phone"></i>
        手机号
      </template>
      18100000000
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        <i class="el-icon-location-outline"></i>
        当前订单流水号
      </template>
      苏州市
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        <i class="el-icon-tickets"></i>
        学院
      </template>
      计算机学院
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        <i class="el-icon-office-building"></i>
        专业
      </template>
      计算机科学与技术
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        <i class="el-icon-office-building"></i>
        年级
      </template>
      2019
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        <i class="el-icon-office-building"></i>
        班级
      </template>
      1
    </el-descriptions-item>
  </el-descriptions>
    </div>
  <div class="title">订单完成情况:</div>
  <div id="o-f-situation">
    <span class="text">{{text}}</span>
  </div>
  <div class="comment-area">
    <span class="comment-area-title">
      评论当前用户:
    </span>
    <el-form>
      <el-input  v-model="comment" placeholder="请输入评论">
        
      </el-input>
      <el-button class="button" type="primary">提交</el-button>
    </el-form>
  </div>
</div>
</template>

<script>
export default{
    name: 'OrderAcceptedSituation',
    data(){
      return{
        comment: '',
        text:  '已完成',
      }
    }
}
</script>

<style lang="less" scoped>
.my-label {
    background: #E1F3D8;
  }

  .my-content {
    background: #FDE2E2;
  }
#order-a-s{
    width: 1000px;
    height: 600px;
    margin: 10px auto;
}
.order-a-user-info{
    width: 100%;
    text-align: left;
    
}
.order-a-user-info .title{
    color: #409eff;
    font-size: 20px;
}
/deep/.order-a-user-info .el-descriptions__body{
    background-color: #008c8c;
    color: white;
    margin-top: 20px;
}
#o-f-situation{
  height: 40px;
  border: 1px solid #409eff;
  background-color: lightgreen;
}
#o-f-situation .text{
  font-size: 40px;
  line-height: 40px;
}
.comment-area{  
  text-align: left;
  height: 200px;
  margin-top: 15px;
}
.comment-area-title{
  color: #409eff;
    font-size: 20px;
}
.button{
  margin-top: 5px;
}
.title{
  text-align: left;
  color: #409eff;
  font-size: 20px;
}
</style>