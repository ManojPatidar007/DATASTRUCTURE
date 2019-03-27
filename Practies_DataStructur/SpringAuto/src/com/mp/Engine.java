package com.mp;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {
//	@Autowired
	private String model;
	public Engine(){}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String toString() {
		return "Model= " + model;
	}

}
