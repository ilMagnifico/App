package com.github.ilmagnifico;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hella", app.sayHello());
	}

	@Test
	public void testSayHelloWithName() {
		assertEquals("Hello World", app.sayHello("World"));
	}
}
