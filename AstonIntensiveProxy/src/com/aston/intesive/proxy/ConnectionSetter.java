package com.aston.intesive.proxy;

public class ConnectionSetter implements ConnectionSet {

	@Override
	public boolean setConnection(String password) {
		
		System.out.println("Connection setted");
		return true;
	}

}
