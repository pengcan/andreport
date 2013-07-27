<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="com.test.Custom"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.google.gson.Gson"%>
<%
	request.setCharacterEncoding("UTF-8");

	//客户端提交的数据。
	
	//id paramete
	String id = request.getParameter("id");
	System.out.println("id:"+id);	
	
	
	//*****************
	//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
	//*****************
	//返回数据
	HashMap result = new HashMap();
	List list = new ArrayList();
	Custom c1 = new Custom("1", "宗庆后", "男",  "18900112233", "高级客户", "http://pengcan2006.gotoip3.com/photos/1.jpg", "1945年10月出生，高级经济师，浙江大学MBA特聘导师，娃哈哈集团公司董事长兼总经理。");
	//将数据放入结果集，并返回。 
	list.add(c1);
	
	
	//请注意Key 为 data
	result.put("data", list);
	
	/*
	<viewPanel dt:dataFields="[id,cusName,grade,phoneNumber,status,photo,remark]" 
			dt:itemRenderer="combination"
			dt:showLeftImage="true"
			dt:showTextContent="true" 
			dt:showFooterContent="false" 
			dt:showRightContent="false" 
	    >
	    <leftImageTemplate dt:imageURLFiled="photo"/>
	    <contentTemplate>
	    	<![CDATA[
				<b><font color=#FF0A0A><textSize-30>#{cusName}</b></textSize-30></font>  &nbsp;&nbsp;&nbsp; <font color='green' ><textSize-24>客户状态：#{status}</textSize-24></font><br>
				<font><textSize-24>客户编号：#{id} &nbsp;&nbsp;&nbsp;  #{grade} &nbsp;&nbsp;&nbsp;  电话：#{phoneNumber}</textSize-24><br>
				<font><textSize-20>介绍：#{remark}</textSize-20>
	    	]]>
	    </contentTemplate>
	</viewPanel>
	*/
	//通过GSON将其转换成json格式
    Gson gson = new Gson();
    String json = gson.toJson(result);

	System.out.print(json);
	out.print(json);
%> 
