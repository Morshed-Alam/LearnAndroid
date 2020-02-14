package com.learn.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity
{

	public static final String TAG = "SplashScreenActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splashscreen);
		final Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				startActivity(intent);
				finish();
			}
		}, 2000);
	}
}