package com.khurrum.freezejellybean;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.actionbarsherlock.view.Menu;
import com.khurrum.common.ApplicationActivity;

public class SplashActivity extends ApplicationActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().setDisplayShowTitleEnabled(true);// make it with out title
        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent listActivity = new Intent(getApplicationContext(),com.khurrum.freezejellybean.JsonListActivity.class);
				SplashActivity.this.startActivity(listActivity);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	getSupportMenuInflater().inflate(R.menu.splash, menu);
        return true;
    }
    
}
