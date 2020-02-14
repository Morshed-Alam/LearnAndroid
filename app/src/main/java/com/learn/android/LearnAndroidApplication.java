package com.learn.android;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.preference.PreferenceManager;
import android.content.SharedPreferences;

public class LearnAndroidApplication extends Application implements SharedPreferences.OnSharedPreferenceChangeListener
{

	private String prefsValue;
	private SharedPreferences prefs;
	@Override
	public void onCreate()
	{
		super.onCreate();
		prefs = PreferenceManager.getDefaultSharedPreferences(this);
		prefs.registerOnSharedPreferenceChangeListener(this);
		prefsValue = prefs.getString(getString(R.string.theme_preference_key), "3");
		AppCompatDelegate.setDefaultNightMode(Utils.getThemeType(prefsValue));
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences prefs, String key)
	{
		AppCompatDelegate.setDefaultNightMode(Utils.getThemeType(prefs.getString(getString(R.string.theme_preference_key),"3")));
	}
	
}