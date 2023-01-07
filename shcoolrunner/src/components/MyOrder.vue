<template>
    <div id="my-order">
        <span class="title">我的订单</span>
        <div class="order-control-button">
            <el-button @click="setFlagA" type="primary" round>我接收的订单</el-button>
            <el-button @click="setFlagP" type="primary" round>我发布的顶单</el-button>
        </div>
        <div v-for="i in 8" id="my-order-content">
            <div class="top">
                <span class="category">超市</span>
                <span class="time">2023/1/1 12:00</span>
                <span class="check-mark">审核状态：</span>
                <span class="check-result">通过</span>
            </div>
            <div class="bottom">
                <div class="order-title">卫龙辣条</div>
                <div class="order-do-button">
                    <el-button type="primary">查看</el-button>
                    <el-button v-if="seen" type="danger" >撤销</el-button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default{
    name: 'MyOrder',
    data(){
        return{
            seen:false,
        }
    },
    methods:{
        setFlagA(){
            this.seen=false;
            
        },
        setFlagP(){
            this.seen=true;
        }
    }
}
</script >

<style lang="less" scoped>
.title{
    font-size: 25px;
    color: #409eff;
    
}
#my-order{
    width: 1000px;
    margin: 10px auto;
}
#my-order-content{
    width: 100%;
    height: 100px;
    
}
.order-control-button{
    width: 400px;
    height: 43px;
    margin: 10px auto;
}
.top{
    height: 30px;
    text-align: left;
    color: white;
}
.time{
    margin-left: 20px;
}
.check-mark{
    margin-left: 680px;
}
.order-title{
    height: 100%;
    text-align: left;
    width: 800px;
    color: white;
    font-size: 30px;
    line-height: 50px;
    display: inline-block;
    float: left;
}
.order-do-button{
    margin-top: 15px;
}
</style>