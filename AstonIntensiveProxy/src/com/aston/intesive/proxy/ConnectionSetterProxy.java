package com.aston.intesive.proxy;

public class ConnectionSetterProxy implements ConnectionSet {

	ConnectionSetter setter = new ConnectionSetter();

	@Override
	public void setConnection(String password) {

		if (password.equals("oooo")) {
			setter.setConnection(password);
		} else {
			System.out.println("Illegal Password");
		}

	}

}
