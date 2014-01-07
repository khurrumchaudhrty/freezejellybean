package com.khurrum.freezejellybean.data;
/**
 * 
 * @author khurrumchaudhry
 *
 */
public class ObjectMapper {

	public final static String TAG_VEG="veg";
	public final static String TAG_FRUIT="fruit";	
	
	private String veg;
	private String fruit;
	
	String getFruit() {
		return fruit;
	}
	void setFruit(String fruit) {
		this.fruit = fruit;
	}
	String getVeg() {
		return veg;
	}
	void setVeg(String veg) {
		this.veg = veg;
	}
	
}
