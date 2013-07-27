package com.example.manageandreport;

import java.util.Set;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 
 * @author bruce.peng
 * @version 0.1
 *
 */
public class SharedPreferencesHelper{
	private Context mContext;
	private SharedPreferences sharedPreferences;
	public SharedPreferencesHelper(Context context) {
		mContext = context;
	}
	
	/**
	 * 
	 * @param value
	 * @param key
	 */
	public void putStringValue(String key, String value){
		sharedPreferences=mContext.getSharedPreferences(key,Context.MODE_WORLD_WRITEABLE);
		sharedPreferences.edit().putString(key, value).commit();		
	}
	/**
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public String getStringValue(String key, String defaultValue){
		SharedPreferences sharedPreferences = mContext.getSharedPreferences(key, Context.MODE_WORLD_READABLE);
		return sharedPreferences.getString(key, defaultValue);	
	}
	
	/**
	 * 
	 * @param value
	 * @param key
	 */
	public void putBooleanValue(String key, boolean value){
		sharedPreferences=mContext.getSharedPreferences(key,Context.MODE_WORLD_WRITEABLE);
		sharedPreferences.edit().putBoolean(key, value).commit();
	}
	/**
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public boolean getBooleanValue(String key, boolean defaultValue){
		SharedPreferences sharedPreferences = mContext.getSharedPreferences(key, Context.MODE_WORLD_READABLE);
		return sharedPreferences.getBoolean(key, defaultValue);	
	}

	/**
	 * 
	 * @param value
	 * @param key
	 */
	public void putIntValue(String key, int value){
		sharedPreferences=mContext.getSharedPreferences(key,Context.MODE_WORLD_WRITEABLE);
		sharedPreferences.edit().putInt(key, value).commit();		
	}
	/**
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public int getIntValue(String key, int defaultValue){
		SharedPreferences sharedPreferences = mContext.getSharedPreferences(key, Context.MODE_WORLD_READABLE);
		return sharedPreferences.getInt(key, defaultValue);	
	}
	

	/**
	 * 
	 * @param value
	 * @param key
	 */
	public void putStringSetValue(String key, Set<String> value){
		sharedPreferences=mContext.getSharedPreferences(key,Context.MODE_WORLD_WRITEABLE);
		sharedPreferences.edit().putStringSet(key, value).commit();
	}
	/**
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public Set<String> getStringSetValue(String key, Set<String> defaultValue){
		SharedPreferences sharedPreferences = mContext.getSharedPreferences(key, Context.MODE_WORLD_READABLE);
		return sharedPreferences.getStringSet(key, defaultValue);	
	}
}

