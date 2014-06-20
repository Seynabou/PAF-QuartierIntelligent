package com.example.paf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button signInButton = (Button) findViewById(R.id.sign_in_button);
		Button signUpButton = (Button) findViewById(R.id.sign_up_button);
		

		
		signInButton.setOnClickListener(this);
		signUpButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) 
	{
		Intent i ;
		switch(v.getId())
		{
			case R.id.sign_in_button:
				popUp("Tu souhaites te connecter");
				break;
			case R.id.sign_up_button:
				popUp("Tu souhaites t'inscrire");
				i = new Intent(this, CreateAccountActivity.class);
	            startActivity(i);
				break;
		}
	}
	
	private void popUp(String message) 
	{
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}



}
