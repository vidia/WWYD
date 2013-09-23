package tschida.david.wwyd;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class IShouldActivity extends Activity
{
	private static final String TAG = "IShouldActivity";
	
	private TextView iShould_title, output, descriptionTitle, friendsTitle;
	private EditText other, thing, description, friends;
	private CheckBox enableDescription, enableFriends;
	private Button save_button;
	private RadioButton last_selected;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ishould);
		// Show the Up button in the action bar.
		setupActionBar();
		
		iShould_title = (TextView) findViewById(R.id.txt_iShould_title);
		output = (TextView) findViewById(R.id.txt_output);
		descriptionTitle = (TextView) findViewById(R.id.txt_descriptionTitle);
		friendsTitle = (TextView) findViewById(R.id.txt_friendsTitle);
		other = (EditText) findViewById(R.id.etxt_other);
		thing = (EditText) findViewById(R.id.etxt_thing);
		description = (EditText) findViewById(R.id.etxt_description);
		friends = (EditText) findViewById(R.id.etxt_friends);
		enableDescription = (CheckBox) findViewById(R.id.chbox_enableDescription);
		enableFriends = (CheckBox) findViewById(R.id.chbox_enableFriends);
		save_button = (Button) findViewById(R.id.btn_save);
	}
	
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar()
	{
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
		{
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ishould, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case android.R.id.home:
				// This ID represents the Home or Up button. In the case of this
				// activity, the Up button is shown. Use NavUtils to allow users
				// to navigate up one level in the application structure. For
				// more details, see the Navigation pattern on Android Design:
				//
				// http://developer.android.com/design/patterns/navigation.html#up-vs-back
				//
				NavUtils.navigateUpFromSameTask(this);
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void btn_save_click(View v)
	{
		String output = "I Should";
		
		// getVerb
		String verb = "{verb}";
		if (last_selected != null)
		{
			if (last_selected.equals(other))
			{
				verb = other.getText().toString();
			} else
			{
				verb = (String) last_selected.getText();
			}
		}
		
		// getThing
		String thing = this.thing.getText().toString();
		
		// description
		String description = "{description}";
		if (enableDescription.isChecked())
		{
			description = this.description.getText().toString();
		}
		
		// Friends
		String friends = "{friends}";
		if (enableFriends.isChecked())
		{
			friends = this.friends.getText().toString();
		}
		
		output = String
				.format("%s %s %s %s %s", output, verb, thing, description, friends);
		
		this.output.setText(output);
	}
	
	public void chbox_that_click(View v)
	{
		Log.d(TAG, "That checkbox clicked.");
		if (enableDescription.isChecked())
		{
			descriptionTitle.setEnabled(true);
			description.setEnabled(true);
		} else
		{
			descriptionTitle.setEnabled(false);
			description.setEnabled(false);
		}
	}
	
	public void chbox_with_click(View v)
	{
		Log.d(TAG, "With checkbox clicked.");
		if (enableFriends.isChecked())
		{
			friendsTitle.setEnabled(true);
			friends.setEnabled(true);
		} else
		{
			friendsTitle.setEnabled(false);
			friends.setEnabled(false);
		}
	}
	
	public void radio_button_selected(View v)
	{
		RadioButton button;
		if (v instanceof RadioButton)
		{
			button = (RadioButton) v;
		} else
		{
			Log.e(TAG,
					"View in radio_button_selected(View) is not a RadioButton");
			return;
		}
		
		if (last_selected != null)
			last_selected.setChecked(false);
		button.setChecked(true);
		last_selected = button;
	}
	
}
