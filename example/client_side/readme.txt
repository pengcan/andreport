1， datagrid.xml 和 list.xml 是andreport应用的结构配置文件。

2， manageandreport 目录下面是示例源码。

示例的关键代码：
	调用主界面：
       	     Intent intent = new Intent(); 
	     intent.setClassName("cn.andreport.datatables", "cn.andreport.datatables.activitys.DTTableActivity"); 
	     startActivity(intent); 
	
	调用设置面：
	     Intent intent = new Intent(); 
	     intent.setClassName("cn.andreport.datatables", "cn.andreport.datatables.activitys.DTSettingsActivity"); 
	     startActivity(intent); 

	管理设置andreport的结构数据：
		1， 在AndroidManifest.xml文件中设置android:sharedUserId="cn.andreport.datatables"
		
		2， 获取andreport的Context并实例化SharedPreferencesHelper 			
			Context friendContext = this.createPackageContext("cn.andreport.datatables", Context.CONTEXT_IGNORE_SECURITY);
			SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(friendContext);

		3，通过SharedPreferencesHelper来管理结构数据，相关参数参见DTXMLTagConstants.java文件
			//修改report title
			sharedPreferencesHelper.putStringValue(DTXMLTagConstants.REPORT_TITLE, "Change Report Title");