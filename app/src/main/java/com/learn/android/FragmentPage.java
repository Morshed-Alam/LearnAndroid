package com.learn.android;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.v7.widget.LinearLayoutManager;
import android.app.Activity;

public class FragmentPage extends Fragment {
	
	private int position;
	private static RecyclerView recyclerView;
	private static RecyclerView.LayoutManager layoutManager;
	private static RecyclerViewAdapter adapter;

	public FragmentPage(int position)
	{
		this.position = position;
	}

	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);
		recyclerView = rootView.findViewById(R.id.recyclerView);
		adapter = new RecyclerViewAdapter(getContext(), position);
		ItemTouchHelper helper = new ItemTouchHelper(new SimpleItemTouchCallback(adapter));
		helper.attachToRecyclerView(recyclerView);
		recyclerView.setAdapter(adapter);
		layoutManager = new LinearLayoutManager(getContext());
		recyclerView.setLayoutManager(layoutManager);
        return rootView;
    }
	
}