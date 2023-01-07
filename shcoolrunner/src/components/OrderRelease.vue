<template>
<div id="order-release">
    <h1 style="color:white">订单发布</h1>
<div id="order-release-item">
  <el-form  ref="form" :model="form" label-width="80px">
  <el-form-item label="订单主体">
    <el-input v-model="form.main" placeholder="请输入订单主要内容"></el-input>
  </el-form-item>
  <el-form-item label="价格">
    <el-input v-model="form.price" placeholder="请输入价格"></el-input>
  </el-form-item>
  <el-form-item label="出发时间">
    <el-col :span="11">
      <el-date-picker type="date" placeholder="选择日期" v-model="form.beginTimeDay" style="width: 100%;"></el-date-picker>
    </el-col>
    <el-col class="line" :span="2">-</el-col>
    <el-col :span="11">
      <el-time-picker placeholder="选择时间" v-model="form.beginTimeSeconds" style="width: 100%;"></el-time-picker>
    </el-col>
  </el-form-item>
  <el-form-item label="取件地点"> 
    <el-input v-model="form.doAddress" placeholder="请输入电话号码"></el-input>
  </el-form-item>
  <el-form-item label="送达地点">
    <el-input v-model="form.sendAddress" placeholder="请输备注"></el-input>
  </el-form-item>
  <el-form-item label="物品重量">
    <el-input v-model="form.goodsWeight" placeholder="请输备注"></el-input>
  </el-form-item>
  <el-form-item label="所属分类">
    <el-select v-model="form.categorys.label" placeholder="活动区域">
      <el-option v-for="i in form.categorys" :key="i.id" :label="i.label" :value="i.label"></el-option>
    </el-select>
  </el-form-item>
  <el-form-item label="联系电话">
    <el-input v-model="form.phoneNumber" placeholder="请输备注"></el-input>
  </el-form-item>
  <el-form-item label="发布人">
    <el-input v-model="form.publisher" placeholder="请输备注"></el-input>
  </el-form-item>
  <el-form-item label="发布时间">
    <el-col :span="11">
      <el-date-picker type="date" placeholder="选择日期" v-model="form.beginTimeDay" style="width: 100%;"></el-date-picker>
    </el-col>
    <el-col class="line" :span="2">-</el-col>
    <el-col :span="11">
      <el-time-picker placeholder="选择时间" v-model="form.beginTimeSeconds" style="width: 100%;"></el-time-picker>
    </el-col>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="onSubmit">立即创建</el-button>
    <el-button>取消</el-button>
  </el-form-item>
</el-form>
</div>
</div>
</template>

<script>
export default{
    name: 'OrderRelease',
    data() {
      return {
        form: {
          main: '',
          price:'',
          beginTimeDay:'',
          beginTimeSeconds:'',
          doAddress:'',
          categorys:[
            {id:'1',label:'a'},
            {id:'2',label:'b'},
            {id:'3',label:'c'}],
          value: '',
          sendAddress: '',
          goodsWeight: '',
          category: '',
          phoneNumber: false,
          publisher:'',
          publishTime: '',
          orderSerial: ''
        }
      }
    },
    methods: {
      onSubmit() {
        console.log('submit!');
      }
    }
    
}
</script>
<style scoped>
#order-release{
    width: 800px;
    border: 1px solid;
    border: 1px solid palegreen;
    margin: 0 auto;
}
</style>