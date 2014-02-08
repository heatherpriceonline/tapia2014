package com.example.now;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{

	Button todaybutton;
	EditText todoTextEditText;
	TextView todoTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		todaybutton = (Button) findViewById(R.id.todayButton);
		
		todoTextEditText = (EditText) findViewById(R.id.todoText);
		
		todoTextView = (TextView) findViewById(R.id.textView);
			todaybutton.setOnClickListener (new View.OnClickListener() {
			    public void onClick(View v) {
			    	String stodoText = todoTextEditText.getText().toString(); //string
			    	//Log.d("TAG", stodoText);
			    	if (!stodoText.matches("") && todoTextView.getText().equals("")) {
			    		todoTextView.setText(stodoText);
			    	} else {
			    		todoTextView.setText(todoTextView.getText() + "\n" + stodoText);	
			    	}
			    	todoTextEditText.setText("");
			    }
			});
	}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/

}
