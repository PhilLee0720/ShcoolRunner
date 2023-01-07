<template>
    <div class="leave-word">
        <div class="leave-word-info">
            <div class="leave-word-info-title">用户留言</div>
            <el-table
                :data="tableData"
                sytle="width: 100"
                class="leave-word-table"
            >
                <el-table-column
                    fixed
                    prop="date"
                    label="日期"
                    width="120">
                    </el-table-column>
                    <el-table-column
                    fixed
                    prop="name"
                    label="发布者"
                    width="80">
                    </el-table-column>
                    <el-table-column
                    fixed
                    prop="address"
                    label="留言内容">
                </el-table-column>
            </el-table>
            <div class="leave-word-info-page-button">
                <el-pagination
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange"
                :current-page="currentPage4"
                :page-size="4"
                layout="total, sizes, prev, pager, next, jumper"
                :total="40">
                </el-pagination>
            </div>
        </div>
    <div id="leave-word-act">
        <div class="leave-word-act-title"></div>
        <div class="leave-word-input">
            <el-form>
                <el-input type="textarea" placeholder="请输入留言"></el-input>
            </el-form>
        </div>
        <div class="leave-word-button">
            <el-button type="primary">主要按钮</el-button>
        </div>
    </div>
    </div>
</template>

<script>
export default{
    name: 'LeaveWord',
    methods: {
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
      }
    },
     data() {
        return {
          tableData: [{
            date: '2016-05-02',
            name: '王小虎',
            address: 'kick your ass'
          }, {
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄 '
          }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
          }, {
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
          }],
          currentPage1: 5,
        currentPage2: 5,
        currentPage3: 5,
        currentPage4: 4
        }
      }
}
</script>
<style lang="less" scoped>
.leave-word-info-page-button{
    width: 800px;
    height: 30px;
    border: 1p solid #409eff;
    border-radius: 4px;
    margin: 0 auto;
    margin-bottom: 20px;
}
.leave-word-info-title{
    padding-top: 10px;
    font-size: 20px;
    color: aliceblue;
}
.leave-word{
    width: 1200px;
    margin: 0 auto;
}
/deep/.leave-word-info .el-table {
    margin-top: 30px;
    margin-bottom: 30px;
}
/deep/.leave-word-info .el-table thead{
    color: white;
}
/deep/.leave-word-info .border-radius{
    border-radius: 40px;
}
/deep/.leave-word-info .el-table  tr{
    background-color: #008c8c;
    color: black;
}
/deep/.leave-word-info .el-table th.el-table__cell{
    background-color: #409eff;
}
.el-textarea .el-textarea__inner{
    min-height: 170px;
}
.leave-word-info{
    width: 1200px;
    border: 1px solid #409eff;
    margin: 0 auto;;
    margin-top: 20px;
    border-radius: 40px;
    box-sizing: border-box;
}
#leave-word-act{
    width: 1200px;
    margin: 10px auto;
    border: 1px solid #409eff;
    border-radius: 40px;
}
.leave-word-input{
    margin-top: 40px;
}
.leave-word-act-title{
    width: 30px;
    height: 20px;
}
.leave-word-button{
    margin-top: 60px;
}
</style>
