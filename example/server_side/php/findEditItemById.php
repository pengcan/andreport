<?php 
header('Content-type: text/json; charset=utf-8'); 

//客户端提交每次固定提交的数据。
//MAC地址
$MacAddress = $_POST["MACAddress"];

//当其他app 调用andreport应用时传递的参数。
//默认是userId， 当然也可以通过andreport的结构文件配置
//dt:fixParamKey="userId"
$fixParamData = $_POST["userId"];

//获取移端提交的id参数
$id = $_POST["id"];

//*****************
//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
//*****************
//返回json格式数据

echo '{"data":[{"id" : "1",  "cusName" : "宗庆后", "grade" : "男",  "phoneNumber": "18900112233",  "status": "高级客户"}]}';
?>