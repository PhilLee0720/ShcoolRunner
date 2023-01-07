<template>
<div id="personal-page">
    <div id="personal-page-info">
        <div id="personal-page-info-head">
            <div class="personal-page-info-head-avatar">
                <el-avatar :size="50" :src="circleUrl"></el-avatar>
                <el-upload
  class="upload-demo"
  action="https://jsonplaceholder.typicode.com/posts/"
  :on-preview="handlePreview"
  :on-remove="handleRemove"
  :before-remove="beforeRemove"
  multiple
  :limit="3"
  :on-exceed="handleExceed"
  :file-list="fileList"
  :before-upload="beforeAvatarUpload">
  <el-button size="small" type="primary">点击上传</el-button>
  <div slot="tip" style="color: white;" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
</el-upload>
</div>
<div class="personal-page-info-desc">
    <el-descriptions class="margin-top" title="个人信息" :column="3" :size="size">
    <el-descriptions-item label="用户昵称">kooriookami</el-descriptions-item>
    <el-descriptions-item label="用户名">苏州市</el-descriptions-item>
    <el-descriptions-item label="性别">phil</el-descriptions-item>
    <el-descriptions-item label="学院">计算机学院</el-descriptions-item>
    <el-descriptions-item label="专业">计算机学院</el-descriptions-item>
    <el-descriptions-item label="年级">计算机科学与技术</el-descriptions-item>
    <el-descriptions-item label="班级">2019</el-descriptions-item>
    <el-descriptions-item label="邮箱">1260071140@qq.com</el-descriptions-item>
  </el-descriptions>
            </div>
        </div>
        <div class="modi-info">
        <router-link to="/personal-center/per-info">
        修改信息
        </router-link>
    </div>
    </div>
</div>
</template>
<script>
export default{
    name: 'PersonalCenterPage',
}
</script>

<style lang="less" scoped>
.personal-page-info-desc{
    width: 896px;
    height: 200px;
    display: inline-block;
    float: left;
}
/deep/.personal-page-info-desc .el-descriptions__body {
    background-color: #008c8c;
}
#personal-page{
    width: 1042px;
    height: 598px;
}

#personal-page-info{
    width: 1000px;
    height: 400px;
    margin: 0 auto;

}
#personal-page-info-head{
    width: 1000px;
    height: 200px;
}
.personal-page-info-head-avatar{
    width: 100px;
    height: 199px;
    display: inline-block;
    float: left;
}
.modi-info a{
    color: white;
    text-decoration:underline;
}
</style>