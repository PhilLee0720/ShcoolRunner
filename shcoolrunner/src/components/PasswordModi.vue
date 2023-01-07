<template>
<div id="password-modi">
    <h1 style="color: white">密码修改</h1>
    <div class="register-info">
    <el-form :label-position="labelPosition" label-width="80px"  :model="ruleForm" status-icon :rules="rules" ref="ruleForm"  class="demo-ruleForm">
    <el-form-item label="账号" prop="account">
      <el-input v-model="ruleForm.account" autocomplete="off"></el-input>
    </el-form-item>
    <el-form-item label="密码" prop="pass">
    <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
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
export default{
    name: 'PasswordModi',
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
#password-modi{
    width: 800px;
    height: 1000px;
    margin: 0 auto;
    border: 1px solid royalblue;
}
</style>