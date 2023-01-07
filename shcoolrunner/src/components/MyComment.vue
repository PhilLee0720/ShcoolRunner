<template>
<div id="my-comment">
    <div v-for="i in 8" id="my-comment-info">
        <div id="user-released-info">
            <span class="label">用户昵称:</span>
            <span class="content">phil</span>
            <span class="label">发布时间:</span>
            <span class="content">2023/1/1</span>
        </div>
        <div id="user-released-info-content">
            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Dolorum ratione velit neque, exercitationem explicabo aliquam aperiam distinctio doloremque corrupti ex voluptate dicta officiis eligendi, facilis obcaecati illo consequatur suscipit labore!
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Vel aspernatur sunt quidem quas natus autem dolores doloribus officiis. Maxime placeat illo eligendi rem optio consequatur necessitatibus aspernatur magnam accusantium excepturi.
        </div>
        <div id="user-released-info-delete">
            <el-button type="primary" icon="el-icon-delete"></el-button>
        </div>
    </div>
</div>  
</template>
<script>
export default{
    name: 'MyComment'
}
</script>
<style scoped>
#my-comment{
    width: 900x;
    border: 1px solid #409eff;
    margin: 10px 10px;
    border-radius: 4px;
    box-sizing: border-box;
}
#my-comment-info{
    width: 900x;
    border: 1px solid white;
    margin: 10px 10px;
    border-radius: 4px;
    box-sizing: border-box;

}
#user-released-info{
    width: 999px;
    height: 25px;
    border-top: none;
    border-left: none;
    border-right: none;
}
#user-released-info .label{
    float: left;
    color: white;
    font-size: 12px;
    line-height: 25px;
    margin-left: 200px ;
}
#user-released-info .content{
    float: left;
    color: white;
    font-size: 12px;
    line-height: 25px;
    margin-left: 20px ;
    height: 25px;
    border: none;
    
}
#user-released-info-content{
    width: 870px;
    height: 51px;
    word-break: break-all;
    overflow: hidden;
}
#user-released-info-delete{
    width: 56px;
    height: 40px;
    position: relative;
    top: -30px;
    left: 910px;
}
</style>
