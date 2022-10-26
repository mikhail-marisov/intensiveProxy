package com.aston.intesive.proxy;

public class ConnectionSetterProxy implements ConnectionSet {

	ConnectionSetter setter = new ConnectionSetter();

	@Override
	public boolean setConnection(String password) {

		if (password.equals("oooo")) {
			setter.setConnection(password);
			return true;
		} else {
			System.out.println("Illegal Password");
			return false;
		}

	}

}
