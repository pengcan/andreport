<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication1.WebForm1" %>
<%

	//客户端提交的分页数据。
	//每页显示的条数
	string itemsPerPage = Request["itemsPerPage"];
	string pageNumber = Request["pageNumber"];
	
	//*****************
	//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
	//*****************
	//返回数据
	WebApplication1.Custom ui = new WebApplication1.Custom();
	ui.Total = 10;
	ui.Data = new List<string>();
	ui.Data.Add("'id' : '1',  'cusName' : '宗庆后', 'grade' : '男',  'phoneNumber': '18900112233',  'status': '高级客户'");
	ui.Data.Add("'id' : '2',  'cusName' : '宗庆后', 'grade' : '男',  'phoneNumber': '18900112233',  'status': '高级客户'");
	System.Web.Script.Serialization.JavaScriptSerializer ser = new System.Web.Script.Serialization.JavaScriptSerializer();
	string result = ser.Serialize(ui);
	Response.Write(result);
	Response.End();
%>
