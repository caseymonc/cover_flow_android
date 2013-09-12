package com.itv.horizontalscrollview;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class HorizontalListAdapter extends ArrayAdapter<View> {


	private LayoutInflater inflater;

	public HorizontalListAdapter(Context context) {
		super(context, 0);
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public int getCount() {
		return Integer.MAX_VALUE;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null) convertView = inflater.inflate(R.layout.list_item, parent, false);
		return convertView;
	}

}
