1�� datagrid.xml �� list.xml ��andreportӦ�õĽṹ�����ļ���

2�� manageandreport Ŀ¼������ʾ��Դ�롣

ʾ���Ĺؼ����룺
	���������棺
       	     Intent intent = new Intent(); 
	     intent.setClassName("cn.andreport.datatables", "cn.andreport.datatables.activitys.DTTableActivity"); 
	     startActivity(intent); 
	
	���������棺
	     Intent intent = new Intent(); 
	     intent.setClassName("cn.andreport.datatables", "cn.andreport.datatables.activitys.DTSettingsActivity"); 
	     startActivity(intent); 

	��������andreport�Ľṹ���ݣ�
		1�� ��AndroidManifest.xml�ļ�������android:sharedUserId="cn.andreport.datatables"
		
		2�� ��ȡandreport��Context��ʵ����SharedPreferencesHelper 			
			Context friendContext = this.createPackageContext("cn.andreport.datatables", Context.CONTEXT_IGNORE_SECURITY);
			SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(friendContext);

		3��ͨ��SharedPreferencesHelper������ṹ���ݣ���ز����μ�DTXMLTagConstants.java�ļ�
			//�޸�report title
			sharedPreferencesHelper.putStringValue(DTXMLTagConstants.REPORT_TITLE, "Change Report Title");