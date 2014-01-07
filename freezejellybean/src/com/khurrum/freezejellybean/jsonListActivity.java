package com.khurrum.freezejellybean;

import android.os.Bundle;
import com.khurrum.common.ApplicationActivity;

public class jsonListActivity extends ApplicationActivity{
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jsonlist);
	        getSupportActionBar().setDisplayShowTitleEnabled(false);
	     }

}
