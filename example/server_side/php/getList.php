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

//提交的查询条件
/*
<searchPanel>
	<searchItem dt:label="编号：" dt:key="id" dt:type="text" dt:remark=""/>
	<searchItem dt:label="姓名：" dt:key="cusName"/>
	<searchItem dt:label="性别：" dt:key="grade" dt:type="radio" dt:options="[男,女,不限]" dt:defaultValue="不限"/>
	<searchItem dt:label="电话：" dt:key="phoneNumber"/>
	<searchItem dt:label="状态：" dt:key="classStatus" dt:type="checkBox" dt:options="[高级客户,普通客户,潜在客户]" dt:defaultValues="[高级客户,普通客户]"/>
</searchPanel>	
*/
$id = $_POST["id"];
$cusName = $_POST["cusName"];
$grade = $_POST["grade"];
$phoneNumber = $_POST["phoneNumber"];
$status = $_POST["status"];



//*****************
//通过查询条件和分页数据返回结果 省略....直接返回硬编码数据 因为只是DEMO。哈哈
//*****************
//返回json格式数据
$json='{"data":[{"id" : "1", "cusName" : "宗庆后", "grade" : "男", "phoneNumber": "18900112233", "status": "高级客户", "photo":"http://pengcan2006.gotoip3.com/photos/1.jpg","remark":"1945年10月出生，高级经济师，浙江大学MBA特聘导师，娃哈哈集团公司董事长兼总经理。<br>2007年~2012年登上《福布斯》全球亿万富豪排行榜。2010年、2012年、2013年中国内地首富。"},'.
	           '{"id" : "2", "cusName" : "李彦宏", "grade" : "男", "phoneNumber": "18933445566", "status": "高级客户", "photo":"http://pengcan2006.gotoip3.com/photos/2.jpg","remark":"1968年11月生，山西阳泉人，无党派，研究生学历。<br>现任全国政协委员、全国工商联副主席、百度公司董事长兼首席执行官、山西省工商联副主席。"},'.
			   '{"id" : "3", "cusName" : "王健林", "grade" : "男", "phoneNumber": "18912343212", "status": "潜在客户", "photo":"http://pengcan2006.gotoip3.com/photos/3.jpg","remark":"1954年10月生，四川人。中共党员，大学学历。现任中国民间商会副会长、大连万达集团股份有限公司董事长。<br>中共十七大代表、第十一届全国政协常委、第十届全国工商联副主席。"},'.
			   '{"id" : "4", "cusName" : "马化腾", "grade" : "男", "phoneNumber": "18943345775", "status": "高级客户", "photo":"http://pengcan2006.gotoip3.com/photos/4.jpg","remark":"广东汕头人，腾讯主要创办人之一，现担任公司控股董事会主席兼首席执行官，曾在深圳大学主修计算机及应用<br>于1993年取得深大理学学士学位。"},'.
			   '{"id" : "5", "cusName" : "张欣", "grade" : "女", "phoneNumber": "18911446677", "status": "潜在客户", "photo":"http://pengcan2006.gotoip3.com/photos/5.pg","remark":"1994年和潘石屹结婚，1995年回到北京和丈夫携手在建筑界打天下，共创了他们自己的房地产公司——SOHO中国，并成为SOHO中国联席总裁。"},'.
			   '{"id" : "6", "cusName" : "陈丽华", "grade" : "女", "phoneNumber": "18911224356", "status": "潜在客户", "photo":"http://pengcan2006.gotoip3.com/photos/6.jpg","remark":"1941年出生于北京，满族，美国佐治亚州萨凡那艺术设计学院荣誉博士，全国政协委员，中国满学会终身名誉会长，中国紫檀博物馆馆长。<br>目前，陈丽华的富华国际集团在北京拥有数家房地产企业，包括长安俱乐部、丽苑公寓等，总投资超过35亿元。"},'.
			   '{"id" : "7", "cusName" : "朱林瑶", "grade" : "女", "phoneNumber": "18911112222", "status": "潜在客户", "photo":"http://pengcan2006.gotoip3.com/photos/7.jpg","remark":"任中国香料香精化妆品工业协会副理事长、中国食品添加剂生产应用工业协会副理事长及中国人民政治协商会议广东省深圳市第四届委员会委员。<br>拥有企业营运、投资及市场拓展之策略制定及决策方面之丰富经验。自2004年3月起出任公司华宝国际集团主席及总裁。"},'.
			   '{"id" : "8", "cusName" : "杨惠妍", "grade" : "女", "phoneNumber": "18964789436", "status": "潜在客户", "photo":"http://pengcan2006.gotoip3.com/photos/8.jpg","remark":"1981年出生，毕业于美国俄亥俄州立大学。在《福布斯》亚洲版2007年中国富豪榜上，登上了中国首富的宝座。<br>名列2013新财富500富人榜第8名，2012年3月27日，碧桂园发布公告，委任杨惠妍为副主席。"},'.
			   '{"id" : "9", "cusName" : "马云", "grade" : "男", "phoneNumber": "18933445642", "status": "高级客户", "photo":"http://pengcan2006.gotoip3.com/photos/9.jpg","remark":"1964年10月15日出生于浙江省杭州市，中国著名企业家，阿里巴巴集团、淘宝网、支付宝创始人。首位登上《福布斯》杂志封面人物的大陆企业家，曾当选世界经济论坛未来领袖"},'.
			   '{"id" : "10", "cusName" : "彭灿", "grade" : "男", "phoneNumber": "18999999999", "status": "普通客户", "photo":"http://pengcan2006.gotoip3.com/photos/10.jpg","remark":"窮屌丝程序猿一枚. 喜欢瞎折腾, 没啥介绍的 只有省略号.............."}'.
			   '],'.
	  '"total":10}'
	  ;
echo $json; 
?>