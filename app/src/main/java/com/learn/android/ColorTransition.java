package com.learn.android;

import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;

public class ColorTransition extends Transition
{

	private static final String PROPBACKGROUND = "com.learn.android:ColorTransition:color";
	private static final String[] PROPERTIES = {PROPBACKGROUND};
	
	public ColorTransition()
	{}
	
	public ColorTransition(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}

	@Override
	public String[] getTransitionProperties()
	{
		return PROPERTIES;
	}
	
	@Override
	public void captureStartValues(TransitionValues transitionValues)
	{
		captureValues(transitionValues);
	}

	@Override
	public void captureEndValues(TransitionValues transitionValues)
	{
		captureValues(transitionValues);
	}

	@Override
	public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues)
	{
		if(startValues == null || endValues == null) {
			return null;
		}
		final Integer startColor = (Integer)startValues.values.get(PROPBACKGROUND);
		final Integer endColor = (Integer)endValues.values.get(PROPBACKGROUND);
		final View view = endValues.view;
		final ArgbEvaluator evaluator = new ArgbEvaluator();
		
		ValueAnimator animator = ValueAnimator.ofFloat(0, 1f);
		animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
			@Override
			public void onAnimationUpdate(ValueAnimator animation)
			{
				int color = (Integer) evaluator.evaluate(animation.getAnimatedFraction(), startColor, endColor);
				view.setBackgroundColor(color);
			}
		});
		return animator;
	}
	
	private void captureValues(TransitionValues transitionValues)
	{
		final View view = transitionValues.view;
		Drawable background = view.getBackground();
		if(background instanceof ColorDrawable) {
			ColorDrawable color = (ColorDrawable) background;
			transitionValues.values.put(PROPBACKGROUND, color.getColor());
		}
	}
}