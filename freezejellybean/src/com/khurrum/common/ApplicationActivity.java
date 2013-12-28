package com.khurrum.common;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

/**
 * will allow to switch between action bar engines
 * @author khurrumchaudhry
 *
 */
public class ApplicationActivity extends SherlockActivity {
	
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	     }

	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	     super.onCreateOptionsMenu(menu);
	     return true;
	    }

}
