package com.khurrum.freezejellybean.data;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

import android.content.Context;

public class JAdaptor {

	List<ObjectMapper> data = new ArrayList<ObjectMapper>();
	
	
	public void startParser(Context con) {

		String json = loadJSONFromAsset(con);
		if (json != null) {
			try {
				JSONArray ja = new JSONArray(json);
				for(int i=0; i< ja.length(); i++){
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

	public String loadJSONFromAsset(Context con) {
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
}
