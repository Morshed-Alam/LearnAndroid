package com.learn.android;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Build;
import android.os.Handler;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.konifar.fab_transformation.FabTransformation;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import com.bumptech.glide.Glide;

public class MainActivity extends BaseActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener, TabLayout.OnTabSelectedListener
{

    public final String LOG_TAG = MainActivity.class.getSimpleName();

    private final String[] PAGE_TITLES = new String[] {
		"ANDROID",
		"JAVA",
		"KOTLIN",
		"SQLITE",
		"GRADLE",
		"TUTORIALS",
		"INTERVIEW"
    };

    private final Fragment[] PAGES = new Fragment[] {
		new FragmentPage(0),
		new FragmentPage(1),
		new FragmentPage(2),
		new FragmentPage(3),
		new FragmentPage(4),
		new FragmentPage(5),
		new FragmentPage(6)
	};

    private ViewPager mViewPager;
	private DrawerLayout mDrawerLayout;
	private ActionBarDrawerToggle actionBarDrawerToggle;
	private CoordinatorLayout coordinatorLayout;
	private FloatingActionButton fab;
	private AppBarLayout appbarLayout;
	private Toolbar toolbarFooter;
	private Toolbar toolbar;
	private TabLayout tabLayout;
	private NavigationView navView;
	private Button toolbarFooterButton;
	private RelativeLayout toolbarFooterBack;
	private ImageView mImageView;
	private CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		appbarLayout = findViewById(R.id.appbar);
		appbarLayout.addOnOffsetChangedListener(new CollapsingToolbarStateListener());
        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
		mImageView = findViewById(R.id.collapsing_image);
		Glide.with(this).load(R.drawable.android).into(mImageView);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		mDrawerLayout = findViewById(R.id.mainDrawerLayout);
		actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close){
			@Override
			public void onDrawerOpened(View view)
			{
				super.onDrawerOpened(view);
			}
			@Override
			public void onDrawerClosed(View view)
			{
				super.onDrawerClosed(view);
			}
		};
		mDrawerLayout.setDrawerListener(actionBarDrawerToggle);
		actionBarDrawerToggle.syncState();

        mViewPager = findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        mViewPager.setPageTransformer(true, new DepthPageTransformer());

        tabLayout =  findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setOnTabSelectedListener(this);
		coordinatorLayout =  findViewById(R.id.activity_main);
		toolbarFooter = findViewById(R.id.toolbar_footer);
		fab = findViewById(R.id.fab);
		fab.setOnClickListener(this);
		toolbarFooterBack = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.toolbar_footer_back, null, false);
		toolbarFooterButton = toolbarFooterBack.findViewById(R.id.toolbar_footer_button);
		toolbarFooter.addView(toolbarFooterBack);
		toolbarFooterButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view)
				{
					finish();
				}
			});
		navView = findViewById(R.id.mainNavigationView);
		navView.setNavigationItemSelectedListener(this);
		mCollapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
		Utils.setShouldRecreate(false);
    }

	@Override
	protected void onResume()
	{
	   super.onResume();
		if(Utils.isShouldRecreate()) {
			this.recreate();
			return;
		}
		fab.setBackgroundTintList(ColorStateList.valueOf(Utils.getPrimaryColor(this)));
		toolbarFooter.setBackgroundColor(Utils.getPrimaryColor(this));
		toolbarFooterButton.setBackgroundColor(Utils.getPrimaryColorDark(this));
		navView.getHeaderView(0).setBackgroundColor(Utils.getPrimaryColor(this));
		mCollapsingToolbarLayout.setContentScrimColor(Utils.getPrimaryColor(this));
		mCollapsingToolbarLayout.setStatusBarScrimColor(Utils.getPrimaryColorDark(this));
	}

    public class MyPagerAdapter extends FragmentStatePagerAdapter
	{

        public MyPagerAdapter(FragmentManager fragmentManager)
		{
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
		{
            return PAGES[position];
        }

        @Override
        public int getCount()
		{
            return PAGES.length;
        }

        @Override
        public CharSequence getPageTitle(int position)
		{
            return PAGE_TITLES[position];
        }

    }

    @Override
	public void onBackPressed()
	{
	   if(mDrawerLayout.isDrawerOpen(navView)) {
			     closeDrawer();
			     return;
			}
		if (toolbarFooter.getVisibility() != View.VISIBLE)
		{
			FabTransformation.with(fab).transformTo(toolbarFooter);
		}
		else
		{
			FabTransformation.with(fab).transformFrom(toolbarFooter);
		}

		new Handler().postDelayed(new Runnable() {

				@Override
				public void run()
				{
					if (toolbarFooter.getVisibility() == View.VISIBLE && toolbarFooter.isAttachedToWindow())
						FabTransformation.with(fab).transformFrom(toolbarFooter);
				}
			}, 3000);
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

	@Override
	public void onClick(View view)
	{
		share();
	}

	@Override
	public boolean onNavigationItemSelected(MenuItem item)
	{
		switch(item.getItemId()) {
			case R.id.item_home:
				closeDrawer();
				return true;
			case R.id.item_Send_Feedback:
				sendFeedback();
				closeDrawer();
				return true;
			case R.id.item_share:
				share();
				closeDrawer();
				return true;
			case R.id.item_settings:
				settings();
				closeDrawer();
				return true;
			case R.id.item_help:
				help();
				closeDrawer();
				return true;
			case R.id.item_about:
			    startActivity(new Intent(MainActivity.this, AboutActivity.class));
			    closeDrawer();
			    return true;
			default:
			    return false;
		}

	}
	
	private void share()
	{
		if (checkPermission())
		{
			writeFile();
			startActivity(Intent.createChooser(getShareIntent(), "Share \"Learn Android\" via..."));
		}
		else
		{
			requestPermission();
			writeFile();
		}
	}
	
	private void closeDrawer()
	{
	      mDrawerLayout.closeDrawer(navView);
	}

	@Override
	public void onTabSelected(TabLayout.Tab tab)
	{
		switch(tab.getPosition()) {
			case 0: Glide.with(this).load(R.drawable.android).into(mImageView);
			break;
			case 1: Glide.with(this).load(R.drawable.java).into(mImageView);
				break;
			case 2: Glide.with(this).load(R.drawable.kotlin).into(mImageView);
				break;
			case 3: Glide.with(this).load(R.drawable.sqlite).into(mImageView);
				break;
			case 4: Glide.with(this).load(R.drawable.gradle).into(mImageView);
				break;
			case 5: Glide.with(this).load(R.drawable.tutorials).into(mImageView);
				break;
			case 6: Glide.with(this).load(R.drawable.interview).into(mImageView);
				break;
		}
	}

	@Override
	public void onTabUnselected(TabLayout.Tab tab)
	{
		
	}

	@Override
	public void onTabReselected(TabLayout.Tab tab)
	{
		
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