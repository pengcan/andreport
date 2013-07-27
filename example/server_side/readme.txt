
请保证服务端的URL和andreport结构文件中的URL配置符合，以jsp的代码为例：

	/***************************************************************/
	//获取分页数据
	/***************************************************************/	
	//客户端提交的分页数据。
	//每页显示的条数
	String itemsPerPage = request.getParameter("itemsPerPage");
	//当前页
	String pageNumber = request.getParameter("pageNumber");



	/***************************************************************/
	//查询 dt:serachURL="http://192.168.0.8:8088/android_ch24_serverside/getList.jsp"
	//
	//查询的url，例如点击查询按钮，填写查询条件并提交查询请求url
	//
	//获取查询数据
	/***************************************************************/	
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
	String id = request.getParameter("id");
	String cusName = request.getParameter("cusName");
	String grade = request.getParameter("grade");
	String phoneNumber = request.getParameter("phoneNumber");
	String classStatus = request.getParameter("classStatus");





	/***************************************************************/
	//编辑 dt:editAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/editAndGetList.jsp"
	//	
	/编辑的url，例如在弹出的编辑panel中修改数据并提交请求的url
	//
	//获取编辑数据
	/***************************************************************/	
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




	/***************************************************************/
	//新增 dt:addedAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/addAndGetList.jsp"
	//	
	//新增的url，例如点击新增按钮，填写新增信息并提交新增加请求url
	//
	//获取编辑数据
	/***************************************************************/	
	/*
	<addPanel>
	    <addItem dt:label="姓名：" dt:key="cusName" dt:type="text" dt:remark=""/>
	    <addItem dt:label="性别：" dt:key="grade" dt:type="radio" dt:options="[男,女]" dt:defaultValue="男"/>
	    <addItem dt:label="电话：" dt:key="phoneNumber"/>
	    <addItem dt:label="状态：" dt:key="status" dt:type="radio" dt:options="[高级客户,普通客户,潜在客户]"  dt:defaultValue="普通客户"/>
	</addPanel>
	*/
	//编辑的paramete
	String cusName = request.getParameter("cusName");
	String grade = request.getParameter("grade");
	String phoneNumber = request.getParameter("phoneNumber");
	String classStatus = request.getParameter("status");


	

	/***************************************************************/
	//删除 dt:deleteAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/deleteAndGetList.jsp"
	//
	//删除的url，例如Action列中的删除按钮，删除某条记录时提交请求的url
	//
	//删除单条记录时，获取 id 数据
	/***************************************************************/		
	//id paramete
	String id = request.getParameter("id");



	/***************************************************************/
	//批量删除 dt:multipleDeleteAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/multipleDeleteAndGetList.jsp"
	//	
	//批量删除的url，例如通过checkBox列选择后，点击导航栏的删除按钮，提交请求的url
	//
	//批量删除记录时，获取 ids 数据
	/***************************************************************/
	//ids paramete
	String id = request.getParameter("ids");
	System.out.println("ids:"+id);	


	/***************************************************************/
	//获取数据 dt:findEditItemByIdURL="http://192.168.0.8:8088/android_ch24_serverside/findEditItemById.jsp"
	//			
	//编辑某记录的url，例如点击action列中的编辑按钮，发送 id参数 获取服务端对应的记录，显示在编辑panel中
	//
	/***************************************************************/	
	//id paramete
	String id = request.getParameter("id");


	/***************************************************************/
	//获取数据 dt:findViewItemByIdURL="http://192.168.0.8:8088/android_ch24_serverside/findViewItemById.jsp"
	//				
	//查看某记录详情的url，例如点击action列中的查看按钮，发送 id参数 获取服务端对应记录的详情，显示在查看panel中
	//
	/***************************************************************/	
	//id paramete
	String id = request.getParameter("id");

	
	
	//返回数据集
	//请注意Key 为 data
	result.put("data", list);
	
	//返回总条数
	//将数据的总条数放入结果集，并返回。用于分页 
	//请注意Key 为 total
	result.put("total", 3);




	

