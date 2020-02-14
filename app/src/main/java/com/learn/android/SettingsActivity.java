package com.learn.android;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.transition.Transition;
import android.transition.TransitionManager;

public class SettingsActivity extends AppCompatActivity implements SharedPreferences.OnSharedPreferenceChangeListener
{
	public static final String TAG = "SettingsActivity";
	private SettingsFragment settingsFragment;
	private Toolbar mToolbar;
	private SharedPreferences prefs;
	private Transition transition;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		mToolbar = findViewById(R.id.toolbar);
		setSupportActionBar(mToolbar);
		transition = new ColorTransition();
		TransitionManager.beginDelayedTransition(mToolbar, transition);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		settingsFragment = new SettingsFragment();
		getSupportFragmentManager().beginTransaction().add(R.id.activity_settingsFrameLayout, settingsFragment).commit();
		prefs = PreferenceManager.getDefaultSharedPreferences(this);
		prefs.registerOnSharedPreferenceChangeListener(this);
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		mToolbar.setBackgroundColor(Utils.getPrimaryColor(this));
		getWindow().setStatusBarColor(Utils.getPrimaryColorDark(this));
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences prefs, String key)
	{
		if (key == getString(R.string.theme_preference_key))
		{
			Utils.setShouldRecreate(true);
			this.recreate();
		}
		if (key == getString(R.string.primary_color_preference_key))
		{
			mToolbar.setBackgroundColor(Utils.getPrimaryColor(this));
			getWindow().setStatusBarColor(Utils.getPrimaryColorDark(this));
		}
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		prefs.unregisterOnSharedPreferenceChangeListener(this);
	}

}