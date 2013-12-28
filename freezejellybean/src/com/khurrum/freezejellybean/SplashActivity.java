package com.khurrum.freezejellybean;

import android.os.Bundle;
import com.actionbarsherlock.view.Menu;
import com.khurrum.common.ApplicationActivity;

public class SplashActivity extends ApplicationActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().setDisplayShowTitleEnabled(false);// make it with out title
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	getSupportMenuInflater().inflate(R.menu.splash, menu);
        return true;
    }
    
}
