package com.learn.android;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.view.animation.LinearInterpolator;

public class ScrollAwareFABBehavior extends FloatingActionButton.Behavior
{
	public ScrollAwareFABBehavior()
	{
		super();
	}
	
	public ScrollAwareFABBehavior(Context context, AttributeSet attributeSet)
	{
		super(context, attributeSet);
	}

	@Override
	public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View directTargetChild, View target, int axes)
	{
		return axes == ViewCompat.SCROLL_AXIS_VERTICAL || super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes);
	}

	@Override
	public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed)
	{
		if(child.getVisibility() != View.INVISIBLE && dyConsumed > 0)	{
		CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) child.getLayoutParams();
		int bottomMargin = params.bottomMargin;
		child.animate().translationY(child.getHeight() + bottomMargin).setInterpolator(new LinearInterpolator()).start();
		} else if(child.getVisibility() != View.INVISIBLE && dyConsumed < 0) {
			child.animate().translationY(0).setInterpolator(new LinearInterpolator()).start();
		}
	}

}