package com.learn.android;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import android.widget.Toast;
import android.webkit.WebChromeClient;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Menu;
import android.view.MenuItem;

public class WebViewActivity extends BaseActivity
{
	private Toolbar toolbar;
	private AdView mAdView;
	private ConnectivityManager cm;
	private boolean isConnected;
	private WebView webView;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.row_tutorial);
		toolbar = findViewById(R.id.webtoolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		webView = findViewById(R.id.webView);
		webView.setWebChromeClient(new WebChromeClient());
		webView.clearCache(true);
		webView.clearHistory();
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setSupportZoom(true);
		webSettings.setBuiltInZoomControls(true);
		webSettings.setDisplayZoomControls(false);
		webView.loadUrl("file:///android_asset/" + getIntent().getExtras().getString("asset"));
		cm = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
		NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
		isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		toolbar.setBackgroundColor(Utils.getPrimaryColor(this));
		getWindow().setStatusBarColor(Utils.getPrimaryColorDark(this));
		if (isConnected)
		{
			MobileAds.initialize(this);
			mAdView = findViewById(R.id.WebadView);
			mAdView.loadAd(new AdRequest.Builder().build());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		return super.onOptionsItemSelected(item);
	}

}