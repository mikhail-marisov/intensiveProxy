package com.aston.intesive.proxy;

public class Application {
	
	public static void main(String[] args) {
		
		ConnectionSetterProxy connect = new ConnectionSetterProxy();
		connect.setConnection("oooo");
	}

}
