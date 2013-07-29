package com.example.manageandreport;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button callAndReportBtn = (Button)findViewById(R.id.callAndReport);
		callAndReportBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					callAndReport();
				} catch (NameNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Button callSettingsBtn = (Button)findViewById(R.id.callSettings);
		callSettingsBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				callSettings();
			}
		});
		
		
		Button manageDatagridBtn = (Button)findViewById(R.id.updateDatagridStructure);
		manageDatagridBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manageDatagrid();
			}
		});
		
		Button manageListBtn = (Button)findViewById(R.id.updateListStructure);
		manageListBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manageList();
			}
		});
	}

	private void callAndReport() throws NameNotFoundException{
		 Intent intent = new Intent(); 
	     intent.setClassName("cn.andreport.datatables", "cn.andreport.datatables.activitys.DTTableActivity"); 
	     Bundle bd = new Bundle();
	     
	     //获取固定参数的key，默认是userId。 如果结构文件中改变了则以改变的为准
		 Context friendContext = this.createPackageContext("cn.andreport.datatables", Context.CONTEXT_IGNORE_SECURITY);
		 SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(friendContext);
		 String fixParamKey = sharedPreferencesHelper.getStringValue(DTXMLTagConstants.FIX_PARAM_KEY, DTXMLTagConstants.FIX_PARAM_KEY_DEFAULT_VALUE);
		 
		 //传入固定参数的值给andreport应用， andreport应用每次提交请求时会发送给服务器
		 bd.putString(fixParamKey, "bruce.peng");
		 intent.putExtra(DTXMLTagConstants.BUNDLE_EXTRA_KEY, bd);
			
	     startActivity(intent); 
	}
	
	private void callSettings(){
		 Intent intent = new Intent(); 
	     intent.setClassName("cn.andreport.datatables", "cn.andreport.datatables.activitys.DTSettingsActivity"); 
	     startActivity(intent); 
	}
	
	private void manageList(){
		try {
			Context friendContext = this.createPackageContext("cn.andreport.datatables", Context.CONTEXT_IGNORE_SECURITY);
			SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(friendContext);

			//修改report title
			sharedPreferencesHelper.putStringValue(DTXMLTagConstants.REPORT_TITLE, "Change Report Title");
			
			//遍历所有的列，并修改列的相关属性
			int endColumnIndex = sharedPreferencesHelper.getIntValue(DTXMLTagConstants.COLUMN_END_INDEX, 0);
			for(int startPrefix = DTXMLTagConstants.COLUMN_START_INDEX,i=0; startPrefix<endColumnIndex; startPrefix++,i++){
				//递增的动态前缀
				int curPrefix = DTXMLTagConstants.COLUMN_START_INDEX + i;
				
				String itemRenderer =  sharedPreferencesHelper.getStringValue(curPrefix+DTXMLTagConstants.ITEM_RENDERER, "");
				if("combination".equals(itemRenderer)){
					//设置显示右边的内容
					sharedPreferencesHelper.putBooleanValue(curPrefix+DTXMLTagConstants.SHOW_FOOTER_CONTENT, true);
					sharedPreferencesHelper.putStringValue(curPrefix+DTXMLTagConstants.FOOTER_TEMPLATE, "客户状态：#{status}");
				}
					
			}
			
			//遍历search panel 的所有的Item
			int endSearchPanelItenIndex = sharedPreferencesHelper.getIntValue(DTXMLTagConstants.SEARCH_PANEL_ITEM_EDN_INDEX, 0);
			for(int startPrefix=DTXMLTagConstants.SEARCH_ITEM_START_INDEX,i=0; startPrefix<endSearchPanelItenIndex; startPrefix++,i++){
				//递增的动态前缀
				int curPrefix = DTXMLTagConstants.SEARCH_ITEM_START_INDEX + i;
				
				//获取所有 item 的 label and key
				String label = sharedPreferencesHelper.getStringValue(curPrefix+DTXMLTagConstants.ITEM_LABEL, "");
				String key =  sharedPreferencesHelper.getStringValue(curPrefix+DTXMLTagConstants.ITEM_KEY, "");
				System.out.println("label:"+label+", key:"+key);
				
			}
			//增加一条search panel item
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_LABEL, "爱好:");
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_KEY, "hobbies");
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_REMARK, "*业余爱好");
			//text类型可以不用设置 
			//sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_TYPE, "text");
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_DEFAULT_VALUE, "钓鱼");
			//修改end index
			endSearchPanelItenIndex = endSearchPanelItenIndex+1;
			sharedPreferencesHelper.putIntValue(DTXMLTagConstants.SEARCH_PANEL_ITEM_EDN_INDEX, endSearchPanelItenIndex);
			
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void manageDatagrid(){
		try {
			Context friendContext = this.createPackageContext("cn.andreport.datatables", Context.CONTEXT_IGNORE_SECURITY);
			SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(friendContext);

			//修改report title
			sharedPreferencesHelper.putStringValue(DTXMLTagConstants.REPORT_TITLE, "Change Report Title");
			
			//遍历所有的列，并修改列的相关属性
			int endColumnIndex = sharedPreferencesHelper.getIntValue(DTXMLTagConstants.COLUMN_END_INDEX, 0);
			for(int startPrefix = DTXMLTagConstants.COLUMN_START_INDEX,i=0; startPrefix<endColumnIndex; startPrefix++,i++){
				//递增的动态前缀
				int curPrefix = DTXMLTagConstants.COLUMN_START_INDEX + i;
				
				//获取当前的head text
				String columnHeaderLabel = sharedPreferencesHelper.getStringValue(curPrefix+DTXMLTagConstants.HEADER_TEXT, "");
				
				//获取当前的renderer 类型， 如果是checkBox类型，则没有head text
				String headerRenderer =  sharedPreferencesHelper.getStringValue(curPrefix+DTXMLTagConstants.HEADER_RENDERER, "");
				if(!"checkBox".equals(headerRenderer))
					sharedPreferencesHelper.putStringValue(curPrefix+DTXMLTagConstants.HEADER_TEXT, columnHeaderLabel+"-changed");
				
			}
			
			//遍历search panel 的所有的Item
			int endSearchPanelItenIndex = sharedPreferencesHelper.getIntValue(DTXMLTagConstants.SEARCH_PANEL_ITEM_EDN_INDEX, 0);
			for(int startPrefix=DTXMLTagConstants.SEARCH_ITEM_START_INDEX,i=0; startPrefix<endSearchPanelItenIndex; startPrefix++,i++){
				//递增的动态前缀
				int curPrefix = DTXMLTagConstants.SEARCH_ITEM_START_INDEX + i;
				
				//获取所有 item 的 label and key
				String label = sharedPreferencesHelper.getStringValue(curPrefix+DTXMLTagConstants.ITEM_LABEL, "");
				String key =  sharedPreferencesHelper.getStringValue(curPrefix+DTXMLTagConstants.ITEM_KEY, "");
				System.out.println("label:"+label+", key:"+key);
				
			}
			//增加一条search panel item
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_LABEL, "爱好:");
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_KEY, "hobbies");
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_REMARK, "*业余爱好");
			//text类型可以不用设置 
			//sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_TYPE, "text");
			sharedPreferencesHelper.putStringValue(endSearchPanelItenIndex+DTXMLTagConstants.ITEM_DEFAULT_VALUE, "钓鱼");
			//修改end index
			endSearchPanelItenIndex = endSearchPanelItenIndex+1;
			sharedPreferencesHelper.putIntValue(DTXMLTagConstants.SEARCH_PANEL_ITEM_EDN_INDEX, endSearchPanelItenIndex);

			//修改view panel 的template
			sharedPreferencesHelper.putBooleanValue(DTXMLTagConstants.SHOW_FOOTER_CONTENT, true);
			sharedPreferencesHelper.putStringValue(DTXMLTagConstants.FOOTER_TEMPLATE, "客户状态：#{status}");
			
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
