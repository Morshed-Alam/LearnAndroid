package com.learn.android;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v7.widget.CardView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import android.content.Intent;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements SimpleItemTouchCallback.ItemTouchHelperAdapter
{
	private ArrayList<String> mDataset1;
	private ArrayList<String> mDataset2;
	private ArrayList<String> mDataset3;
	private static Context mContext;
	public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
	{
		private static CardView cardView;
		private TextView title, message, more;
		private String data;
		public RecyclerViewHolder(CardView v)
		{
			super(v);
			cardView = v;
			title = v.findViewById(R.id.textView);
			message = v.findViewById(R.id.textViewMessage);
			more = v.findViewById(R.id.textViewMore);
			cardView.setOnClickListener(this);
		}
		@Override
		public void onClick(View view)
		{
			final Intent intent = new Intent(mContext, WebViewActivity.class);
			intent.putExtra("asset", data);
			mContext.startActivity(intent);
		}
	}
	
	public RecyclerViewAdapter(Context context, final int
 pagePosition)
	{
		mDataset1 = Data.getDataset1(pagePosition);
		mDataset2 = Data.getDataset2(pagePosition);
		mDataset3 = Data.getDataset3(pagePosition);
		mContext = context;
	}

	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup vg, int viewType)
	{
			final CardView cardView = (CardView) LayoutInflater.from(vg.getContext()).inflate(R.layout.row_item, vg, false);
			RecyclerViewHolder vh = new RecyclerViewHolder(cardView);
			return vh;
	}

	@Override
	public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position)
	{
		RecyclerViewHolder h = (RecyclerViewHolder) holder;
		h.title.setText(mDataset1.get(position));
		h.message.setText(mDataset2.get(position));
		h.more.setText("Read More...");
		h.data = mDataset3.get(position);
	}

	@Override
	public int getItemCount()
	{
		return mDataset1.size();
	}

	@Override
	public void onItemMoved(int fromPosition, int toPosition)
	{
		if (fromPosition < toPosition)
		{
			for (int i = fromPosition; i < toPosition; i++)
			{
				Collections.swap(mDataset1, i, i + 1);
				Collections.swap(mDataset2, i, i + 1);
				Collections.swap(mDataset3, i, i + 1);
				notifyDataSetChanged();
			}
		}
		else if (fromPosition > toPosition)
		{
			for (int i = fromPosition; i > toPosition; i--)
			{
				Collections.swap(mDataset1, i, i - 1);
				Collections.swap(mDataset2, i, i - 1);
				Collections.swap(mDataset3, i, i - 1);
				notifyDataSetChanged();
			}
		}
	}

}