<?php 
header('Content-type: text/json; charset=utf-8'); 

//客户端提交每次固定提交的数据。
//MAC地址
$MacAddress = $_POST["MACAddress"];

//当其他app 调用andreport应用时传递的参数。
//默认是userId， 当然也可以通过andreport的结构文件配置
//dt:fixParamKey="userId"
$fixParamData = $_POST["userId"];

	
//获取移端提交的参数
//分页数据
$itemsPerPage = $_POST["itemsPerPage"];
$pageNumber = $_POST["pageNumber"];

//获取移端动到id参数
$id = $_POST["id"];


//*****************
//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
//*****************
//返回json格式数据
$json='{"data":[{"id" : "1", "cusName" : "宗庆后", "grade" : "男", "phoneNumber": "18900112233", "status": "高级客户"},'.
	           '{"id" : "2", "cusName" : "李彦宏", "grade" : "男", "phoneNumber": "18933445566", "status": "高级客户"},'.
			   '{"id" : "3", "cusName" : "王健林", "grade" : "男", "phoneNumber": "18912343212", "status": "潜在客户"},'.
			   '{"id" : "4", "cusName" : "马化腾", "grade" : "男", "phoneNumber": "18943345775", "status": "高级客户"},'.
			   '{"id" : "5", "cusName" : "张欣", "grade" : "女", "phoneNumber": "18911446677", "status": "潜在客户"},'.
			   '{"id" : "6", "cusName" : "陈丽华", "grade" : "女", "phoneNumber": "18911224356", "status": "潜在客户"},'.
			   '{"id" : "7", "cusName" : "朱林瑶", "grade" : "女", "phoneNumber": "18911112222", "status": "潜在客户"},'.
			   '{"id" : "8", "cusName" : "许家印", "grade" : "男", "phoneNumber": "18912437904", "status": "高级客户"},'.
			   '{"id" : "9", "cusName" : "杨惠妍", "grade" : "女", "phoneNumber": "18964789436", "status": "潜在客户"},'.
			   '{"id" : "10", "cusName" : "许荣茂", "grade" : "女", "phoneNumber": "18912435678", "status": "潜在客户"},'.
			   '{"id" : "11", "cusName" : "马云", "grade" : "男", "phoneNumber": "18933445642", "status": "高级客户"},'.
			   '{"id" : "12", "cusName" : "何享健", "grade" : "男", "phoneNumber": "18911657698", "status": "潜在客户"},'.
			   '{"id" : "13", "cusName" : "张近东", "grade" : "男", "phoneNumber": "18934435436", "status": "潜在客户"},'.
			   '{"id" : "14", "cusName" : "孙广信", "grade" : "男", "phoneNumber": "18919082453", "status": "潜在客户"},'.
			   '{"id" : "15", "cusName" : "丁磊", "grade" : "男", "phoneNumber": "18912479464", "status": "普通客户"},'.
			   '{"id" : "16", "cusName" : "梁稳根", "grade" : "男", "phoneNumber": "18912513897", "status": "普通客户"},'.
			   '{"id" : "17", "cusName" : "吴亚军", "grade" : "男", "phoneNumber": "18932435670", "status": "普通客户"},'.
			   '{"id" : "18", "cusName" : "刘永行", "grade" : "男", "phoneNumber": "18912324468", "status": "潜在客户"},'.
			   '{"id" : "19", "cusName" : "陈宁宁", "grade" : "女", "phoneNumber": "18911278690", "status": "潜在客户"},'.
			   '{"id" : "20", "cusName" : "彭灿", "grade" : "男", "phoneNumber": "18999999999", "status": "普通客户"}'.
			   '],'.
	  '"total":20}'
	  ;
echo $json; 
?>