manageandreport 目录下面是示例源码。

示例的关键代码：
	调用主界面,并传递参数。该参数在andreport发送请求时会一起发送给服务端：
       	     Intent intent = new Intent(); 
	     Bundle bd = new Bundle();
	     
	     //获取固定参数的key，默认是userId。 如果结构文件中改变了则以改变的为准
	     Context friendContext = this.createPackageContext("cn.andreport.datatables", Context.CONTEXT_IGNORE_SECURITY);
	     SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(friendContext);
	     String fixParamKey = sharedPreferencesHelper.getStringValue(DTXMLTagConstants.FIX_PARAM_KEY, DTXMLTagConstants.FIX_PARAM_KEY_DEFAULT_VALUE);
		 
	     //传入固定参数的值给andreport应用， andreport应用每次提交请求时会发送给服务器
	     bd.putString(fixParamKey, "bruce.peng");
	     intent.putExtra(DTXMLTagConstants.BUNDLE_EXTRA_KEY, bd);
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