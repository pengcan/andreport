<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication1.WebForm1" %>
<%

	//客户端提交每次固定提交的数据。
	//MAC地址
	string MacAddress = Request["MACAddress"];

	//当其他app 调用andreport应用时传递的参数。
	//默认是userId， 当然也可以通过andreport的结构文件配置
	//dt:fixParamKey="userId"
	string fixParamData = Request["userId"];

	//客户端提交的分页数据。
	//每页显示的条数
	string itemsPerPage = Request["itemsPerPage"];
	string pageNumber = Request["pageNumber"];
	
	/*
	<searchPanel>
	    <searchItem dt:label="编号：" dt:key="id" dt:type="text" dt:remark=""/>
	    <searchItem dt:label="姓名：" dt:key="cusName"/>
	    <searchItem dt:label="性别：" dt:key="grade" dt:type="radio" dt:options="[男,女,不限]" dt:defaultValue="不限"/>
	    <searchItem dt:label="电话：" dt:key="phoneNumber"/>
	    <searchItem dt:label="状态：" dt:key="classStatus" dt:type="checkBox" dt:options="[高级客户,普通客户,潜在客户]" dt:defaultValues="[高级客户,普通客户]"/>
	</searchPanel>	
	*/
	//查询条件
	string id = Request["id"];
	string cusName = Request["cusName"];
	string grade = Request["grade"];
	string classStatus = Request["classStatus"];
	
	
	//*****************
	//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
	//*****************
	//返回数据
	WebApplication1.Custom ui = new WebApplication1.Custom();
	ui.Total = 10;
	ui.Data = new List<WebApplication1.Item>() { 
		new WebApplication1.Item{ ID=1,Name="马化腾"},
		new WebApplication1.Item{ ID=2,cusName="马云"}
	};
   
	System.Web.Script.Serialization.JavaScriptSerializer ser = new System.Web.Script.Serialization.JavaScriptSerializer();
	string result = ser.Serialize(ui);
	Response.Write(result);
	Response.End();
%>
