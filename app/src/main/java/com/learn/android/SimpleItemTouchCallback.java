package com.learn.android;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

public class SimpleItemTouchCallback extends Callback
{
	
	public interface ItemTouchHelperAdapter {
		void onItemMoved(int fromPosition, int toPosition);
	}
	
	private ItemTouchHelperAdapter mHelperAdapter;
	
	public SimpleItemTouchCallback(ItemTouchHelperAdapter helperAdapter)
	{
		mHelperAdapter = helperAdapter;
	}

	@Override
	public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder holder)
	{
		int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
		return makeMovementFlags(dragFlags, 0);
	}

	@Override
	public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder holder, RecyclerView.ViewHolder target)
	{
		if(mHelperAdapter != null)
			mHelperAdapter.onItemMoved(holder.getAdapterPosition(), target.getAdapterPosition());
		return true;
	}

	@Override
	public void onSwiped(RecyclerView.ViewHolder holder, int direction)
	{
		
	}

	@Override
	public boolean isLongPressDragEnabled()
	{
		return true;
	}

	@Override
	public boolean isItemViewSwipeEnabled()
	{
		return false;
	}
	
}