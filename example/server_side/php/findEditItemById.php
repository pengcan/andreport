<?php 
header('Content-type: text/json; charset=utf-8'); 

//获取移端提交的id参数
$id = $_POST["id"];

//*****************
//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
//*****************
//返回json格式数据

echo '{"data":[{"id" : "1",  "cusName" : "宗庆后", "grade" : "男",  "phoneNumber": "18900112233",  "status": "高级客户"}]}';
?>