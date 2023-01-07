<template>
<div id="search">
    <el-form :inline="true" :model="formInline" class="demo-form-inline">
        <el-form-item>
            <el-input size="small" maxlength="20" v-model="formInline.user" placeholder="请输入订单编号"></el-input>
        </el-form-item>
        <el-form-item>
            <el-button type="primary" @click="onSubmit">查询</el-button>
        </el-form-item>
    </el-form>
    <el-tabs  v-model="activeName" :tab-position="tabPosition" style="height: 60px;">
    <el-tab-pane label="分类"></el-tab-pane>
    <el-tab-pane class="first-category" label="不限" name="first"></el-tab-pane>
    <el-tab-pane label="取件" name="second"></el-tab-pane>
    <el-tab-pane label="外卖" name="third"></el-tab-pane>
    <el-tab-pane label="超市" name="fourth"></el-tab-pane>
    <el-tab-pane label="寄件" name="sixth"></el-tab-pane>
    <el-tab-pane label="礼物" name="seveth"></el-tab-pane>
    <el-tab-pane label="其他" name="eighth"></el-tab-pane>
    </el-tabs>
    <div id="orders">
        <div v-for="i in 6" class="order">
            <div class="left">
                <span class="order-des">title</span>
                <span class="ca-name">【】</span>
                <div class="note">
                    <span>备注：</span>
                    <span>123456789012345678901234567890</span>
                </div>
            </div>
            <div class="right">
                <el-button type="primary">成功按钮</el-button>
                <span class="price"><span>报价：</span>20</span>
                <span class="create-time"><span>发布时间：</span>2022/1/10 19:07</span>
            </div>
    </div>
    </div>
</div>
</template>

<script>
export default{
    name: 'OrdersInfo',
    data(){
        return{
                formInline: {
            user: ''
            },
            activeName: 'first'
        }   
    },
    methods: {
      onSubmit() {
        console.log('submit!');
      }
    }
}
</script>

<style>
.note{
    width:180px;
    height: 100px;
    border:1px solid #409eff;
    font-size: 5px;
    word-break:break-all;
    overflow: hidden;
}
.note span{
}
.note::after{
    display: block;
    content: '';
    clear: both;
}
#search{
    width: 1344px;
    margin-top: 60px;
    /* line-height: 40px; */
    color: white;
}
.demo-form-inline{
    margin-left: -400px;
    margin-top: 3px;
}
.first-category{
    margin-left: 100px;
}
#orders{
    width: 1000px;
    height: 400px;
    margin: 0 auto;
}
#orders .order{
    width: 300px;
    height: 150px;
    float: left;
    margin: 30px 15px;
    background-color: #008c8c;
    border-radius: 4px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, .12);
}
#orders .order .left{
    width: 180px;
    height: 120px;
    float: left;
    margin: 8px 5px;
}
#orders .order .right{
    width: 100px;
    height: 120px;
    font-size: 5px;
    float: left;
    margin: 8px 5px;
}
#orders .order .left .order-des{
    float: left;
    margin-left: 20px;
}
#orders .order .left .le-word{
    margin-top: 20px;
}
.right .price{
    text-align: left;
    display: block;
    position: relative;
    top: 20px;
}
.right .create-time{
    text-align: left;
    display: block;
    position: relative;
    top: 40px;
}

</style>