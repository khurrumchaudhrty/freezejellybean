package com.khurrum.freezejellybean;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SplashActivity extends SherlockActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
    }


    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.MenuItem menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.splash, (Menu) menu);
        return true;
    }
    
}
