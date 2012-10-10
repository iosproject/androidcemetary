package com.keanteam.cemetaryworking;

import android.app.TabActivity;

import android.content.Intent;

import android.os.Bundle;

import android.widget.TabHost;

import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TabHost th = (TabHost)findViewById(android.R.id.tabhost);
		TabSpec ts1 = th.newTabSpec("tab_id_1");
		TabSpec ts2 = th.newTabSpec("tab_id_2");
		TabSpec ts3 = th.newTabSpec("tab_id_3");
		TabSpec ts4 = th.newTabSpec("tab_id_4");

		ts1.setIndicator("Home").setContent(new Intent(this,HomeActivity.class));
		ts2.setIndicator("Map").setContent(new Intent(this,MapActivity.class));
		ts3.setIndicator("Search").setContent(new Intent(this,SearchActivity.class));
		ts4.setIndicator("More").setContent(new Intent(this,MoreActivity.class));

		th.addTab(ts1);
		th.addTab(ts2);
		th.addTab(ts3);
		th.addTab(ts4);
		
	}

}