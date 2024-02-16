package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingImplTest {

	@Test
	void greetTest() {
		Greeting greeting = new GreetingImpl();
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

}
