package com.mycdiproject.entities;


import javax.inject.Inject;

import com.mycdiproject.api.DisplayEnabled;

public class MyOuterType {
	
	@Inject
	private DisplayEnabled type;

	public DisplayEnabled getType() {
		return type;
	}

	public void setType(DisplayEnabled type) {
		this.type = type;
	}
	
	public void doSomething() {
		type.displayData();
		System.out.println("sldkfjlaskjdflkajsdf");
	}

}
