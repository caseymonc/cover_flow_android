package com.itv.horizontalscrollview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CoverFlow list = (CoverFlow) findViewById(R.id.list);
		list.setAdapter(new HorizontalListAdapter(this));
		list.setDynamics(new SimpleDynamics(0.95f, 0.7f));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
