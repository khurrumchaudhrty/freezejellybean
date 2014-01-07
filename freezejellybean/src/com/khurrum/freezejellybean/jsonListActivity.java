package com.khurrum.freezejellybean;

import android.os.Bundle;
import com.khurrum.common.ApplicationActivity;
import com.khurrum.freezejellybean.data.Parser;

public class JsonListActivity extends ApplicationActivity{
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jsonlist);
	        getSupportActionBar().setDisplayShowTitleEnabled(false);
	        Parser parser = new Parser();
	        parser.startParser(this);
	        
	     }

}
