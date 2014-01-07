package com.khurrum.freezejellybean;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ListView;

import com.khurrum.common.ApplicationActivity;
import com.khurrum.freezejellybean.data.JAdaptor;
/**
 * 
 * @author khurrumchaudhry
 *
 */
public class JsonListActivity extends ApplicationActivity{
	ListView list;
	JAdaptor adaptor;
	View view ;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jsonlist);
	        getSupportActionBar().setDisplayShowTitleEnabled(false);
	        adaptor = new JAdaptor(this.getApplicationContext());
	        new Thread(){
				public void run(){
					adaptor.startParser();// Refer to dump.readme file in assets for how 100000 data points
					handler.sendEmptyMessage(0);
				}
			}.start();
	
			view = findViewById(R.id.empty);//inflater.inflate(R.layout.empty,null,true);
	
	        list = (ListView)findViewById(R.id.listView);
	        list.setEmptyView(view);
	        list.setAdapter(adaptor);
	        
	        Chronometer chmeter = (Chronometer) view.findViewById(R.id.chmtr);
	        chmeter.start();
	     }

	 private final Handler handler = new Handler() {
		    public void handleMessage(Message msg) {
		    	Chronometer chmeter = (Chronometer) view.findViewById(R.id.chmtr);
		        chmeter.stop();
		        
		    	adaptor.notifyDataSetChanged();
		    }};
}
