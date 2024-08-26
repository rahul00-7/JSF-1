package com.newgen.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class SearchPlants {
	private String result;
	public String execute() {
		this.result = "Nothing here";
		return "noresult";
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
