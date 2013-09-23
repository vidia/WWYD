package tschida.david.wwyd;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity
{
	public final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void iShould_click(View v)
	{
		Log.v(TAG, "Clicked \"I Should...\"");
		Intent intent = new Intent(this, IShouldActivity.class);
		startActivity(intent);
	}
	
	public void whatShouldI_click(View v)
	{
		Log.v(TAG, "Clicked \"What Should I...?\"");
		Intent intent = new Intent(this, WhatShouldIActivity.class);
		startActivity(intent);
	}
	
}
