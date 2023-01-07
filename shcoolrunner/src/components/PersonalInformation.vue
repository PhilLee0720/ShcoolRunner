<template>
<div id="personal-info">
    <h1 style="color: white;">个人信息</h1>
    <div class="personal-info-form">
        <el-form  ref="form" :model="form" label-width="80px">
  <el-form-item label="用户昵称">
    <el-input v-model="form.nickname" placeholder="请输入用户昵称" ></el-input>
  </el-form-item>
  <el-form-item label="用户姓名">
    <el-input v-model="form.username" placeholder="请输入价格"></el-input>
  </el-form-item>
  <el-form-item label="性别">
    <el-radio v-model="form.gender" label="1" value="1">男</el-radio>
  <el-radio v-model="form.gender" label="2" value="2">女</el-radio>
  </el-form-item>
  <el-form-item label="学院"> 
    <el-input v-model="form.institute" placeholder="请输入学院"></el-input>
  </el-form-item>
  <el-form-item label="年级">
    <el-input v-model="form.grades" placeholder="请输入年级"></el-input>
  </el-form-item>
  <el-form-item label="班级">
    <el-input v-model="form.class" placeholder="请输入班级"></el-input>
  </el-form-item>
  <el-form-item label="地址">
    <el-input v-model="form.address" placeholder="请输入地址"></el-input>
  </el-form-item>
  <el-form-item label="电话号码">
    <el-input v-model="form.phoneNumber" placeholder="请输入电话号码"></el-input>
  </el-form-item>
  <el-form-item label="邮箱">
    <el-input v-model="form.email" placeholder="请输入邮箱"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button class="button" type="primary" @click="onSubmit">保存</el-button>
    <el-button>取消</el-button>
  </el-form-item>
</el-form>
    </div>
</div>
</template>

<script>
export default{
    name: 'PersonalInfomation',
    data() {
      return {
        form: {
          nickname: 'lee',
          userName:'',
          gender: '1',
          institute:'',
          grades:'',
          class:'',
          address: '',
          phoneNumber: '',
          email:'',
        }
      }
    }
}
</script>

<style lang="less" scoped>
#personal-info{
    width: 1000px;
    border: 1px solid red;
    margin: 0 auto;
}
.personal-info-form{
    text-align: left;
}
.button{
    margin-left: 350px;
}
</style>