package com.aston.intesive.proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConnectionSetterProxyTest {

	@Test
	void testSetConnection() {

		ConnectionSetterProxy connect = new ConnectionSetterProxy();
		boolean status = connect.setConnection("oooo");
		assertTrue(status);
	}

	@Test
	void testSetConnectionFalse() {
		
		ConnectionSetterProxy connect = new ConnectionSetterProxy();
		boolean status = connect.setConnection("oo");
		assertFalse(status);
	}

}
