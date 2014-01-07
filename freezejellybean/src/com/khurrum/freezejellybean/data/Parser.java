package com.khurrum.freezejellybean.data;

import java.io.IOException;
import java.io.InputStream;

import org.json.*;

import android.content.Context;

public class Parser {

	public void startParser(Context con) {

		String json = loadJSONFromAsset(con);
		if (json != null) {
			try {
				JSONArray ja = new JSONArray(json);
				System.out.println(ja.length());
			} catch (JSONException e) {
				e.printStackTrace();
			}
			
		}
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
