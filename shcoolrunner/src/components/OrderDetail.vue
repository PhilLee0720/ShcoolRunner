<template>
<div id="order-detail">
    <div od="order-detail">
        <span class="title">订单详情:</span>
    <div class="order-detail-content">
        <div class="order-detail-content-left">
        <el-descriptions class="margin-top"  :column="1" :size="small">
    <el-descriptions-item>
      <template slot="label">
        跑腿费:
      </template>
      3元
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        出发时间：
      </template>
      3元
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        取件地点:
      </template>
      18100000000
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        送达地点:
      </template>
      苏州市
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        物品总量:
      </template>
      <el-tag size="small">学校</el-tag>
    </el-descriptions-item>
  </el-descriptions>
        </div>
        <div class="order-detail-content-right">
            <el-descriptions class="margin-top"  :column="1" :size="small">
    <el-descriptions-item>
      <template slot="label">
        所属分类:
      </template>
      3元
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        联系电话:
      </template>
      3元
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        发布人:
      </template>
      18100000000
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        发布时间:
      </template>
      苏州市
    </el-descriptions-item>
    <el-descriptions-item>
      <template slot="label">
        订单编号:
      </template>
      <el-tag size="small">学校</el-tag>
    </el-descriptions-item>
  </el-descriptions>
        </div>
    </div>
    </div>
    <div id="order-note">
        <span class="title">备注:</span>
        <div class="order-note-content">
            Lorem ipsum dolor, sit amet consectetur adipisicing elit. Et, dolorum voluptatum hic in, esse sequi quo sit eius expedita itaque dolorem. Aspernatur explicabo provident doloribus ullam quisquam odio est porro.
        </div>
    </div>
<div id="order-comment">
    <span class="title">评论区:</span>
    <div class="comment-area">
        <el-form>
            <el-input
  type="textarea"
  :rows="5"
  placeholder="请输入内容"
  v-model="textarea">
</el-input>
        </el-form>
        <el-button class="button" type="primary" round>提交评论</el-button>
    </div>
    <div class="comment-history">
        <span class="title">
        历史评论:
        </span>
        <div v-for="i in 8" class="comment-history-content">
            really shit
            <span class="time-title">评论时间:</span>
            <span class="time">2022-1-1 23:19</span>
        </div>
    </div>
</div>
</div>
</template>
<script>
export default{
    name: 'OrderDetail'
}
</script>
<style lang="less"  scoped>
#order-detail{
    width: 1200px;
    margin: 10px auto;
    text-align: left;
    box-shadow: 0 2px 4px rgba(0, 0, 0, .12)
    
}
.title{
    font-size: 25px;
    color: #409eff;
}
.order-detail-content{
    width: 100%;
    height: 173px;
    background-color: rgb(226, 221, 221);
}
.order-detail-content-left{
    width: 400px;
    height: 100%;
    display: inline-block;
    float: left;
}
.order-detail-content-right{
    width: 400px;
    height: 100%;
    display: inline-block;
    float: left;
    margin-left: 395px;
}
/deep/.order-detail-content .el-descriptions__body{
    background-color: rgb(226, 221, 221);
}
.button{
    margin-left: 300px;
    margin-top: 20px;
}
#order-comment{
    width: 100%;
    margin-top: 30px;
}
#order-comment .comment-area{
    width: 800px;
}
.order-note-content{
    width: 100%;
    height: 50px;
    color: white;
    font-size: 15px;
    word-break: break-all;
    overflow: hidden;
}
.comment-history-content{
    width: 800px;
    height: 50px;
    font-size: 10px;
    color: white;
    word-break: break-all;
    overflow: hidden;
    margin: 5px 0;
}
.time{
    font-size: 10px;
    color: white;
    position: relative;
    bottom: -23px;
    right: -160px;
}
.time-title{
    font-size: 10px;
    color: white;
    position: relative;
    bottom: -23px;
    right: -150px;
}
</style>