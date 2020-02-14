package com.learn.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.pm.ResolveInfo;
import android.support.v4.content.ContextCompat;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;
import android.content.Context;
import android.view.View;
import java.io.File;
import android.support.v7.widget.ShareActionProvider;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import android.Manifest;

/* base activity */
public class BaseActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback
{
	public static final int WRITE_PERMISSION_REQUEST_CODE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu_main, menu);
		final MenuItem item = menu.findItem(R.id.action_share);
		ShareActionProvider mProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
		mProvider.setShareIntent(getShareIntent());
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{		
		switch(item.getItemId()) 
		{
			case R.id.action_share :
				if(checkPermission())
				{
					writeFile();
				} else {
					requestPermission();
					writeFile();
				}
				return true;
			case R.id.action_Send_Feedback :
			  sendFeedback();
				return true;
			case R.id.action_help :
				help();
				return true;
			case R.id.action_settings:
				settings();
				return true;
			default : return false;
			}
		
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
	{
			switch (requestCode) {
				case WRITE_PERMISSION_REQUEST_CODE: {
						if (grantResults.length > 0 && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
							Toast.makeText(this, "Grant WRITE_EXTERNAL_STORAGE permission", Toast.LENGTH_SHORT).show();
						}
						return;
					}
			}
	}
	
	@Override
	protected void onResume()
	{
		super.onResume();
	}
	
	protected void writeFile(){
		if(new File(Environment.getExternalStorageDirectory().getPath()+"/Android/data/com.learn.android/learn_android.apk").exists()) return;
		File apkfile = new File(getApplicationContext().getApplicationInfo().publicSourceDir);
		File f = new File(Environment.getExternalStorageDirectory()+"/Android/data/com.learn.android");
		if(!f.exists()) f.mkdirs();
		try {
			File outputFile = new File(f, "learn_android.apk");
			outputFile.createNewFile();
			InputStream is = new FileInputStream(apkfile);
			OutputStream out = new FileOutputStream(outputFile);

			byte[] buf = new byte[1024];
			int len;
			while ((len = is.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			is.close();
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected boolean checkPermission(){
		if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
			return true;
		}
		return false;
	}

	protected void requestPermission()
	{
		ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE }, WRITE_PERMISSION_REQUEST_CODE);
	}
	
	protected Intent getShareIntent()
	{
		final Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("application/vnd.android.package-archive");
		intent.putExtra(Intent.EXTRA_STREAM, FileProvider.getUriForFile(BaseActivity.this, "com.learn.android.provider", new File(Environment.getExternalStorageDirectory()+"/Android/data/com.learn.android/learn_android.apk")));
		return intent;
	}
	
	public void sendFeedback()
	{
		Intent intent = new Intent("android.intent.action.SEND");
		intent.setType("text/email");
		intent.putExtra("android.intent.extra.EMAIL", new String[]{"morshedgms58@gmail.com"});
		intent.putExtra("android.intent.extra.SUBJECT", "Feedback of Learn Android");
		ResolveInfo resolveInfo = null;
		for (ResolveInfo resolveInfo2 : getPackageManager().queryIntentActivities(intent, 0))
		{ 
			if (resolveInfo2.activityInfo.packageName.endsWith(".gm") || resolveInfo2.activityInfo.name.toLowerCase().contains("gmail")) { 
			    resolveInfo = resolveInfo2;
			} 
		} 
		if (resolveInfo != null) {
			intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
		} 
		startActivity(Intent.createChooser(intent, "Send Feedback:"));
	}
	
	public void help()
	{
		Intent in = new Intent(BaseActivity.this, WebViewActivity.class);
		in.putExtra("asset", "help.html");
		startActivity(in);
	}
	
	public void settings()
	{
		startActivity(new Intent(BaseActivity.this, SettingsActivity.class));
	}
	
}