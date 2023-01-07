<template>
<div id="register">
  <div class="register-title">注册</div>
  <div class="register-info">
    <el-form :label-position="labelPosition" label-width="80px"  :model="ruleForm" status-icon :rules="rules" ref="ruleForm"  class="demo-ruleForm">
    <el-form-item label="账号" prop="account">
      <el-input v-model="ruleForm.account" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item label="密码" prop="pass">
    <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
  </el-form-item>
  <el-form-item label="确认密码" prop="checkPass">
    <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
    <el-button @click="resetForm('ruleForm')">重置</el-button>
  </el-form-item>
</el-form>
  </div>
</div>
</template>

<script>
const axios = require('axios');
export default{
    name: 'Register',
    data() {
      var validateAccount = (rule,value,callback)=>{
        if(value === ''){
          callback(new Error('请输入账号'))
        }else{
          callback();
        }
      };
      var validatePass = (rule,value,callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
          if (this.ruleForm.checkPass !== '') {
            this.$refs.ruleForm.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请再次输入密码'));
        } else if (value !== this.ruleForm.pass) {
          callback(new Error('两次输入密码不一致!'));
        } else {
          callback();
        }
      };
      return {
        labelPosition: 'right',
        formLabelAlign: {
          name: '',
          region: '',
          type: ''
        },
        ruleForm: {
          account: '',
          pass: '',
          checkPass: ''
        },
        rules: {
          account:[
            {validator: validateAccount,trigger: 'blur'}
          ],
          pass: [
            { validator: validatePass, trigger: 'blur' }
          ],
          checkPass: [
            { validator: validatePass2, trigger: 'blur' }
          ]
        }
      };
  },
  methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            alert('submit!');
          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
          this.$refs[formName].resetFields();
      }
    }
}
</script>

<style scoped>
.register-title{
  color: whitesmoke;
  font-size: 50px;
}
#register{
    width: 600px;
    margin: 50px auto;
}
.register-info{
  width: 580px;
  height: 400px;
  margin-top: 40px;
  margin-left: -20px;
}
</style>