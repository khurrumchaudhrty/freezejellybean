package com.khurrum.freezejellybean.data;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

import com.khurrum.freezejellybean.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * yes https://github.com/FasterXML is better but for the sake of smple code
 * this is ok
 * 
 * @author khurrumchaudhry
 * 
 */
public class JAdaptor extends BaseAdapter {

	List<ObjectMapper> data = new ArrayList<ObjectMapper>();
	Context localContext = null;
	LayoutInflater inflater;// we can improve this situation but ok for now for sample
	
	public JAdaptor(Context applicationContext) {
		localContext = applicationContext;
	}

	public void startParser() {

		String json = loadJSONFromAsset(localContext);
		if (json != null) {
			try {
				JSONArray ja = new JSONArray(json);
				for (int i = 0; i < ja.length(); i++) {
					JSONObject jobj = ja.getJSONObject(i);
					ObjectMapper ojm = new ObjectMapper();
					ojm.setFruit(jobj.getString(ObjectMapper.TAG_FRUIT));
					ojm.setVeg(jobj.getString(ObjectMapper.TAG_VEG));
					data.add(ojm);
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}

		}
		System.out.println(data.size());
	}

	private String loadJSONFromAsset(Context con) {
		String json = null;
		try {
			InputStream is = con.getAssets().open("dump.json");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			json = new String(buffer, "UTF-8");
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
		return json;
	}

	
	
	/**
	 * Adaptor specific methods to control views
	 */
	@Override
	public int getCount() {
		return data.size();
	}
	

	@Override
	public ObjectMapper getItem(int position) {
		return data.get(position);
	}
	

	@Override
	public long getItemId(int position) {
		return position;
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
			inflater = (LayoutInflater) localContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.listrowview,null,true);
		}
		
		((TextView)convertView.findViewById(R.id.veg)).setText(data.get(position).getVeg());
		((TextView)convertView.findViewById(R.id.fruit)).setText(data.get(position).getFruit());		
		
		return convertView;
	}
}
