package com.mycdiproject.entities;



import com.google.gson.GsonBuilder;
import com.mycdiproject.api.DisplayEnabled;

public class MyAltDepndentType implements DisplayEnabled {

	private String someProperty;

	public MyAltDepndentType() {

	}

	public MyAltDepndentType(String property) {
		setSomeProperty(property);
	}

	public String getSomeProperty() {
		return someProperty;
	}

	public void setSomeProperty(String someProperty) {
		this.someProperty = someProperty;
	}

	public void displayData() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "ALT [" + new GsonBuilder().setLenient().create().toJson(this).toString() + "]";
	}

}
