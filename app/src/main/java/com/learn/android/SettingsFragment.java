package com.learn.android;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat
{
	
	@Override
	public void onCreatePreferences(Bundle p1, String p2)
	{
		addPreferencesFromResource(R.xml.settings_prefs);
	}

}