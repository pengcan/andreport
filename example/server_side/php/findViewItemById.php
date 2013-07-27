<?php 
header('Content-type: text/json; charset=utf-8'); 

//获取移端提交的id参数
$id = $_POST["id"];

//*****************
//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
//*****************
//返回json格式数据

echo '{"data":[{"id" : "1", "cusName" : "宗庆后", "grade" : "男", "phoneNumber": "18900112233", "status": "高级客户", "photo":"http://pengcan2006.gotoip3.com/photos/1.jpg","remark":"1945年10月出生，高级经济师，浙江大学MBA特聘导师，<br>娃哈哈集团公司董事长兼总经理。<br>2007年~2012年登上《福布斯》全球亿万富豪排行榜。<br>2010年、2012年、2013年中国内地首富。"}]}';
?>