package com.newgen.buttonActions;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "btn")
public class IndividualUserBtns {
	public ArrayList<String> courses;
	public String selectProperty;
	
	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	

	public String displayName() {
		
		return "test";
	}

	public String getsSelectProperty() {
		return selectProperty;
	}

	public void setsSelectProperty(String selectProperty) {
		this.selectProperty = selectProperty;
	}

}
