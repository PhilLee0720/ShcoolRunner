<template>
<div id="sys-not" >
    <div v-for="i in 8" class="noti">
        <div class="content">Lorem ipsum dolor sit amet consectetur adipisicing elit. Incidunt facere exercitationem consequatur repellat, quidem, hic ullam debitis saepe sequi officia dolor laborum maiores ipsa quibusdam dolorem a quae. Ratione, iure.</div>
        <div class="datetime">发布时间：<span>2023/1/1 12:00</span></div>
    </div>
</div>
</template>

<script>
export default{
    name: 'SystemNotice'
}
</script>

<style>
#sys-not{
    width: 700px;
    border: 3px solid #409eff;
    margin: 50px auto;
    border-radius: 5px;
    color: white;
}
.noti{
    width: 600px;
    height: 100px;
    border: 1px solid #409eff;
    margin: 20px 20px;
    border-radius: 5px;
}
.content{
    height: 80px;
    border: 1px solid #409eff;
    font-size: 8px;
}
.datetime{
    color: black;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 10px;
}

</style>