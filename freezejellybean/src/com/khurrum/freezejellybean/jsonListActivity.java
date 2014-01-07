package com.khurrum.freezejellybean;

import android.os.Bundle;
import android.widget.ListView;

import com.khurrum.common.ApplicationActivity;
import com.khurrum.freezejellybean.data.JAdaptor;

public class JsonListActivity extends ApplicationActivity{
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jsonlist);
	        getSupportActionBar().setDisplayShowTitleEnabled(false);
	        JAdaptor parser = new JAdaptor();
	        parser.startParser(this);
	        
	        
	        ListView list = (ListView)findViewById(R.id.listView);
	        
	     }

}
