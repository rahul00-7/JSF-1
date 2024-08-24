/**
 * 
 */
package com.newgen.users;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author rahul.p.kumar
 *
 */
@ManagedBean(name="m1")
@RequestScoped
public class IndividualUsers {
	public String name, address, password;
	
	Map<String,String> items;
	
	public Map<String, String> getItems() {
		return items;
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}

	public IndividualUsers() {
		items = new HashMap<>();
		items.put("C", "Programming in C");
		items.put("Python", "Programming in Python");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	

	

}
