package com.learn.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;

public class AboutActivity extends AppCompatActivity
{
	private ImageView  collapsingImageView;
	private FloatingImageView profileView;
	private Toolbar toolbar;
	private CollapsingToolbarLayout collapsingToolbar;
	private AppBarLayout appbar;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		toolbar = findViewById(R.id.toolbar_about);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		collapsingToolbar = findViewById(R.id.collapsing_toolbar_about);
		profileView = findViewById(R.id.circle_image_about);
		collapsingImageView = findViewById(R.id.image_view_about);
		appbar = findViewById(R.id.appbar_about);
		appbar.addOnOffsetChangedListener(new CollapsingToolbarStateListener());
		Glide.with(this).load(R.drawable.profile_full).into(collapsingImageView);
		Glide.with(this).load(R.drawable.profile).into(profileView);
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		collapsingToolbar.setContentScrimColor(Utils.getPrimaryColor(this));
		collapsingToolbar.setStatusBarScrimColor(Utils.getPrimaryColorDark(this));
	}
	
	private class CollapsingToolbarStateListener extends AppBarStateChangeListener
	{

		@Override
		public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state)
		{
			if(state == AppBarStateChangeListener.State.COLLAPSED) {
				toolbar.setTitle("Learn Android");
			}else if(state == AppBarStateChangeListener.State.EXPANDED) {
				getWindow().setStatusBarColor(Color.TRANSPARENT);
				toolbar.setTitle("");
			}
		}
	}
	
}