package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Home {
	private String owner;
	private int doorno ;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	
	public void connect()
	{
		System.out.println("connecting internet ");
	}

}
