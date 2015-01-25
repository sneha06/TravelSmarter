package com.sneha.travelsmarter;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Spinner spin = (Spinner) findViewById(R.id.choices);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, 
				android.R.layout.simple_spinner_item,
				getResources().getStringArray(R.array.choice));
		spin.setAdapter(adapter);
		
		spin.setOnItemSelectedListener(new OnItemSelectedListener() {

			//API key:	AIzaSyBs3G8OKaaRYwkAjOgVgX_mj1nkYuakfUg
			
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,MapActivity.class);
				switch (position) {
				case 1:
					intent.putExtra("Monuments", spin.getSelectedItem().toString());
					startActivity(intent);
					break;

				case 2:
					intent.putExtra("Monuments", spin.getSelectedItem().toString());
					startActivity(intent);
					break;
					
				case 3:
					intent.putExtra("Monuments", spin.getSelectedItem().toString());
					startActivity(intent);
					break;	
				default:
					break;
				}
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	
}
