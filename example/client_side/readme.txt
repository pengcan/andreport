manageandreport Ŀ¼������ʾ��Դ�롣

ʾ���Ĺؼ����룺
	����������,�����ݲ������ò�����andreport��������ʱ��һ���͸�����ˣ�
       	     Intent intent = new Intent(); 
	     Bundle bd = new Bundle();
	     
	     //��ȡ�̶�������key��Ĭ����userId�� ����ṹ�ļ��иı������Ըı��Ϊ׼
	     Context friendContext = this.createPackageContext("cn.andreport.datatables", Context.CONTEXT_IGNORE_SECURITY);
	     SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(friendContext);
	     String fixParamKey = sharedPreferencesHelper.getStringValue(DTXMLTagConstants.FIX_PARAM_KEY, DTXMLTagConstants.FIX_PARAM_KEY_DEFAULT_VALUE);
		 
	     //����̶�������ֵ��andreportӦ�ã� andreportӦ��ÿ���ύ����ʱ�ᷢ�͸�������
	     bd.putString(fixParamKey, "bruce.peng");
	     intent.putExtra(DTXMLTagConstants.BUNDLE_EXTRA_KEY, bd);
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