<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="com.test.Custom"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.google.gson.Gson"%>
<%
	request.setCharacterEncoding("UTF-8");

	//客户端提交的分页数据。
	//每页显示的条数
	String itemsPerPage = request.getParameter("itemsPerPage");
	//当前页
	String pageNumber = request.getParameter("pageNumber");
	//分页数据
	System.out.println("itemsPerPage:"+itemsPerPage+"-----pageNumber:"+pageNumber);
	
	/*
	<editPanel>
	    <editItem dt:label="编号：" dt:key="id" dt:editable="false"/>
	    <editItem dt:label="姓名：" dt:key="cusName"/>
	    <editItem dt:label="性别：" dt:key="grade" dt:type="radio" dt:options="[男,女]"/>
	    <editItem dt:label="电话：" dt:key="phoneNumber" dt:type="text" dt:remark="*请勿泄漏"/>
	    <editItem dt:label="状态：" dt:key="status" dt:type="radio" dt:options="[高级客户,普通客户,潜在客户]"/>
	</editPanel>
	*/
	//编辑的paramete
	String id = request.getParameter("id");
	String cusName = request.getParameter("cusName");
	String grade = request.getParameter("grade");
	String phoneNumber = request.getParameter("phoneNumber");
	String classStatus = request.getParameter("status");
	System.out.println("id:"+id+"-----cusName:"+cusName+"------grade:"+grade+"------phoneNumber:"+phoneNumber+"------classStatus:"+classStatus);	
	
	
	
	
	//*****************
	//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
	//*****************
	//返回数据
	HashMap result = new HashMap();
	List list = new ArrayList();
	Custom c1 = new Custom("1", "宗庆后", "男",  "18900112233", "高级客户", "http://pengcan2006.gotoip3.com/photos/1.jpg", "1945年10月出生，高级经济师，浙江大学MBA特聘导师，娃哈哈集团公司董事长兼总经理。");
	list.add(c1);
	Custom c2 = new Custom("1", "李彦宏", "男",  "18933445566", "高级客户", "http://pengcan2006.gotoip3.com/photos/2.jpg", "现任全国政协委员、全国工商联副主席、百度公司董事长兼首席执行官、山西省工商联副主席。");
	list.add(c2);
	Custom c3 = new Custom("1", "马化腾", "男",  "18943345775", "高级客户", "http://pengcan2006.gotoip3.com/photos/3.jpg", "广东汕头人，腾讯主要创办人之一，现担任公司控股董事会主席兼首席执行官。");
	list.add(c3);
	//将数据放入结果集，并返回。 
	
	
	//请注意Key 为 data
	result.put("data", list);
	
	//将数据的总条数放入结果集，并返回。用于分页 
	//请注意Key 为 total
	result.put("total", 3);
	
	
	//通过GSON将其转换成json格式
    Gson gson = new Gson();
    String json = gson.toJson(result);

	System.out.print(json);
	out.print(json);
%> 
