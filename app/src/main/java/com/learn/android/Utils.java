package com.learn.android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.content.SharedPreferences;
import android.support.v7.preference.PreferenceManager;
import android.graphics.Color;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import android.app.Activity;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatDelegate;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.view.ViewGroup;

public class Utils
{
	private static String[] colorPrimaryDarkPrefsValues, colorPrimaryPrefsValues, colorAccentPrefsValues;
	private static String colorPrefsDefaultValueIndex, colorAccentPrefsDefaultValueIndex;
	private static SharedPreferences prefs;
	private static boolean shouldRecreate = false;

	public static void setShouldRecreate(boolean shouldRecreate)
	{
		Utils.shouldRecreate = shouldRecreate;
	}

	public static boolean isShouldRecreate()
	{
		return shouldRecreate;
	}
	
	public static int getPrimaryColor(@NonNull Context context)
	{
		init(context);
		int index = Integer.parseInt(prefs.getString(context.getString(R.string.primary_color_preference_key), colorPrefsDefaultValueIndex));
		return Color.parseColor(colorPrimaryPrefsValues[index]);
	}
	
	public static int getPrimaryColorDark(@NonNull Context context)
	{
		init(context);
		int index = Integer.parseInt(prefs.getString(context.getString(R.string.primary_color_preference_key), colorPrefsDefaultValueIndex));
		return Color.parseColor(colorPrimaryDarkPrefsValues[index]);
	}
	
	public static int getAccentColor(@NonNull Context context)
	{
		init(context);
		int index = Integer.parseInt(prefs.getString(context.getString(R.string.accent_color_preference_key), colorAccentPrefsDefaultValueIndex));
		return Color.parseColor(colorAccentPrefsValues[index]);
	}
	
	public static int getThemeType(String value)
	{
		switch(value) {
			case "0": return AppCompatDelegate.MODE_NIGHT_NO;
			case "1": return AppCompatDelegate.MODE_NIGHT_YES;
			case "3": return AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
			case "2": return AppCompatDelegate.MODE_NIGHT_AUTO;
			default: return AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
		}
	}
	
	public static void init(Context context)
	{
		colorPrimaryPrefsValues = context.getResources().getStringArray(R.array.ColorPrimaryArray);
		colorPrimaryDarkPrefsValues = context.getResources().getStringArray(R.array.ColorPrimaryDarkArray);
		colorAccentPrefsValues = context.getResources().getStringArray(R.array.ColorAccentArray);
		colorPrefsDefaultValueIndex = context.getString(R.string.ColorPrimaryDefaultValueIndex);
		colorAccentPrefsDefaultValueIndex = context.getString(R.string.ColorAccentDefaultValueIndex);
		prefs = PreferenceManager.getDefaultSharedPreferences(context);
	}
}